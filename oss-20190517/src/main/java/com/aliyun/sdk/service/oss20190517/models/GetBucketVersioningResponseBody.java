// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketVersioningResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketVersioningResponseBody</p>
 */
public class GetBucketVersioningResponseBody extends TeaModel {
    @ParentIgnore("VersioningConfiguration")
    @NameInMap("Status")
    private String status;

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
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String status; 

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(BucketVersioningStatus status) {
            this.status = status.getValue();
            return this;
        }

        public GetBucketVersioningResponseBody build() {
            return new GetBucketVersioningResponseBody(this);
        } 

    } 

}
