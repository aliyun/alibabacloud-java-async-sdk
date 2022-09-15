// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>DeleteSavedSearchRequest</p>
 */
public class DeleteSavedSearchRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("savedsearchName")
    @Validation(required = true)
    private String savedsearchName;

    private DeleteSavedSearchRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.savedsearchName = builder.savedsearchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSavedSearchRequest create() {
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
     * @return savedsearchName
     */
    public String getSavedsearchName() {
        return this.savedsearchName;
    }

    public static final class Builder extends Request.Builder<DeleteSavedSearchRequest, Builder> {
        private String project; 
        private String savedsearchName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSavedSearchRequest request) {
            super(request);
            this.project = request.project;
            this.savedsearchName = request.savedsearchName;
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
         * savedsearchName.
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putPathParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
            return this;
        }

        @Override
        public DeleteSavedSearchRequest build() {
            return new DeleteSavedSearchRequest(this);
        } 

    } 

}
