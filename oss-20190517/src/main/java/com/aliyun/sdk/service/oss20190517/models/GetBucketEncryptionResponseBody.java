// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketEncryptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketEncryptionResponseBody</p>
 */
public class GetBucketEncryptionResponseBody extends TeaModel {
    @ParentIgnore("ServerSideEncryptionRule")
    @NameInMap("ApplyServerSideEncryptionByDefault")
    private ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault;

    private GetBucketEncryptionResponseBody(Builder builder) {
        this.applyServerSideEncryptionByDefault = builder.applyServerSideEncryptionByDefault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketEncryptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return applyServerSideEncryptionByDefault
     */
    public ApplyServerSideEncryptionByDefault getApplyServerSideEncryptionByDefault() {
        return this.applyServerSideEncryptionByDefault;
    }

    public static final class Builder {
        private ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault; 

        /**
         * ApplyServerSideEncryptionByDefault.
         */
        public Builder applyServerSideEncryptionByDefault(ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault) {
            this.applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault;
            return this;
        }

        public GetBucketEncryptionResponseBody build() {
            return new GetBucketEncryptionResponseBody(this);
        } 

    } 

}
