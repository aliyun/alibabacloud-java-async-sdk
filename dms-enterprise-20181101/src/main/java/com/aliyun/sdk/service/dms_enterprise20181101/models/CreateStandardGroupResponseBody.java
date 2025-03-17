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
 * {@link CreateStandardGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStandardGroupResponseBody</p>
 */
public class CreateStandardGroupResponseBody extends TeaModel {
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

    private CreateStandardGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.standardGroup = builder.standardGroup;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStandardGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateStandardGroupResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.standardGroup = model.standardGroup;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34E01EDD-6A16-4CF0-9541-C644D1BE01AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the created security rule set.</p>
         */
        public Builder standardGroup(StandardGroup standardGroup) {
            this.standardGroup = standardGroup;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateStandardGroupResponseBody build() {
            return new CreateStandardGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateStandardGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateStandardGroupResponseBody</p>
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

            private Builder() {
            } 

            private Builder(StandardGroup model) {
                this.dbType = model.dbType;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupMode = model.groupMode;
                this.groupName = model.groupName;
                this.lastMenderId = model.lastMenderId;
            } 

            /**
             * <p>The type of the database engine. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
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
             * <p>test_rule</p>
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
             * <p>test_group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The ID of the user who creates the security rule set.</p>
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
