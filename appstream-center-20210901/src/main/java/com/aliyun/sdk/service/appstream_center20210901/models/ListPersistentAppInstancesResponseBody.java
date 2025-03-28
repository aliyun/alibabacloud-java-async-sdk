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
 * {@link ListPersistentAppInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPersistentAppInstancesResponseBody</p>
 */
public class ListPersistentAppInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PersistentAppInstanceModels")
    private java.util.List<PersistentAppInstanceModels> persistentAppInstanceModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPersistentAppInstancesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.persistentAppInstanceModels = builder.persistentAppInstanceModels;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPersistentAppInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return persistentAppInstanceModels
     */
    public java.util.List<PersistentAppInstanceModels> getPersistentAppInstanceModels() {
        return this.persistentAppInstanceModels;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PersistentAppInstanceModels> persistentAppInstanceModels; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPersistentAppInstancesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.persistentAppInstanceModels = model.persistentAppInstanceModels;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
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
         * PersistentAppInstanceModels.
         */
        public Builder persistentAppInstanceModels(java.util.List<PersistentAppInstanceModels> persistentAppInstanceModels) {
            this.persistentAppInstanceModels = persistentAppInstanceModels;
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

        public ListPersistentAppInstancesResponseBody build() {
            return new ListPersistentAppInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPersistentAppInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPersistentAppInstancesResponseBody</p>
     */
    public static class PersistentAppInstanceModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceId")
        private String appInstanceId;

        @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
        private String appInstancePersistentId;

        @com.aliyun.core.annotation.NameInMap("AppInstancePersistentName")
        private String appInstancePersistentName;

        @com.aliyun.core.annotation.NameInMap("AppInstancePersistentStatus")
        private String appInstancePersistentStatus;

        @com.aliyun.core.annotation.NameInMap("AppInstanceStatus")
        private String appInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUsers")
        private java.util.List<String> authorizedUsers;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        private PersistentAppInstanceModels(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceId = builder.appInstanceId;
            this.appInstancePersistentId = builder.appInstancePersistentId;
            this.appInstancePersistentName = builder.appInstancePersistentName;
            this.appInstancePersistentStatus = builder.appInstancePersistentStatus;
            this.appInstanceStatus = builder.appInstanceStatus;
            this.authorizedUsers = builder.authorizedUsers;
            this.gmtCreate = builder.gmtCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersistentAppInstanceModels create() {
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
         * @return appInstancePersistentId
         */
        public String getAppInstancePersistentId() {
            return this.appInstancePersistentId;
        }

        /**
         * @return appInstancePersistentName
         */
        public String getAppInstancePersistentName() {
            return this.appInstancePersistentName;
        }

        /**
         * @return appInstancePersistentStatus
         */
        public String getAppInstancePersistentStatus() {
            return this.appInstancePersistentStatus;
        }

        /**
         * @return appInstanceStatus
         */
        public String getAppInstanceStatus() {
            return this.appInstanceStatus;
        }

        /**
         * @return authorizedUsers
         */
        public java.util.List<String> getAuthorizedUsers() {
            return this.authorizedUsers;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceId; 
            private String appInstancePersistentId; 
            private String appInstancePersistentName; 
            private String appInstancePersistentStatus; 
            private String appInstanceStatus; 
            private java.util.List<String> authorizedUsers; 
            private String gmtCreate; 

            private Builder() {
            } 

            private Builder(PersistentAppInstanceModels model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceId = model.appInstanceId;
                this.appInstancePersistentId = model.appInstancePersistentId;
                this.appInstancePersistentName = model.appInstancePersistentName;
                this.appInstancePersistentStatus = model.appInstancePersistentStatus;
                this.appInstanceStatus = model.appInstanceStatus;
                this.authorizedUsers = model.authorizedUsers;
                this.gmtCreate = model.gmtCreate;
            } 

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
             * AppInstancePersistentId.
             */
            public Builder appInstancePersistentId(String appInstancePersistentId) {
                this.appInstancePersistentId = appInstancePersistentId;
                return this;
            }

            /**
             * AppInstancePersistentName.
             */
            public Builder appInstancePersistentName(String appInstancePersistentName) {
                this.appInstancePersistentName = appInstancePersistentName;
                return this;
            }

            /**
             * AppInstancePersistentStatus.
             */
            public Builder appInstancePersistentStatus(String appInstancePersistentStatus) {
                this.appInstancePersistentStatus = appInstancePersistentStatus;
                return this;
            }

            /**
             * AppInstanceStatus.
             */
            public Builder appInstanceStatus(String appInstanceStatus) {
                this.appInstanceStatus = appInstanceStatus;
                return this;
            }

            /**
             * AuthorizedUsers.
             */
            public Builder authorizedUsers(java.util.List<String> authorizedUsers) {
                this.authorizedUsers = authorizedUsers;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            public PersistentAppInstanceModels build() {
                return new PersistentAppInstanceModels(this);
            } 

        } 

    }
}
