// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListLiveChannelRequest} extends {@link RequestModel}
 *
 * <p>ListLiveChannelRequest</p>
 */
public class ListLiveChannelRequest extends Request {
    @Host
    @NameInMap("bucket")
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

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return marker
     */
    public String marker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Long maxKeys() {
        return this.maxKeys;
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    public static final class Builder extends Request.Builder<ListLiveChannelRequest.Builder> {
        private String bucket; 
        private String marker; 
        private Long maxKeys; 
        private String prefix; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>marker.</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>max-keys.</p>
         */
        public Builder maxKeys(Long maxKeys) {
            this.putQueryParameter("max-keys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * <p>prefix.</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        public ListLiveChannelRequest build() {
            return new ListLiveChannelRequest(this);
        } 

    } 

}
