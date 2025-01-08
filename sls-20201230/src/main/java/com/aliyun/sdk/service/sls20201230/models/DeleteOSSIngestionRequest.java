// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DeleteOSSIngestionRequest} extends {@link RequestModel}
 *
 * <p>DeleteOSSIngestionRequest</p>
 */
public class DeleteOSSIngestionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ossIngestionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossIngestionName;

    private DeleteOSSIngestionRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.ossIngestionName = builder.ossIngestionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOSSIngestionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return ossIngestionName
     */
    public String getOssIngestionName() {
        return this.ossIngestionName;
    }

    public static final class Builder extends Request.Builder<DeleteOSSIngestionRequest, Builder> {
        private String project; 
        private String ossIngestionName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOSSIngestionRequest request) {
            super(request);
            this.project = request.project;
            this.ossIngestionName = request.ossIngestionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingest-oss-123456</p>
         */
        public Builder ossIngestionName(String ossIngestionName) {
            this.putPathParameter("ossIngestionName", ossIngestionName);
            this.ossIngestionName = ossIngestionName;
            return this;
        }

        @Override
        public DeleteOSSIngestionRequest build() {
            return new DeleteOSSIngestionRequest(this);
        } 

    } 

}
