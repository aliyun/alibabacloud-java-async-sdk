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

    @com.aliyun.core.annotation.NameInMap("allowedModelGroupConfig")
    private String allowedModelGroupConfig;

    @com.aliyun.core.annotation.NameInMap("allowedModels")
    private String allowedModels;

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

    @com.aliyun.core.annotation.NameInMap("nodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("parentId")
    private Long parentId;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("userId")
    private Long userId;

    private ClientDTO(Builder builder) {
        this.address = builder.address;
        this.allowedModelGroupConfig = builder.allowedModelGroupConfig;
        this.allowedModels = builder.allowedModels;
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
        this.nodeType = builder.nodeType;
        this.parentId = builder.parentId;
        this.remark = builder.remark;
        this.userId = builder.userId;
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
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
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

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String address; 
        private String allowedModelGroupConfig; 
        private String allowedModels; 
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
        private String nodeType; 
        private Long parentId; 
        private String remark; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(ClientDTO model) {
            this.address = model.address;
            this.allowedModelGroupConfig = model.allowedModelGroupConfig;
            this.allowedModels = model.allowedModels;
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
            this.nodeType = model.nodeType;
            this.parentId = model.parentId;
            this.remark = model.remark;
            this.userId = model.userId;
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
         * <p>The authorization management configuration in the format of {&quot;model_ids&quot;:[...],&quot;group_ids&quot;:[...]}. An empty value indicates that group authorization is not used.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;model_ids&quot;:[1,2],&quot;group_ids&quot;:[&quot;mg_xxx&quot;]}</p>
         */
        public Builder allowedModelGroupConfig(String allowedModelGroupConfig) {
            this.allowedModelGroupConfig = allowedModelGroupConfig;
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
         * <p>The customer UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>st-xxxx</p>
         */
        public Builder clientUuid(String clientUuid) {
            this.clientUuid = clientUuid;
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
         * <p>The status. A value of 0 indicates enabled, and a non-zero value indicates disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * <p>The discount factor. A value of 1.0 indicates no discount.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder discount(Double discount) {
            this.discount = discount;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The hierarchy level. Valid values: 1 to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * <p>The account type. A value of 0 indicates a main account, and a value of 1 indicates a regular account.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder main(Integer main) {
            this.main = main;
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
         * <p>The node type. Valid values: department: Department. user: User node, which is a leaf in the department tree.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The parent department ID. An empty value indicates the top level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parentId(Long parentId) {
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
            this.remark = remark;
            return this;
        }

        /**
         * <p>The user ID. This field has a value only when the node type is user.</p>
         * 
         * <strong>example:</strong>
         * <p>30001</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public ClientDTO build() {
            return new ClientDTO(this);
        } 

    } 

}
