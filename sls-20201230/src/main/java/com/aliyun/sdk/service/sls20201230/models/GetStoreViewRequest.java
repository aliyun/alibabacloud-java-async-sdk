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
 * {@link GetStoreViewRequest} extends {@link RequestModel}
 *
 * <p>GetStoreViewRequest</p>
 */
public class GetStoreViewRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private GetStoreViewRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoreViewRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetStoreViewRequest, Builder> {
        private String project; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetStoreViewRequest request) {
            super(request);
            this.project = request.project;
            this.name = request.name;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_storeview</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetStoreViewRequest build() {
            return new GetStoreViewRequest(this);
        } 

    } 

}
