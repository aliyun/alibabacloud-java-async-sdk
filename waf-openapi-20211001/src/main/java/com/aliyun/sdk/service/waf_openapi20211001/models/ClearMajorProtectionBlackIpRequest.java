// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearMajorProtectionBlackIpRequest} extends {@link RequestModel}
 *
 * <p>ClearMajorProtectionBlackIpRequest</p>
 */
public class ClearMajorProtectionBlackIpRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private ClearMajorProtectionBlackIpRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ruleId = builder.ruleId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearMajorProtectionBlackIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ClearMajorProtectionBlackIpRequest, Builder> {
        private String instanceId; 
        private Long ruleId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ClearMajorProtectionBlackIpRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ruleId = request.ruleId;
            this.templateId = request.templateId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ClearMajorProtectionBlackIpRequest build() {
            return new ClearMajorProtectionBlackIpRequest(this);
        } 

    } 

}
