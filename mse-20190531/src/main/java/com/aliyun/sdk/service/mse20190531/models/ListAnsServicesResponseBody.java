// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAnsServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnsServicesResponseBody</p>
 */
public class ListAnsServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAnsServicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnsServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errorCode; 
        private String httpCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>202</p>
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>52BA6DA6-A702-4362-A32F-DFF79655****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAnsServicesResponseBody build() {
            return new ListAnsServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAnsServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAnsServicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterCount")
        private Integer clusterCount;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HealthyInstanceCount")
        private Integer healthyInstanceCount;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private Integer ipCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private Data(Builder builder) {
            this.clusterCount = builder.clusterCount;
            this.groupName = builder.groupName;
            this.healthyInstanceCount = builder.healthyInstanceCount;
            this.ipCount = builder.ipCount;
            this.name = builder.name;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterCount
         */
        public Integer getClusterCount() {
            return this.clusterCount;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return healthyInstanceCount
         */
        public Integer getHealthyInstanceCount() {
            return this.healthyInstanceCount;
        }

        /**
         * @return ipCount
         */
        public Integer getIpCount() {
            return this.ipCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Integer clusterCount; 
            private String groupName; 
            private Integer healthyInstanceCount; 
            private Integer ipCount; 
            private String name; 
            private String source; 

            /**
             * <p>The total number of clusters.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clusterCount(Integer clusterCount) {
                this.clusterCount = clusterCount;
                return this;
            }

            /**
             * <p>The name of the contact group.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The total number of instances with healthy heartbeats.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder healthyInstanceCount(Integer healthyInstanceCount) {
                this.healthyInstanceCount = healthyInstanceCount;
                return this;
            }

            /**
             * <p>The total number of instances that are used for the current service.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipCount(Integer ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
