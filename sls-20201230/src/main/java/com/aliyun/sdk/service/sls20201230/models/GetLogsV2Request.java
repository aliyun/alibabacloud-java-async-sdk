// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLogsV2Request} extends {@link RequestModel}
 *
 * <p>GetLogsV2Request</p>
 */
public class GetLogsV2Request extends Request {
    @Host
    @NameInMap("project")
    private String project;

    @Path
    @NameInMap("logstore")
    private String logstore;

    @Header
    @NameInMap("Accept-Encoding")
    private String acceptEncoding;

    @Body
    @NameInMap("forward")
    private Boolean forward;

    @Body
    @NameInMap("from")
    @Validation(required = true)
    private Integer from;

    @Body
    @NameInMap("line")
    @Validation(maximum = 100)
    private Long line;

    @Body
    @NameInMap("offset")
    private Long offset;

    @Body
    @NameInMap("powerSql")
    private Boolean powerSql;

    @Body
    @NameInMap("query")
    private String query;

    @Body
    @NameInMap("reverse")
    private Boolean reverse;

    @Body
    @NameInMap("session")
    private String session;

    @Body
    @NameInMap("shard")
    private Integer shard;

    @Body
    @NameInMap("to")
    @Validation(required = true)
    private Integer to;

    @Body
    @NameInMap("topic")
    private String topic;

    private GetLogsV2Request(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.acceptEncoding = builder.acceptEncoding;
        this.forward = builder.forward;
        this.from = builder.from;
        this.line = builder.line;
        this.offset = builder.offset;
        this.powerSql = builder.powerSql;
        this.query = builder.query;
        this.reverse = builder.reverse;
        this.session = builder.session;
        this.shard = builder.shard;
        this.to = builder.to;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsV2Request create() {
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
     * @return acceptEncoding
     */
    public String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    /**
     * @return forward
     */
    public Boolean getForward() {
        return this.forward;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return line
     */
    public Long getLine() {
        return this.line;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return powerSql
     */
    public Boolean getPowerSql() {
        return this.powerSql;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return session
     */
    public String getSession() {
        return this.session;
    }

    /**
     * @return shard
     */
    public Integer getShard() {
        return this.shard;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<GetLogsV2Request, Builder> {
        private String project; 
        private String logstore; 
        private String acceptEncoding; 
        private Boolean forward; 
        private Integer from; 
        private Long line; 
        private Long offset; 
        private Boolean powerSql; 
        private String query; 
        private Boolean reverse; 
        private String session; 
        private Integer shard; 
        private Integer to; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(GetLogsV2Request request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.acceptEncoding = request.acceptEncoding;
            this.forward = request.forward;
            this.from = request.from;
            this.line = request.line;
            this.offset = request.offset;
            this.powerSql = request.powerSql;
            this.query = request.query;
            this.reverse = request.reverse;
            this.session = request.session;
            this.shard = request.shard;
            this.to = request.to;
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
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * Accept-Encoding.
         */
        public Builder acceptEncoding(String acceptEncoding) {
            this.putHeaderParameter("Accept-Encoding", acceptEncoding);
            this.acceptEncoding = acceptEncoding;
            return this;
        }

        /**
         * forward.
         */
        public Builder forward(Boolean forward) {
            this.putBodyParameter("forward", forward);
            this.forward = forward;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * line.
         */
        public Builder line(Long line) {
            this.putBodyParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * powerSql.
         */
        public Builder powerSql(Boolean powerSql) {
            this.putBodyParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putBodyParameter("reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * session.
         */
        public Builder session(String session) {
            this.putBodyParameter("session", session);
            this.session = session;
            return this;
        }

        /**
         * Shard ID。
         */
        public Builder shard(Integer shard) {
            this.putBodyParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * topic.
         */
        public Builder topic(String topic) {
            this.putBodyParameter("topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public GetLogsV2Request build() {
            return new GetLogsV2Request(this);
        } 

    } 

}
