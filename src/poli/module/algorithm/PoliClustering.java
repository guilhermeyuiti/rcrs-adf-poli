package poli.module.algorithm;

import adf.agent.develop.DevelopData;
import adf.agent.info.AgentInfo;
import adf.agent.info.ScenarioInfo;
import adf.agent.info.WorldInfo;
import adf.agent.module.ModuleManager;
import adf.component.module.algorithm.StaticClustering;
import java.util.Map;
import rescuecore2.standard.entities.StandardEntity;
import adf.agent.communication.MessageManager;
import adf.agent.communication.standard.bundle.MessageUtil;
import adf.agent.communication.standard.bundle.centralized.CommandAmbulance;
import adf.agent.communication.standard.bundle.centralized.MessageReport;
import adf.agent.communication.standard.bundle.information.MessageAmbulanceTeam;
import adf.agent.communication.standard.bundle.information.MessageCivilian;
import adf.agent.communication.standard.bundle.information.MessageFireBrigade;
import adf.agent.communication.standard.bundle.information.MessagePoliceForce;
import adf.agent.precompute.PrecomputeData;
import adf.component.module.algorithm.Clustering;
import adf.component.communication.CommunicationMessage;
import rescuecore2.standard.entities.AmbulanceTeam;
import rescuecore2.standard.entities.Area;
import rescuecore2.standard.entities.Human;
import rescuecore2.standard.entities.StandardEntityURN;
import rescuecore2.standard.score.BuildingDamageScoreFunction;
import rescuecore2.worldmodel.EntityID;
import rescuecore2.standard.entities.*;
import rescuecore2.worldmodel.Entity;
import adf.debug.TestLogger;
import poli.module.algorithm.PoliClustering;

import org.apache.log4j.Logger;

import java.util.*;

import static rescuecore2.standard.entities.StandardEntityURN.*;

public abstract class PoliClustering extends StaticClustering {

  public PoliClustering( AgentInfo ai, WorldInfo wi, ScenarioInfo si, ModuleManager moduleManager, DevelopData developData ) {
    super( ai, wi, si, moduleManager, developData );
  }
  
  public abstract Map<Integer, StandardEntity> getClusterCenter();

  public abstract StandardEntity getNearEntity( WorldInfo worldInfo, List<StandardEntity> srcEntityList, StandardEntity targetEntity );
}