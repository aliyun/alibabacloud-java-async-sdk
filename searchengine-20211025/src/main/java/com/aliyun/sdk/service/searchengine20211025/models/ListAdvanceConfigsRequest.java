// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListAdvanceConfigsRequest</p>
 */
public class ListAdvanceConfigsRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("dataSourceName")
    private String dataSourceName;

    @Query
    @NameInMap("indexName")
    private String indexName;

    @Query
    @NameInMap("type")
    private String type;

    private ListAdvanceConfigsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.indexName = builder.indexName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdvanceConfigsRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAdvanceConfigsRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private String indexName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAdvanceConfigsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.indexName = request.indexName;
            this.type = request.type;
        } 

        /**
         * Obtains a list of advanced configurations.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * dataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * indexName.
         */
        public Builder indexName(String indexName) {
            this.putQueryParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAdvanceConfigsRequest build() {
            return new ListAdvanceConfigsRequest(this);
        } 

    } 

}
