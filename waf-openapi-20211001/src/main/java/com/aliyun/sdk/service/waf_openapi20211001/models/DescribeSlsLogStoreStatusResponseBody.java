// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsLogStoreStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsLogStoreStatusResponseBody</p>
 */
public class DescribeSlsLogStoreStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExistStatus")
    private Boolean existStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSlsLogStoreStatusResponseBody(Builder builder) {
        this.existStatus = builder.existStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsLogStoreStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return existStatus
     */
    public Boolean getExistStatus() {
        return this.existStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean existStatus; 
        private String requestId; 

        /**
         * Indicates whether a Logstore is created for WAF. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder existStatus(Boolean existStatus) {
            this.existStatus = existStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSlsLogStoreStatusResponseBody build() {
            return new DescribeSlsLogStoreStatusResponseBody(this);
        } 

    } 

}
