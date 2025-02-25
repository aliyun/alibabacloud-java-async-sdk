// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListServerLockRequest} extends {@link RequestModel}
 *
 * <p>ListServerLockRequest</p>
 */
public class ListServerLockRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginStartDate")
    private Long beginStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndExpireDate")
    private Long endExpireDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndStartDate")
    private Long endStartDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LockProductId")
    private String lockProductId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByType")
    private String orderByType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerLockStatus")
    private Integer serverLockStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartExpireDate")
    private Long startExpireDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private ListServerLockRequest(Builder builder) {
        super(builder);
        this.beginStartDate = builder.beginStartDate;
        this.domainName = builder.domainName;
        this.endExpireDate = builder.endExpireDate;
        this.endStartDate = builder.endStartDate;
        this.lang = builder.lang;
        this.lockProductId = builder.lockProductId;
        this.orderBy = builder.orderBy;
        this.orderByType = builder.orderByType;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderByType
     */
    public String getOrderByType() {
        return this.orderByType;
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
        private String orderBy; 
        private String orderByType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer serverLockStatus; 
        private Long startExpireDate; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(ListServerLockRequest request) {
            super(request);
            this.beginStartDate = request.beginStartDate;
            this.domainName = request.domainName;
            this.endExpireDate = request.endExpireDate;
            this.endStartDate = request.endStartDate;
            this.lang = request.lang;
            this.lockProductId = request.lockProductId;
            this.orderBy = request.orderBy;
            this.orderByType = request.orderByType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.serverLockStatus = request.serverLockStatus;
            this.startExpireDate = request.startExpireDate;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The start of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10 17:37:36</p>
         */
        public Builder beginStartDate(Long beginStartDate) {
            this.putQueryParameter("BeginStartDate", beginStartDate);
            this.beginStartDate = beginStartDate;
            return this;
        }

        /**
         * <p>The domain name for which you want to query the enabled registry lock.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-10 17:37:36</p>
         */
        public Builder endExpireDate(Long endExpireDate) {
            this.putQueryParameter("EndExpireDate", endExpireDate);
            this.endExpireDate = endExpireDate;
            return this;
        }

        /**
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-10 17:37:36</p>
         */
        public Builder endStartDate(Long endStartDate) {
            this.putQueryParameter("EndStartDate", endStartDate);
            this.endStartDate = endStartDate;
            return this;
        }

        /**
         * <p>The language of the error message to return if the request fails. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the product to which the domain name with the registry lock enabled belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1807**</p>
         */
        public Builder lockProductId(String lockProductId) {
            this.putQueryParameter("LockProductId", lockProductId);
            this.lockProductId = lockProductId;
            return this;
        }

        /**
         * <p>The field that you use to sort the query results.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>EXPIRE_DATE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXPIRE_DATE</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The order of the information based on which you want to sort the domain names, such as the registration date and expiration date. Valid values: ASC and DESC. The value ASC specifies the ascending order. The value DESC specifies the descending order. If this parameter is not configured, the default value DESC is used.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderByType(String orderByType) {
            this.putQueryParameter("OrderByType", orderByType);
            this.orderByType = orderByType;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the registry lock. Valid values:</p>
         * <ul>
         * <li>1: The registry lock is not enabled.</li>
         * <li>2: The registry lock is enabled.</li>
         * <li>3: The registry lock is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serverLockStatus(Integer serverLockStatus) {
            this.putQueryParameter("ServerLockStatus", serverLockStatus);
            this.serverLockStatus = serverLockStatus;
            return this;
        }

        /**
         * <p>The start of the expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-10 17:37:36</p>
         */
        public Builder startExpireDate(Long startExpireDate) {
            this.putQueryParameter("StartExpireDate", startExpireDate);
            this.startExpireDate = startExpireDate;
            return this;
        }

        /**
         * <p>The IP address of the client. For example, you can set the value to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
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
