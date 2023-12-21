// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetABMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetABMetricResponseBody</p>
 */
public class GetABMetricResponseBody extends TeaModel {
    @NameInMap("Definition")
    private String definition;

    @NameInMap("Description")
    private String description;

    @NameInMap("LeftMetricId")
    private String leftMetricId;

    @NameInMap("Name")
    private String name;

    @NameInMap("Operator")
    private String operator;

    @NameInMap("Realtime")
    private String realtime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultResourceId")
    private String resultResourceId;

    @NameInMap("ResultTableMetaId")
    private String resultTableMetaId;

    @NameInMap("RightMetricId")
    private String rightMetricId;

    @NameInMap("SceneId")
    private String sceneId;

    @NameInMap("SceneName")
    private String sceneName;

    @NameInMap("StatisticsCycle")
    private Integer statisticsCycle;

    @NameInMap("TableMetaId")
    private String tableMetaId;

    @NameInMap("Type")
    private String type;

    private GetABMetricResponseBody(Builder builder) {
        this.definition = builder.definition;
        this.description = builder.description;
        this.leftMetricId = builder.leftMetricId;
        this.name = builder.name;
        this.operator = builder.operator;
        this.realtime = builder.realtime;
        this.requestId = builder.requestId;
        this.resultResourceId = builder.resultResourceId;
        this.resultTableMetaId = builder.resultTableMetaId;
        this.rightMetricId = builder.rightMetricId;
        this.sceneId = builder.sceneId;
        this.sceneName = builder.sceneName;
        this.statisticsCycle = builder.statisticsCycle;
        this.tableMetaId = builder.tableMetaId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetABMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return leftMetricId
     */
    public String getLeftMetricId() {
        return this.leftMetricId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return realtime
     */
    public String getRealtime() {
        return this.realtime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultResourceId
     */
    public String getResultResourceId() {
        return this.resultResourceId;
    }

    /**
     * @return resultTableMetaId
     */
    public String getResultTableMetaId() {
        return this.resultTableMetaId;
    }

    /**
     * @return rightMetricId
     */
    public String getRightMetricId() {
        return this.rightMetricId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return statisticsCycle
     */
    public Integer getStatisticsCycle() {
        return this.statisticsCycle;
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String definition; 
        private String description; 
        private String leftMetricId; 
        private String name; 
        private String operator; 
        private String realtime; 
        private String requestId; 
        private String resultResourceId; 
        private String resultTableMetaId; 
        private String rightMetricId; 
        private String sceneId; 
        private String sceneName; 
        private Integer statisticsCycle; 
        private String tableMetaId; 
        private String type; 

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * LeftMetricId.
         */
        public Builder leftMetricId(String leftMetricId) {
            this.leftMetricId = leftMetricId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Realtime.
         */
        public Builder realtime(String realtime) {
            this.realtime = realtime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultResourceId.
         */
        public Builder resultResourceId(String resultResourceId) {
            this.resultResourceId = resultResourceId;
            return this;
        }

        /**
         * ResultTableMetaId.
         */
        public Builder resultTableMetaId(String resultTableMetaId) {
            this.resultTableMetaId = resultTableMetaId;
            return this;
        }

        /**
         * RightMetricId.
         */
        public Builder rightMetricId(String rightMetricId) {
            this.rightMetricId = rightMetricId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }

        /**
         * StatisticsCycle.
         */
        public Builder statisticsCycle(Integer statisticsCycle) {
            this.statisticsCycle = statisticsCycle;
            return this;
        }

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetABMetricResponseBody build() {
            return new GetABMetricResponseBody(this);
        } 

    } 

}
