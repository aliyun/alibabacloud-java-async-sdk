// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceTDEInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTDEInfoResponseBody</p>
 */
public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TDEStatus")
    private String TDEStatus;

    private DescribeDBInstanceTDEInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceTDEInfoResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TDEStatus.
         */
        public Builder TDEStatus(String TDEStatus) {
            this.TDEStatus = TDEStatus;
            return this;
        }

        public DescribeDBInstanceTDEInfoResponseBody build() {
            return new DescribeDBInstanceTDEInfoResponseBody(this);
        } 

    } 

}
