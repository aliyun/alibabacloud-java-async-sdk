// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListFaultReportsRequest} extends {@link RequestModel}
 *
 * <p>ListFaultReportsRequest</p>
 */
public class ListFaultReportsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<String> nodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListFaultReportsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodes = builder.nodes;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaultReportsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodes
     */
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListFaultReportsRequest, Builder> {
        private Long maxResults; 
        private String nextToken; 
        private java.util.List<String> nodes; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListFaultReportsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodes = request.nodes;
            this.status = request.status;
        } 

        /**
         * <p>The maximum number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>DA4F08D4</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of nodes.</p>
         */
        public Builder nodes(java.util.List<String> nodes) {
            String nodesShrink = shrink(nodes, "Nodes", "json");
            this.putBodyParameter("Nodes", nodesShrink);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The status of the fault report.</p>
         * 
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListFaultReportsRequest build() {
            return new ListFaultReportsRequest(this);
        } 

    } 

}
