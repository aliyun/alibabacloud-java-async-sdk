// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceTDEStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceTDEStatusResponseBody</p>
 */
public class DescribeInstanceTDEStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeInstanceTDEStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceTDEStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return TDEStatus
     */
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder {
        private String requestId; 
        private String TDEStatus; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether TDE is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: TDE is enabled.</li>
         * <li><strong>Disable</strong>: TDE is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeInstanceTDEStatusResponseBody build() {
            return new DescribeInstanceTDEStatusResponseBody(this);
        } 

    } 

}
