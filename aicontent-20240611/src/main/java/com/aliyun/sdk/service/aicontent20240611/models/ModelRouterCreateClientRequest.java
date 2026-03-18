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
    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact")
    private String contact;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private ModelRouterCreateClientRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.allowedModels = builder.allowedModels;
        this.contact = builder.contact;
        this.name = builder.name;
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

    public static final class Builder extends Request.Builder<ModelRouterCreateClientRequest, Builder> {
        private String address; 
        private String allowedModels; 
        private String contact; 
        private String name; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateClientRequest request) {
            super(request);
            this.address = request.address;
            this.allowedModels = request.allowedModels;
            this.contact = request.contact;
            this.name = request.name;
            this.remark = request.remark;
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

        @Override
        public ModelRouterCreateClientRequest build() {
            return new ModelRouterCreateClientRequest(this);
        } 

    } 

}
