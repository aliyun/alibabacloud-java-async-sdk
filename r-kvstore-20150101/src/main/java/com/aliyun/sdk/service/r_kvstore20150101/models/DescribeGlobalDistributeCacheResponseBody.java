// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDistributeCacheResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDistributeCacheResponseBody</p>
 */
public class DescribeGlobalDistributeCacheResponseBody extends TeaModel {
    @NameInMap("GlobalDistributeCaches")
    private java.util.List < GlobalDistributeCaches> globalDistributeCaches;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeGlobalDistributeCacheResponseBody(Builder builder) {
        this.globalDistributeCaches = builder.globalDistributeCaches;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDistributeCacheResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalDistributeCaches
     */
    public java.util.List < GlobalDistributeCaches> getGlobalDistributeCaches() {
        return this.globalDistributeCaches;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < GlobalDistributeCaches> globalDistributeCaches; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * GlobalDistributeCaches.
         */
        public Builder globalDistributeCaches(java.util.List < GlobalDistributeCaches> globalDistributeCaches) {
            this.globalDistributeCaches = globalDistributeCaches;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeGlobalDistributeCacheResponseBody build() {
            return new DescribeGlobalDistributeCacheResponseBody(this);
        } 

    } 

    public static class SubInstances extends TeaModel {
        @NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @NameInMap("InstanceClass")
        private String instanceClass;

        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("RegionId")
        private String regionId;

        private SubInstances(Builder builder) {
            this.globalInstanceId = builder.globalInstanceId;
            this.instanceClass = builder.instanceClass;
            this.instanceID = builder.instanceID;
            this.instanceStatus = builder.instanceStatus;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubInstances create() {
            return builder().build();
        }

        /**
         * @return globalInstanceId
         */
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String globalInstanceId; 
            private String instanceClass; 
            private String instanceID; 
            private String instanceStatus; 
            private String regionId; 

            /**
             * GlobalInstanceId.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
                return this;
            }

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public SubInstances build() {
                return new SubInstances(this);
            } 

        } 

    }
    public static class GlobalDistributeCaches extends TeaModel {
        @NameInMap("GlobalInstanceId")
        private String globalInstanceId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SubInstances")
        private java.util.List < SubInstances> subInstances;

        private GlobalDistributeCaches(Builder builder) {
            this.globalInstanceId = builder.globalInstanceId;
            this.status = builder.status;
            this.subInstances = builder.subInstances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalDistributeCaches create() {
            return builder().build();
        }

        /**
         * @return globalInstanceId
         */
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subInstances
         */
        public java.util.List < SubInstances> getSubInstances() {
            return this.subInstances;
        }

        public static final class Builder {
            private String globalInstanceId; 
            private String status; 
            private java.util.List < SubInstances> subInstances; 

            /**
             * GlobalInstanceId.
             */
            public Builder globalInstanceId(String globalInstanceId) {
                this.globalInstanceId = globalInstanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubInstances.
             */
            public Builder subInstances(java.util.List < SubInstances> subInstances) {
                this.subInstances = subInstances;
                return this;
            }

            public GlobalDistributeCaches build() {
                return new GlobalDistributeCaches(this);
            } 

        } 

    }
}
