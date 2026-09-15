// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddCheckResultWhiteListRequest} extends {@link RequestModel}
 *
 * <p>AddCheckResultWhiteListRequest</p>
 */
public class AddCheckResultWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List<Long> checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    private AddCheckResultWhiteListRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.instanceIds = builder.instanceIds;
        this.remark = builder.remark;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCheckResultWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<AddCheckResultWhiteListRequest, Builder> {
        private java.util.List<Long> checkIds; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<String> instanceIds; 
        private String remark; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(AddCheckResultWhiteListRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.instanceIds = request.instanceIds;
            this.remark = request.remark;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The IDs of the check items.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder checkIds(java.util.List<Long> checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values: true: performs only a dry run without executing the actual operation. false: performs the actual operation. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance IDs of the cloud service instances to add to the whitelist. Separate multiple instance IDs with commas (,).</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The remarks. Maximum length: 65,535 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The rule type. Default value: <strong>WHITE</strong>. Valid values:</p>
         * <ul>
         * <li><strong>WHITE</strong>: Add to whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHITE</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public AddCheckResultWhiteListRequest build() {
            return new AddCheckResultWhiteListRequest(this);
        } 

    } 

}
