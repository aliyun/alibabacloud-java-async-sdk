// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABMetricRequest} extends {@link RequestModel}
 *
 * <p>UpdateABMetricRequest</p>
 */
public class UpdateABMetricRequest extends Request {
    @Path
    @NameInMap("ABMetricId")
    @Validation(required = true)
    private String ABMetricId;

    @Body
    @NameInMap("Definition")
    @Validation(required = true)
    private String definition;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("LeftMetricId")
    private String leftMetricId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Operator")
    private String operator;

    @Body
    @NameInMap("Realtime")
    @Validation(required = true)
    private Boolean realtime;

    @Body
    @NameInMap("ResultResourceId")
    private String resultResourceId;

    @Body
    @NameInMap("RightMetricId")
    private String rightMetricId;

    @Body
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    @Body
    @NameInMap("StatisticsCycle")
    private Integer statisticsCycle;

    @Body
    @NameInMap("TableMetaId")
    @Validation(required = true)
    private String tableMetaId;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdateABMetricRequest(Builder builder) {
        super(builder);
        this.ABMetricId = builder.ABMetricId;
        this.definition = builder.definition;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.leftMetricId = builder.leftMetricId;
        this.name = builder.name;
        this.operator = builder.operator;
        this.realtime = builder.realtime;
        this.resultResourceId = builder.resultResourceId;
        this.rightMetricId = builder.rightMetricId;
        this.sceneId = builder.sceneId;
        this.statisticsCycle = builder.statisticsCycle;
        this.tableMetaId = builder.tableMetaId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateABMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricId
     */
    public String getABMetricId() {
        return this.ABMetricId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
    public Boolean getRealtime() {
        return this.realtime;
    }

    /**
     * @return resultResourceId
     */
    public String getResultResourceId() {
        return this.resultResourceId;
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

    public static final class Builder extends Request.Builder<UpdateABMetricRequest, Builder> {
        private String ABMetricId; 
        private String definition; 
        private String description; 
        private String instanceId; 
        private String leftMetricId; 
        private String name; 
        private String operator; 
        private Boolean realtime; 
        private String resultResourceId; 
        private String rightMetricId; 
        private String sceneId; 
        private Integer statisticsCycle; 
        private String tableMetaId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateABMetricRequest request) {
            super(request);
            this.ABMetricId = request.ABMetricId;
            this.definition = request.definition;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.leftMetricId = request.leftMetricId;
            this.name = request.name;
            this.operator = request.operator;
            this.realtime = request.realtime;
            this.resultResourceId = request.resultResourceId;
            this.rightMetricId = request.rightMetricId;
            this.sceneId = request.sceneId;
            this.statisticsCycle = request.statisticsCycle;
            this.tableMetaId = request.tableMetaId;
            this.type = request.type;
        } 

        /**
         * ABMetricId.
         */
        public Builder ABMetricId(String ABMetricId) {
            this.putPathParameter("ABMetricId", ABMetricId);
            this.ABMetricId = ABMetricId;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LeftMetricId.
         */
        public Builder leftMetricId(String leftMetricId) {
            this.putBodyParameter("LeftMetricId", leftMetricId);
            this.leftMetricId = leftMetricId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * Realtime.
         */
        public Builder realtime(Boolean realtime) {
            this.putBodyParameter("Realtime", realtime);
            this.realtime = realtime;
            return this;
        }

        /**
         * ResultResourceId.
         */
        public Builder resultResourceId(String resultResourceId) {
            this.putBodyParameter("ResultResourceId", resultResourceId);
            this.resultResourceId = resultResourceId;
            return this;
        }

        /**
         * RightMetricId.
         */
        public Builder rightMetricId(String rightMetricId) {
            this.putBodyParameter("RightMetricId", rightMetricId);
            this.rightMetricId = rightMetricId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * StatisticsCycle.
         */
        public Builder statisticsCycle(Integer statisticsCycle) {
            this.putBodyParameter("StatisticsCycle", statisticsCycle);
            this.statisticsCycle = statisticsCycle;
            return this;
        }

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putBodyParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateABMetricRequest build() {
            return new UpdateABMetricRequest(this);
        } 

    } 

}
