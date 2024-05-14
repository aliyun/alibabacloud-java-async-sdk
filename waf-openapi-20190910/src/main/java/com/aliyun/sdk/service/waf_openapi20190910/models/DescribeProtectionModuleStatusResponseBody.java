// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtectionModuleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleStatusResponseBody</p>
 */
public class DescribeProtectionModuleStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModuleStatus")
    private Integer moduleStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * ModuleStatus.
         */
        public Builder moduleStatus(Integer moduleStatus) {
            this.moduleStatus = moduleStatus;
            return this;
        }

        /**
         * RequestId.
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
