// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListSessionPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSessionPackagesResponseBody</p>
 */
public class ListSessionPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSessionPackagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSessionPackagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSessionPackagesResponseBody build() {
            return new ListSessionPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSessionPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionPackagesResponseBody</p>
     */
    public static class InstanceObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("UsedTime")
        private Long usedTime;

        private InstanceObject(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.startTime = builder.startTime;
            this.totalTime = builder.totalTime;
            this.usedTime = builder.usedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceObject create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return usedTime
         */
        public Long getUsedTime() {
            return this.usedTime;
        }

        public static final class Builder {
            private String expiredTime; 
            private String instanceId; 
            private String instanceType; 
            private String resourceId; 
            private String resourceType; 
            private String startTime; 
            private Long totalTime; 
            private Long usedTime; 

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalTime.
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * UsedTime.
             */
            public Builder usedTime(Long usedTime) {
                this.usedTime = usedTime;
                return this;
            }

            public InstanceObject build() {
                return new InstanceObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSessionPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSessionPackagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableHours")
        private Long availableHours;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("DeleteStatus")
        private Integer deleteStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceObject")
        private InstanceObject instanceObject;

        @com.aliyun.core.annotation.NameInMap("MaxHours")
        private Long maxHours;

        @com.aliyun.core.annotation.NameInMap("MaxSessions")
        private Long maxSessions;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SessionPackageId")
        private String sessionPackageId;

        @com.aliyun.core.annotation.NameInMap("SessionPackageName")
        private String sessionPackageName;

        @com.aliyun.core.annotation.NameInMap("SessionPackageTypeId")
        private String sessionPackageTypeId;

        @com.aliyun.core.annotation.NameInMap("SessionSpec")
        private String sessionSpec;

        @com.aliyun.core.annotation.NameInMap("SessionUsageRate")
        private Long sessionUsageRate;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("UserIdentification")
        private Long userIdentification;

        private Data(Builder builder) {
            this.availableHours = builder.availableHours;
            this.chargeType = builder.chargeType;
            this.deleteStatus = builder.deleteStatus;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceObject = builder.instanceObject;
            this.maxHours = builder.maxHours;
            this.maxSessions = builder.maxSessions;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.region = builder.region;
            this.sessionPackageId = builder.sessionPackageId;
            this.sessionPackageName = builder.sessionPackageName;
            this.sessionPackageTypeId = builder.sessionPackageTypeId;
            this.sessionSpec = builder.sessionSpec;
            this.sessionUsageRate = builder.sessionUsageRate;
            this.state = builder.state;
            this.userIdentification = builder.userIdentification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return availableHours
         */
        public Long getAvailableHours() {
            return this.availableHours;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return deleteStatus
         */
        public Integer getDeleteStatus() {
            return this.deleteStatus;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return instanceObject
         */
        public InstanceObject getInstanceObject() {
            return this.instanceObject;
        }

        /**
         * @return maxHours
         */
        public Long getMaxHours() {
            return this.maxHours;
        }

        /**
         * @return maxSessions
         */
        public Long getMaxSessions() {
            return this.maxSessions;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sessionPackageId
         */
        public String getSessionPackageId() {
            return this.sessionPackageId;
        }

        /**
         * @return sessionPackageName
         */
        public String getSessionPackageName() {
            return this.sessionPackageName;
        }

        /**
         * @return sessionPackageTypeId
         */
        public String getSessionPackageTypeId() {
            return this.sessionPackageTypeId;
        }

        /**
         * @return sessionSpec
         */
        public String getSessionSpec() {
            return this.sessionSpec;
        }

        /**
         * @return sessionUsageRate
         */
        public Long getSessionUsageRate() {
            return this.sessionUsageRate;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return userIdentification
         */
        public Long getUserIdentification() {
            return this.userIdentification;
        }

        public static final class Builder {
            private Long availableHours; 
            private String chargeType; 
            private Integer deleteStatus; 
            private String gmtCreate; 
            private String gmtModifiedTime; 
            private InstanceObject instanceObject; 
            private Long maxHours; 
            private Long maxSessions; 
            private String projectId; 
            private String projectName; 
            private String region; 
            private String sessionPackageId; 
            private String sessionPackageName; 
            private String sessionPackageTypeId; 
            private String sessionSpec; 
            private Long sessionUsageRate; 
            private Integer state; 
            private Long userIdentification; 

            /**
             * AvailableHours.
             */
            public Builder availableHours(Long availableHours) {
                this.availableHours = availableHours;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * DeleteStatus.
             */
            public Builder deleteStatus(Integer deleteStatus) {
                this.deleteStatus = deleteStatus;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * InstanceObject.
             */
            public Builder instanceObject(InstanceObject instanceObject) {
                this.instanceObject = instanceObject;
                return this;
            }

            /**
             * MaxHours.
             */
            public Builder maxHours(Long maxHours) {
                this.maxHours = maxHours;
                return this;
            }

            /**
             * MaxSessions.
             */
            public Builder maxSessions(Long maxSessions) {
                this.maxSessions = maxSessions;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SessionPackageId.
             */
            public Builder sessionPackageId(String sessionPackageId) {
                this.sessionPackageId = sessionPackageId;
                return this;
            }

            /**
             * SessionPackageName.
             */
            public Builder sessionPackageName(String sessionPackageName) {
                this.sessionPackageName = sessionPackageName;
                return this;
            }

            /**
             * SessionPackageTypeId.
             */
            public Builder sessionPackageTypeId(String sessionPackageTypeId) {
                this.sessionPackageTypeId = sessionPackageTypeId;
                return this;
            }

            /**
             * SessionSpec.
             */
            public Builder sessionSpec(String sessionSpec) {
                this.sessionSpec = sessionSpec;
                return this;
            }

            /**
             * SessionUsageRate.
             */
            public Builder sessionUsageRate(Long sessionUsageRate) {
                this.sessionUsageRate = sessionUsageRate;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * UserIdentification.
             */
            public Builder userIdentification(Long userIdentification) {
                this.userIdentification = userIdentification;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
