package poli.module.algorithm;

import adf.agent.develop.DevelopData;
import adf.agent.info.AgentInfo;
import adf.agent.info.ScenarioInfo;
import adf.agent.info.WorldInfo;
import adf.agent.module.ModuleManager;
import adf.component.module.algorithm.StaticClustering;
import java.util.Map;
import rescuecore2.standard.entities.StandardEntity;

public abstract class PoliClustering extends StaticClustering {

  public PoliClustering( AgentInfo ai, WorldInfo wi, ScenarioInfo si, ModuleManager moduleManager, DevelopData developData ) {
    super( ai, wi, si, moduleManager, developData );
  }
  
  public abstract Map<Integer, StandardEntity> getClusterCenter();
}