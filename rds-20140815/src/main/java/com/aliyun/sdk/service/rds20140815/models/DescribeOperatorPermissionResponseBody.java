// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("Privileges")
    private String privileges;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOperatorPermissionResponseBody(Builder builder) {
        this.createdTime = builder.createdTime;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
        private String expiredTime; 
        private String privileges; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOperatorPermissionResponseBody model) {
            this.createdTime = model.createdTime;
            this.expiredTime = model.expiredTime;
            this.privileges = model.privileges;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The effective period of the authorization. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12T02:27:04Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The time when the authorization expires. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2030-01-01T11:58:17Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The types of permissions that are granted. Valid values:</p>
         * <ul>
         * <li><strong>Control</strong>: configuration permissions. Allows you to view and modify instance configurations.</li>
         * <li><strong>Data</strong>: database permissions. Allows you to view table schemas, indexes, and SQL statements.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Control,Data</p>
         */
        public Builder privileges(String privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4C3535DC-743E-505A-B4F6-ABC***75C3</p>
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
