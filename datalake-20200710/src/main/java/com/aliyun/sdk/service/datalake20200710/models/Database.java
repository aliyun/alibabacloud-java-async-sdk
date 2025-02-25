// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Database} extends {@link TeaModel}
 *
 * <p>Database</p>
 */
public class Database extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Integer createTime;

    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("LocationUri")
    private String locationUri;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerName")
    private String ownerName;

    @com.aliyun.core.annotation.NameInMap("OwnerType")
    private String ownerType;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @com.aliyun.core.annotation.NameInMap("Privileges")
    private PrincipalPrivilegeSet privileges;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Integer updateTime;

    private Database(Builder builder) {
        this.createTime = builder.createTime;
        this.createdBy = builder.createdBy;
        this.description = builder.description;
        this.locationUri = builder.locationUri;
        this.name = builder.name;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.parameters = builder.parameters;
        this.privileges = builder.privileges;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Database create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return locationUri
     */
    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerName
     */
    public String getOwnerName() {
        return this.ownerName;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return privileges
     */
    public PrincipalPrivilegeSet getPrivileges() {
        return this.privileges;
    }

    /**
     * @return updateTime
     */
    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Integer createTime; 
        private String createdBy; 
        private String description; 
        private String locationUri; 
        private String name; 
        private String ownerName; 
        private String ownerType; 
        private java.util.Map < String, String > parameters; 
        private PrincipalPrivilegeSet privileges; 
        private Integer updateTime; 

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * LocationUri.
         */
        public Builder locationUri(String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OwnerName.
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * OwnerType.
         */
        public Builder ownerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * Privileges.
         */
        public Builder privileges(PrincipalPrivilegeSet privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Integer updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Database build() {
            return new Database(this);
        } 

    } 

}
