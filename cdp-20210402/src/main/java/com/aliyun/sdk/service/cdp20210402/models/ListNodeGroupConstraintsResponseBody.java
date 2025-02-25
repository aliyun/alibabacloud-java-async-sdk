// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeGroupConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeGroupConstraintsResponseBody</p>
 */
public class ListNodeGroupConstraintsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListNodeGroupConstraintsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeGroupConstraintsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListNodeGroupConstraintsResponseBody build() {
            return new ListNodeGroupConstraintsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HostGroupType")
        private String hostGroupType;

        @NameInMap("RecommendedInstanceTypes")
        private java.util.List < String > recommendedInstanceTypes;

        @NameInMap("availableDataDiskCategories")
        private java.util.List < String > availableDataDiskCategories;

        @NameInMap("availableInstanceTypes")
        private java.util.List < String > availableInstanceTypes;

        @NameInMap("availableSystemDiskCategories")
        private java.util.List < String > availableSystemDiskCategories;

        @NameInMap("defaultDataDiskCount")
        private Integer defaultDataDiskCount;

        @NameInMap("defaultDataDiskSize")
        private Integer defaultDataDiskSize;

        @NameInMap("defaultNodeCount")
        private Integer defaultNodeCount;

        @NameInMap("defaultSystemDiskSize")
        private Integer defaultSystemDiskSize;

        @NameInMap("maxDataDiskCount")
        private Integer maxDataDiskCount;

        @NameInMap("maxDataDiskSize")
        private Integer maxDataDiskSize;

        @NameInMap("maxNodeCount")
        private Integer maxNodeCount;

        @NameInMap("maxSystemDiskSize")
        private Integer maxSystemDiskSize;

        @NameInMap("minDataDiskCount")
        private Integer minDataDiskCount;

        @NameInMap("minDataDiskSize")
        private Integer minDataDiskSize;

        @NameInMap("minNodeCount")
        private Integer minNodeCount;

        @NameInMap("minSystemDiskSize")
        private Integer minSystemDiskSize;

        @NameInMap("nodeGroupName")
        private String nodeGroupName;

