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
 * {@link GetSqlInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetSqlInstanceRequest</p>
 */
public class GetSqlInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private GetSqlInstanceRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<GetSqlInstanceRequest, Builder> {
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlInstanceRequest request) {
            super(request);
            this.project = request.project;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public GetSqlInstanceRequest build() {
            return new GetSqlInstanceRequest(this);
        } 

    } 

}
