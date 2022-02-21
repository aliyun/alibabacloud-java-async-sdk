// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceGroupByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceGroupByDeviceResponseBody</p>
 */
public class QueryDeviceGroupByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("GroupInfos")
    private GroupInfos groupInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDeviceGroupByDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.groupInfos = builder.groupInfos;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceGroupByDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return groupInfos
     */
    public GroupInfos getGroupInfos() {
        return this.groupInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private GroupInfos groupInfos; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * GroupInfos.
         */
        public Builder groupInfos(GroupInfos groupInfos) {
            this.groupInfos = groupInfos;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceGroupByDeviceResponseBody build() {
            return new QueryDeviceGroupByDeviceResponseBody(this);
        } 

    } 

    public static class GroupInfo extends TeaModel {
        @NameInMap("GroupDesc")
        private String groupDesc;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("UtcCreate")
        private String utcCreate;

        private GroupInfo(Builder builder) {
            this.groupDesc = builder.groupDesc;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.utcCreate = builder.utcCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfo create() {
            return builder().build();
        }

        /**
         * @return groupDesc
         */
        public String getGroupDesc() {
            return this.groupDesc;
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

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public static final class Builder {
            private String groupDesc; 
            private String groupId; 
            private String groupName; 
            private String utcCreate; 

            /**
             * GroupDesc.
             */
            public Builder groupDesc(String groupDesc) {
                this.groupDesc = groupDesc;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
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
             * UtcCreate.
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
    public static class GroupInfos extends TeaModel {
        @NameInMap("GroupInfo")
        private java.util.List < GroupInfo> groupInfo;

        private GroupInfos(Builder builder) {
            this.groupInfo = builder.groupInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupInfos create() {
            return builder().build();
        }

        /**
         * @return groupInfo
         */
        public java.util.List < GroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

        public static final class Builder {
            private java.util.List < GroupInfo> groupInfo; 

            /**
             * GroupInfo.
             */
            public Builder groupInfo(java.util.List < GroupInfo> groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            public GroupInfos build() {
                return new GroupInfos(this);
            } 

        } 

    }
}
