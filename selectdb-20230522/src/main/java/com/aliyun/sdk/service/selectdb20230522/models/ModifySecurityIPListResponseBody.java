// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link ModifySecurityIPListResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecurityIPListResponseBody</p>
 */
public class ModifySecurityIPListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("GroupTag")
    private String groupTag;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.NameInMap("SecurityIPType")
    private String securityIPType;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("WhitelistNetType")
    private String whitelistNetType;

    private ModifySecurityIPListResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.groupName = builder.groupName;
        this.groupTag = builder.groupTag;
        this.requestId = builder.requestId;
        this.securityIPList = builder.securityIPList;
        this.securityIPType = builder.securityIPType;
        this.taskId = builder.taskId;
        this.whitelistNetType = builder.whitelistNetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIPListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String DBInstanceName; 
        private String groupName; 
        private String groupTag; 
        private String requestId; 
        private String securityIPList; 
        private String securityIPType; 
        private Long taskId; 
        private String whitelistNetType; 

        private Builder() {
        } 

        private Builder(ModifySecurityIPListResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.groupName = model.groupName;
            this.groupTag = model.groupTag;
            this.requestId = model.requestId;
            this.securityIPList = model.securityIPList;
            this.securityIPType = model.securityIPType;
            this.taskId = model.taskId;
            this.whitelistNetType = model.whitelistNetType;
        } 

        /**
         * <p>The name of the instance.</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The name of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The tag of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>grouptag</p>
         */
        public Builder groupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>195F64C2-8F11-532B-A436-FC08A221D756</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IP addresses in the whitelist of the instance. Multiple IP addresses are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.XX.XX,127.2.XX.XX</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The IP address type.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder securityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>479095561</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The network type of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>mix</p>
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
