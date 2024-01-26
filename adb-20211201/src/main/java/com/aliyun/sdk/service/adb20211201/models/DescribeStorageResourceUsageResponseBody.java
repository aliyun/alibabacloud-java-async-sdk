// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageResourceUsageResponseBody</p>
 */
public class DescribeStorageResourceUsageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeStorageResourceUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageResourceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Integer code; 
        private Data data; 
        private String requestId; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The queried resource usage.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeStorageResourceUsageResponseBody build() {
            return new DescribeStorageResourceUsageResponseBody(this);
        } 

    } 

    public static class AcuInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Values")
        private java.util.List < String > values;

        private AcuInfo(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcuInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List < String > values; 

            /**
             * The resource usage metric. Valid values:
             * <p>
             * 
             * *   `TotalAcuNumber`: the total number of ACUs.
             * *   `ReservedAcuNumber`: the number of ACUs for the reserved resources.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The values of the metric at specific points in time.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public AcuInfo build() {
                return new AcuInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AcuInfo")
        private java.util.List < AcuInfo> acuInfo;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.acuInfo = builder.acuInfo;
            this.DBClusterId = builder.DBClusterId;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acuInfo
         */
        public java.util.List < AcuInfo> getAcuInfo() {
            return this.acuInfo;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List < AcuInfo> acuInfo; 
            private String DBClusterId; 
            private String endTime; 
            private String startTime; 

            /**
             * The AnalyticDB compute unit (ACU) usage of the cluster.
             */
            public Builder acuInfo(java.util.List < AcuInfo> acuInfo) {
                this.acuInfo = acuInfo;
                return this;
            }

            /**
             * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The end time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
