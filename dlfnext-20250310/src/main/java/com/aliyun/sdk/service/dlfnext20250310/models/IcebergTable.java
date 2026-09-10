// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link IcebergTable} extends {@link TeaModel}
 *
 * <p>IcebergTable</p>
 */
public class IcebergTable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("icebergTableMetadata")
    private IcebergTableMetadata icebergTableMetadata;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    @com.aliyun.core.annotation.NameInMap("version")
    private Long version;

    private IcebergTable(Builder builder) {
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.icebergTableMetadata = builder.icebergTableMetadata;
        this.id = builder.id;
        this.name = builder.name;
        this.owner = builder.owner;
        this.path = builder.path;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IcebergTable create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return icebergTableMetadata
     */
    public IcebergTableMetadata getIcebergTableMetadata() {
        return this.icebergTableMetadata;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Long createdAt; 
        private String createdBy; 
        private IcebergTableMetadata icebergTableMetadata; 
        private String id; 
        private String name; 
        private String owner; 
        private String path; 
        private Long updatedAt; 
        private String updatedBy; 
        private Long version; 

        private Builder() {
        } 

        private Builder(IcebergTable model) {
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.icebergTableMetadata = model.icebergTableMetadata;
            this.id = model.id;
            this.name = model.name;
            this.owner = model.owner;
            this.path = model.path;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
            this.version = model.version;
        } 

        /**
         * <p>The table creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1747120676378</p>
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The table creator.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1045689747920334:root</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>The metadata of the table.</p>
         */
        public Builder icebergTableMetadata(IcebergTableMetadata icebergTableMetadata) {
            this.icebergTableMetadata = icebergTableMetadata;
            return this;
        }

        /**
         * <p>The table UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>tbl-424fc31c-4876-4df5-97a5-c78f3046e739</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The owner of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1045689747920334:root</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The table URI.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://clg-iceberg-bcc387be9d24490da5f194bbaf990906/ns-b314a3c3-dff5-4e30-8ba2-0493a60566c7.db/iceberg-tbl-56539259-1879-4d6d-bd6e-d1ddb3364cc9</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The time when the table was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1744970111419</p>
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>The user who last updated the table.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1045689747920334:root</p>
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * <p>The version of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public IcebergTable build() {
            return new IcebergTable(this);
        } 

    } 

}
