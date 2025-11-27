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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The app instances of the persistent session type.</p>
         */
        public Builder persistentAppInstanceModels(java.util.List<PersistentAppInstanceModels> persistentAppInstanceModels) {
            this.persistentAppInstanceModels = persistentAppInstanceModels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
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
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-0bxls9m9arax6****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The ID of the app instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-azn3kmwruh1vl****</p>
             */
            public Builder appInstanceId(String appInstanceId) {
                this.appInstanceId = appInstanceId;
                return this;
            }

            /**
             * <p>The ID of the app instance of the persistent session type.</p>
             * 
             * <strong>example:</strong>
             * <p>p-0cc7s3mw2fg4j****</p>
             */
            public Builder appInstancePersistentId(String appInstancePersistentId) {
                this.appInstancePersistentId = appInstancePersistentId;
                return this;
            }

            /**
             * <p>The name of the app instance of the persistent session type.</p>
             * 
             * <strong>example:</strong>
             * <p>test-persistent-name</p>
             */
            public Builder appInstancePersistentName(String appInstancePersistentName) {
                this.appInstancePersistentName = appInstancePersistentName;
                return this;
            }

            /**
             * <p>The status of the app instance of the persistent session type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>STARTING</li>
             * <li>RUNNING</li>
             * <li>STOPPED</li>
             * <li>UNAVAILABLE</li>
             * <li>DELETING</li>
             * <li>PENDING</li>
             * <li>STOPPING</li>
             * <li>DELETED</li>
             * <li>REBUILDING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder appInstancePersistentStatus(String appInstancePersistentStatus) {
                this.appInstancePersistentStatus = appInstancePersistentStatus;
                return this;
            }

            /**
             * <p>The status of the app instance.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>INIT: The app instance is being initialized.</li>
             * <li>STARTING: The app instance is being started.</li>
             * <li>CLOSING: The app instance is being stopped.</li>
             * <li>CLOSED: The app instance is closed.</li>
             * <li>RUNNING: The app instance is running.</li>
             * <li>idle: The app instance is idle.</li>
             * <li>BOUND: The app instance is bound to an app instance group.</li>
             * <li>UNAVAILABLE: The app instance is unavailable.</li>
             * <li>DELETED: The app instance is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder appInstanceStatus(String appInstanceStatus) {
                this.appInstanceStatus = appInstanceStatus;
                return this;
            }

            /**
             * <p>The authorized users.</p>
             */
            public Builder authorizedUsers(java.util.List<String> authorizedUsers) {
                this.authorizedUsers = authorizedUsers;
                return this;
            }

            /**
             * <p>The time when the app instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-13T03:22:18.000+00:00</p>
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
