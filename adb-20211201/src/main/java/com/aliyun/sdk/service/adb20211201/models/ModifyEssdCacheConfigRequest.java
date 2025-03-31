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
 * {@link ModifyEssdCacheConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyEssdCacheConfigRequest</p>
 */
public class ModifyEssdCacheConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableEssdCache")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableEssdCache;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EssdCacheSize")
    private Integer essdCacheSize;

    private ModifyEssdCacheConfigRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.enableEssdCache = builder.enableEssdCache;
        this.essdCacheSize = builder.essdCacheSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEssdCacheConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return enableEssdCache
     */
    public Boolean getEnableEssdCache() {
        return this.enableEssdCache;
    }

    /**
     * @return essdCacheSize
     */
    public Integer getEssdCacheSize() {
        return this.essdCacheSize;
    }

    public static final class Builder extends Request.Builder<ModifyEssdCacheConfigRequest, Builder> {
        private String DBClusterId; 
        private Boolean enableEssdCache; 
        private Integer essdCacheSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEssdCacheConfigRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.enableEssdCache = request.enableEssdCache;
            this.essdCacheSize = request.essdCacheSize;
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
         * <p>Specifies whether to enable the disk cache feature.</p>
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
        public Builder enableEssdCache(Boolean enableEssdCache) {
            this.putQueryParameter("EnableEssdCache", enableEssdCache);
            this.enableEssdCache = enableEssdCache;
            return this;
        }

        /**
         * <p>The disk cache size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder essdCacheSize(Integer essdCacheSize) {
            this.putQueryParameter("EssdCacheSize", essdCacheSize);
            this.essdCacheSize = essdCacheSize;
            return this;
        }

        @Override
        public ModifyEssdCacheConfigRequest build() {
            return new ModifyEssdCacheConfigRequest(this);
        } 

    } 

}