        private Data(Builder builder) {
            this.hostGroupType = builder.hostGroupType;
            this.recommendedInstanceTypes = builder.recommendedInstanceTypes;
            this.availableDataDiskCategories = builder.availableDataDiskCategories;
            this.availableInstanceTypes = builder.availableInstanceTypes;
            this.availableSystemDiskCategories = builder.availableSystemDiskCategories;
            this.defaultDataDiskCount = builder.defaultDataDiskCount;
            this.defaultDataDiskSize = builder.defaultDataDiskSize;
            this.defaultNodeCount = builder.defaultNodeCount;
            this.defaultSystemDiskSize = builder.defaultSystemDiskSize;
            this.maxDataDiskCount = builder.maxDataDiskCount;
            this.maxDataDiskSize = builder.maxDataDiskSize;
            this.maxNodeCount = builder.maxNodeCount;
            this.maxSystemDiskSize = builder.maxSystemDiskSize;
            this.minDataDiskCount = builder.minDataDiskCount;
            this.minDataDiskSize = builder.minDataDiskSize;
            this.minNodeCount = builder.minNodeCount;
            this.minSystemDiskSize = builder.minSystemDiskSize;
            this.nodeGroupName = builder.nodeGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostGroupType
         */
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        /**
         * @return recommendedInstanceTypes
         */
        public java.util.List < String > getRecommendedInstanceTypes() {
            return this.recommendedInstanceTypes;
        }

        /**
         * @return availableDataDiskCategories
         */
        public java.util.List < String > getAvailableDataDiskCategories() {
            return this.availableDataDiskCategories;
        }

        /**
         * @return availableInstanceTypes
         */
        public java.util.List < String > getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        /**
         * @return availableSystemDiskCategories
         */
        public java.util.List < String > getAvailableSystemDiskCategories() {
            return this.availableSystemDiskCategories;
        }

        /**
         * @return defaultDataDiskCount
         */
        public Integer getDefaultDataDiskCount() {
            return this.defaultDataDiskCount;
        }

        /**
         * @return defaultDataDiskSize
         */
        public Integer getDefaultDataDiskSize() {
            return this.defaultDataDiskSize;
        }

        /**
         * @return defaultNodeCount
         */
        public Integer getDefaultNodeCount() {
            return this.defaultNodeCount;
        }

        /**
         * @return defaultSystemDiskSize
         */
        public Integer getDefaultSystemDiskSize() {
            return this.defaultSystemDiskSize;
        }

        /**
         * @return maxDataDiskCount
         */
        public Integer getMaxDataDiskCount() {
            return this.maxDataDiskCount;
        }

        /**
         * @return maxDataDiskSize
         */
        public Integer getMaxDataDiskSize() {
            return this.maxDataDiskSize;
        }

        /**
         * @return maxNodeCount
         */
        public Integer getMaxNodeCount() {
            return this.maxNodeCount;
        }

        /**
         * @return maxSystemDiskSize
         */
        public Integer getMaxSystemDiskSize() {
            return this.maxSystemDiskSize;
        }

        /**
         * @return minDataDiskCount
         */
        public Integer getMinDataDiskCount() {
            return this.minDataDiskCount;
        }

        /**
         * @return minDataDiskSize
         */
        public Integer getMinDataDiskSize() {
            return this.minDataDiskSize;
        }

        /**
         * @return minNodeCount
         */
        public Integer getMinNodeCount() {
            return this.minNodeCount;
        }

        /**
         * @return minSystemDiskSize
         */
        public Integer getMinSystemDiskSize() {
            return this.minSystemDiskSize;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public static final class Builder {
            private String hostGroupType; 
            private java.util.List < String > recommendedInstanceTypes; 
            private java.util.List < String > availableDataDiskCategories; 
            private java.util.List < String > availableInstanceTypes; 
            private java.util.List < String > availableSystemDiskCategories; 
            private Integer defaultDataDiskCount; 
            private Integer defaultDataDiskSize; 
            private Integer defaultNodeCount; 
            private Integer defaultSystemDiskSize; 
            private Integer maxDataDiskCount; 
            private Integer maxDataDiskSize; 
            private Integer maxNodeCount; 
            private Integer maxSystemDiskSize; 
            private Integer minDataDiskCount; 
            private Integer minDataDiskSize; 
            private Integer minNodeCount; 
            private Integer minSystemDiskSize; 
            private String nodeGroupName; 

            /**
             * HostGroupType.
             */
            public Builder hostGroupType(String hostGroupType) {
                this.hostGroupType = hostGroupType;
                return this;
            }

            /**
             * RecommendedInstanceTypes.
             */
            public Builder recommendedInstanceTypes(java.util.List < String > recommendedInstanceTypes) {
                this.recommendedInstanceTypes = recommendedInstanceTypes;
                return this;
            }

            /**
             * availableDataDiskCategories.
             */
            public Builder availableDataDiskCategories(java.util.List < String > availableDataDiskCategories) {
                this.availableDataDiskCategories = availableDataDiskCategories;
                return this;
            }

            /**
             * availableInstanceTypes.
             */
            public Builder availableInstanceTypes(java.util.List < String > availableInstanceTypes) {
                this.availableInstanceTypes = availableInstanceTypes;
                return this;
            }

            /**
             * availableSystemDiskCategories.
             */
            public Builder availableSystemDiskCategories(java.util.List < String > availableSystemDiskCategories) {
                this.availableSystemDiskCategories = availableSystemDiskCategories;
                return this;
            }

            /**
             * defaultDataDiskCount.
             */
            public Builder defaultDataDiskCount(Integer defaultDataDiskCount) {
                this.defaultDataDiskCount = defaultDataDiskCount;
                return this;
            }

            /**
             * defaultDataDiskSize.
             */
            public Builder defaultDataDiskSize(Integer defaultDataDiskSize) {
                this.defaultDataDiskSize = defaultDataDiskSize;
                return this;
            }

            /**
             * defaultNodeCount.
             */
            public Builder defaultNodeCount(Integer defaultNodeCount) {
                this.defaultNodeCount = defaultNodeCount;
                return this;
            }

            /**
             * defaultSystemDiskSize.
             */
            public Builder defaultSystemDiskSize(Integer defaultSystemDiskSize) {
                this.defaultSystemDiskSize = defaultSystemDiskSize;
                return this;
            }

            /**
             * maxDataDiskCount.
             */
            public Builder maxDataDiskCount(Integer maxDataDiskCount) {
                this.maxDataDiskCount = maxDataDiskCount;
                return this;
            }

            /**
             * maxDataDiskSize.
             */
            public Builder maxDataDiskSize(Integer maxDataDiskSize) {
                this.maxDataDiskSize = maxDataDiskSize;
                return this;
            }

            /**
             * maxNodeCount.
             */
            public Builder maxNodeCount(Integer maxNodeCount) {
                this.maxNodeCount = maxNodeCount;
                return this;
            }

            /**
             * maxSystemDiskSize.
             */
            public Builder maxSystemDiskSize(Integer maxSystemDiskSize) {
                this.maxSystemDiskSize = maxSystemDiskSize;
                return this;
            }

            /**
             * minDataDiskCount.
             */
            public Builder minDataDiskCount(Integer minDataDiskCount) {
                this.minDataDiskCount = minDataDiskCount;
                return this;
            }

            /**
             * minDataDiskSize.
             */
            public Builder minDataDiskSize(Integer minDataDiskSize) {
                this.minDataDiskSize = minDataDiskSize;
                return this;
            }

            /**
             * minNodeCount.
             */
            public Builder minNodeCount(Integer minNodeCount) {
                this.minNodeCount = minNodeCount;
                return this;
            }

            /**
             * minSystemDiskSize.
             */
            public Builder minSystemDiskSize(Integer minSystemDiskSize) {
                this.minSystemDiskSize = minSystemDiskSize;
                return this;
            }

            /**
             * nodeGroupName.
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
