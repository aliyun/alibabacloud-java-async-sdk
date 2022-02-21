// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsResponseBody</p>
 */
public class ListUserGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListUserGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserGroupsResponseBody build() {
            return new ListUserGroupsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("IsvSubId")
        private String isvSubId;

        @NameInMap("ParentUserGroupId")
        private Long parentUserGroupId;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UserCount")
        private Long userCount;

        @NameInMap("UserGroupId")
        private Long userGroupId;

        @NameInMap("UserGroupName")
        private String userGroupName;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.isvSubId = builder.isvSubId;
            this.parentUserGroupId = builder.parentUserGroupId;
            this.updateTime = builder.updateTime;
            this.userCount = builder.userCount;
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return isvSubId
         */
        public String getIsvSubId() {
            return this.isvSubId;
        }

        /**
         * @return parentUserGroupId
         */
        public Long getParentUserGroupId() {
            return this.parentUserGroupId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userCount
         */
        public Long getUserCount() {
            return this.userCount;
        }

        /**
         * @return userGroupId
         */
        public Long getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private String isvSubId; 
            private Long parentUserGroupId; 
            private String updateTime; 
            private Long userCount; 
            private Long userGroupId; 
            private String userGroupName; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * IsvSubId.
             */
            public Builder isvSubId(String isvSubId) {
                this.isvSubId = isvSubId;
                return this;
            }

            /**
             * ParentUserGroupId.
             */
            public Builder parentUserGroupId(Long parentUserGroupId) {
                this.parentUserGroupId = parentUserGroupId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Long userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * UserGroupId.
             */
            public Builder userGroupId(Long userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserGroupName.
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
