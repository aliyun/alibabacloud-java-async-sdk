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
 * {@link DescribeComputeResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComputeResourceUsageResponseBody</p>
 */
public class DescribeComputeResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComputeResourceUsageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComputeResourceUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeComputeResourceUsageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The queried resource usage.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEAW</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComputeResourceUsageResponseBody build() {
            return new DescribeComputeResourceUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeComputeResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComputeResourceUsageResponseBody</p>
     */
    public static class AcuInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

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
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(AcuInfo model) {
                this.name = model.name;
                this.values = model.values;
            } 

            /**
             * <p>The resource usage metric. Valid values:</p>
             * <ul>
             * <li><code>TotalAcuNumber</code>: the total number of ACUs.</li>
             * <li><code>ReservedAcuNumber</code>: the number of ACUs for the reserved resources.</li>
             * <li><code>ReservedAcuUsageNumber</code>: the number of ACUs for the reserved resources that are used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TotalAcuNumber</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The values of the metric at specific points in time.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public AcuInfo build() {
                return new AcuInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeComputeResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeComputeResourceUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcuInfo")
        private java.util.List<AcuInfo> acuInfo;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupType")
        private String resourceGroupType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.acuInfo = builder.acuInfo;
            this.DBClusterId = builder.DBClusterId;
            this.endTime = builder.endTime;
            this.resourceGroupName = builder.resourceGroupName;
            this.resourceGroupType = builder.resourceGroupType;
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
        public java.util.List<AcuInfo> getAcuInfo() {
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
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return resourceGroupType
         */
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private java.util.List<AcuInfo> acuInfo; 
            private String DBClusterId; 
            private String endTime; 
            private String resourceGroupName; 
            private String resourceGroupType; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acuInfo = model.acuInfo;
                this.DBClusterId = model.DBClusterId;
                this.endTime = model.endTime;
                this.resourceGroupName = model.resourceGroupName;
                this.resourceGroupType = model.resourceGroupType;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The AnalyticDB compute unit (ACU) usage of the cluster.</p>
             */
            public Builder acuInfo(java.util.List<AcuInfo> acuInfo) {
                this.acuInfo = acuInfo;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-clusterxxx</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-07T02:37:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The type of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>interative</p>
             */
            public Builder resourceGroupType(String resourceGroupType) {
                this.resourceGroupType = resourceGroupType;
                return this;
            }

            /**
             * <p>The start time of the query. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-24T07:00:00Z</p>
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
