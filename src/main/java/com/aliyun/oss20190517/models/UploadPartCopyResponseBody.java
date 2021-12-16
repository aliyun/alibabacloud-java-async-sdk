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
    @ParentIgnore("CopyPartResult")
    @NameInMap("ETag")
    private String ETag;

    @ParentIgnore("CopyPartResult")
    @NameInMap("LastModified")
    private String lastModified;


    private UploadPartCopyResponseBody(Builder builder) {
        this.ETag = builder.ETag;
        this.lastModified = builder.lastModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartCopyResponseBody create() {
        return builder().build();
    }

    /**
     * @return ETag
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    public static final class Builder {
        private String ETag; 
        private String lastModified; 

        /**
         * <p>ETag.</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
            return this;
        }

        /**
         * <p>LastModified.</p>
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
