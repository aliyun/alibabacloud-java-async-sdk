// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlsResourceResponse} extends {@link TeaModel}
 *
 * <p>CreateSlsResourceResponse</p>
 */
public class CreateSlsResourceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("logStore")
    private String logStore;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateSlsResourceResponse(BuilderImpl builder) {
        super(builder);
        this.logStore = builder.logStore;
        this.project = builder.project;
        this.requestId = builder.requestId;
    }

    public static CreateSlsResourceResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public interface Builder extends Response.Builder<CreateSlsResourceResponse, Builder> {

        Builder logStore(String logStore);

        Builder project(String project);

        Builder requestId(String requestId);

        @Override
        CreateSlsResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSlsResourceResponse, Builder>
            implements Builder {
        private String logStore; 
        private String project; 
        private String requestId; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSlsResourceResponse response) {
            super(response);
            this.logStore = response.logStore;
            this.project = response.project;
            this.requestId = response.requestId;
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

        /**
         * requestId.
         */
        @Override
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        @Override
        public CreateSlsResourceResponse build() {
            return new CreateSlsResourceResponse(this);
        } 

    } 

}
