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
    @Path
    @NameInMap("savedsearchName")
    @Validation(required = true)
    private String savedsearchName;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private DeleteSavedSearchRequest(Builder builder) {
        super(builder);
        this.savedsearchName = builder.savedsearchName;
        this.project = builder.project;
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
     * @return savedsearchName
     */
    public String getSavedsearchName() {
        return this.savedsearchName;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<DeleteSavedSearchRequest, Builder> {
        private String savedsearchName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSavedSearchRequest request) {
            super(request);
            this.savedsearchName = request.savedsearchName;
            this.project = request.project;
        } 

        /**
         * savedsearchName.
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putPathParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
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
        public DeleteSavedSearchRequest build() {
            return new DeleteSavedSearchRequest(this);
        } 

    } 

}
