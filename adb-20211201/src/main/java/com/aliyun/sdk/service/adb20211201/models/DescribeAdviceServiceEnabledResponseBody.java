// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAdviceServiceEnabledResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdviceServiceEnabledResponseBody</p>
 */
public class DescribeAdviceServiceEnabledResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private DescribeAdviceServiceEnabledResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdviceServiceEnabledResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Boolean result; 

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li>If the request was successful, a <strong>Success</strong> message is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E031AABF-BD56-5966-A063-4283EF18DB45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the suggestion feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>True</strong></li>
         * <li><strong>False</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public DescribeAdviceServiceEnabledResponseBody build() {
            return new DescribeAdviceServiceEnabledResponseBody(this);
        } 

    } 

}
