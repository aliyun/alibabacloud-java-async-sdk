// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateStandardGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStandardGroupResponseBody</p>
 */
public class UpdateStandardGroupResponseBody extends TeaModel {
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

    private UpdateStandardGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.standardGroup = builder.standardGroup;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStandardGroupResponseBody create() {
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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the security rule set.</p>
         */
        public Builder standardGroup(StandardGroup standardGroup) {
            this.standardGroup = standardGroup;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateStandardGroupResponseBody build() {
            return new UpdateStandardGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateStandardGroupResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateStandardGroupResponseBody</p>
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
             * <p>The type of the database for which the security rules are used.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The description of the security rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>Production Environment test rules</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The security rule set ID.</p>
             * 
             * <strong>example:</strong>
             * <p>41****</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The control mode. Valid values:</p>
             * <ul>
             * <li><strong>NONE_CONTROL</strong>: Flexible Management</li>
             * <li><strong>STABLE</strong>: Stable Change</li>
             * <li><strong>COMMON</strong>: Security Collaboration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMMON</p>
             */
            public Builder groupMode(String groupMode) {
                this.groupMode = groupMode;
                return this;
            }

            /**
             * <p>The name of the security rule set.</p>
             * 
             * <strong>example:</strong>
             * <p>poc_test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The ID of the user who last modified the security rules.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
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
