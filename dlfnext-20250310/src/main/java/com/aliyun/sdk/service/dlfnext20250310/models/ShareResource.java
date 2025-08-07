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
 * {@link ShareResource} extends {@link TeaModel}
 *
 * <p>ShareResource</p>
 */
public class ShareResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("shareType")
    private String shareType;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    private ShareResource(Builder builder) {
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.databaseName = builder.databaseName;
        this.shareType = builder.shareType;
        this.tableName = builder.tableName;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShareResource create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
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

    public static final class Builder {
        private Long createdAt; 
        private String createdBy; 
        private String databaseName; 
        private String shareType; 
        private String tableName; 
        private Long updatedAt; 
        private String updatedBy; 

        private Builder() {
        } 

        private Builder(ShareResource model) {
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.databaseName = model.databaseName;
            this.shareType = model.shareType;
            this.tableName = model.tableName;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * shareType.
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * updatedBy.
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public ShareResource build() {
            return new ShareResource(this);
        } 

    } 

}
