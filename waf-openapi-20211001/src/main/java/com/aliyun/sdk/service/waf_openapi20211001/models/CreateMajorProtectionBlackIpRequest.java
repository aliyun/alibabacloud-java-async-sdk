// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMajorProtectionBlackIpRequest} extends {@link RequestModel}
 *
 * <p>CreateMajorProtectionBlackIpRequest</p>
 */
public class CreateMajorProtectionBlackIpRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExpiredTime")
    @Validation(required = true)
    private Long expiredTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IpList")
    @Validation(required = true)
    private String ipList;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private CreateMajorProtectionBlackIpRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.instanceId = builder.instanceId;
        this.ipList = builder.ipList;
        this.ruleId = builder.ruleId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMajorProtectionBlackIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
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

    public static final class Builder extends Request.Builder<CreateMajorProtectionBlackIpRequest, Builder> {
        private String description; 
        private Long expiredTime; 
        private String instanceId; 
        private String ipList; 
        private Long ruleId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMajorProtectionBlackIpRequest request) {
            super(request);
            this.description = request.description;
            this.expiredTime = request.expiredTime;
            this.instanceId = request.instanceId;
            this.ipList = request.ipList;
            this.ruleId = request.ruleId;
            this.templateId = request.templateId;
        } 

        /**
         * 防护对象1domain 	描述信息。
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(Long expiredTime) {
            this.putQueryParameter("ExpiredTime", expiredTime);
            this.expiredTime = expiredTime;
            return this;
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
         * IpList.
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
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
        public CreateMajorProtectionBlackIpRequest build() {
            return new CreateMajorProtectionBlackIpRequest(this);
        } 

    } 

}
