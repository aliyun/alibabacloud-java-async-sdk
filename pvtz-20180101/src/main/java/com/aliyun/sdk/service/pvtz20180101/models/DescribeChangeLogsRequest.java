// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangeLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeChangeLogsRequest</p>
 */
public class DescribeChangeLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    private Long startTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeChangeLogsRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.entityType = builder.entityType;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTimestamp = builder.startTimestamp;
        this.userClientIp = builder.userClientIp;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChangeLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeChangeLogsRequest, Builder> {
        private Long endTimestamp; 
        private String entityType; 
        private String keyword; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTimestamp; 
        private String userClientIp; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChangeLogsRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.entityType = request.entityType;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTimestamp = request.startTimestamp;
            this.userClientIp = request.userClientIp;
            this.zoneId = request.zoneId;
        } 

        /**
         * The end of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * The type of operation logs. Valid values:
         * <p>
         * 
         * *   **PV_ZONE**: the logs that record the operations on zones
         * *   **PV_RECORD**: the logs that record the operations on DNS records
         * 
         * If you set this parameter to other values, all types of operation logs are queried.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * The keyword for searches in "%KeyWord%" mode. The value is not case-sensitive.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: **100**. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The beginning of the time range to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * The global ID of the zone.\
         * <p>
         * If you specify this parameter, the logs that record the operations on the Domain Name System (DNS) records of the specified zone are queried.\
         * If you leave this parameter empty, the logs that record the operations on all zones that belong to the current Alibaba Cloud account and the DNS records of these zones are queried.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeChangeLogsRequest build() {
            return new DescribeChangeLogsRequest(this);
        } 

    } 

}
