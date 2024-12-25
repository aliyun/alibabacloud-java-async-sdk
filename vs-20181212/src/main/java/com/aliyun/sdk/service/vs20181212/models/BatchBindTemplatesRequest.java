// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchBindTemplatesRequest} extends {@link RequestModel}
 *
 * <p>BatchBindTemplatesRequest</p>
 */
public class BatchBindTemplatesRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
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

        private Builder(BatchBindTemplatesRequest request) {
            super(request);
            this.applyAll = request.applyAll;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.ownerId = request.ownerId;
            this.replace = request.replace;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****994-cn-qingdao</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stream</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****998-cn-qingdao</p>
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
