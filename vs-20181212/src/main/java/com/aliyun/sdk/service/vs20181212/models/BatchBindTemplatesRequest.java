// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindTemplatesRequest} extends {@link RequestModel}
 *
 * <p>BatchBindTemplatesRequest</p>
 */
public class BatchBindTemplatesRequest extends Request {
    @Query
    @NameInMap("ApplyAll")
    private Boolean applyAll;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Replace")
    private Boolean replace;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    private BatchBindTemplatesRequest(Builder builder) {
        super(builder);
        this.applyAll = builder.applyAll;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.ownerId = builder.ownerId;
        this.replace = builder.replace;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindTemplatesRequest create() {
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

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<BatchBindTemplatesRequest, Builder> {
        private Boolean applyAll; 
        private String instanceId; 
        private String instanceType; 
        private Long ownerId; 
        private Boolean replace; 
        private String templateId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindTemplatesRequest response) {
            super(response);
            this.applyAll = response.applyAll;
            this.instanceId = response.instanceId;
            this.instanceType = response.instanceType;
            this.ownerId = response.ownerId;
            this.replace = response.replace;
            this.templateId = response.templateId;
            this.templateType = response.templateType;
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

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public BatchBindTemplatesRequest build() {
            return new BatchBindTemplatesRequest(this);
        } 

    } 

}
