// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBundleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBundleResponseBody</p>
 */
public class CreateBundleResponseBody extends TeaModel {
    @NameInMap("BundleId")
    private String bundleId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBundleResponseBody(Builder builder) {
        this.bundleId = builder.bundleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBundleResponseBody create() {
        return builder().build();
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bundleId; 
        private String requestId; 

        /**
         * The ID of the cloud computer template.
         */
        public Builder bundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBundleResponseBody build() {
            return new CreateBundleResponseBody(this);
        } 

    } 

}
