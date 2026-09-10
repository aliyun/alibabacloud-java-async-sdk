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
 * {@link ListStackConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListStackConfigsRequest</p>
 */
public class ListStackConfigsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stackId")
    private String stackId;

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
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ListStackConfigsRequest(Builder builder) {
        super(builder);
        this.stackId = builder.stackId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListStackConfigsRequest, Builder> {
        private String stackId; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListStackConfigsRequest request) {
            super(request);
            this.stackId = request.stackId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
            this.version = request.version;
        } 

        /**
         * <p>The stack ID. The unique identifier generated after the stack is created.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqbxxxxx</p>
         */
        public Builder stackId(String stackId) {
            this.putPathParameter("stackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The maximum number of records to read in this request. Default value: 20. Maximum value: 200.</p>
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
         * <p>The pagination token that marks the position from which to start reading. Leave empty to start from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>s8UVlnE23gZvjCvCwkoZ7Z4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The status of the stack configuration.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Name</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>Creating</td>
         * <td>Being created.</td>
         * </tr>
         * <tr>
         * <td>Created</td>
         * <td>Created.</td>
         * </tr>
         * <tr>
         * <td>Waiting</td>
         * <td>Waiting for deployment.</td>
         * </tr>
         * <tr>
         * <td>Deploying</td>
         * <td>Being deployed.</td>
         * </tr>
         * <tr>
         * <td>Deployed</td>
         * <td>Deployed.</td>
         * </tr>
         * <tr>
         * <td>Errored</td>
         * <td>Deployment failed.</td>
         * </tr>
         * <tr>
         * <td>Deleting</td>
         * <td>Being deleted.</td>
         * </tr>
         * <tr>
         * <td>Deleted</td>
         * <td>Deleted.</td>
         * </tr>
         * <tr>
         * <td>DeleteFailed</td>
         * <td>Deletion failed.</td>
         * </tr>
         * <tr>
         * <td>DetectTriggered</td>
         * <td>Drift detection triggered.</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The version number of the stack configuration, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ListStackConfigsRequest build() {
            return new ListStackConfigsRequest(this);
        } 

    } 

}
