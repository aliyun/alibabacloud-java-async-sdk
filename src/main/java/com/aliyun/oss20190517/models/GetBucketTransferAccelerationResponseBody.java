// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetBucketTransferAccelerationResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketTransferAccelerationResponseBody</p>
 */
public class GetBucketTransferAccelerationResponseBody extends TeaModel {
    @ParentIgnore("TransferAccelerationConfiguration")
    @NameInMap("Enabled")
    private Boolean enabled;


    private GetBucketTransferAccelerationResponseBody(Builder builder) {
        this.enabled = builder.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketTransferAccelerationResponseBody create() {
        return builder().build();
    }

    /**
     * @return enabled
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static final class Builder {
        private Boolean enabled; 

        /**
         * <p>Enabled.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public GetBucketTransferAccelerationResponseBody build() {
            return new GetBucketTransferAccelerationResponseBody(this);
        } 

    } 

}
