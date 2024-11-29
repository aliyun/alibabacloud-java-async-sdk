// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PolarDBMySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1o3z6beqpej****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The tag ID. For more information, see <a href="https://help.aliyun.com/document_detail/290038.html">Query governance</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LARGE_ROWS_EXAMINED</p>
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * <p>The SQL template ID. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query the SQL template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>05fecf7e7b3efd123c4d5197035f****</p>
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
