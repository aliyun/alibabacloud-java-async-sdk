// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerScanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerScanConfigResponseBody</p>
 */
public class DescribeContainerScanConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerScanConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerScanConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpStatusCode; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerScanConfigResponseBody build() {
            return new DescribeContainerScanConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCount")
        private Integer allCount;

        @com.aliyun.core.annotation.NameInMap("AppNames")
        private String appNames;

        @com.aliyun.core.annotation.NameInMap("ChooseCount")
        private Integer chooseCount;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        private Data(Builder builder) {
            this.allCount = builder.allCount;
            this.appNames = builder.appNames;
            this.chooseCount = builder.chooseCount;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allCount
         */
        public Integer getAllCount() {
            return this.allCount;
        }

        /**
         * @return appNames
         */
        public String getAppNames() {
            return this.appNames;
        }

        /**
         * @return chooseCount
         */
        public Integer getChooseCount() {
            return this.chooseCount;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        public static final class Builder {
            private Integer allCount; 
            private String appNames; 
            private Integer chooseCount; 
            private String clusterId; 
            private String clusterName; 

            /**
             * The total number of container applications in the cluster.
             */
            public Builder allCount(Integer allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * The names of the container applications.
             */
            public Builder appNames(String appNames) {
                this.appNames = appNames;
                return this;
            }

            /**
             * The number of selected container applications.
             */
            public Builder chooseCount(Integer chooseCount) {
                this.chooseCount = chooseCount;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
