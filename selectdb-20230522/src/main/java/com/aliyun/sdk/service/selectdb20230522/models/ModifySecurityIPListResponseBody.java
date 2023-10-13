// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityIPListResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecurityIPListResponseBody</p>
 */
public class ModifySecurityIPListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("GroupTag")
    private String groupTag;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIPList")
    private String securityIPList;

    @NameInMap("SecurityIPType")
    private String securityIPType;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TaskId")
    private Long taskId;

    @NameInMap("WhitelistNetType")
    private String whitelistNetType;

    private ModifySecurityIPListResponseBody(Builder builder) {
        this.code = builder.code;
        this.DBInstanceName = builder.DBInstanceName;
        this.groupName = builder.groupName;
        this.groupTag = builder.groupTag;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.securityIPList = builder.securityIPList;
        this.securityIPType = builder.securityIPType;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.whitelistNetType = builder.whitelistNetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIPListResponseBody create() {
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
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return securityIPType
     */
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return whitelistNetType
     */
    public String getWhitelistNetType() {
        return this.whitelistNetType;
    }

    public static final class Builder {
        private String code; 
        private String DBInstanceName; 
        private String groupName; 
        private String groupTag; 
        private String message; 
        private String requestId; 
        private String securityIPList; 
        private String securityIPType; 
        private Boolean success; 
        private Long taskId; 
        private String whitelistNetType; 

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
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * SecurityIPType.
         */
        public Builder securityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * WhitelistNetType.
         */
        public Builder whitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }

        public ModifySecurityIPListResponseBody build() {
            return new ModifySecurityIPListResponseBody(this);
        } 

    } 

}
