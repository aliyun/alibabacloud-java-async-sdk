// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterCreateClientRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateClientRequest</p>
 */
public class ModelRouterCreateClientRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowedModelGroupConfig")
    private String allowedModelGroupConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact")
    private String contact;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("discount")
    private Double discount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private ModelRouterCreateClientRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.allowedModelGroupConfig = builder.allowedModelGroupConfig;
        this.allowedModels = builder.allowedModels;
        this.contact = builder.contact;
        this.discount = builder.discount;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return allowedModelGroupConfig
     */
    public String getAllowedModelGroupConfig() {
        return this.allowedModelGroupConfig;
    }

    /**
     * @return allowedModels
     */
    public String getAllowedModels() {
        return this.allowedModels;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @return discount
     */
    public Double getDiscount() {
        return this.discount;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ModelRouterCreateClientRequest, Builder> {
        private String address; 
        private String allowedModelGroupConfig; 
        private String allowedModels; 
        private String contact; 
        private Double discount; 
        private String name; 
        private Long parentId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateClientRequest request) {
            super(request);
            this.address = request.address;
            this.allowedModelGroupConfig = request.allowedModelGroupConfig;
            this.allowedModels = request.allowedModels;
            this.contact = request.contact;
            this.discount = request.discount;
            this.name = request.name;
            this.parentId = request.parentId;
            this.remark = request.remark;
        } 

        /**
         * <p>The company address.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        public Builder address(String address) {
            this.putBodyParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>The allowed model group configuration in JSON string format: {&quot;model_ids&quot;:[101],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}. If both this field and allowedModels are specified, this field takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;model_ids&quot;:[101],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}</p>
         */
        public Builder allowedModelGroupConfig(String allowedModelGroupConfig) {
            this.putBodyParameter("allowedModelGroupConfig", allowedModelGroupConfig);
            this.allowedModelGroupConfig = allowedModelGroupConfig;
            return this;
        }

        /**
         * <p>The list of allowed model IDs, separated by commas. An empty value indicates all models are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder allowedModels(String allowedModels) {
            this.putBodyParameter("allowedModels", allowedModels);
            this.allowedModels = allowedModels;
            return this;
        }

        /**
         * <p>The contact information.</p>
         * 
         * <strong>example:</strong>
         * <p>13800138000</p>
         */
        public Builder contact(String contact) {
            this.putBodyParameter("contact", contact);
            this.contact = contact;
            return this;
        }

        /**
         * <p>The discount coefficient. A value of 1.0 indicates no discount, and 0.8 indicates a 20% discount. Default value: 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder discount(Double discount) {
            this.putBodyParameter("discount", discount);
            this.discount = discount;
            return this;
        }

        /**
         * <p>The customer name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCustomer</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the parent department. If not specified, a top-level department is created.</p>
         * 
         * <strong>example:</strong>
         * <p>292090</p>
         */
        public Builder parentId(Long parentId) {
            this.putBodyParameter("parentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Remarks</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ModelRouterCreateClientRequest build() {
            return new ModelRouterCreateClientRequest(this);
        } 

    } 

}
