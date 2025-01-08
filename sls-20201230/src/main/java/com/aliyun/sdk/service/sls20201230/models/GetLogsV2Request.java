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
 * {@link GetLogsV2Request} extends {@link RequestModel}
 *
 * <p>GetLogsV2Request</p>
 */
public class GetLogsV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Accept-Encoding")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceptEncoding;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forward")
    private Boolean forward;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("from")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("highlight")
    private Boolean highlight;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("line")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long line;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("powerSql")
    private Boolean powerSql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("session")
    private String session;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer to;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topic")
    private String topic;

    private GetLogsV2Request(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.acceptEncoding = builder.acceptEncoding;
        this.forward = builder.forward;
        this.from = builder.from;
        this.highlight = builder.highlight;
        this.line = builder.line;
        this.offset = builder.offset;
        this.powerSql = builder.powerSql;
        this.query = builder.query;
        this.reverse = builder.reverse;
        this.session = builder.session;
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
     * @return highlight
     */
    public Boolean getHighlight() {
        return this.highlight;
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
        private Boolean highlight; 
        private Long line; 
        private Long offset; 
        private Boolean powerSql; 
        private String query; 
        private Boolean reverse; 
        private String session; 
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
            this.highlight = request.highlight;
            this.line = request.line;
            this.offset = request.offset;
            this.powerSql = request.powerSql;
            this.query = request.query;
            this.reverse = request.reverse;
            this.session = request.session;
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
         * <p>The compression format.</p>
         * <ul>
         * <li>For Java, Python, and Go, only the lz4 and gzip algorithms are supported for decompression.</li>
         * <li>For PHP, JavaScript, and C#, only the gzip algorithm is supported for decompression.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lz4</p>
         */
        public Builder acceptEncoding(String acceptEncoding) {
            this.putHeaderParameter("Accept-Encoding", acceptEncoding);
            this.acceptEncoding = acceptEncoding;
            return this;
        }

        /**
         * <p>Specifies whether to page forward or backward for the scan-based query or phrase search.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forward(Boolean forward) {
            this.putBodyParameter("forward", forward);
            this.forward = forward;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is the log time that is specified when log data is written.</p>
         * <p>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned. The value is a timestamp that follows the UNIX time format. It is the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1627268185</p>
         */
        public Builder from(Integer from) {
            this.putBodyParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>Specifies whether to highlight the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder highlight(Boolean highlight) {
            this.putBodyParameter("highlight", highlight);
            this.highlight = highlight;
            return this;
        }

        /**
         * <p>The maximum number of logs to return for the request. This parameter takes effect only when the query parameter is set to a search statement. Valid values: 0 to 100. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder line(Long line) {
            this.putBodyParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * <p>The line from which the query starts. This parameter takes effect only when the query parameter is set to a search statement. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>Specifies whether to enable the SQL enhancement feature. By default, the feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder powerSql(Boolean powerSql) {
            this.putBodyParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
        }

        /**
         * <p>The search statement or query statement. For more information, see the &quot;Log search overview&quot; and &quot;Log analysis overview&quot; topics.</p>
         * <p>If you add set session parallel_sql=true; to the analytic statement in the query parameter, Dedicated SQL is used. Example: * | set session parallel_sql=true; select count(*) as pv.</p>
         * <p>Note: If you specify an analytic statement in the query parameter, the line and offset parameters do not take effect in this operation. In this case, we recommend that you set the line and offset parameters to 0 and use the LIMIT clause to specify the number of logs to return on each page. For more information, see the &quot;Perform paged queries&quot; topic.</p>
         * 
         * <strong>example:</strong>
         * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Specifies whether to return logs in reverse chronological order of log timestamps. The log timestamps are accurate to minutes. Valid values:</p>
         * <p>true: Logs are returned in reverse chronological order of log timestamps. false (default): Logs are returned in chronological order of log timestamps. Note: The reverse parameter takes effect only when the query parameter is set to a search statement. The reverse parameter specifies the method used to sort returned logs. If the query parameter is set to a query statement, the reverse parameter does not take effect. The method used to sort returned logs is specified by the ORDER BY clause in the analytic statement. If you use the keyword asc in the ORDER BY clause, the logs are sorted in chronological order. If you use the keyword desc in the ORDER BY clause, the logs are sorted in reverse chronological order. By default, asc is used in the ORDER BY clause.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putBodyParameter("reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The parameter that is used to query data.</p>
         * 
         * <strong>example:</strong>
         * <p>mode=scan</p>
         */
        public Builder session(String session) {
            this.putBodyParameter("session", session);
            this.session = session;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is the log time that is specified when log data is written.</p>
         * <p>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the from parameter, but does not include the end time specified by the to parameter. If you specify the same value for the from and to parameters, the interval is invalid, and an error message is returned. The value is a timestamp that follows the UNIX time format. It is the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1627268185</p>
         */
        public Builder to(Integer to) {
            this.putBodyParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The topic of the logs. Default value: double quotation marks (&quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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
