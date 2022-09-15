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
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("externalStoreName")
    @Validation(required = true)
    private String externalStoreName;

    private DeleteExternalStoreRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.externalStoreName = builder.externalStoreName;
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

    public static final class Builder extends Request.Builder<DeleteExternalStoreRequest, Builder> {
        private String project; 
        private String externalStoreName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExternalStoreRequest request) {
            super(request);
            this.project = request.project;
            this.externalStoreName = request.externalStoreName;
        } 

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * externalStoreName.
         */
        public Builder externalStoreName(String externalStoreName) {
            this.putPathParameter("externalStoreName", externalStoreName);
            this.externalStoreName = externalStoreName;
            return this;
        }

        @Override
        public DeleteExternalStoreRequest build() {
            return new DeleteExternalStoreRequest(this);
        } 

    } 

}
