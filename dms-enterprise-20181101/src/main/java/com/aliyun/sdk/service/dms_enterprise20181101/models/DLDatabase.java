// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DLDatabase} extends {@link TeaModel}
 *
 * <p>DLDatabase</p>
 */
public class DLDatabase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("DbId")
    private Long dbId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    private DLDatabase(Builder builder) {
        this.catalogName = builder.catalogName;
        this.dbId = builder.dbId;
        this.description = builder.description;
        this.location = builder.location;
        this.name = builder.name;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLDatabase create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public static final class Builder {
        private String catalogName; 
        private Long dbId; 
        private String description; 
        private String location; 
        private String name; 
        private java.util.Map<String, ?> parameters; 

        private Builder() {
        } 

        private Builder(DLDatabase model) {
            this.catalogName = model.catalogName;
            this.dbId = model.dbId;
            this.description = model.description;
            this.location = model.location;
            this.name = model.name;
            this.parameters = model.parameters;
        } 

        /**
         * CatalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * DbId.
         */
        public Builder dbId(Long dbId) {
            this.dbId = dbId;
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
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
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
         * Parameters.
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        public DLDatabase build() {
            return new DLDatabase(this);
        } 

    } 

}
