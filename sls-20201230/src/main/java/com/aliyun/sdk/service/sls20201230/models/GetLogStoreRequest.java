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
 * {@link GetLogStoreRequest} extends {@link RequestModel}
 *
 * <p>GetLogStoreRequest</p>
 */
public class GetLogStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private GetLogStoreRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<GetLogStoreRequest, Builder> {
        private String logstore; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(GetLogStoreRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.project = request.project;
        } 

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
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
        public GetLogStoreRequest build() {
            return new GetLogStoreRequest(this);
        } 

    } 

}
