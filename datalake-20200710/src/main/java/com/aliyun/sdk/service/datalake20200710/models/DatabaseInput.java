// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DatabaseInput} extends {@link TeaModel}
 *
 * <p>DatabaseInput</p>
 */
public class DatabaseInput extends TeaModel {
    @NameInMap("CreateTime")
    private Integer createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("LocationUri")
    private String locationUri;

    @NameInMap("Name")
    private String name;

    @NameInMap("OwnerName")
    private String ownerName;

    @NameInMap("OwnerType")
    private String ownerType;

    @NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @NameInMap("Privileges")
    private PrincipalPrivilegeSet privileges;

    private DatabaseInput(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.locationUri = builder.locationUri;
        this.name = builder.name;
        this.ownerName = builder.ownerName;
        this.ownerType = builder.ownerType;
        this.parameters = builder.parameters;
        this.privileges = builder.privileges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatabaseInput create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Integer getCreateTime() {
        return this.createTime;
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

    public static final class Builder {
        private Integer createTime; 
        private String description; 
        private String locationUri; 
        private String name; 
        private String ownerName; 
        private String ownerType; 
        private java.util.Map < String, String > parameters; 
        private PrincipalPrivilegeSet privileges; 

        /**
         * CreateTime.
         */
        public Builder createTime(Integer createTime) {
            this.createTime = createTime;
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

        public DatabaseInput build() {
            return new DatabaseInput(this);
        } 

    } 

}
