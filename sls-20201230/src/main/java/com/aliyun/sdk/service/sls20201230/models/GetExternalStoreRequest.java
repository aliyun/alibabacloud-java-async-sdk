// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>GetExternalStoreRequest</p>
 */
public class GetExternalStoreRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("externalStoreName")
    @Validation(required = true)
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
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the external store.
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
