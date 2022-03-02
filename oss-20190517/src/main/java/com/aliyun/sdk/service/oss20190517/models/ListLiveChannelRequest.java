// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>ListLiveChannelRequest</p>
 */
public class ListLiveChannelRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("marker")
    private String marker;

    @Query
    @NameInMap("max-keys")
    private Long maxKeys;

    @Query
    @NameInMap("prefix")
    private String prefix;

    private ListLiveChannelRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveChannelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder extends Request.Builder<ListLiveChannelRequest, Builder> {
        private String bucket; 
        private String marker; 
        private Long maxKeys; 
        private String prefix; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveChannelRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.marker = request.marker;
            this.maxKeys = request.maxKeys;
            this.prefix = request.prefix;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * max-keys.
         */
        public Builder maxKeys(Long maxKeys) {
            this.putQueryParameter("max-keys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        @Override
        public ListLiveChannelRequest build() {
            return new ListLiveChannelRequest(this);
        } 

    } 

}
