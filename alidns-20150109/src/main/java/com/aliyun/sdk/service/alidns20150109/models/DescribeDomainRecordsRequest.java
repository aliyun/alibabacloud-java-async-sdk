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

        private Builder(DescribeDomainRecordsRequest response) {
            super(response);
            this.direction = response.direction;
            this.domainName = response.domainName;
            this.groupId = response.groupId;
            this.keyWord = response.keyWord;
            this.lang = response.lang;
            this.line = response.line;
            this.orderBy = response.orderBy;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.RRKeyWord = response.RRKeyWord;
            this.searchMode = response.searchMode;
            this.status = response.status;
            this.type = response.type;
            this.typeKeyWord = response.typeKeyWord;
            this.valueKeyWord = response.valueKeyWord;
        } 

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
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
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
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
         * Line.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RRKeyWord.
         */
        public Builder RRKeyWord(String RRKeyWord) {
            this.putQueryParameter("RRKeyWord", RRKeyWord);
            this.RRKeyWord = RRKeyWord;
            return this;
        }

        /**
         * SearchMode.
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * TypeKeyWord.
         */
        public Builder typeKeyWord(String typeKeyWord) {
            this.putQueryParameter("TypeKeyWord", typeKeyWord);
            this.typeKeyWord = typeKeyWord;
            return this;
        }

        /**
         * ValueKeyWord.
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
