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
 * {@link ClientCreateCmd} extends {@link TeaModel}
 *
 * <p>ClientCreateCmd</p>
 */
public class ClientCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

    @com.aliyun.core.annotation.NameInMap("contact")
    private String contact;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private ClientCreateCmd(Builder builder) {
        this.address = builder.address;
        this.allowedModels = builder.allowedModels;
        this.contact = builder.contact;
        this.name = builder.name;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientCreateCmd create() {
        return builder().build();
    }

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

    public static final class Builder {
        private String address; 
        private String allowedModels; 
        private String contact; 
        private String name; 
        private String remark; 

        private Builder() {
        } 

        private Builder(ClientCreateCmd model) {
            this.address = model.address;
            this.allowedModels = model.allowedModels;
            this.contact = model.contact;
            this.name = model.name;
            this.remark = model.remark;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * allowedModels.
         */
        public Builder allowedModels(String allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }

        /**
         * contact.
         */
        public Builder contact(String contact) {
            this.contact = contact;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public ClientCreateCmd build() {
            return new ClientCreateCmd(this);
        } 

    } 

}
