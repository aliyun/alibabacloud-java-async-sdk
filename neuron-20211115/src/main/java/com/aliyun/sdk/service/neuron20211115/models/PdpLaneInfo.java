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
 * {@link PdpLaneInfo} extends {@link TeaModel}
 *
 * <p>PdpLaneInfo</p>
 */
public class PdpLaneInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("creatorUid")
    private String creatorUid;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("initGroupFlag")
    private Boolean initGroupFlag;

    @com.aliyun.core.annotation.NameInMap("inletServices")
    private String inletServices;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("serviceGroupIds")
    private String serviceGroupIds;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private PdpLaneInfo(Builder builder) {
        this.alias = builder.alias;
        this.companyId = builder.companyId;
        this.creatorName = builder.creatorName;
        this.creatorUid = builder.creatorUid;
        this.description = builder.description;
        this.env = builder.env;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.initGroupFlag = builder.initGroupFlag;
        this.inletServices = builder.inletServices;
        this.name = builder.name;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.serviceGroupIds = builder.serviceGroupIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpLaneInfo create() {
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
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return creatorUid
     */
    public String getCreatorUid() {
        return this.creatorUid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
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
     * @return initGroupFlag
     */
    public Boolean getInitGroupFlag() {
        return this.initGroupFlag;
    }

    /**
     * @return inletServices
     */
    public String getInletServices() {
        return this.inletServices;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return serviceGroupIds
     */
    public String getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String alias; 
        private Long companyId; 
        private String creatorName; 
        private String creatorUid; 
        private String description; 
        private String env; 
        private String gmtCreate; 
        private Long id; 
        private Boolean initGroupFlag; 
        private String inletServices; 
        private String name; 
        private Long productId; 
        private String productName; 
        private String serviceGroupIds; 
        private String type; 

        private Builder() {
        } 

        private Builder(PdpLaneInfo model) {
            this.alias = model.alias;
            this.companyId = model.companyId;
            this.creatorName = model.creatorName;
            this.creatorUid = model.creatorUid;
            this.description = model.description;
            this.env = model.env;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.initGroupFlag = model.initGroupFlag;
            this.inletServices = model.inletServices;
            this.name = model.name;
            this.productId = model.productId;
            this.productName = model.productName;
            this.serviceGroupIds = model.serviceGroupIds;
            this.type = model.type;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * creatorUid.
         */
        public Builder creatorUid(String creatorUid) {
            this.creatorUid = creatorUid;
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
         * env.
         */
        public Builder env(String env) {
            this.env = env;
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
         * initGroupFlag.
         */
        public Builder initGroupFlag(Boolean initGroupFlag) {
            this.initGroupFlag = initGroupFlag;
            return this;
        }

        /**
         * inletServices.
         */
        public Builder inletServices(String inletServices) {
            this.inletServices = inletServices;
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
         * productId.
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * serviceGroupIds.
         */
        public Builder serviceGroupIds(String serviceGroupIds) {
            this.serviceGroupIds = serviceGroupIds;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PdpLaneInfo build() {
            return new PdpLaneInfo(this);
        } 

    } 

}
