// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeProtectionModuleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleStatusResponseBody</p>
 */
public class DescribeProtectionModuleStatusResponseBody extends TeaModel {
    @NameInMap("ModuleStatus")
    private Integer moduleStatus;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeProtectionModuleStatusResponseBody(Builder builder) {
        this.moduleStatus = builder.moduleStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtectionModuleStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return moduleStatus
     */
    public Integer getModuleStatus() {
        return this.moduleStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer moduleStatus; 
        private String requestId; 

        /**
         * <p>ModuleStatus.</p>
         */
        public Builder moduleStatus(Integer moduleStatus) {
            this.moduleStatus = moduleStatus;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProtectionModuleStatusResponseBody build() {
            return new DescribeProtectionModuleStatusResponseBody(this);
        } 

    } 

}
