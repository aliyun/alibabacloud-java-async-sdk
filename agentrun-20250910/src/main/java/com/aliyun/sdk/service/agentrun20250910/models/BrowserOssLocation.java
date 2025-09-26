// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BrowserOssLocation} extends {@link TeaModel}
 *
 * <p>BrowserOssLocation</p>
 */
public class BrowserOssLocation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    private BrowserOssLocation(Builder builder) {
        this.bucket = builder.bucket;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserOssLocation create() {
        return builder().build();
    }

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
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder {
        private String bucket; 
        private String prefix; 

        private Builder() {
        } 

        private Builder(BrowserOssLocation model) {
            this.bucket = model.bucket;
            this.prefix = model.prefix;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public BrowserOssLocation build() {
            return new BrowserOssLocation(this);
        } 

    } 

}
