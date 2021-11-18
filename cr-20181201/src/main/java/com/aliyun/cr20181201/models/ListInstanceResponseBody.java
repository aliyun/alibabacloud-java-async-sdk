// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResponseBody</p>
 */
public class ListInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Instances")
    private java.util.List < Instances> instances;


    private ListInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.pageNo = builder.pageNo;
        this.isSuccess = builder.isSuccess;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private Integer pageNo; 
        private Boolean isSuccess; 
        private Integer pageSize; 
        private Integer totalCount; 
        private java.util.List < Instances> instances; 

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>12121</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Instance information</p>
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        public ListInstanceResponseBody build() {
            return new ListInstanceResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("InstanceSpecification")
        private String instanceSpecification;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;


        private Instances(Builder builder) {
            this.modifiedTime = builder.modifiedTime;
            this.instanceName = builder.instanceName;
            this.createTime = builder.createTime;
            this.instanceSpecification = builder.instanceSpecification;
            this.instanceStatus = builder.instanceStatus;
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceSpecification
         */
        public String getInstanceSpecification() {
            return this.instanceSpecification;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String modifiedTime; 
            private String instanceName; 
            private String createTime; 
            private String instanceSpecification; 
            private String instanceStatus; 
            private String instanceId; 
            private String regionId; 

            /**
             * <p>Last modified time</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>Instance name</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>Created</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Enterprise Edition</p>
             */
            public Builder instanceSpecification(String instanceSpecification) {
                this.instanceSpecification = instanceSpecification;
                return this;
            }

            /**
             * <p>Instance status</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>Instance ID</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
