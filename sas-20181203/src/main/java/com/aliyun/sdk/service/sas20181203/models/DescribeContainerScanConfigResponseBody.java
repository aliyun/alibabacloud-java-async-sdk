// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerScanConfigResponseBody build() {
            return new DescribeContainerScanConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerScanConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerScanConfigResponseBody</p>
     */
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
             * <p>The total number of container applications in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder allCount(Integer allCount) {
                this.allCount = allCount;
                return this;
            }

            /**
             * <p>The names of the container applications.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;alicloud-monitor-controller&quot;]</p>
             */
            public Builder appNames(String appNames) {
                this.appNames = appNames;
                return this;
            }

            /**
             * <p>The number of selected container applications.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder chooseCount(Integer chooseCount) {
                this.chooseCount = chooseCount;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>hhht-cluster-02</p>
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
