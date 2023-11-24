// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlsIndexRequest} extends {@link RequestModel}
 *
 * <p>CreateSlsIndexRequest</p>
 */
public class CreateSlsIndexRequest extends Request {
    @NameInMap("logstore")
    private String logstore;

    @NameInMap("project")
    private String project;

    private CreateSlsIndexRequest(Builder builder) {
        super(builder);
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlsIndexRequest create() {
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

    public static final class Builder extends Request.Builder<CreateSlsIndexRequest, Builder> {
        private String logstore; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlsIndexRequest request) {
            super(request);
            this.logstore = request.logstore;
            this.project = request.project;
        } 

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        @Override
        public CreateSlsIndexRequest build() {
            return new CreateSlsIndexRequest(this);
        } 

    } 

}
