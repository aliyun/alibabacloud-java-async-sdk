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
 * {@link ClientDTO} extends {@link TeaModel}
 *
 * <p>ClientDTO</p>
 */
public class ClientDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

    @com.aliyun.core.annotation.NameInMap("clientUuid")
    private String clientUuid;

    @com.aliyun.core.annotation.NameInMap("contact")
    private String contact;

    @com.aliyun.core.annotation.NameInMap("deleteTag")
    private Integer deleteTag;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("main")
    private Integer main;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private ClientDTO(Builder builder) {
        this.address = builder.address;
        this.allowedModels = builder.allowedModels;
        this.clientUuid = builder.clientUuid;
        this.contact = builder.contact;
        this.deleteTag = builder.deleteTag;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.main = builder.main;
        this.name = builder.name;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientDTO create() {
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
     * @return clientUuid
     */
    public String getClientUuid() {
        return this.clientUuid;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @return deleteTag
     */
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return main
     */
    public Integer getMain() {
        return this.main;
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
        private String clientUuid; 
        private String contact; 
        private Integer deleteTag; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private Integer main; 
        private String name; 
        private String remark; 

        private Builder() {
        } 

        private Builder(ClientDTO model) {
            this.address = model.address;
            this.allowedModels = model.allowedModels;
            this.clientUuid = model.clientUuid;
            this.contact = model.contact;
            this.deleteTag = model.deleteTag;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.main = model.main;
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
         * clientUuid.
         */
        public Builder clientUuid(String clientUuid) {
            this.clientUuid = clientUuid;
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
         * deleteTag.
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * main.
         */
        public Builder main(Integer main) {
            this.main = main;
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

        public ClientDTO build() {
            return new ClientDTO(this);
        } 

    } 

}
