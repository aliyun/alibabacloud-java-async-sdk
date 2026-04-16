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
 * {@link ClientTreeDTO} extends {@link TeaModel}
 *
 * <p>ClientTreeDTO</p>
 */
public class ClientTreeDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

    @com.aliyun.core.annotation.NameInMap("children")
    private java.util.List<ClientTreeDTO> children;

    @com.aliyun.core.annotation.NameInMap("clientUuid")
    private String clientUuid;

    @com.aliyun.core.annotation.NameInMap("contact")
    private String contact;

    @com.aliyun.core.annotation.NameInMap("deleteTag")
    private Integer deleteTag;

    @com.aliyun.core.annotation.NameInMap("discount")
    private Double discount;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("level")
    private Integer level;

    @com.aliyun.core.annotation.NameInMap("main")
    private Integer main;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private ClientTreeDTO(Builder builder) {
        this.address = builder.address;
        this.allowedModels = builder.allowedModels;
        this.children = builder.children;
        this.clientUuid = builder.clientUuid;
        this.contact = builder.contact;
        this.deleteTag = builder.deleteTag;
        this.discount = builder.discount;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.level = builder.level;
        this.main = builder.main;
        this.name = builder.name;
        this.parentId = builder.parentId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientTreeDTO create() {
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
     * @return children
     */
    public java.util.List<ClientTreeDTO> getChildren() {
        return this.children;
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
     * @return discount
     */
    public Double getDiscount() {
        return this.discount;
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
     * @return level
     */
    public Integer getLevel() {
        return this.level;
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

    public static final class Builder {
        private String address; 
        private String allowedModels; 
        private java.util.List<ClientTreeDTO> children; 
        private String clientUuid; 
        private String contact; 
        private Integer deleteTag; 
        private Double discount; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private Integer level; 
        private Integer main; 
        private String name; 
        private Long parentId; 
        private String remark; 

        private Builder() {
        } 

        private Builder(ClientTreeDTO model) {
            this.address = model.address;
            this.allowedModels = model.allowedModels;
            this.children = model.children;
            this.clientUuid = model.clientUuid;
            this.contact = model.contact;
            this.deleteTag = model.deleteTag;
            this.discount = model.discount;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.level = model.level;
            this.main = model.main;
            this.name = model.name;
            this.parentId = model.parentId;
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
         * children.
         */
        public Builder children(java.util.List<ClientTreeDTO> children) {
            this.children = children;
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
         * discount.
         */
        public Builder discount(Double discount) {
            this.discount = discount;
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
         * level.
         */
        public Builder level(Integer level) {
            this.level = level;
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
         * parentId.
         */
        public Builder parentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public ClientTreeDTO build() {
            return new ClientTreeDTO(this);
        } 

    } 

}
