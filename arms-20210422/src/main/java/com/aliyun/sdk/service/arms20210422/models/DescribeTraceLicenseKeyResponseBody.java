// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTraceLicenseKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceLicenseKeyResponseBody</p>
 */
public class DescribeTraceLicenseKeyResponseBody extends TeaModel {
    @NameInMap("LicenseKey")
    private String licenseKey;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeTraceLicenseKeyResponseBody(Builder builder) {
        this.licenseKey = builder.licenseKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTraceLicenseKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return licenseKey
     */
    public String getLicenseKey() {
        return this.licenseKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String licenseKey; 
        private String requestId; 

        /**
         * LicenseKey.
         */
        public Builder licenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTraceLicenseKeyResponseBody build() {
            return new DescribeTraceLicenseKeyResponseBody(this);
        } 

    } 

}
