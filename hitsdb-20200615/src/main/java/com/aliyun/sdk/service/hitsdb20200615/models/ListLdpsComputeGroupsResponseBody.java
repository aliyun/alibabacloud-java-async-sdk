// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link ListLdpsComputeGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLdpsComputeGroupsResponseBody</p>
 */
public class ListLdpsComputeGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("GroupList")
    private java.util.List<GroupList> groupList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLdpsComputeGroupsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.groupList = builder.groupList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLdpsComputeGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return groupList
     */
    public java.util.List<GroupList> getGroupList() {
        return this.groupList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<GroupList> groupList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLdpsComputeGroupsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.groupList = model.groupList;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * GroupList.
         */
        public Builder groupList(java.util.List<GroupList> groupList) {
            this.groupList = groupList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLdpsComputeGroupsResponseBody build() {
            return new ListLdpsComputeGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLdpsComputeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLdpsComputeGroupsResponseBody</p>
     */
    public static class GroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExceptionInfo")
        private String exceptionInfo;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("WebUI")
        private String webUI;

        private GroupList(Builder builder) {
            this.exceptionInfo = builder.exceptionInfo;
            this.groupName = builder.groupName;
            this.isDefault = builder.isDefault;
            this.properties = builder.properties;
            this.state = builder.state;
            this.webUI = builder.webUI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupList create() {
            return builder().build();
        }

        /**
         * @return exceptionInfo
         */
        public String getExceptionInfo() {
            return this.exceptionInfo;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return webUI
         */
        public String getWebUI() {
            return this.webUI;
        }

        public static final class Builder {
            private String exceptionInfo; 
            private String groupName; 
            private Boolean isDefault; 
            private java.util.Map<String, ?> properties; 
            private String state; 
            private String webUI; 

            private Builder() {
            } 

            private Builder(GroupList model) {
                this.exceptionInfo = model.exceptionInfo;
                this.groupName = model.groupName;
                this.isDefault = model.isDefault;
                this.properties = model.properties;
                this.state = model.state;
                this.webUI = model.webUI;
            } 

            /**
             * ExceptionInfo.
             */
            public Builder exceptionInfo(String exceptionInfo) {
                this.exceptionInfo = exceptionInfo;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * WebUI.
             */
            public Builder webUI(String webUI) {
                this.webUI = webUI;
                return this;
            }

            public GroupList build() {
                return new GroupList(this);
            } 

        } 

    }
}
