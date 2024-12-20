// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSlsIndexResponse} extends {@link TeaModel}
 *
 * <p>CreateSlsIndexResponse</p>
 */
public class CreateSlsIndexResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("logStore")
    private String logStore;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private CreateSlsIndexResponse(BuilderImpl builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.logStore = builder.logStore;
        this.project = builder.project;
    }

    public static CreateSlsIndexResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public interface Builder extends Response.Builder<CreateSlsIndexResponse, Builder> {

        Builder requestId(String requestId);

        Builder logStore(String logStore);

        Builder project(String project);

        @Override
        CreateSlsIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSlsIndexResponse, Builder>
            implements Builder {
        private String requestId; 
        private String logStore; 
        private String project; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSlsIndexResponse response) {
            super(response);
            this.requestId = response.requestId;
            this.logStore = response.logStore;
            this.project = response.project;
        } 

        /**
         * RequestId.
         */
        @Override
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * logStore.
         */
        @Override
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * project.
         */
        @Override
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        @Override
        public CreateSlsIndexResponse build() {
            return new CreateSlsIndexResponse(this);
        } 

    } 

}
