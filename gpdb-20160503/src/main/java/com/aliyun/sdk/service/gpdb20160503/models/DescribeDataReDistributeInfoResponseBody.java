// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDataReDistributeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataReDistributeInfoResponseBody</p>
 */
public class DescribeDataReDistributeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataReDistributeInfo")
    private DataReDistributeInfo dataReDistributeInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDataReDistributeInfoResponseBody model) {
            this.dataReDistributeInfo = model.dataReDistributeInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data redistribution information.</p>
         */
        public Builder dataReDistributeInfo(DataReDistributeInfo dataReDistributeInfo) {
            this.dataReDistributeInfo = dataReDistributeInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04836A02-ADC9-1AA7-AC36-DE5E048BF505</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDataReDistributeInfoResponseBody build() {
            return new DescribeDataReDistributeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataReDistributeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataReDistributeInfoResponseBody</p>
     */
    public static class DataReDistributeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("RemainTime")
        private String remainTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(DataReDistributeInfo model) {
                this.message = model.message;
                this.progress = model.progress;
                this.remainTime = model.remainTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The execution information. If an error occurs, the error message is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>redistributing</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress of data redistribution. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The estimated remaining time for data redistribution.</p>
             * 
             * <strong>example:</strong>
             * <p>00:01:28</p>
             */
            public Builder remainTime(String remainTime) {
                this.remainTime = remainTime;
                return this;
            }

            /**
             * <p>This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of data redistribution.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The execution type. The value <strong>immediate</strong> is returned, indicating immediate execution.</p>
             * 
             * <strong>example:</strong>
             * <p>immediate</p>
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
