// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeDomainRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainRecordsRequest</p>
 */
public class DescribeDomainRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Line")
    private String line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RRKeyWord")
    private String RRKeyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeKeyWord")
    private String typeKeyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValueKeyWord")
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
         * <p>The order in which you want to sort the returned DNS records. Valid values: DESC and ASC. Default value: DESC.</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The domain name. You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a> operation to obtain the domain name.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the domain name group.</p>
         * <ul>
         * <li>If you do not specify GroupId, all domain names are queried.</li>
         * <li>If you set GroupId to 0, no value is returned.</li>
         * <li>If you set GroupId to 1, the domain names in the default group are queried.</li>
         * <li>If you set GroupId to -2, all domain names are queried.</li>
         * <li>You can also specify GroupId based on the actual group ID.</li>
         * </ul>
         * <p>You can call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomaingroups?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainGroups </a>operation to obtain the ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2223</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The language.</p>
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
         * <p>The resolution line. Default value: <strong>default</strong>.</p>
         * <p>For more information, see</p>
         * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29807.htm">DNS lines</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn_mobile_anhui</p>
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * <p>The method that is used to sort the returned DNS records. By default, the DNS records are sorted in reverse chronological order based on the time when they were added.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 500</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The hostname keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        public Builder RRKeyWord(String RRKeyWord) {
            this.putQueryParameter("RRKeyWord", RRKeyWord);
            this.RRKeyWord = RRKeyWord;
            return this;
        }

        /**
         * <p>The search mode. Valid values: <strong>LIKE, EXACT, and ADVANCED</strong>.</p>
         * <ul>
         * <li><p>If you set SearchMode to LIKE or EXACT, specify KeyWord. In this case, RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status are invalid.</p>
         * </li>
         * <li><p>If you set SearchMode to ADVANCED, specify RRKeyWord, TypeKeyWord, ValueKeyWord, Type, Line, and Status.</p>
         * </li>
         * <li><p>If you do not specify SearchMode, the system determines the search mode based on the following rules:</p>
         * <ul>
         * <li>If KeyWord is specified, the system uses the LIKE mode.</li>
         * <li>If KeyWord is not specified, the system queries DNS records based on values of RRKeyWord and ValueKeyWord in fuzzy match mode, and based on the values of TypeKeyWord, Type, Line, and Status in exact match mode.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LIKE</p>
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>The status of the DNS records to query. Valid values: <strong>Enable and Disable</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the DNS records to query. For more information, see</p>
         * <p><a href="https://www.alibabacloud.com/help/zh/doc-detail/29805.htm">DNS record types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The type keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in exact match mode. The value is not case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>MX</p>
         */
        public Builder typeKeyWord(String typeKeyWord) {
            this.putQueryParameter("TypeKeyWord", typeKeyWord);
            this.typeKeyWord = typeKeyWord;
            return this;
        }

        /**
         * <p>The record value keyword based on which the system queries DNS records. The system queries DNS records based on the value of this parameter in fuzzy match mode. The value is not case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>com</p>
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
