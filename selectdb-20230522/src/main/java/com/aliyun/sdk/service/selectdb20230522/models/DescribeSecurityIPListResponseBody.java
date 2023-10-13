// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityIPListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityIPListResponseBody</p>
 */
public class DescribeSecurityIPListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("GroupItems")
    private java.util.List < GroupItems> groupItems;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSecurityIPListResponseBody(Builder builder) {
        this.code = builder.code;
        this.DBInstanceName = builder.DBInstanceName;
        this.groupItems = builder.groupItems;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIPListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return groupItems
     */
    public java.util.List < GroupItems> getGroupItems() {
        return this.groupItems;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String DBInstanceName; 
        private java.util.List < GroupItems> groupItems; 
        private String message; 
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
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * GroupItems.
         */
        public Builder groupItems(java.util.List < GroupItems> groupItems) {
            this.groupItems = groupItems;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSecurityIPListResponseBody build() {
            return new DescribeSecurityIPListResponseBody(this);
        } 

    } 

    public static class GroupItems extends TeaModel {
        @NameInMap("AecurityIPType")
        private String aecurityIPType;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupTag")
        private String groupTag;

        @NameInMap("SecurityIPList")
        private String securityIPList;

        @NameInMap("WhitelistNetType")
        private String whitelistNetType;

        private GroupItems(Builder builder) {
            this.aecurityIPType = builder.aecurityIPType;
            this.groupName = builder.groupName;
            this.groupTag = builder.groupTag;
            this.securityIPList = builder.securityIPList;
            this.whitelistNetType = builder.whitelistNetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupItems create() {
            return builder().build();
        }

        /**
         * @return aecurityIPType
         */
        public String getAecurityIPType() {
            return this.aecurityIPType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupTag
         */
        public String getGroupTag() {
            return this.groupTag;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return whitelistNetType
         */
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

        public static final class Builder {
            private String aecurityIPType; 
            private String groupName; 
            private String groupTag; 
            private String securityIPList; 
            private String whitelistNetType; 

            /**
             * AecurityIPType.
             */
            public Builder aecurityIPType(String aecurityIPType) {
                this.aecurityIPType = aecurityIPType;
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
             * GroupTag.
             */
            public Builder groupTag(String groupTag) {
                this.groupTag = groupTag;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * WhitelistNetType.
             */
            public Builder whitelistNetType(String whitelistNetType) {
                this.whitelistNetType = whitelistNetType;
                return this;
            }

            public GroupItems build() {
                return new GroupItems(this);
            } 

        } 

    }
}
