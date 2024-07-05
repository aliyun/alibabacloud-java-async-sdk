// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindTemplateRequest} extends {@link RequestModel}
 *
 * <p>BatchBindTemplateRequest</p>
 */
public class BatchBindTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyAll")
    private Boolean applyAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replace")
    private Boolean replace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private BatchBindTemplateRequest(Builder builder) {
        super(builder);
        this.applyAll = builder.applyAll;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.ownerId = builder.ownerId;
        this.replace = builder.replace;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyAll
     */
    public Boolean getApplyAll() {
        return this.applyAll;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return replace
     */
    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<BatchBindTemplateRequest, Builder> {
        private Boolean applyAll; 
        private String instanceId; 
        private String instanceType; 
        private Long ownerId; 
        private Boolean replace; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindTemplateRequest request) {
            super(request);
            this.applyAll = request.applyAll;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.ownerId = request.ownerId;
            this.replace = request.replace;
            this.templateId = request.templateId;
        } 

        /**
         * ApplyAll.
         */
        public Builder applyAll(Boolean applyAll) {
            this.putQueryParameter("ApplyAll", applyAll);
            this.applyAll = applyAll;
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Replace.
         */
        public Builder replace(Boolean replace) {
            this.putQueryParameter("Replace", replace);
            this.replace = replace;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public BatchBindTemplateRequest build() {
            return new BatchBindTemplateRequest(this);
        } 

    } 

}
