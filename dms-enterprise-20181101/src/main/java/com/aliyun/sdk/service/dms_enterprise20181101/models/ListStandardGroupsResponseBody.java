// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStandardGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStandardGroupsResponseBody</p>
 */
public class ListStandardGroupsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StandardGroupList")
    private java.util.List < StandardGroupList> standardGroupList;

    @NameInMap("Success")
    private Boolean success;

    private ListStandardGroupsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.standardGroupList = builder.standardGroupList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStandardGroupsResponseBody create() {
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
     * @return standardGroupList
     */
    public java.util.List < StandardGroupList> getStandardGroupList() {
        return this.standardGroupList;
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
        private java.util.List < StandardGroupList> standardGroupList; 
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StandardGroupList.
         */
        public Builder standardGroupList(java.util.List < StandardGroupList> standardGroupList) {
            this.standardGroupList = standardGroupList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListStandardGroupsResponseBody build() {
            return new ListStandardGroupsResponseBody(this);
        } 

    } 

    public static class StandardGroupList extends TeaModel {
        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupMode")
        private String groupMode;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("LastMenderId")
        private Long lastMenderId;

        private StandardGroupList(Builder builder) {
            this.dbType = builder.dbType;
            this.description = builder.description;
            this.groupMode = builder.groupMode;
            this.groupName = builder.groupName;
            this.lastMenderId = builder.lastMenderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardGroupList create() {
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

            public StandardGroupList build() {
                return new StandardGroupList(this);
            } 

        } 

    }
}
