// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CopyObjectResponseBody} extends {@link TeaModel}
 *
 * <p>CopyObjectResponseBody</p>
 */
public class CopyObjectResponseBody extends TeaModel {
    @ParentIgnore("CopyObjectResult")
    @NameInMap("ETag")
    private String ETag;

    @ParentIgnore("CopyObjectResult")
    @NameInMap("LastModified")
    private String lastModified;


    private CopyObjectResponseBody(Builder builder) {
        this.ETag = builder.ETag;
        this.lastModified = builder.lastModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyObjectResponseBody create() {
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

        public CopyObjectResponseBody build() {
            return new CopyObjectResponseBody(this);
        } 

    } 

}
