// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link ListCertRequest} extends {@link RequestModel}
 *
 * <p>ListCertRequest</p>
 */
public class ListCertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AfterDate")
    private String afterDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeforeDate")
    private String beforeDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceUuid")
    private String instanceUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListCertRequest(Builder builder) {
        super(builder);
        this.afterDate = builder.afterDate;
        this.beforeDate = builder.beforeDate;
        this.currentPage = builder.currentPage;
        this.instanceUuid = builder.instanceUuid;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.showSize = builder.showSize;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return afterDate
     */
    public String getAfterDate() {
        return this.afterDate;
    }

    /**
     * @return beforeDate
     */
    public String getBeforeDate() {
        return this.beforeDate;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return this.instanceUuid;
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
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
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

    public static final class Builder extends Request.Builder<ListCertRequest, Builder> {
        private String afterDate; 
        private String beforeDate; 
        private Integer currentPage; 
        private String instanceUuid; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer showSize; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCertRequest request) {
            super(request);
            this.afterDate = request.afterDate;
            this.beforeDate = request.beforeDate;
            this.currentPage = request.currentPage;
            this.instanceUuid = request.instanceUuid;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.showSize = request.showSize;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * AfterDate.
         */
        public Builder afterDate(String afterDate) {
            this.putQueryParameter("AfterDate", afterDate);
            this.afterDate = afterDate;
            return this;
        }

        /**
         * BeforeDate.
         */
        public Builder beforeDate(String beforeDate) {
            this.putQueryParameter("BeforeDate", beforeDate);
            this.beforeDate = beforeDate;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InstanceUuid.
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
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

        @Override
        public ListCertRequest build() {
            return new ListCertRequest(this);
        } 

    } 

}
