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
    @com.aliyun.core.annotation.NameInMap("advancedParams")
    private java.util.Map<String, ?> advancedParams;

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
    @com.aliyun.core.annotation.NameInMap("returnRichMainBody")
    private Boolean returnRichMainBody;

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
        this.advancedParams = builder.advancedParams;
        this.enableRerank = builder.enableRerank;
        this.industry = builder.industry;
        this.page = builder.page;
        this.query = builder.query;
        this.returnMainText = builder.returnMainText;
        this.returnMarkdownText = builder.returnMarkdownText;
        this.returnRichMainBody = builder.returnRichMainBody;
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
     * @return advancedParams
     */
    public java.util.Map<String, ?> getAdvancedParams() {
        return this.advancedParams;
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
     * @return returnRichMainBody
     */
    public Boolean getReturnRichMainBody() {
        return this.returnRichMainBody;
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
        private java.util.Map<String, ?> advancedParams; 
        private Boolean enableRerank; 
        private String industry; 
        private Integer page; 
        private String query; 
        private Boolean returnMainText; 
        private Boolean returnMarkdownText; 
        private Boolean returnRichMainBody; 
        private Boolean returnSummary; 
        private String sessionId; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(GenericSearchRequest request) {
            super(request);
            this.advancedParams = request.advancedParams;
            this.enableRerank = request.enableRerank;
            this.industry = request.industry;
            this.page = request.page;
            this.query = request.query;
            this.returnMainText = request.returnMainText;
            this.returnMarkdownText = request.returnMarkdownText;
            this.returnRichMainBody = request.returnRichMainBody;
            this.returnSummary = request.returnSummary;
            this.sessionId = request.sessionId;
            this.timeRange = request.timeRange;
        } 

        /**
         * <p>The advanced search parameters. Filters search results by the start and end dates of the webpage publication time. The date format is YYYY-MM-DD. This parameter takes precedence over timeRange.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;startPublishedDate&quot;:&quot;2025-07-01&quot;,&quot;endPublishedDate&quot;:&quot;2025-07-31&quot;}</p>
         */
        public Builder advancedParams(java.util.Map<String, ?> advancedParams) {
            String advancedParamsShrink = shrink(advancedParams, "advancedParams", "json");
            this.putQueryParameter("advancedParams", advancedParamsShrink);
            this.advancedParams = advancedParams;
            return this;
        }

        /**
         * <p>Specifies whether to rerank the search results. Default value: true.</p>
         */
        public Builder enableRerank(Boolean enableRerank) {
            this.putQueryParameter("enableRerank", enableRerank);
            this.enableRerank = enableRerank;
            return this;
        }

        /**
         * <p>The industry. If specified, only site content restricted to the specified industries is recalled. Separate multiple industries with commas.</p>
         * 
         * <strong>example:</strong>
         * <p>finance,law</p>
         */
        public Builder industry(String industry) {
            this.putQueryParameter("industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * <p>The page number. The value starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The search keywords.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iPhone</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Specifies whether to return the main text of the webpage. Default value: true.</p>
         */
        public Builder returnMainText(Boolean returnMainText) {
            this.putQueryParameter("returnMainText", returnMainText);
            this.returnMainText = returnMainText;
            return this;
        }

        /**
         * <p>Specifies whether to return the webpage content in Markdown format. Default value: true.</p>
         */
        public Builder returnMarkdownText(Boolean returnMarkdownText) {
            this.putQueryParameter("returnMarkdownText", returnMarkdownText);
            this.returnMarkdownText = returnMarkdownText;
            return this;
        }

        /**
         * <p>Specifies whether to return the full rich text body. Default value: false.</p>
         */
        public Builder returnRichMainBody(Boolean returnRichMainBody) {
            this.putQueryParameter("returnRichMainBody", returnRichMainBody);
            this.returnRichMainBody = returnRichMainBody;
            return this;
        }

        /**
         * <p>Specifies whether to return the enhanced summary. Default value: true.</p>
         */
        public Builder returnSummary(Boolean returnSummary) {
            this.putQueryParameter("returnSummary", returnSummary);
            this.returnSummary = returnSummary;
            return this;
        }

        /**
         * <p>The session ID for multi-turn interactions.</p>
         * 
         * <strong>example:</strong>
         * <p>282j3h3434j23hdw9sd72j3</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The time range.</p>
         * 
         * <strong>example:</strong>
         * <p>OneWeek</p>
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
