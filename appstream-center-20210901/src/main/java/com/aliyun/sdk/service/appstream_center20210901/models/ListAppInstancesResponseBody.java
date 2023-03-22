// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppInstancesResponseBody</p>
 */
public class ListAppInstancesResponseBody extends TeaModel {
    @NameInMap("AppInstanceModels")
    private java.util.List < AppInstanceModels> appInstanceModels;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAppInstancesResponseBody(Builder builder) {
        this.appInstanceModels = builder.appInstanceModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return appInstanceModels
     */
    public java.util.List < AppInstanceModels> getAppInstanceModels() {
        return this.appInstanceModels;
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
        private java.util.List < AppInstanceModels> appInstanceModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AppInstanceModels.
         */
        public Builder appInstanceModels(java.util.List < AppInstanceModels> appInstanceModels) {
            this.appInstanceModels = appInstanceModels;
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
         * Id of the request
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

        public ListAppInstancesResponseBody build() {
            return new ListAppInstancesResponseBody(this);
        } 

    } 

    public static class AppInstanceModels extends TeaModel {
        @NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @NameInMap("AppInstanceId")
        private String appInstanceId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("MainEthPublicIp")
        private String mainEthPublicIp;

        @NameInMap("SessionStatus")
        private String sessionStatus;

        @NameInMap("Status")
        private String status;

        private AppInstanceModels(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.mainEthPublicIp = builder.mainEthPublicIp;
            this.sessionStatus = builder.sessionStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceModels create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceId
         */
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return mainEthPublicIp
         */
        public String getMainEthPublicIp() {
            return this.mainEthPublicIp;
        }

        /**
         * @return sessionStatus
         */
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String mainEthPublicIp; 
            private String sessionStatus; 
            private String status; 

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * AppInstanceId.
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * MainEthPublicIp.
             */
            public Builder mainEthPublicIp(String mainEthPublicIp) {
                this.mainEthPublicIp = mainEthPublicIp;
                return this;
            }

            /**
             * SessionStatus.
             */
            public Builder sessionStatus(String sessionStatus) {
                this.sessionStatus = sessionStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AppInstanceModels build() {
                return new AppInstanceModels(this);
            } 

        } 

    }
}
