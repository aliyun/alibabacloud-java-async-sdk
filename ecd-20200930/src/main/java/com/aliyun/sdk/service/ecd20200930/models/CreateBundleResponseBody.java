// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBundleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBundleResponseBody</p>
 */
public class CreateBundleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>b-cezrnfgecbich****</p>
         */
        public Builder bundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
