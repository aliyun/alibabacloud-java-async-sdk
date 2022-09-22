// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEcsScenarioFacadeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEcsScenarioFacadeRequest</p>
 */
public class DescribeEcsScenarioFacadeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ExtMap")
    private java.util.Map < String, String > extMap;

    @Query
    @NameInMap("ExtParam")
    private String extParam;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScenarioList")
    private java.util.List < ScenarioList> scenarioList;

    private DescribeEcsScenarioFacadeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.extMap = builder.extMap;
        this.extParam = builder.extParam;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scenarioList = builder.scenarioList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEcsScenarioFacadeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return extMap
     */
    public java.util.Map < String, String > getExtMap() {
        return this.extMap;
    }

    /**
     * @return extParam
     */
    public String getExtParam() {
        return this.extParam;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scenarioList
     */
    public java.util.List < ScenarioList> getScenarioList() {
        return this.scenarioList;
    }

    public static final class Builder extends Request.Builder<DescribeEcsScenarioFacadeRequest, Builder> {
        private String sourceRegionId; 
        private java.util.Map < String, String > extMap; 
        private String extParam; 
        private Long ownerId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private java.util.List < ScenarioList> scenarioList; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEcsScenarioFacadeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.extMap = request.extMap;
            this.extParam = request.extParam;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scenarioList = request.scenarioList;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ExtMap.
         */
        public Builder extMap(java.util.Map < String, String > extMap) {
            this.putQueryParameter("ExtMap", extMap);
            this.extMap = extMap;
            return this;
        }

        /**
         * ExtParam.
         */
        public Builder extParam(String extParam) {
            this.putQueryParameter("ExtParam", extParam);
            this.extParam = extParam;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ScenarioList.
         */
        public Builder scenarioList(java.util.List < ScenarioList> scenarioList) {
            this.putQueryParameter("ScenarioList", scenarioList);
            this.scenarioList = scenarioList;
            return this;
        }

        @Override
        public DescribeEcsScenarioFacadeRequest build() {
            return new DescribeEcsScenarioFacadeRequest(this);
        } 

    } 

    public static class ScenarioResources extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Values")
        private java.util.List < String > values;

        private ScenarioResources(Builder builder) {
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenarioResources create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String type; 
            private java.util.List < String > values; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public ScenarioResources build() {
                return new ScenarioResources(this);
            } 

        } 

    }
    public static class ScenarioList extends TeaModel {
        @NameInMap("Scenario")
        private String scenario;

        @NameInMap("ScenarioResources")
        private java.util.List < ScenarioResources> scenarioResources;

        private ScenarioList(Builder builder) {
            this.scenario = builder.scenario;
            this.scenarioResources = builder.scenarioResources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenarioList create() {
            return builder().build();
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return scenarioResources
         */
        public java.util.List < ScenarioResources> getScenarioResources() {
            return this.scenarioResources;
        }

        public static final class Builder {
            private String scenario; 
            private java.util.List < ScenarioResources> scenarioResources; 

            /**
             * Scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * ScenarioResources.
             */
            public Builder scenarioResources(java.util.List < ScenarioResources> scenarioResources) {
                this.scenarioResources = scenarioResources;
                return this;
            }

            public ScenarioList build() {
                return new ScenarioList(this);
            } 

        } 

    }
}
