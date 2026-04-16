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
 * {@link ModelRouterUpdateClientRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterUpdateClientRequest</p>
 */
public class ModelRouterUpdateClientRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

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
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private ModelRouterUpdateClientRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.address = builder.address;
        this.allowedModels = builder.allowedModels;
        this.contact = builder.contact;
        this.discount = builder.discount;
        this.name = builder.name;
        this.remark = builder.remark;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterUpdateClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModelRouterUpdateClientRequest, Builder> {
        private Long id; 
        private String address; 
        private String allowedModels; 
        private String contact; 
        private Double discount; 
        private String name; 
        private String remark; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterUpdateClientRequest request) {
            super(request);
            this.id = request.id;
            this.address = request.address;
            this.allowedModels = request.allowedModels;
            this.contact = request.contact;
            this.discount = request.discount;
            this.name = request.name;
            this.remark = request.remark;
            this.status = request.status;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * address.
         */
        public Builder address(String address) {
            this.putBodyParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * allowedModels.
         */
        public Builder allowedModels(String allowedModels) {
            this.putBodyParameter("allowedModels", allowedModels);
            this.allowedModels = allowedModels;
            return this;
        }

        /**
         * contact.
         */
        public Builder contact(String contact) {
            this.putBodyParameter("contact", contact);
            this.contact = contact;
            return this;
        }

        /**
         * discount.
         */
        public Builder discount(Double discount) {
            this.putBodyParameter("discount", discount);
            this.discount = discount;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModelRouterUpdateClientRequest build() {
            return new ModelRouterUpdateClientRequest(this);
        } 

    } 

}
