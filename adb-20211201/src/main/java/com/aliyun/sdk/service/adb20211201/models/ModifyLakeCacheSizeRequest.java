// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ModifyLakeCacheSizeRequest} extends {@link RequestModel}
 *
 * <p>ModifyLakeCacheSizeRequest</p>
 */
public class ModifyLakeCacheSizeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableLakeCache")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableLakeCache;

    private ModifyLakeCacheSizeRequest(Builder builder) {
        super(builder);
        this.capacity = builder.capacity;
        this.DBClusterId = builder.DBClusterId;
        this.enableLakeCache = builder.enableLakeCache;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLakeCacheSizeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return enableLakeCache
     */
    public Boolean getEnableLakeCache() {
        return this.enableLakeCache;
    }

    public static final class Builder extends Request.Builder<ModifyLakeCacheSizeRequest, Builder> {
        private Long capacity; 
        private String DBClusterId; 
        private Boolean enableLakeCache; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLakeCacheSizeRequest request) {
            super(request);
            this.capacity = request.capacity;
            this.DBClusterId = request.DBClusterId;
            this.enableLakeCache = request.enableLakeCache;
        } 

        /**
         * <p>The lake cache size that you want to set. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp10yt0gva71ei7d</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the lake cache feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableLakeCache(Boolean enableLakeCache) {
            this.putQueryParameter("EnableLakeCache", enableLakeCache);
            this.enableLakeCache = enableLakeCache;
            return this;
        }

        @Override
        public ModifyLakeCacheSizeRequest build() {
            return new ModifyLakeCacheSizeRequest(this);
        } 

    } 

}
