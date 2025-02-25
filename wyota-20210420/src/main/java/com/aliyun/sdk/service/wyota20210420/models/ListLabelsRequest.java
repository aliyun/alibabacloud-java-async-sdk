// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListLabelsRequest} extends {@link RequestModel}
 *
 * <p>ListLabelsRequest</p>
 */
public class ListLabelsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContent")
    private String labelContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    private String labelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListLabelsRequest(Builder builder) {
        super(builder);
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelContent
     */
    public String getLabelContent() {
        return this.labelContent;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
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

    public static final class Builder extends Request.Builder<ListLabelsRequest, Builder> {
        private String labelContent; 
        private String labelId; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListLabelsRequest request) {
            super(request);
            this.labelContent = request.labelContent;
            this.labelId = request.labelId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * LabelContent.
         */
        public Builder labelContent(String labelContent) {
            this.putBodyParameter("LabelContent", labelContent);
            this.labelContent = labelContent;
            return this;
        }

        /**
         * LabelId.
         */
        public Builder labelId(String labelId) {
            this.putBodyParameter("LabelId", labelId);
            this.labelId = labelId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListLabelsRequest build() {
            return new ListLabelsRequest(this);
        } 

    } 

}
