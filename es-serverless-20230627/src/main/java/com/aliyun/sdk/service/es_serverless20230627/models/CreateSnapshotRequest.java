// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateSnapshotRequest</p>
 */
public class CreateSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repository")
    @com.aliyun.core.annotation.Validation(required = true)
    private String repository;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indices")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("snapshot")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateSnapshotRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.repository = builder.repository;
        this.indices = builder.indices;
        this.snapshot = builder.snapshot;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSnapshotRequest create() {
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
     * @return indices
     */
    public String getIndices() {
        return this.indices;
    }

    /**
     * @return snapshot
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateSnapshotRequest, Builder> {
        private String appName; 
        private String repository; 
        private String indices; 
        private String snapshot; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateSnapshotRequest request) {
            super(request);
            this.appName = request.appName;
            this.repository = request.repository;
            this.indices = request.indices;
            this.snapshot = request.snapshot;
            this.dryRun = request.dryRun;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * repository.
         */
        public Builder repository(String repository) {
            this.putPathParameter("repository", repository);
            this.repository = repository;
            return this;
        }

        /**
         * indices.
         */
        public Builder indices(String indices) {
            this.putBodyParameter("indices", indices);
            this.indices = indices;
            return this;
        }

        /**
         * snapshot.
         */
        public Builder snapshot(String snapshot) {
            this.putBodyParameter("snapshot", snapshot);
            this.snapshot = snapshot;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateSnapshotRequest build() {
            return new CreateSnapshotRequest(this);
        } 

    } 

}
