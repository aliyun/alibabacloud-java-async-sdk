// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmEventStackInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmEventStackInfoResponseBody</p>
 */
public class DescribeAlarmEventStackInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackInfo")
    private String stackInfo;

    private DescribeAlarmEventStackInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackInfo = builder.stackInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventStackInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackInfo
     */
    public String getStackInfo() {
        return this.stackInfo;
    }

    public static final class Builder {
        private String requestId; 
        private String stackInfo; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The stack information of the alert details.
         */
        public Builder stackInfo(String stackInfo) {
            this.stackInfo = stackInfo;
            return this;
        }

        public DescribeAlarmEventStackInfoResponseBody build() {
            return new DescribeAlarmEventStackInfoResponseBody(this);
        } 

    } 

}
