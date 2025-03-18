// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListVectorQueryResultRequest} extends {@link RequestModel}
 *
 * <p>ListVectorQueryResultRequest</p>
 */
public class ListVectorQueryResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("vectorQueryType")
    private String vectorQueryType;

    private ListVectorQueryResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.path = builder.path;
        this.queryType = builder.queryType;
        this.vectorQueryType = builder.vectorQueryType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVectorQueryResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return vectorQueryType
     */
    public String getVectorQueryType() {
        return this.vectorQueryType;
    }

    public static final class Builder extends Request.Builder<ListVectorQueryResultRequest, Builder> {
        private String instanceId; 
        private java.util.Map<String, ?> body; 
        private String path; 
        private String queryType; 
        private String vectorQueryType; 

        private Builder() {
            super();
        } 

        private Builder(ListVectorQueryResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.path = request.path;
            this.queryType = request.queryType;
            this.vectorQueryType = request.vectorQueryType;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rps6c08</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request body.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The query type. Valid values: vector, primary_key, and vector_text.</p>
         * 
         * <strong>example:</strong>
         * <p>primary_key</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("queryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The vector query type. Valid values: vector, image, and text.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder vectorQueryType(String vectorQueryType) {
            this.putQueryParameter("vectorQueryType", vectorQueryType);
            this.vectorQueryType = vectorQueryType;
            return this;
        }

        @Override
        public ListVectorQueryResultRequest build() {
            return new ListVectorQueryResultRequest(this);
        } 

    } 

}
