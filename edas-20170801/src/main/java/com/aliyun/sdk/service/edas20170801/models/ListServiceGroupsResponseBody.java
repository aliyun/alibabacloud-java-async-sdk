// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceGroupsResponseBody</p>
 */
public class ListServiceGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceGroupsList")
    private ServiceGroupsList serviceGroupsList;

    private ListServiceGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.serviceGroupsList = builder.serviceGroupsList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceGroupsList
     */
    public ServiceGroupsList getServiceGroupsList() {
        return this.serviceGroupsList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private ServiceGroupsList serviceGroupsList; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about service groups.
         */
        public Builder serviceGroupsList(ServiceGroupsList serviceGroupsList) {
            this.serviceGroupsList = serviceGroupsList;
            return this;
        }

        public ListServiceGroupsResponseBody build() {
            return new ListServiceGroupsResponseBody(this);
        } 

    } 

    public static class ListServiceGroups extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        private ListServiceGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListServiceGroups create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String createTime; 
            private String groupId; 
            private String groupName; 

            /**
             * The time when the service group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the service group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the service group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public ListServiceGroups build() {
                return new ListServiceGroups(this);
            } 

        } 

    }
    public static class ServiceGroupsList extends TeaModel {
        @NameInMap("ListServiceGroups")
        private java.util.List < ListServiceGroups> listServiceGroups;

        private ServiceGroupsList(Builder builder) {
            this.listServiceGroups = builder.listServiceGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceGroupsList create() {
            return builder().build();
        }

        /**
         * @return listServiceGroups
         */
        public java.util.List < ListServiceGroups> getListServiceGroups() {
            return this.listServiceGroups;
        }

        public static final class Builder {
            private java.util.List < ListServiceGroups> listServiceGroups; 

            /**
             * ListServiceGroups.
             */
            public Builder listServiceGroups(java.util.List < ListServiceGroups> listServiceGroups) {
                this.listServiceGroups = listServiceGroups;
                return this;
            }

            public ServiceGroupsList build() {
                return new ServiceGroupsList(this);
            } 

        } 

    }
}
