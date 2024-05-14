// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeSolutionRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeSolutionRequest</p>
 */
public class GetQueryOptimizeSolutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlId;

    private GetQueryOptimizeSolutionRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.ruleIds = builder.ruleIds;
        this.sqlId = builder.sqlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeSolutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeSolutionRequest, Builder> {
        private String engine; 
        private String instanceId; 
        private String ruleIds; 
        private String sqlId; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeSolutionRequest request) {
            super(request);
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.ruleIds = request.ruleIds;
            this.sqlId = request.sqlId;
        } 

        /**
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PolarDBMySQL**
         * *   **PostgreSQL**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The instance ID. You can call the [GetQueryOptimizeDataStats](~~405261~~) operation to query the instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The tag ID. For more information, see [Query governance](~~290038~~).
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * The SQL template ID. You can call the [GetQueryOptimizeDataStats](~~405261~~) operation to query the SQL template ID.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        @Override
        public GetQueryOptimizeSolutionRequest build() {
            return new GetQueryOptimizeSolutionRequest(this);
        } 

    } 

}
