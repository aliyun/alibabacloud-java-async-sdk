// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateABMetricRequest} extends {@link RequestModel}
 *
 * <p>CreateABMetricRequest</p>
 */
public class CreateABMetricRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String definition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeftMetricId")
    private String leftMetricId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Realtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean realtime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResultResourceId")
    private String resultResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RightMetricId")
    private String rightMetricId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisticsCycle")
    private Integer statisticsCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateABMetricRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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

    public static CreateABMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateABMetricRequest, Builder> {
        private String regionId; 
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

        private Builder(CreateABMetricRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sum(click_cnt)</p>
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-test1</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pv</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putBodyParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateABMetricRequest build() {
            return new CreateABMetricRequest(this);
        } 

    } 

}
