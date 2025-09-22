// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeVersionPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVersionPageListRequest</p>
 */
public class DescribeVersionPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectCode")
    private String objectCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("objectId")
    private Long objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paging")
    private Boolean paging;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DescribeVersionPageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.currentPage = builder.currentPage;
        this.objectCode = builder.objectCode;
        this.objectId = builder.objectId;
        this.pageSize = builder.pageSize;
        this.paging = builder.paging;
        this.regId = builder.regId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionPageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return objectCode
     */
    public String getObjectCode() {
        return this.objectCode;
    }

    /**
     * @return objectId
     */
    public Long getObjectId() {
        return this.objectId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paging
     */
    public Boolean getPaging() {
        return this.paging;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeVersionPageListRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer currentPage; 
        private String objectCode; 
        private Long objectId; 
        private Integer pageSize; 
        private Boolean paging; 
        private String regId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVersionPageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.currentPage = request.currentPage;
            this.objectCode = request.objectCode;
            this.objectId = request.objectId;
            this.pageSize = request.pageSize;
            this.paging = request.paging;
            this.regId = request.regId;
            this.type = request.type;
        } 

        /**
         * <p>Sets the language type for the request and response messages, with a default value of <strong>zh</strong>. Values: </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Maximum number of results to be read in this call, with a default value of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Used to mark the starting position for reading. An empty value indicates starting from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>ex_OERlw0Zqfb23</p>
         */
        public Builder objectCode(String objectCode) {
            this.putQueryParameter("objectCode", objectCode);
            this.objectCode = objectCode;
            return this;
        }

        /**
         * <p>Primary key ID of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>392023</p>
         */
        public Builder objectId(Long objectId) {
            this.putQueryParameter("objectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>Number of items per page, with a default value of 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Pagination flag, with a default value of true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paging(Boolean paging) {
            this.putQueryParameter("paging", paging);
            this.paging = paging;
            return this;
        }

        /**
         * <p>Region code.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Type.</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeVersionPageListRequest build() {
            return new DescribeVersionPageListRequest(this);
        } 

    } 

}
