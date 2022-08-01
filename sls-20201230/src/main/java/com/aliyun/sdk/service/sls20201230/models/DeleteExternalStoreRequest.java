// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteExternalStoreRequest} extends {@link RequestModel}
 *
 * <p>DeleteExternalStoreRequest</p>
 */
public class DeleteExternalStoreRequest extends Request {
    @Path
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private DeleteExternalStoreRequest(Builder builder) {
        super(builder);
        this.externalStoreName = builder.externalStoreName;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExternalStoreRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteExternalStoreRequest, Builder> {
        private String externalStoreName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExternalStoreRequest request) {
            super(request);
            this.externalStoreName = request.externalStoreName;
            this.project = request.project;
        } 

        /**
         * externalStoreName.
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public DeleteExternalStoreRequest build() {
            return new DeleteExternalStoreRequest(this);
        } 

    } 

}
