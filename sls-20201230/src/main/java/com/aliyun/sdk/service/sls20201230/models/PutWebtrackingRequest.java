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
 * {@link PutWebtrackingRequest} extends {@link RequestModel}
 *
 * <p>PutWebtrackingRequest</p>
 */
public class PutWebtrackingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("__logs__")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, String>> logs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("__source__")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("__tags__")
    private java.util.Map<String, String> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("__topic__")
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
    public java.util.List<java.util.Map<String, String>> getLogs() {
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
    public java.util.Map<String, String> getTags() {
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
        private java.util.List<java.util.Map<String, String>> logs; 
        private String source; 
        private java.util.Map<String, String> tags; 
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
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ali-test-logstore</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.putPathParameter("logstoreName", logstoreName);
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The logs. Each element is a JSON object that indicates a log.</p>
         * <blockquote>
         * <p> <strong>Note</strong>: The time in a log that is collected by using the web tracking feature is the time at which Simple Log Service receives the log. You do not need to configure the <strong>time</strong> field for each log. If this field exists, it is overwritten by the time at which Simple Log Service receives the log.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder logs(java.util.List<java.util.Map<String, String>> logs) {
            this.putBodyParameter("__logs__", logs);
            this.logs = logs;
            return this;
        }

        /**
         * <p>The source of the logs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("__source__", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The tags of the logs.</p>
         */
        public Builder tags(java.util.Map<String, String> tags) {
            this.putBodyParameter("__tags__", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The topic of the logs.</p>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
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
