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
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * The compression method.
         */
        public Builder acceptEncoding(String acceptEncoding) {
            this.putHeaderParameter("Accept-Encoding", acceptEncoding);
            this.acceptEncoding = acceptEncoding;
            return this;
        }

        /**
         * Specifies whether to page forward or backward for the scan-based query or the phrase query.
         */
        public Builder forward(Boolean forward) {
            this.putBodyParameter("forward", forward);
            this.forward = forward;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is the log time that is specified when log data is written.
         * <p>
         * 
         * The time range specified by the from and to parameters is a left-closed and right-open interval. Each interval includes the specified start time but does not include the specified end time. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder from(Integer from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * The maximum number of logs to return for the request. This parameter takes effect only when the query parameter is set to a search statement. Valid values: 0 to 100. Default value: 100.
         */
        public Builder line(Long line) {
            this.putBodyParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * The row from which the query starts. This parameter takes effect only when the query parameter is set to a search statement. Default value: 0.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * Specifies whether to enable the SQL enhancement feature. By default, the feature is disabled.
         */
        public Builder powerSql(Boolean powerSql) {
            this.putBodyParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
        }

        /**
         * The search statement or the query statement. For more information, see the "Log search overview" and "Log analysis overview" topics.
         * <p>
         * 
         * If you add set session parallel_sql=true; to the analytic statement in the query parameter, the dedicated SQL feature is enabled. Example: \* | set session parallel_sql=true; select count(\*) as pv.
         * 
         * Note: If you specify an analytic statement in the query parameter, the line and offset parameters are invalid for this operation. In this case, we recommend that you set the line and offset parameters to 0 and use a LIMIT clause to limit the number of entries to return on each page. For more information, see the "Perform paged queries" topic.
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * Specifies whether to return logs in reverse chronological order of log timestamps. The log timestamps are accurate to the minute. Valid values:
         * <p>
         * 
         * true: returns logs in reverse chronological order of log timestamps. false (default): returns logs in chronological order of log timestamps. Note The reverse parameter takes effect only when the query parameter is set to a search statement. The reverse parameter specifies the method used to sort the returned logs. If the query parameter is set to a query statement, which consists of a search statement and an analytic statement, the reverse parameter does not take effect. The method used to sort the returned logs is specified by the ORDER BY clause in the analytic statement. If you use the keyword asc in the ORDER BY clause, the logs are sorted in chronological order. If you use the keyword desc in the ORDER BY clause, the logs are sorted in reverse chronological order. By default, asc is used in the ORDER BY clause.
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
         * The ID of the shard.
         */
        public Builder shard(Integer shard) {
            this.putBodyParameter("shard", shard);
            this.shard = shard;
            return this;
        }

        /**
         * The end of the time range to query. The value is the log time that is specified when log data is written.
         * <p>
         * 
         * The time range specified by the from and to parameters is a left-closed and right-open interval. Each interval includes the specified start time but does not include the specified end time. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder to(Integer to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * The topic of the logs. Default value: double quotation marks ("").
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
