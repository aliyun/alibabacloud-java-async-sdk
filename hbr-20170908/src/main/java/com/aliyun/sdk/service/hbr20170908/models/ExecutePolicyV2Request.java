// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link ExecutePolicyV2Request} extends {@link RequestModel}
 *
 * <p>ExecutePolicyV2Request</p>
 */
public class ExecutePolicyV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ExecutePolicyV2Request(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.policyId = builder.policyId;
        this.ruleId = builder.ruleId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecutePolicyV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ExecutePolicyV2Request, Builder> {
        private String dataSourceId; 
        private String policyId; 
        private String ruleId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ExecutePolicyV2Request request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.policyId = request.policyId;
            this.ruleId = request.ruleId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>Data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1************dtv</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putBodyParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>Policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************hky</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>Rule ID, limited to executing rules of <strong>RuleType</strong> <strong>BACKUP</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-0002*****ux8</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>Data source type, with the value range as follows:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: Represents ECS full machine backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ExecutePolicyV2Request build() {
            return new ExecutePolicyV2Request(this);
        } 

    } 

}
