// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseTemplateStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseTemplateStatusRequest</p>
 */
public class ModifyDefenseTemplateStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    @Query
    @NameInMap("TemplateStatus")
    @Validation(required = true)
    private Integer templateStatus;

    private ModifyDefenseTemplateStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
        this.templateStatus = builder.templateStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseTemplateStatusRequest create() {
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateStatus
     */
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseTemplateStatusRequest, Builder> {
        private String instanceId; 
        private Long templateId; 
        private Integer templateStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseTemplateStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
            this.templateStatus = request.templateStatus;
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
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateStatus.
         */
        public Builder templateStatus(Integer templateStatus) {
            this.putQueryParameter("TemplateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        @Override
        public ModifyDefenseTemplateStatusRequest build() {
            return new ModifyDefenseTemplateStatusRequest(this);
        } 

    } 

}
