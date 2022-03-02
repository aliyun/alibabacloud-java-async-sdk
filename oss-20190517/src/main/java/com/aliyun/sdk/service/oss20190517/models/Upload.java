// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link Upload} extends {@link TeaModel}
 *
 * <p>Upload</p>
 */
public class Upload extends TeaModel {
    @NameInMap("Initiated")
    private String initiated;

    @NameInMap("Key")
    private String key;

    @NameInMap("UploadId")
    private String uploadId;

    private Upload(Builder builder) {
        this.initiated = builder.initiated;
        this.key = builder.key;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Upload create() {
        return builder().build();
    }

    /**
     * @return initiated
     */
    public String getInitiated() {
        return this.initiated;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder {
        private String initiated; 
        private String key; 
        private String uploadId; 

        /**
         * description
         */
        public Builder initiated(String initiated) {
            this.initiated = initiated;
            return this;
        }

        /**
         * description
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * description
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public Upload build() {
            return new Upload(this);
        } 

    } 

}
