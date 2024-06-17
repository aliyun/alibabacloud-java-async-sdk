// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRestQueryResultRequest} extends {@link RequestModel}
 *
 * <p>ListRestQueryResultRequest</p>
 */
public class ListRestQueryResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indexName")
    private String indexName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private java.util.Map < String, ? > query;

    private ListRestQueryResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.address = builder.address;
        this.indexName = builder.indexName;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRestQueryResultRequest create() {
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
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return query
     */
    public java.util.Map < String, ? > getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<ListRestQueryResultRequest, Builder> {
        private String instanceId; 
        private String address; 
        private String indexName; 
        private java.util.Map < String, ? > query; 

        private Builder() {
            super();
        } 

        private Builder(ListRestQueryResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.address = request.address;
            this.indexName = request.indexName;
            this.query = request.query;
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
         * indexName.
         */
        public Builder indexName(String indexName) {
            this.putBodyParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * query.
         */
        public Builder query(java.util.Map < String, ? > query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public ListRestQueryResultRequest build() {
            return new ListRestQueryResultRequest(this);
        } 

    } 

}
