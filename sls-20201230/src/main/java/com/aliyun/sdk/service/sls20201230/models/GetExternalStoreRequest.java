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
 * {@link GetExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>GetExternalStoreRequest</p>
 */
public class GetExternalStoreRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("externalStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalStoreName;

    private GetExternalStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.externalStoreName = builder.externalStoreName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExternalStoreRequest create() {
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
     * @return externalStoreName
     */
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    public static final class Builder extends Request.Builder<GetExternalStoreRequest, Builder> {
        private String project; 
        private String externalStoreName; 

        private Builder() {
            super();
        } 

        private Builder(GetExternalStoreRequest request) {
            super(request);
            this.project = request.project;
            this.externalStoreName = request.externalStoreName;
        } 

        /**
         * <p>The name of the project.</p>
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
         * <p>The name of the external store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_store</p>
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        @Override
        public GetExternalStoreRequest build() {
            return new GetExternalStoreRequest(this);
        } 

    } 

}
