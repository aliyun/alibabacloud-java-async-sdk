// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListBucketsRequest} extends {@link RequestModel}
 *
 * <p>ListBucketsRequest</p>
 */
public class ListBucketsRequest extends Request {
    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("marker")
    private String marker;

    @Query
    @NameInMap("max-keys")
    private Long maxKeys;


    private ListBucketsRequest(Builder builder) {
        super(builder);
        this.prefix = builder.prefix;
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBucketsRequest create() {
        return builder().build();
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
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

    public static final class Builder extends Request.Builder<ListBucketsRequest.Builder> {
        private String prefix; 
        private String marker; 
        private Long maxKeys; 

        /**
         * <p>prefix.</p>
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
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

        public ListBucketsRequest build() {
            return new ListBucketsRequest(this);
        } 

    } 

}
