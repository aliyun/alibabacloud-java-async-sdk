// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckModifyVirtualWareHouseResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CheckModifyVirtualWareHouseResourceResponseBody</p>
 */
public class CheckModifyVirtualWareHouseResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckModifyVirtualWareHouseResourceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckModifyVirtualWareHouseResourceResponseBody create() {
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

        public CheckModifyVirtualWareHouseResourceResponseBody build() {
            return new CheckModifyVirtualWareHouseResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckModifyVirtualWareHouseResourceResponseBody} extends {@link TeaModel}
     *
     * <p>CheckModifyVirtualWareHouseResourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpectedDBClusterStatus")
        private String expectedDBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("ExpectedOrderFinishSeconds")
        private Long expectedOrderFinishSeconds;

        @com.aliyun.core.annotation.NameInMap("ExpectedTargetVirtualWareHouseStatus")
        private String expectedTargetVirtualWareHouseStatus;

        private Data(Builder builder) {
            this.expectedDBClusterStatus = builder.expectedDBClusterStatus;
            this.expectedOrderFinishSeconds = builder.expectedOrderFinishSeconds;
            this.expectedTargetVirtualWareHouseStatus = builder.expectedTargetVirtualWareHouseStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return expectedDBClusterStatus
         */
        public String getExpectedDBClusterStatus() {
            return this.expectedDBClusterStatus;
        }

        /**
         * @return expectedOrderFinishSeconds
         */
        public Long getExpectedOrderFinishSeconds() {
            return this.expectedOrderFinishSeconds;
        }

        /**
         * @return expectedTargetVirtualWareHouseStatus
         */
        public String getExpectedTargetVirtualWareHouseStatus() {
            return this.expectedTargetVirtualWareHouseStatus;
        }

        public static final class Builder {
            private String expectedDBClusterStatus; 
            private Long expectedOrderFinishSeconds; 
            private String expectedTargetVirtualWareHouseStatus; 

            /**
             * ExpectedDBClusterStatus.
             */
            public Builder expectedDBClusterStatus(String expectedDBClusterStatus) {
                this.expectedDBClusterStatus = expectedDBClusterStatus;
                return this;
            }

            /**
             * ExpectedOrderFinishSeconds.
             */
            public Builder expectedOrderFinishSeconds(Long expectedOrderFinishSeconds) {
                this.expectedOrderFinishSeconds = expectedOrderFinishSeconds;
                return this;
            }

            /**
             * ExpectedTargetVirtualWareHouseStatus.
             */
            public Builder expectedTargetVirtualWareHouseStatus(String expectedTargetVirtualWareHouseStatus) {
                this.expectedTargetVirtualWareHouseStatus = expectedTargetVirtualWareHouseStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
