// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link OpenStructOssSourceConfig} extends {@link TeaModel}
 *
 * <p>OpenStructOssSourceConfig</p>
 */
public class OpenStructOssSourceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("object")
    private String object;

    private OpenStructOssSourceConfig(Builder builder) {
        this.bucket = builder.bucket;
        this.object = builder.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructOssSourceConfig create() {
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
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    public static final class Builder {
        private String bucket; 
        private String object; 

        private Builder() {
        } 

        private Builder(OpenStructOssSourceConfig model) {
            this.bucket = model.bucket;
            this.object = model.object;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * object.
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        public OpenStructOssSourceConfig build() {
            return new OpenStructOssSourceConfig(this);
        } 

    } 

}
