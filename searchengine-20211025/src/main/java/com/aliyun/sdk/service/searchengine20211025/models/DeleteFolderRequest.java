// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFolderRequest} extends {@link RequestModel}
 *
 * <p>DeleteFolderRequest</p>
 */
public class DeleteFolderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("database")
    @com.aliyun.core.annotation.Validation(required = true)
    private String database;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("folderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long folderId;

    private DeleteFolderRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.database = builder.database;
        this.folderId = builder.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFolderRequest create() {
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
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return folderId
     */
    public Long getFolderId() {
        return this.folderId;
    }

    public static final class Builder extends Request.Builder<DeleteFolderRequest, Builder> {
        private String instanceId; 
        private String database; 
        private Long folderId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFolderRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.database = request.database;
            this.folderId = request.folderId;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * database name
         */
        public Builder database(String database) {
            this.putPathParameter("database", database);
            this.database = database;
            return this;
        }

        /**
         * folder id
         */
        public Builder folderId(Long folderId) {
            this.putPathParameter("folderId", folderId);
            this.folderId = folderId;
            return this;
        }

        @Override
        public DeleteFolderRequest build() {
            return new DeleteFolderRequest(this);
        } 

    } 

}
