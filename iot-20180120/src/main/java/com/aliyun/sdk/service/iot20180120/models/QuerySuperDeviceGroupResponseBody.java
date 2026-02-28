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
 * {@link QuerySuperDeviceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySuperDeviceGroupResponseBody</p>
 */
public class QuerySuperDeviceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySuperDeviceGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySuperDeviceGroupResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySuperDeviceGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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
         * <p>The parent group information returned if the call succeeds. For more information, see the following <strong>GroupInfo</strong> parameter.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7411716B-A488-4EEB-9AA0-6DB05AD2491F</p>
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

        public QuerySuperDeviceGroupResponseBody build() {
            return new QuerySuperDeviceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySuperDeviceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySuperDeviceGroupResponseBody</p>
     */
    public static class GroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupDesc")
        private String groupDesc;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private GroupInfo(Builder builder) {
            this.groupDesc = builder.groupDesc;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
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

        public static final class Builder {
            private String groupDesc; 
            private String groupId; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(GroupInfo model) {
                this.groupDesc = model.groupDesc;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The description of the parent group.</p>
             * 
             * <strong>example:</strong>
             * <p>A test</p>
             */
            public Builder groupDesc(String groupDesc) {
                this.groupDesc = groupDesc;
                return this;
            }

            /**
             * <p>The ID of the parent group.</p>
             * 
             * <strong>example:</strong>
             * <p>tDQvBJqbUyHskDse</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the parent group.</p>
             * 
             * <strong>example:</strong>
             * <p>IOTTEST</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public GroupInfo build() {
                return new GroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySuperDeviceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySuperDeviceGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupInfo")
        private java.util.List<GroupInfo> groupInfo;

        private Data(Builder builder) {
            this.groupInfo = builder.groupInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            private Builder(Data model) {
                this.groupInfo = model.groupInfo;
            } 

            /**
             * GroupInfo.
             */
            public Builder groupInfo(java.util.List<GroupInfo> groupInfo) {
                this.groupInfo = groupInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
