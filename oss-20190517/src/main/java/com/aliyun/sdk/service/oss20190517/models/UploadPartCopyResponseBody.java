// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link UploadPartCopyResponseBody} extends {@link TeaModel}
 *
 * <p>UploadPartCopyResponseBody</p>
 */
public class UploadPartCopyResponseBody extends TeaModel {
    @ParentIgnore("CopyPartResult")
    @NameInMap("ETag")
    private String eTag;

    @ParentIgnore("CopyPartResult")
    @NameInMap("LastModified")
    private String lastModified;

    private UploadPartCopyResponseBody(Builder builder) {
        this.eTag = builder.eTag;
        this.lastModified = builder.lastModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartCopyResponseBody create() {
        return builder().build();
    }

    /**
     * @return eTag
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    public static final class Builder {
        private String eTag; 
        private String lastModified; 

        /**
         * ETag.
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * LastModified.
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public UploadPartCopyResponseBody build() {
            return new UploadPartCopyResponseBody(this);
        } 

    } 

}
