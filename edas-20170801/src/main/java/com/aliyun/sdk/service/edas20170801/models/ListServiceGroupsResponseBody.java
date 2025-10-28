// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListServiceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceGroupsResponseBody</p>
 */
public class ListServiceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceGroupsList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListServiceGroupsResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.serviceGroupsList = model.serviceGroupsList;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>a5281053-08e4-47a5-b2ab-5c0323de7b5a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about service groups.</p>
         */
        public Builder serviceGroupsList(ServiceGroupsList serviceGroupsList) {
            this.serviceGroupsList = serviceGroupsList;
            return this;
        }

        public ListServiceGroupsResponseBody build() {
            return new ListServiceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceGroupsResponseBody</p>
     */
    public static class ListServiceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
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

            private Builder() {
            } 

            private Builder(ListServiceGroups model) {
                this.createTime = model.createTime;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The time when the service group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1575357165770</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the service group.</p>
             * 
             * <strong>example:</strong>
             * <p>789d9cda-74b1-<strong><strong>-</strong></strong>-05e21a0a7661</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the service group.</p>
             * 
             * <strong>example:</strong>
             * <p>edas-test-group</p>
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
    /**
     * 
     * {@link ListServiceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceGroupsResponseBody</p>
     */
    public static class ServiceGroupsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListServiceGroups")
        private java.util.List<ListServiceGroups> listServiceGroups;

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
        public java.util.List<ListServiceGroups> getListServiceGroups() {
            return this.listServiceGroups;
        }

        public static final class Builder {
            private java.util.List<ListServiceGroups> listServiceGroups; 

            private Builder() {
            } 

            private Builder(ServiceGroupsList model) {
                this.listServiceGroups = model.listServiceGroups;
            } 

            /**
             * ListServiceGroups.
             */
            public Builder listServiceGroups(java.util.List<ListServiceGroups> listServiceGroups) {
                this.listServiceGroups = listServiceGroups;
                return this;
            }

            public ServiceGroupsList build() {
                return new ServiceGroupsList(this);
            } 

        } 

    }
}
