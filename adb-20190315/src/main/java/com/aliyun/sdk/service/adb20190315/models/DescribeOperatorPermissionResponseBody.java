// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOperatorPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperatorPermissionResponseBody</p>
 */
public class DescribeOperatorPermissionResponseBody extends TeaModel {
    @NameInMap("CreatedTime")
    private String createdTime;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("Privileges")
    private String privileges;

    @NameInMap("RequestId")
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
         * The time when the authorization takes effect.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The time when the authorization expires.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The type of authorization. Valid values: Control | Data.
         */
        public Builder privileges(String privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * The ID of the request.
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
