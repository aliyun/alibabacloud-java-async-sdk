// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListDetectConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListDetectConfigsRequest</p>
 */
public class ListDetectConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("detectConfigName")
    private String detectConfigName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListDetectConfigsRequest(Builder builder) {
        super(builder);
        this.detectConfigName = builder.detectConfigName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDetectConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectConfigName
     */
    public String getDetectConfigName() {
        return this.detectConfigName;
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

    public static final class Builder extends Request.Builder<ListDetectConfigsRequest, Builder> {
        private String detectConfigName; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListDetectConfigsRequest request) {
            super(request);
            this.detectConfigName = request.detectConfigName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>Name of the drift detection configuration (fuzzy match).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder detectConfigName(String detectConfigName) {
            this.putQueryParameter("detectConfigName", detectConfigName);
            this.detectConfigName = detectConfigName;
            return this;
        }

        /**
         * <p>Maximum number of records to retrieve in a single request. Valid range: 1–200. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Query credential (Token). Set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>30BaZ9ekYWXJdqshYecA++coNg7qT1Zbm3RfLyFIZeY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListDetectConfigsRequest build() {
            return new ListDetectConfigsRequest(this);
        } 

    } 

}
