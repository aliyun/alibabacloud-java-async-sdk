// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    public ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault() {
        return this.applyServerSideEncryptionByDefault;
    }

    public static final class Builder {
        private ApplyServerSideEncryptionByDefault applyServerSideEncryptionByDefault; 

        /**
         * <p>ApplyServerSideEncryptionByDefault.</p>
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
