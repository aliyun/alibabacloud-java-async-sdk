// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryServerLockResponseBody} extends {@link TeaModel}
 *
 * <p>QueryServerLockResponseBody</p>
 */
public class QueryServerLockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainInstanceId")
    private String domainInstanceId;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("ExpireDate")
    private String expireDate;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("LockInstanceId")
    private String lockInstanceId;

    @com.aliyun.core.annotation.NameInMap("LockProductId")
    private String lockProductId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerLockStatus")
    private Integer serverLockStatus;

    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private QueryServerLockResponseBody(Builder builder) {
        this.domainInstanceId = builder.domainInstanceId;
        this.domainName = builder.domainName;
        this.expireDate = builder.expireDate;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.lockInstanceId = builder.lockInstanceId;
        this.lockProductId = builder.lockProductId;
        this.requestId = builder.requestId;
        this.serverLockStatus = builder.serverLockStatus;
        this.startDate = builder.startDate;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryServerLockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainInstanceId
     */
    public String getDomainInstanceId() {
        return this.domainInstanceId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return expireDate
     */
    public String getExpireDate() {
        return this.expireDate;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return lockInstanceId
     */
    public String getLockInstanceId() {
        return this.lockInstanceId;
    }

    /**
     * @return lockProductId
     */
    public String getLockProductId() {
        return this.lockProductId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverLockStatus
     */
    public Integer getServerLockStatus() {
        return this.serverLockStatus;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String domainInstanceId; 
        private String domainName; 
        private String expireDate; 
        private String gmtCreate; 
        private String gmtModified; 
        private String lockInstanceId; 
        private String lockProductId; 
        private String requestId; 
        private Integer serverLockStatus; 
        private String startDate; 
        private String userId; 

        private Builder() {
        } 

        private Builder(QueryServerLockResponseBody model) {
            this.domainInstanceId = model.domainInstanceId;
            this.domainName = model.domainName;
            this.expireDate = model.expireDate;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.lockInstanceId = model.lockInstanceId;
            this.lockProductId = model.lockProductId;
            this.requestId = model.requestId;
            this.serverLockStatus = model.serverLockStatus;
            this.startDate = model.startDate;
            this.userId = model.userId;
        } 

        /**
         * <p>Domain instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S20190N1DAI4****</p>
         */
        public Builder domainInstanceId(String domainInstanceId) {
            this.domainInstanceId = domainInstanceId;
            return this;
        }

        /**
         * <p>The queried domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Expiration Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2030-07-10 17:37:36</p>
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10 17:37:36</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>Updated At.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10 17:37:36</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Registry lock instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S2021591IQ28****</p>
         */
        public Builder lockInstanceId(String lockInstanceId) {
            this.lockInstanceId = lockInstanceId;
            return this;
        }

        /**
         * <p>Lock product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1807**</p>
         */
        public Builder lockProductId(String lockProductId) {
            this.lockProductId = lockProductId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Registry lock status. Valid values:</p>
         * <ul>
         * <li>1: Disabled</li>
         * <li>2: Enabled</li>
         * <li>3: Shutdown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder serverLockStatus(Integer serverLockStatus) {
            this.serverLockStatus = serverLockStatus;
            return this;
        }

        /**
         * <p>The time when the lock takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10 17:37:36</p>
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>User UID.</p>
         * 
         * <strong>example:</strong>
         * <p>121000000****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public QueryServerLockResponseBody build() {
            return new QueryServerLockResponseBody(this);
        } 

    } 

}
