// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UploadPartCopyResponseBody} extends {@link TeaModel}
 *
 * <p>UploadPartCopyResponseBody</p>
 */
public class UploadPartCopyResponseBody extends TeaModel {
    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("ETag")
    private String ETag;


    private UploadPartCopyResponseBody(Builder builder) {
        this.lastModified = builder.lastModified;
        this.ETag = builder.ETag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartCopyResponseBody create() {
        return builder().build();
    }

    /**
     * @return lastModified
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * @return ETag
     */
    public String ETag() {
        return this.ETag;
    }

    public static final class Builder {
        private String lastModified; 
        private String ETag; 

        /**
         * <p>LastModified.</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * <p>ETag.</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
            return this;
        }

        public UploadPartCopyResponseBody build() {
            return new UploadPartCopyResponseBody(this);
        } 

    } 

}
