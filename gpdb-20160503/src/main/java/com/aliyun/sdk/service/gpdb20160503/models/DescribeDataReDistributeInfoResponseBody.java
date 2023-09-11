// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataReDistributeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataReDistributeInfoResponseBody</p>
 */
public class DescribeDataReDistributeInfoResponseBody extends TeaModel {
    @NameInMap("DataReDistributeInfo")
    private DataReDistributeInfo dataReDistributeInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDataReDistributeInfoResponseBody(Builder builder) {
        this.dataReDistributeInfo = builder.dataReDistributeInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataReDistributeInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataReDistributeInfo
     */
    public DataReDistributeInfo getDataReDistributeInfo() {
        return this.dataReDistributeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataReDistributeInfo dataReDistributeInfo; 
        private String requestId; 

        /**
         * The data redistribution information.
         */
        public Builder dataReDistributeInfo(DataReDistributeInfo dataReDistributeInfo) {
            this.dataReDistributeInfo = dataReDistributeInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataReDistributeInfoResponseBody build() {
            return new DescribeDataReDistributeInfoResponseBody(this);
        } 

    } 

    public static class DataReDistributeInfo extends TeaModel {
        @NameInMap("Message")
        private String message;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("RemainTime")
        private String remainTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private DataReDistributeInfo(Builder builder) {
            this.message = builder.message;
            this.progress = builder.progress;
            this.remainTime = builder.remainTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataReDistributeInfo create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return remainTime
         */
        public String getRemainTime() {
            return this.remainTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String message; 
            private Long progress; 
            private String remainTime; 
            private String startTime; 
            private String status; 
            private String type; 

            /**
             * The execution information. If an error occurs, the error message is returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The progress of data redistribution. Unit: %.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The estimated remaining time for data redistribution.
             */
            public Builder remainTime(String remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * This parameter is not supported.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of data redistribution.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The execution type. The value **immediate** is returned, indicating immediate execution.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataReDistributeInfo build() {
                return new DataReDistributeInfo(this);
            } 

        } 

    }
}
