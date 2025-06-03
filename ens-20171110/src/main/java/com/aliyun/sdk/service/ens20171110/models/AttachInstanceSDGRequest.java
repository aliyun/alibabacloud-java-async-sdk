// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AttachInstanceSDGRequest} extends {@link RequestModel}
 *
 * <p>AttachInstanceSDGRequest</p>
 */
public class AttachInstanceSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadOpt")
    private LoadOpt loadOpt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SDGId;

    private AttachInstanceSDGRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.loadOpt = builder.loadOpt;
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachInstanceSDGRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return loadOpt
     */
    public LoadOpt getLoadOpt() {
        return this.loadOpt;
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<AttachInstanceSDGRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private LoadOpt loadOpt; 
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(AttachInstanceSDGRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.loadOpt = request.loadOpt;
            this.SDGId = request.SDGId;
        } 

        /**
         * <p>The IDs of the instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * LoadOpt.
         */
        public Builder loadOpt(LoadOpt loadOpt) {
            String loadOptShrink = shrink(loadOpt, "LoadOpt", "json");
            this.putQueryParameter("LoadOpt", loadOptShrink);
            this.loadOpt = loadOpt;
            return this;
        }

        /**
         * <p>The ID of the SDG.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public AttachInstanceSDGRequest build() {
            return new AttachInstanceSDGRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachInstanceSDGRequest} extends {@link TeaModel}
     *
     * <p>AttachInstanceSDGRequest</p>
     */
    public static class LoadOpt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockRwSplit")
        private Boolean blockRwSplit;

        @com.aliyun.core.annotation.NameInMap("BlockRwSplitSize")
        private Integer blockRwSplitSize;

        @com.aliyun.core.annotation.NameInMap("Cache")
        private Boolean cache;

        @com.aliyun.core.annotation.NameInMap("CacheSize")
        private Integer cacheSize;

        private LoadOpt(Builder builder) {
            this.blockRwSplit = builder.blockRwSplit;
            this.blockRwSplitSize = builder.blockRwSplitSize;
            this.cache = builder.cache;
            this.cacheSize = builder.cacheSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadOpt create() {
            return builder().build();
        }

        /**
         * @return blockRwSplit
         */
        public Boolean getBlockRwSplit() {
            return this.blockRwSplit;
        }

        /**
         * @return blockRwSplitSize
         */
        public Integer getBlockRwSplitSize() {
            return this.blockRwSplitSize;
        }

        /**
         * @return cache
         */
        public Boolean getCache() {
            return this.cache;
        }

        /**
         * @return cacheSize
         */
        public Integer getCacheSize() {
            return this.cacheSize;
        }

        public static final class Builder {
            private Boolean blockRwSplit; 
            private Integer blockRwSplitSize; 
            private Boolean cache; 
            private Integer cacheSize; 

            private Builder() {
            } 

            private Builder(LoadOpt model) {
                this.blockRwSplit = model.blockRwSplit;
                this.blockRwSplitSize = model.blockRwSplitSize;
                this.cache = model.cache;
                this.cacheSize = model.cacheSize;
            } 

            /**
             * BlockRwSplit.
             */
            public Builder blockRwSplit(Boolean blockRwSplit) {
                this.blockRwSplit = blockRwSplit;
                return this;
            }

            /**
             * BlockRwSplitSize.
             */
            public Builder blockRwSplitSize(Integer blockRwSplitSize) {
                this.blockRwSplitSize = blockRwSplitSize;
                return this;
            }

            /**
             * Cache.
             */
            public Builder cache(Boolean cache) {
                this.cache = cache;
                return this;
            }

            /**
             * CacheSize.
             */
            public Builder cacheSize(Integer cacheSize) {
                this.cacheSize = cacheSize;
                return this;
            }

            public LoadOpt build() {
                return new LoadOpt(this);
            } 

        } 

    }
}
