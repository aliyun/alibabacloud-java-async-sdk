// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Catalog} extends {@link TeaModel}
 *
 * <p>Catalog</p>
 */
public class Catalog extends TeaModel {
    @NameInMap("CatalogId")
    private String catalogId;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("CreatedBy")
    private String createdBy;

    @NameInMap("Description")
    private String description;

    @NameInMap("LocationUri")
    private String locationUri;

    @NameInMap("Owner")
    private String owner;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private Long updateTime;

    private Catalog(Builder builder) {
        this.catalogId = builder.catalogId;
        this.createTime = builder.createTime;
        this.createdBy = builder.createdBy;
        this.description = builder.description;
        this.locationUri = builder.locationUri;
        this.owner = builder.owner;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Catalog create() {
        return builder().build();
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
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
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String catalogId; 
        private Long createTime; 
        private String createdBy; 
        private String description; 
        private String locationUri; 
        private String owner; 
        private String status; 
        private Long updateTime; 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
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
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Catalog build() {
            return new Catalog(this);
        } 

    } 

}
