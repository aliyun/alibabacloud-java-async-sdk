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
 * {@link GetHistogramsRequest} extends {@link RequestModel}
 *
 * <p>GetHistogramsRequest</p>
 */
public class GetHistogramsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topic")
    private String topic;

    private GetHistogramsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.from = builder.from;
        this.query = builder.query;
        this.to = builder.to;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistogramsRequest create() {
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
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<GetHistogramsRequest, Builder> {
        private String project; 
        private String logstore; 
        private Long from; 
        private String query; 
        private Long to; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(GetHistogramsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.from = request.from;
            this.query = request.query;
            this.to = request.to;
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
         * <p>test-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The start time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1409529600</p>
         */
        public Builder from(Long from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The search statement. Only search statements are supported. Analytic statements are not supported. For more information about the syntax of search statements, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>with_pack_meta</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The end time of the subinterval. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1409569200</p>
         */
        public Builder to(Long to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The topic of the logs.</p>
         * 
         * <strong>example:</strong>
         * <p>topic</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public GetHistogramsRequest build() {
            return new GetHistogramsRequest(this);
        } 

    } 

}
