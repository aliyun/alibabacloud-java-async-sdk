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
 * {@link GetSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>GetSavedSearchRequest</p>
 */
public class GetSavedSearchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("savedsearchName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String savedsearchName;

    private GetSavedSearchRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.savedsearchName = builder.savedsearchName;
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

    public static final class Builder extends Request.Builder<GetSavedSearchRequest, Builder> {
        private String project; 
        private String savedsearchName; 

        private Builder() {
            super();
        } 

        private Builder(GetSavedSearchRequest request) {
            super(request);
            this.project = request.project;
            this.savedsearchName = request.savedsearchName;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the saved search.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>savedsearch-name</p>
         */
        public Builder savedsearchName(String savedsearchName) {
            this.putPathParameter("savedsearchName", savedsearchName);
            this.savedsearchName = savedsearchName;
            return this;
        }

        @Override
        public GetSavedSearchRequest build() {
            return new GetSavedSearchRequest(this);
        } 

    } 

}
