// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtectionModuleModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleModeResponseBody</p>
 */
public class DescribeProtectionModuleModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Mode")
    private Integer mode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProtectionModuleModeResponseBody(Builder builder) {
        this.mode = builder.mode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtectionModuleModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return mode
     */
    public Integer getMode() {
        return this.mode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer mode; 
        private String requestId; 

        /**
         * Mode.
         */
        public Builder mode(Integer mode) {
            this.mode = mode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProtectionModuleModeResponseBody build() {
            return new DescribeProtectionModuleModeResponseBody(this);
        } 

    } 

}
