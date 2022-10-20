// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link PutWebtrackingRequest} extends {@link RequestModel}
 *
 * <p>PutWebtrackingRequest</p>
 */
public class PutWebtrackingRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstoreName")
    @Validation(required = true)
    private String logstoreName;

    @Body
    @NameInMap("__logs__")
    @Validation(required = true)
    private java.util.List < java.util.Map<String, String>> logs;

    @Body
    @NameInMap("__source__")
    @Validation(required = true)
    private String source;

    @Body
    @NameInMap("__tags__")
    private java.util.Map < String, String > tags;

    @Body
    @NameInMap("__topic__")
    private String topic;

    private PutWebtrackingRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstoreName = builder.logstoreName;
        this.logs = builder.logs;
        this.source = builder.source;
        this.tags = builder.tags;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutWebtrackingRequest create() {
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
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return logs
     */
    public java.util.List < java.util.Map<String, String>> getLogs() {
        return this.logs;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, String > getTags() {
        return this.tags;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<PutWebtrackingRequest, Builder> {
        private String project; 
        private String logstoreName; 
        private java.util.List < java.util.Map<String, String>> logs; 
        private String source; 
        private java.util.Map < String, String > tags; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(PutWebtrackingRequest request) {
            super(request);
            this.project = request.project;
            this.logstoreName = request.logstoreName;
            this.logs = request.logs;
            this.source = request.source;
            this.tags = request.tags;
            this.topic = request.topic;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder logstoreName(String logstoreName) {
            this.putPathParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * __logs__.
         */
        public Builder logs(java.util.List < java.util.Map<String, String>> logs) {
            this.putBodyParameter("__logs__", logs);
            this.logs = logs;
            return this;
        }

        /**
         * __source__.
         */
        public Builder source(String source) {
            this.putBodyParameter("__source__", source);
            this.source = source;
            return this;
        }

        /**
         * __tags__.
         */
        public Builder tags(java.util.Map < String, String > tags) {
            this.putBodyParameter("__tags__", tags);
            this.tags = tags;
            return this;
        }

        /**
         * __topic__.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("__topic__", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public PutWebtrackingRequest build() {
            return new PutWebtrackingRequest(this);
        } 

    } 

}
