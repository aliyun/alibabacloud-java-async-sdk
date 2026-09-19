// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link ListTemplateCacheRequest} extends {@link RequestModel}
 *
 * <p>ListTemplateCacheRequest</p>
 */
public class ListTemplateCacheRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateID")
    private String templateID;

    private ListTemplateCacheRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
        this.teamID = builder.teamID;
        this.templateID = builder.templateID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return templateID
     */
    public String getTemplateID() {
        return this.templateID;
    }

    public static final class Builder extends Request.Builder<ListTemplateCacheRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String status; 
        private String teamID; 
        private String templateID; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplateCacheRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
            this.teamID = request.teamID;
            this.templateID = request.templateID;
        } 

        /**
         * <p>The maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
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
         * <p>The pagination token returned from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>cae5f900-8b1d-4c0e-9c2a-1a2b3c4d5e6f</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Filters by cache status. Valid values:</p>
         * <ul>
         * <li>InProgress</li>
         * <li>Success</li>
         * <li>Failed</li>
         * <li>Deleting</li>
         * <li>Evicted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13b721e6-8cc8-5df2-af13-80316f7508af</p>
         */
        public Builder teamID(String teamID) {
            this.putQueryParameter("teamID", teamID);
            this.teamID = teamID;
            return this;
        }

        /**
         * <p>The unique identifier of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>us7dxqaezw5uu7aa2cm5</p>
         */
        public Builder templateID(String templateID) {
            this.putQueryParameter("templateID", templateID);
            this.templateID = templateID;
            return this;
        }

        @Override
        public ListTemplateCacheRequest build() {
            return new ListTemplateCacheRequest(this);
        } 

    } 

}
