// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateStorageDomainRoutingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStorageDomainRoutingRuleResponseBody</p>
 */
public class CreateStorageDomainRoutingRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateStorageDomainRoutingRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageDomainRoutingRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private String ruleId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateStorageDomainRoutingRuleResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.ruleId = model.ruleId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The request ID</p>
         * 
         * <strong>example:</strong>
         * <p>C8E90AB5-0A96-5D12-9E59-11EE463*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crsdr-n6pbhgjx*****</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>Identification of whether the request is successful or not</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateStorageDomainRoutingRuleResponseBody build() {
            return new CreateStorageDomainRoutingRuleResponseBody(this);
        } 

    } 

}
