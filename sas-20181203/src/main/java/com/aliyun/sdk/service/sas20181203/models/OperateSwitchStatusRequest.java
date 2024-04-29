// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateSwitchStatusRequest} extends {@link RequestModel}
 *
 * <p>OperateSwitchStatusRequest</p>
 */
public class OperateSwitchStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private OperateSwitchStatusRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateSwitchStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<OperateSwitchStatusRequest, Builder> {
        private Long ruleId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(OperateSwitchStatusRequest request) {
            super(request);
            this.ruleId = request.ruleId;
            this.status = request.status;
        } 

        /**
         * The rule ID.
         * <p>
         * 
         * >  You can call the [ListContainerDefenseRule](~~2590599~~) operation to query the rule ID.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The rule status for container tamper-proofing. Valid values:
         * <p>
         * - **on**
         * - **off**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public OperateSwitchStatusRequest build() {
            return new OperateSwitchStatusRequest(this);
        } 

    } 

}
