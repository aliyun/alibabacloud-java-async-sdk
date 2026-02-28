// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceGroupByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceGroupByDeviceResponseBody</p>
 */
public class QueryDeviceGroupByDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GroupInfos")
    private GroupInfos groupInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryDeviceGroupByDeviceResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.groupInfos = model.groupInfos;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The group information returned if the call succeeds. For more information, see the following GroupInfo parameter.</p>
         */
        public Builder groupInfos(GroupInfos groupInfos) {
            this.groupInfos = groupInfos;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7941C8CD-7764-4A94-8CD9-E2762D4A73AC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceGroupByDeviceResponseBody build() {
            return new QueryDeviceGroupByDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceGroupByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceGroupByDeviceResponseBody</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupDesc")
        private String groupDesc;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        private GroupInfo(Builder builder) {
            this.groupDesc = builder.groupDesc;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
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
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
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
            private String groupType; 
            private String utcCreate; 

            private Builder() {
            } 

            private Builder(GroupInfo model) {
                this.groupDesc = model.groupDesc;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.utcCreate = model.utcCreate;
            } 

            /**
             * <p>The description of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>father desc</p>
             */
            public Builder groupDesc(String groupDesc) {
                this.groupDesc = groupDesc;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>6a3FF2XE2BKa****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>father1543152336554</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>LINK_PLATFORM_DYNAMIC</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The time when the group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-25T13:25:37.000Z</p>
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
    /**
     * 
     * {@link QueryDeviceGroupByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceGroupByDeviceResponseBody</p>
     */
    public static class GroupInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupInfo")
        private java.util.List<GroupInfo> groupInfo;

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
        public java.util.List<GroupInfo> getGroupInfo() {
            return this.groupInfo;
        }

        public static final class Builder {
            private java.util.List<GroupInfo> groupInfo; 

            private Builder() {
            } 

            private Builder(GroupInfos model) {
                this.groupInfo = model.groupInfo;
            } 

            /**
             * GroupInfo.
             */
            public Builder groupInfo(java.util.List<GroupInfo> groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            public GroupInfos build() {
                return new GroupInfos(this);
            } 

        } 

    }
}
