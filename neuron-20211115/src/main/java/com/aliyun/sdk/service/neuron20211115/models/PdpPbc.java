// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PdpPbc} extends {@link TeaModel}
 *
 * <p>PdpPbc</p>
 */
public class PdpPbc extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.NameInMap("company")
    @com.aliyun.core.annotation.Validation(required = true)
    private String company;

    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("developerId")
    private String developerId;

    @com.aliyun.core.annotation.NameInMap("gitGroup")
    private String gitGroup;

    @com.aliyun.core.annotation.NameInMap("gitGroupInfo")
    private String gitGroupInfo;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("snowbergDisplay")
    private Boolean snowbergDisplay;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PdpPbc(Builder builder) {
        this.alias = builder.alias;
        this.company = builder.company;
        this.companyId = builder.companyId;
        this.description = builder.description;
        this.developerId = builder.developerId;
        this.gitGroup = builder.gitGroup;
        this.gitGroupInfo = builder.gitGroupInfo;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.snowbergDisplay = builder.snowbergDisplay;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpPbc create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return developerId
     */
    public String getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return gitGroup
     */
    public String getGitGroup() {
        return this.gitGroup;
    }

    /**
     * @return gitGroupInfo
     */
    public String getGitGroupInfo() {
        return this.gitGroupInfo;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snowbergDisplay
     */
    public Boolean getSnowbergDisplay() {
        return this.snowbergDisplay;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String alias; 
        private String company; 
        private Long companyId; 
        private String description; 
        private String developerId; 
        private String gitGroup; 
        private String gitGroupInfo; 
        private String gmtCreate; 
        private Long id; 
        private String name; 
        private String requestId; 
        private Boolean snowbergDisplay; 
        private String type; 

        private Builder() {
        } 

        private Builder(PdpPbc model) {
            this.alias = model.alias;
            this.company = model.company;
            this.companyId = model.companyId;
            this.description = model.description;
            this.developerId = model.developerId;
            this.gitGroup = model.gitGroup;
            this.gitGroupInfo = model.gitGroupInfo;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.name = model.name;
            this.requestId = model.requestId;
            this.snowbergDisplay = model.snowbergDisplay;
            this.type = model.type;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>基础商品</p>
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>多端商城</p>
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * developerId.
         */
        public Builder developerId(String developerId) {
            this.developerId = developerId;
            return this;
        }

        /**
         * gitGroup.
         */
        public Builder gitGroup(String gitGroup) {
            this.gitGroup = gitGroup;
            return this;
        }

        /**
         * gitGroupInfo.
         */
        public Builder gitGroupInfo(String gitGroupInfo) {
            this.gitGroupInfo = gitGroupInfo;
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
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * snowbergDisplay.
         */
        public Builder snowbergDisplay(Boolean snowbergDisplay) {
            this.snowbergDisplay = snowbergDisplay;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PdpPbc build() {
            return new PdpPbc(this);
        } 

    } 

}
