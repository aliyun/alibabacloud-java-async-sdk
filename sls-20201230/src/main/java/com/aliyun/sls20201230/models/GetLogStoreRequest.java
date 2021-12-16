// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLogStoreRequest} extends {@link RequestModel}
 *
 * <p>GetLogStoreRequest</p>
 */
public class GetLogStoreRequest extends Request {
    @Path
    @NameInMap("logstore")
    private String logstore;

    @Host
    @NameInMap("project")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String logstore; 
        private String project; 

        /**
         * <p>The logstore name.</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>project.</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        public GetLogStoreRequest build() {
            return new GetLogStoreRequest(this);
        } 

    } 

}
