// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVectorQueryResultRequest} extends {@link RequestModel}
 *
 * <p>ListVectorQueryResultRequest</p>
 */
public class ListVectorQueryResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, ? > body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("vectorQueryType")
    private String vectorQueryType;

    private ListVectorQueryResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.address = builder.address;
        this.body = builder.body;
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
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
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
        private String address; 
        private java.util.Map < String, ? > body; 
        private String queryType; 
        private String vectorQueryType; 

        private Builder() {
            super();
        } 

        private Builder(ListVectorQueryResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.address = request.address;
            this.body = request.body;
            this.queryType = request.queryType;
            this.vectorQueryType = request.vectorQueryType;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * address.
         */
        public Builder address(String address) {
            this.putQueryParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * queryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("queryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * vectorQueryType.
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
