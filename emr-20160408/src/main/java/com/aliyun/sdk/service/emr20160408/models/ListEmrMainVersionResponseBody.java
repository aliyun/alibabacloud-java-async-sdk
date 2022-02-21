// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmrMainVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListEmrMainVersionResponseBody</p>
 */
public class ListEmrMainVersionResponseBody extends TeaModel {
    @NameInMap("EmrMainVersionList")
    private EmrMainVersionList emrMainVersionList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListEmrMainVersionResponseBody(Builder builder) {
        this.emrMainVersionList = builder.emrMainVersionList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEmrMainVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return emrMainVersionList
     */
    public EmrMainVersionList getEmrMainVersionList() {
        return this.emrMainVersionList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private EmrMainVersionList emrMainVersionList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * EmrMainVersionList.
         */
        public Builder emrMainVersionList(EmrMainVersionList emrMainVersionList) {
            this.emrMainVersionList = emrMainVersionList;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEmrMainVersionResponseBody build() {
            return new ListEmrMainVersionResponseBody(this);
        } 

    } 

    public static class ServiceInfo extends TeaModel {
        @NameInMap("Display")
        private Boolean display;

        @NameInMap("Mandatory")
        private Boolean mandatory;

        @NameInMap("ServiceDisplayName")
        private String serviceDisplayName;

        @NameInMap("ServiceDisplayVersion")
        private String serviceDisplayVersion;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceVersion")
        private String serviceVersion;

        private ServiceInfo(Builder builder) {
            this.display = builder.display;
            this.mandatory = builder.mandatory;
            this.serviceDisplayName = builder.serviceDisplayName;
            this.serviceDisplayVersion = builder.serviceDisplayVersion;
            this.serviceName = builder.serviceName;
            this.serviceVersion = builder.serviceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfo create() {
            return builder().build();
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return mandatory
         */
        public Boolean getMandatory() {
            return this.mandatory;
        }

        /**
         * @return serviceDisplayName
         */
        public String getServiceDisplayName() {
            return this.serviceDisplayName;
        }

        /**
         * @return serviceDisplayVersion
         */
        public String getServiceDisplayVersion() {
            return this.serviceDisplayVersion;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public static final class Builder {
            private Boolean display; 
            private Boolean mandatory; 
            private String serviceDisplayName; 
            private String serviceDisplayVersion; 
            private String serviceName; 
            private String serviceVersion; 

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * Mandatory.
             */
            public Builder mandatory(Boolean mandatory) {
                this.mandatory = mandatory;
                return this;
            }

            /**
             * ServiceDisplayName.
             */
            public Builder serviceDisplayName(String serviceDisplayName) {
                this.serviceDisplayName = serviceDisplayName;
                return this;
            }

            /**
             * ServiceDisplayVersion.
             */
            public Builder serviceDisplayVersion(String serviceDisplayVersion) {
                this.serviceDisplayVersion = serviceDisplayVersion;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServiceVersion.
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
            } 

        } 

    }
    public static class ServiceInfoList extends TeaModel {
        @NameInMap("ServiceInfo")
        private java.util.List < ServiceInfo> serviceInfo;

        private ServiceInfoList(Builder builder) {
            this.serviceInfo = builder.serviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfoList create() {
            return builder().build();
        }

        /**
         * @return serviceInfo
         */
        public java.util.List < ServiceInfo> getServiceInfo() {
            return this.serviceInfo;
        }

        public static final class Builder {
            private java.util.List < ServiceInfo> serviceInfo; 

            /**
             * ServiceInfo.
             */
            public Builder serviceInfo(java.util.List < ServiceInfo> serviceInfo) {
                this.serviceInfo = serviceInfo;
                return this;
            }

            public ServiceInfoList build() {
                return new ServiceInfoList(this);
            } 

        } 

    }
    public static class ClusterTypeInfo extends TeaModel {
        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("ServiceInfoList")
        private ServiceInfoList serviceInfoList;

        private ClusterTypeInfo(Builder builder) {
            this.clusterType = builder.clusterType;
            this.serviceInfoList = builder.serviceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeInfo create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return serviceInfoList
         */
        public ServiceInfoList getServiceInfoList() {
            return this.serviceInfoList;
        }

        public static final class Builder {
            private String clusterType; 
            private ServiceInfoList serviceInfoList; 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * ServiceInfoList.
             */
            public Builder serviceInfoList(ServiceInfoList serviceInfoList) {
                this.serviceInfoList = serviceInfoList;
                return this;
            }

            public ClusterTypeInfo build() {
                return new ClusterTypeInfo(this);
            } 

        } 

    }
    public static class ClusterTypeInfoList extends TeaModel {
        @NameInMap("ClusterTypeInfo")
        private java.util.List < ClusterTypeInfo> clusterTypeInfo;

        private ClusterTypeInfoList(Builder builder) {
            this.clusterTypeInfo = builder.clusterTypeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeInfoList create() {
            return builder().build();
        }

        /**
         * @return clusterTypeInfo
         */
        public java.util.List < ClusterTypeInfo> getClusterTypeInfo() {
            return this.clusterTypeInfo;
        }

        public static final class Builder {
            private java.util.List < ClusterTypeInfo> clusterTypeInfo; 

            /**
             * ClusterTypeInfo.
             */
            public Builder clusterTypeInfo(java.util.List < ClusterTypeInfo> clusterTypeInfo) {
                this.clusterTypeInfo = clusterTypeInfo;
                return this;
            }

            public ClusterTypeInfoList build() {
                return new ClusterTypeInfoList(this);
            } 

        } 

    }
    public static class ClusterTypeWhiteUser extends TeaModel {
        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("UserId")
        private String userId;

        private ClusterTypeWhiteUser(Builder builder) {
            this.clusterType = builder.clusterType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeWhiteUser create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String clusterType; 
            private String userId; 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ClusterTypeWhiteUser build() {
                return new ClusterTypeWhiteUser(this);
            } 

        } 

    }
    public static class ClusterTypeWhiteUserList extends TeaModel {
        @NameInMap("ClusterTypeWhiteUser")
        private java.util.List < ClusterTypeWhiteUser> clusterTypeWhiteUser;

        private ClusterTypeWhiteUserList(Builder builder) {
            this.clusterTypeWhiteUser = builder.clusterTypeWhiteUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeWhiteUserList create() {
            return builder().build();
        }

        /**
         * @return clusterTypeWhiteUser
         */
        public java.util.List < ClusterTypeWhiteUser> getClusterTypeWhiteUser() {
            return this.clusterTypeWhiteUser;
        }

        public static final class Builder {
            private java.util.List < ClusterTypeWhiteUser> clusterTypeWhiteUser; 

            /**
             * ClusterTypeWhiteUser.
             */
            public Builder clusterTypeWhiteUser(java.util.List < ClusterTypeWhiteUser> clusterTypeWhiteUser) {
                this.clusterTypeWhiteUser = clusterTypeWhiteUser;
                return this;
            }

            public ClusterTypeWhiteUserList build() {
                return new ClusterTypeWhiteUserList(this);
            } 

        } 

    }
    public static class WhiteUserList extends TeaModel {
        @NameInMap("WhiteUser")
        private java.util.List < String > whiteUser;

        private WhiteUserList(Builder builder) {
            this.whiteUser = builder.whiteUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteUserList create() {
            return builder().build();
        }

        /**
         * @return whiteUser
         */
        public java.util.List < String > getWhiteUser() {
            return this.whiteUser;
        }

        public static final class Builder {
            private java.util.List < String > whiteUser; 

            /**
             * WhiteUser.
             */
            public Builder whiteUser(java.util.List < String > whiteUser) {
                this.whiteUser = whiteUser;
                return this;
            }

            public WhiteUserList build() {
                return new WhiteUserList(this);
            } 

        } 

    }
    public static class EmrMainVersion extends TeaModel {
        @NameInMap("ClusterTypeInfoList")
        private ClusterTypeInfoList clusterTypeInfoList;

        @NameInMap("ClusterTypeWhiteUserList")
        private ClusterTypeWhiteUserList clusterTypeWhiteUserList;

        @NameInMap("Display")
        private Boolean display;

        @NameInMap("EcmVersion")
        private Boolean ecmVersion;

        @NameInMap("EmrVersion")
        private String emrVersion;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("PublishType")
        private String publishType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("StackVersion")
        private String stackVersion;

        @NameInMap("WhiteUserList")
        private WhiteUserList whiteUserList;

        private EmrMainVersion(Builder builder) {
            this.clusterTypeInfoList = builder.clusterTypeInfoList;
            this.clusterTypeWhiteUserList = builder.clusterTypeWhiteUserList;
            this.display = builder.display;
            this.ecmVersion = builder.ecmVersion;
            this.emrVersion = builder.emrVersion;
            this.imageId = builder.imageId;
            this.publishType = builder.publishType;
            this.regionId = builder.regionId;
            this.stackName = builder.stackName;
            this.stackVersion = builder.stackVersion;
            this.whiteUserList = builder.whiteUserList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrMainVersion create() {
            return builder().build();
        }

        /**
         * @return clusterTypeInfoList
         */
        public ClusterTypeInfoList getClusterTypeInfoList() {
            return this.clusterTypeInfoList;
        }

        /**
         * @return clusterTypeWhiteUserList
         */
        public ClusterTypeWhiteUserList getClusterTypeWhiteUserList() {
            return this.clusterTypeWhiteUserList;
        }

        /**
         * @return display
         */
        public Boolean getDisplay() {
            return this.display;
        }

        /**
         * @return ecmVersion
         */
        public Boolean getEcmVersion() {
            return this.ecmVersion;
        }

        /**
         * @return emrVersion
         */
        public String getEmrVersion() {
            return this.emrVersion;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return publishType
         */
        public String getPublishType() {
            return this.publishType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return stackVersion
         */
        public String getStackVersion() {
            return this.stackVersion;
        }

        /**
         * @return whiteUserList
         */
        public WhiteUserList getWhiteUserList() {
            return this.whiteUserList;
        }

        public static final class Builder {
            private ClusterTypeInfoList clusterTypeInfoList; 
            private ClusterTypeWhiteUserList clusterTypeWhiteUserList; 
            private Boolean display; 
            private Boolean ecmVersion; 
            private String emrVersion; 
            private String imageId; 
            private String publishType; 
            private String regionId; 
            private String stackName; 
            private String stackVersion; 
            private WhiteUserList whiteUserList; 

            /**
             * ClusterTypeInfoList.
             */
            public Builder clusterTypeInfoList(ClusterTypeInfoList clusterTypeInfoList) {
                this.clusterTypeInfoList = clusterTypeInfoList;
                return this;
            }

            /**
             * ClusterTypeWhiteUserList.
             */
            public Builder clusterTypeWhiteUserList(ClusterTypeWhiteUserList clusterTypeWhiteUserList) {
                this.clusterTypeWhiteUserList = clusterTypeWhiteUserList;
                return this;
            }

            /**
             * Display.
             */
            public Builder display(Boolean display) {
                this.display = display;
                return this;
            }

            /**
             * EcmVersion.
             */
            public Builder ecmVersion(Boolean ecmVersion) {
                this.ecmVersion = ecmVersion;
                return this;
            }

            /**
             * EmrVersion.
             */
            public Builder emrVersion(String emrVersion) {
                this.emrVersion = emrVersion;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(String publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * StackVersion.
             */
            public Builder stackVersion(String stackVersion) {
                this.stackVersion = stackVersion;
                return this;
            }

            /**
             * WhiteUserList.
             */
            public Builder whiteUserList(WhiteUserList whiteUserList) {
                this.whiteUserList = whiteUserList;
                return this;
            }

            public EmrMainVersion build() {
                return new EmrMainVersion(this);
            } 

        } 

    }
    public static class EmrMainVersionList extends TeaModel {
        @NameInMap("EmrMainVersion")
        private java.util.List < EmrMainVersion> emrMainVersion;

        private EmrMainVersionList(Builder builder) {
            this.emrMainVersion = builder.emrMainVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmrMainVersionList create() {
            return builder().build();
        }

        /**
         * @return emrMainVersion
         */
        public java.util.List < EmrMainVersion> getEmrMainVersion() {
            return this.emrMainVersion;
        }

        public static final class Builder {
            private java.util.List < EmrMainVersion> emrMainVersion; 

            /**
             * EmrMainVersion.
             */
            public Builder emrMainVersion(java.util.List < EmrMainVersion> emrMainVersion) {
                this.emrMainVersion = emrMainVersion;
                return this;
            }

            public EmrMainVersionList build() {
                return new EmrMainVersionList(this);
            } 

        } 

    }
}
