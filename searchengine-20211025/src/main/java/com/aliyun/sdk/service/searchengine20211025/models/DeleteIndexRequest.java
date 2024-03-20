// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIndexRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndexRequest</p>
 */
public class DeleteIndexRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("indexName")
    @Validation(required = true)
    private String indexName;

    @Query
    @NameInMap("dataSource")
    @Validation(required = true)
    private String dataSource;

    @Query
    @NameInMap("deleteDataSource")
    private Boolean deleteDataSource;

    private DeleteIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexName = builder.indexName;
        this.dataSource = builder.dataSource;
        this.deleteDataSource = builder.deleteDataSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndexRequest create() {
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
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return deleteDataSource
     */
    public Boolean getDeleteDataSource() {
        return this.deleteDataSource;
    }

    public static final class Builder extends Request.Builder<DeleteIndexRequest, Builder> {
        private String instanceId; 
        private String indexName; 
        private String dataSource; 
        private Boolean deleteDataSource; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexName = request.indexName;
            this.dataSource = request.dataSource;
            this.deleteDataSource = request.deleteDataSource;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the index
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * The data source
         */
        public Builder dataSource(String dataSource) {
            this.putQueryParameter("dataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * deleteDataSource.
         */
        public Builder deleteDataSource(Boolean deleteDataSource) {
            this.putQueryParameter("deleteDataSource", deleteDataSource);
            this.deleteDataSource = deleteDataSource;
            return this;
        }

        @Override
        public DeleteIndexRequest build() {
            return new DeleteIndexRequest(this);
        } 

    } 

}
