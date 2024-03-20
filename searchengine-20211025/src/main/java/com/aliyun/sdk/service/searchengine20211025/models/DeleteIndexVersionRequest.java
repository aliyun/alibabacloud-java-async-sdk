// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIndexVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndexVersionRequest</p>
 */
public class DeleteIndexVersionRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("indexName")
    @Validation(required = true)
    private String indexName;

    @Path
    @NameInMap("versionName")
    @Validation(required = true)
    private String versionName;

    private DeleteIndexVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexName = builder.indexName;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndexVersionRequest create() {
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
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<DeleteIndexVersionRequest, Builder> {
        private String instanceId; 
        private String indexName; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndexVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexName = request.indexName;
            this.versionName = request.versionName;
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
         * The name of the version
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("versionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public DeleteIndexVersionRequest build() {
            return new DeleteIndexVersionRequest(this);
        } 

    } 

}
