// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerLockRequest} extends {@link RequestModel}
 *
 * <p>ListServerLockRequest</p>
 */
public class ListServerLockRequest extends Request {
    @Query
    @NameInMap("BeginStartDate")
    private Long beginStartDate;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndExpireDate")
    private Long endExpireDate;

    @Query
    @NameInMap("EndStartDate")
    private Long endStartDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("LockProductId")
    private String lockProductId;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ServerLockStatus")
    private Integer serverLockStatus;

    @Query
    @NameInMap("StartExpireDate")
    private Long startExpireDate;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private ListServerLockRequest(Builder builder) {
        super(builder);
        this.beginStartDate = builder.beginStartDate;
        this.domainName = builder.domainName;
        this.endExpireDate = builder.endExpireDate;
        this.endStartDate = builder.endStartDate;
        this.lang = builder.lang;
        this.lockProductId = builder.lockProductId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.serverLockStatus = builder.serverLockStatus;
        this.startExpireDate = builder.startExpireDate;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerLockRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginStartDate
     */
    public Long getBeginStartDate() {
        return this.beginStartDate;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endExpireDate
     */
    public Long getEndExpireDate() {
        return this.endExpireDate;
    }

    /**
     * @return endStartDate
     */
    public Long getEndStartDate() {
        return this.endStartDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return lockProductId
     */
    public String getLockProductId() {
        return this.lockProductId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return serverLockStatus
     */
    public Integer getServerLockStatus() {
        return this.serverLockStatus;
    }

    /**
     * @return startExpireDate
     */
    public Long getStartExpireDate() {
        return this.startExpireDate;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<ListServerLockRequest, Builder> {
        private Long beginStartDate; 
        private String domainName; 
        private Long endExpireDate; 
        private Long endStartDate; 
        private String lang; 
        private String lockProductId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer serverLockStatus; 
        private Long startExpireDate; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(ListServerLockRequest response) {
            super(response);
            this.beginStartDate = response.beginStartDate;
            this.domainName = response.domainName;
            this.endExpireDate = response.endExpireDate;
            this.endStartDate = response.endStartDate;
            this.lang = response.lang;
            this.lockProductId = response.lockProductId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.serverLockStatus = response.serverLockStatus;
            this.startExpireDate = response.startExpireDate;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * BeginStartDate.
         */
        public Builder beginStartDate(Long beginStartDate) {
            this.putQueryParameter("BeginStartDate", beginStartDate);
            this.beginStartDate = beginStartDate;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EndExpireDate.
         */
        public Builder endExpireDate(Long endExpireDate) {
            this.putQueryParameter("EndExpireDate", endExpireDate);
            this.endExpireDate = endExpireDate;
            return this;
        }

        /**
         * EndStartDate.
         */
        public Builder endStartDate(Long endStartDate) {
            this.putQueryParameter("EndStartDate", endStartDate);
            this.endStartDate = endStartDate;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LockProductId.
         */
        public Builder lockProductId(String lockProductId) {
            this.putQueryParameter("LockProductId", lockProductId);
            this.lockProductId = lockProductId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ServerLockStatus.
         */
        public Builder serverLockStatus(Integer serverLockStatus) {
            this.putQueryParameter("ServerLockStatus", serverLockStatus);
            this.serverLockStatus = serverLockStatus;
            return this;
        }

        /**
         * StartExpireDate.
         */
        public Builder startExpireDate(Long startExpireDate) {
            this.putQueryParameter("StartExpireDate", startExpireDate);
            this.startExpireDate = startExpireDate;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public ListServerLockRequest build() {
            return new ListServerLockRequest(this);
        } 

    } 

}
