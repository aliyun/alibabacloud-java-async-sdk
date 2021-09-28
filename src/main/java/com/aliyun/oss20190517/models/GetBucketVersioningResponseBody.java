// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketVersioningResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketVersioningResponseBody</p>
 */
public class GetBucketVersioningResponseBody extends TeaModel {
    @ParentIgnore("VersioningConfiguration")
    @NameInMap("Status")
    private BucketVersioningStatus status;


    private GetBucketVersioningResponseBody(Builder builder) {
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketVersioningResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public BucketVersioningStatus status() {
        return this.status;
    }

    public static final class Builder {
        private BucketVersioningStatus status; 

        /**
         * <p>Status.</p>
         */
        public Builder status(BucketVersioningStatus status) {
            this.status = status;
            return this;
        }

        public GetBucketVersioningResponseBody build() {
            return new GetBucketVersioningResponseBody(this);
        } 

    } 

}
