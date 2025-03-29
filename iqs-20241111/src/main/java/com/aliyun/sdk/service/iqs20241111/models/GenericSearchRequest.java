// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link GenericSearchRequest} extends {@link RequestModel}
 *
 * <p>GenericSearchRequest</p>
 */
public class GenericSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enableRerank")
    private Boolean enableRerank;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("returnMainText")
    private Boolean returnMainText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("returnMarkdownText")
    private Boolean returnMarkdownText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("returnSummary")
    private Boolean returnSummary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private GenericSearchRequest(Builder builder) {
        super(builder);
        this.enableRerank = builder.enableRerank;
        this.industry = builder.industry;
        this.page = builder.page;
        this.query = builder.query;
        this.returnMainText = builder.returnMainText;
        this.returnMarkdownText = builder.returnMarkdownText;
        this.returnSummary = builder.returnSummary;
        this.sessionId = builder.sessionId;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenericSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableRerank
     */
    public Boolean getEnableRerank() {
        return this.enableRerank;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return returnMainText
     */
    public Boolean getReturnMainText() {
        return this.returnMainText;
    }

    /**
     * @return returnMarkdownText
     */
    public Boolean getReturnMarkdownText() {
        return this.returnMarkdownText;
    }

    /**
     * @return returnSummary
     */
    public Boolean getReturnSummary() {
        return this.returnSummary;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<GenericSearchRequest, Builder> {
        private Boolean enableRerank; 
        private String industry; 
        private Integer page; 
        private String query; 
        private Boolean returnMainText; 
        private Boolean returnMarkdownText; 
        private Boolean returnSummary; 
        private String sessionId; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(GenericSearchRequest request) {
            super(request);
            this.enableRerank = request.enableRerank;
            this.industry = request.industry;
            this.page = request.page;
            this.query = request.query;
            this.returnMainText = request.returnMainText;
            this.returnMarkdownText = request.returnMarkdownText;
            this.returnSummary = request.returnSummary;
            this.sessionId = request.sessionId;
            this.timeRange = request.timeRange;
        } 

        /**
         * enableRerank.
         */
        public Builder enableRerank(Boolean enableRerank) {
            this.putQueryParameter("enableRerank", enableRerank);
            this.enableRerank = enableRerank;
            return this;
        }

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.putQueryParameter("industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * returnMainText.
         */
        public Builder returnMainText(Boolean returnMainText) {
            this.putQueryParameter("returnMainText", returnMainText);
            this.returnMainText = returnMainText;
            return this;
        }

        /**
         * returnMarkdownText.
         */
        public Builder returnMarkdownText(Boolean returnMarkdownText) {
            this.putQueryParameter("returnMarkdownText", returnMarkdownText);
            this.returnMarkdownText = returnMarkdownText;
            return this;
        }

        /**
         * returnSummary.
         */
        public Builder returnSummary(Boolean returnSummary) {
            this.putQueryParameter("returnSummary", returnSummary);
            this.returnSummary = returnSummary;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("timeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public GenericSearchRequest build() {
            return new GenericSearchRequest(this);
        } 

    } 

}
