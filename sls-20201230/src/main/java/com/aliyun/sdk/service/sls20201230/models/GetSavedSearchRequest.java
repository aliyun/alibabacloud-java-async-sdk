// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>GetSavedSearchRequest</p>
 */
public class GetSavedSearchRequest extends Request {
    @Path
    @NameInMap("savedsearchName")
    private String savedsearchName;

    @Host
    @NameInMap("project")
    private String project;

    private GetSavedSearchRequest(Builder builder) {
        super(builder);
        this.savedsearchName = builder.savedsearchName;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavedSearchRequest create() {
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

    public static final class Builder extends Request.Builder<GetSavedSearchRequest, Builder> {
        private String savedsearchName; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetSavedSearchRequest response) {
            super(response);
            this.savedsearchName = response.savedsearchName;
            this.project = response.project;
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
        public GetSavedSearchRequest build() {
            return new GetSavedSearchRequest(this);
        } 

    } 

}
