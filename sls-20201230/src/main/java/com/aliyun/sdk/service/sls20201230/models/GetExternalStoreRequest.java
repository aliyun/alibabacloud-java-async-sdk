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
    @Path
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private GetExternalStoreRequest(Builder builder) {
        super(builder);
        this.externalStoreName = builder.externalStoreName;
        this.project = builder.project;
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
     * @return externalStoreName
     */
    public String getExternalStoreName() {
        return this.externalStoreName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<GetExternalStoreRequest, Builder> {
        private String externalStoreName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetExternalStoreRequest request) {
            super(request);
            this.externalStoreName = request.externalStoreName;
            this.project = request.project;
        } 

        /**
         * A short description of struct
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public GetExternalStoreRequest build() {
            return new GetExternalStoreRequest(this);
        } 

    } 

}
