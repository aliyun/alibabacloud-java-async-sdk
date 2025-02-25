// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeOperatorPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperatorPermissionResponseBody</p>
 */
public class DescribeOperatorPermissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatedTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("Privileges")
    private String privileges;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOperatorPermissionResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
        this.DBClusterId = builder.DBClusterId;
        this.expiredTime = builder.expiredTime;
        this.privileges = builder.privileges;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperatorPermissionResponseBody create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return privileges
     */
    public String getPrivileges() {
        return this.privileges;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createdTime; 
        private String DBClusterId; 
        private String expiredTime; 
        private String privileges; 
        private String requestId; 

        /**
         * <p>The time when the permissions take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-25T03:35:02Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The time when the permissions expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-10T02:19:00Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The queried permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>Control,Data</p>
         */
        public Builder privileges(String privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOperatorPermissionResponseBody build() {
            return new DescribeOperatorPermissionResponseBody(this);
        } 

    } 

}
