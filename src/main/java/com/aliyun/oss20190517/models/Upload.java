// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link Upload} extends {@link TeaModel}
 *
 * <p>Upload</p>
 */
public class Upload extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("UploadId")
    private String uploadId;

    @NameInMap("Initiated")
    private String initiated;


    private Upload(Builder builder) {
        this.key = builder.key;
        this.uploadId = builder.uploadId;
        this.initiated = builder.initiated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Upload create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return uploadId
     */
    public String uploadId() {
        return this.uploadId;
    }

    /**
     * @return initiated
     */
    public String initiated() {
        return this.initiated;
    }

    public static final class Builder {
        private String key; 
        private String uploadId; 
        private String initiated; 

        /**
         * <p>description</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder initiated(String initiated) {
            this.initiated = initiated;
            return this;
        }

        public Upload build() {
            return new Upload(this);
        } 

    } 

}
