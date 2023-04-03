// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainRecordsRequest</p>
 */
public class DescribeDomainRecordsRequest extends Request {
    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("KeyWord")
    private String keyWord;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Line")
    private String line;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("RRKeyWord")
    private String RRKeyWord;

    @Query
    @NameInMap("SearchMode")
    private String searchMode;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("TypeKeyWord")
    private String typeKeyWord;

    @Query
    @NameInMap("ValueKeyWord")
    private String valueKeyWord;

    private DescribeDomainRecordsRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.keyWord = builder.keyWord;
        this.lang = builder.lang;
        this.line = builder.line;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.RRKeyWord = builder.RRKeyWord;
        this.searchMode = builder.searchMode;
        this.status = builder.status;
        this.type = builder.type;
        this.typeKeyWord = builder.typeKeyWord;
        this.valueKeyWord = builder.valueKeyWord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
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
     * @return line
     */
    public String getLine() {
        return this.line;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return RRKeyWord
     */
    public String getRRKeyWord() {
        return this.RRKeyWord;
    }

    /**
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return typeKeyWord
     */
    public String getTypeKeyWord() {
        return this.typeKeyWord;
    }

    /**
     * @return valueKeyWord
     */
    public String getValueKeyWord() {
        return this.valueKeyWord;
    }

    public static final class Builder extends Request.Builder<DescribeDomainRecordsRequest, Builder> {
        private String direction; 
        private String domainName; 
        private Long groupId; 
        private String keyWord; 
        private String lang; 
        private String line; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String RRKeyWord; 
        private String searchMode; 
        private String status; 
        private String type; 
        private String typeKeyWord; 
        private String valueKeyWord; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainRecordsRequest request) {
            super(request);
            this.direction = request.direction;
            this.domainName = request.domainName;
            this.groupId = request.groupId;
            this.keyWord = request.keyWord;
            this.lang = request.lang;
            this.line = request.line;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.RRKeyWord = request.RRKeyWord;
            this.searchMode = request.searchMode;
            this.status = request.status;
            this.type = request.type;
            this.typeKeyWord = request.typeKeyWord;
            this.valueKeyWord = request.valueKeyWord;
        } 

        /**
         * The order in which the returned DNS records are sorted. Valid values: DESC and ASC. Default value: DESC.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The domain name for which you want to query DNS records.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of the domain name group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The keyword based on which the system queries DNS records.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * The language of the domain name.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The line based on which the system queries DNS records. Default value: **default**.
         * <p>
         * 
         * For more information, see the following topic:
         * 
         * [DNS lines](https://www.alibabacloud.com/help/zh/doc-detail/29807.htm)
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * The method that is used to sort the returned DNS records. By default, the DNS records are sorted in reverse chronological order based on the time when they were added.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **500**. Default value: **20**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The resource record (RR) keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.
         */
        public Builder RRKeyWord(String RRKeyWord) {
            this.putQueryParameter("RRKeyWord", RRKeyWord);
            this.RRKeyWord = RRKeyWord;
            return this;
        }

        /**
         * The search mode. Valid values: **LIKE, EXACT, and ADVANCED**.
         * <p>
         * 
         * *   If you set this parameter to LIKE or EXACT, specify the KeyWord parameter.In this case, the RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status parameters are ignored.
         * 
         * *   If you set this parameter to ADVANCED, specify the RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status parameters.
         * 
         * *   If you do not specify this parameter, the system determines the search mode based on the following rules:
         * 
         *     *   If the KeyWord parameter is specified, the system uses the LIKE mode.
         *     *   If the KeyWord parameter is not specified, the system queries DNS records based on values of the RRKeyWord and ValueKeyWord parameters in fuzzy match mode, and based on the values of the TypeKeyWord, Type, Line, and Status parameters in exact match mode.
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * The status of the DNS records to query. Valid values: **Enable and Disable**.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the DNS records to query. For more information, see the following topic:
         * <p>
         * 
         * [DNS record types](https://www.alibabacloud.com/help/zh/doc-detail/29805.htm)
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The type keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in exact match mode. The value is not case-sensitive.
         */
        public Builder typeKeyWord(String typeKeyWord) {
            this.putQueryParameter("TypeKeyWord", typeKeyWord);
            this.typeKeyWord = typeKeyWord;
            return this;
        }

        /**
         * The record value keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.
         */
        public Builder valueKeyWord(String valueKeyWord) {
            this.putQueryParameter("ValueKeyWord", valueKeyWord);
            this.valueKeyWord = valueKeyWord;
            return this;
        }

        @Override
        public DescribeDomainRecordsRequest build() {
            return new DescribeDomainRecordsRequest(this);
        } 

    } 

}
