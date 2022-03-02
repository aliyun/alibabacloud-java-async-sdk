// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CopyObjectResponseBody} extends {@link TeaModel}
 *
 * <p>CopyObjectResponseBody</p>
 */
public class CopyObjectResponseBody extends TeaModel {
    @ParentIgnore("CopyObjectResult")
    @NameInMap("ETag")
    private String eTag;

    @ParentIgnore("CopyObjectResult")
    @NameInMap("LastModified")
    private String lastModified;

    private CopyObjectResponseBody(Builder builder) {
        this.eTag = builder.eTag;
        this.lastModified = builder.lastModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyObjectResponseBody create() {
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

        public CopyObjectResponseBody build() {
            return new CopyObjectResponseBody(this);
        } 

    } 

}
