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
 * {@link ClientUpdateCmd} extends {@link TeaModel}
 *
 * <p>ClientUpdateCmd</p>
 */
public class ClientUpdateCmd extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private ClientUpdateCmd(Builder builder) {
        this.address = builder.address;
        this.allowedModels = builder.allowedModels;
        this.contact = builder.contact;
        this.name = builder.name;
        this.remark = builder.remark;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientUpdateCmd create() {
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

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String address; 
        private String allowedModels; 
        private String contact; 
        private String name; 
        private String remark; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(ClientUpdateCmd model) {
            this.address = model.address;
            this.allowedModels = model.allowedModels;
            this.contact = model.contact;
            this.name = model.name;
            this.remark = model.remark;
            this.status = model.status;
        } 

        /**
         * <p>The company address.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * <p>The list of allowed model IDs, separated by commas. An empty value indicates all models.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder allowedModels(String allowedModels) {
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
            this.contact = contact;
            return this;
        }

        /**
         * <p>The customer name.</p>
         * 
         * <strong>example:</strong>
         * <p>My customer</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Remark</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public ClientUpdateCmd build() {
            return new ClientUpdateCmd(this);
        } 

    } 

}
