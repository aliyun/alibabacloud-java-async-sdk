// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link DetachKVCacheStoreRequest} extends {@link RequestModel}
 *
 * <p>DetachKVCacheStoreRequest</p>
 */
public class DetachKVCacheStoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceIds> resourceIds;

    private DetachKVCacheStoreRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachKVCacheStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<ResourceIds> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<DetachKVCacheStoreRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private java.util.List<ResourceIds> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(DetachKVCacheStoreRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceIds(java.util.List<ResourceIds> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public DetachKVCacheStoreRequest build() {
            return new DetachKVCacheStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachKVCacheStoreRequest} extends {@link TeaModel}
     *
     * <p>DetachKVCacheStoreRequest</p>
     */
    public static class ResourceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KvcsId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String kvcsId;

        @com.aliyun.core.annotation.NameInMap("VscId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vscId;

        private ResourceIds(Builder builder) {
            this.kvcsId = builder.kvcsId;
            this.vscId = builder.vscId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIds create() {
            return builder().build();
        }

        /**
         * @return kvcsId
         */
        public String getKvcsId() {
            return this.kvcsId;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        public static final class Builder {
            private String kvcsId; 
            private String vscId; 

            private Builder() {
            } 

            private Builder(ResourceIds model) {
                this.kvcsId = model.kvcsId;
                this.vscId = model.vscId;
            } 

            /**
             * <p>KVCacheStore KvcsId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>kvcs-your-resource-id</p>
             */
            public Builder kvcsId(String kvcsId) {
                this.kvcsId = kvcsId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-uf6cpove22nrjnpenwkyal</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            public ResourceIds build() {
                return new ResourceIds(this);
            } 

        } 

    }
}
