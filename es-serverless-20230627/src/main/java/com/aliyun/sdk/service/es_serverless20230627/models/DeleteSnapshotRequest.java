// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link DeleteSnapshotRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnapshotRequest</p>
 */
public class DeleteSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repository")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repository;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("snapshot")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshot;

    private DeleteSnapshotRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.repository = builder.repository;
        this.snapshot = builder.snapshot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * @return snapshot
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    public static final class Builder extends Request.Builder<DeleteSnapshotRequest, Builder> {
        private String appName; 
        private String repository; 
        private String snapshot; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnapshotRequest request) {
            super(request);
            this.appName = request.appName;
            this.repository = request.repository;
            this.snapshot = request.snapshot;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_auto_snapshot</p>
         */
        public Builder repository(String repository) {
            this.putPathParameter("repository", repository);
            this.repository = repository;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qingning</p>
         */
        public Builder snapshot(String snapshot) {
            this.putPathParameter("snapshot", snapshot);
            this.snapshot = snapshot;
            return this;
        }

        @Override
        public DeleteSnapshotRequest build() {
            return new DeleteSnapshotRequest(this);
        } 

    } 

}
