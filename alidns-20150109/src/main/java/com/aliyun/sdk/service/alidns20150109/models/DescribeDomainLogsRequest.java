// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainLogsRequest</p>
 */
public class DescribeDomainLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    private DescribeDomainLogsRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.keyWord = builder.keyWord;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
        this.type = builder.type;
        this.endDate = builder.endDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    public static final class Builder extends Request.Builder<DescribeDomainLogsRequest, Builder> {
        private String groupId; 
        private String keyWord; 
        private String lang; 
        private Long pageNumber; 
        private Long pageSize; 
        private String startDate; 
        private String type; 
        private String endDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainLogsRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.keyWord = request.keyWord;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
            this.type = request.type;
            this.endDate = request.endDate;
        } 

        /**
         * The ID of the domain name group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The keyword for the query in "%KeyWord%" mode. The keyword is not case-sensitive.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The page number to return. The page number starts from **1**. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return per page. Maximum value: **100**. Default value: **20**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The start time for the query. Format: **YYYY-MM-DD**
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * The type of object of which you want to query operation logs. Valid values:
         * <p>
         * 
         * *   domain: domain name
         * *   slavedns: secondary Domain Name System (DNS)
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The end time for the query. Format: **YYYY-MM-DD**
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        @Override
        public DescribeDomainLogsRequest build() {
            return new DescribeDomainLogsRequest(this);
        } 

    } 

}
