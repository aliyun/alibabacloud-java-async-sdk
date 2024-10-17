// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTraceLicenseKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceLicenseKeyResponseBody</p>
 */
public class DescribeTraceLicenseKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LicenseKey")
    private String licenseKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The license key for the application.</p>
         * 
         * <strong>example:</strong>
         * <p>b590lhguqs@3a75d95f218****</p>
         */
        public Builder licenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>29053944-6FE5-4240-8927-10095ECE****</p>
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
