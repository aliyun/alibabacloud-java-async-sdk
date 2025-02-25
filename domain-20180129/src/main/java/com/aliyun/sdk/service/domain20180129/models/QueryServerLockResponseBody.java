// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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

        /**
         * DomainInstanceId.
         */
        public Builder domainInstanceId(String domainInstanceId) {
            this.domainInstanceId = domainInstanceId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * ExpireDate.
         */
        public Builder expireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * LockInstanceId.
         */
        public Builder lockInstanceId(String lockInstanceId) {
            this.lockInstanceId = lockInstanceId;
            return this;
        }

        /**
         * LockProductId.
         */
        public Builder lockProductId(String lockProductId) {
            this.lockProductId = lockProductId;
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
         * ServerLockStatus.
         */
        public Builder serverLockStatus(Integer serverLockStatus) {
            this.serverLockStatus = serverLockStatus;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * UserId.
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
