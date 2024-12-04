// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceTDEResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceTDEResponseBody</p>
 */
public class DescribeDBInstanceTDEResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceTDEResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceTDEResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceTDEResponseBody build() {
            return new DescribeDBInstanceTDEResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceTDEResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceTDEResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TDEStatus")
        private String TDEStatus;

        private Data(Builder builder) {
            this.TDEStatus = builder.TDEStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return TDEStatus
         */
        public String getTDEStatus() {
            return this.TDEStatus;
        }

        public static final class Builder {
            private String TDEStatus; 

            /**
             * TDEStatus.
             */
            public Builder TDEStatus(String TDEStatus) {
                this.TDEStatus = TDEStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
