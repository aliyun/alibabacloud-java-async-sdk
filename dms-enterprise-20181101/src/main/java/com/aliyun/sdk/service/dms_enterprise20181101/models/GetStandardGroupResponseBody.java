// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetStandardGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandardGroupResponseBody</p>
 */
public class GetStandardGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StandardGroup")
    private StandardGroup standardGroup;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStandardGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.standardGroup = builder.standardGroup;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
     * @return standardGroup
     */
    public StandardGroup getStandardGroup() {
        return this.standardGroup;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private StandardGroup standardGroup; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StandardGroup.
         */
        public Builder standardGroup(StandardGroup standardGroup) {
            this.standardGroup = standardGroup;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStandardGroupResponseBody build() {
            return new GetStandardGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandardGroupResponseBody</p>
     */
    public static class StandardGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupMode")
        private String groupMode;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LastMenderId")
        private Long lastMenderId;

        private StandardGroup(Builder builder) {
            this.dbType = builder.dbType;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupMode = builder.groupMode;
            this.groupName = builder.groupName;
            this.lastMenderId = builder.lastMenderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardGroup create() {
            return builder().build();
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupMode
         */
        public String getGroupMode() {
            return this.groupMode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lastMenderId
         */
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

        public static final class Builder {
            private String dbType; 
            private String description; 
            private Long groupId; 
            private String groupMode; 
            private String groupName; 
            private Long lastMenderId; 

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupMode.
             */
            public Builder groupMode(String groupMode) {
                this.groupMode = groupMode;
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
             * LastMenderId.
             */
            public Builder lastMenderId(Long lastMenderId) {
                this.lastMenderId = lastMenderId;
                return this;
            }

            public StandardGroup build() {
                return new StandardGroup(this);
            } 

        } 

    }
}
