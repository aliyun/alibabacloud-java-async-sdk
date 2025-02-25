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
 * {@link GetLogsRequest} extends {@link RequestModel}
 *
 * <p>GetLogsRequest</p>
 */
public class GetLogsRequest extends Request {
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
    private Integer from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("line")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Long line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("powerSql")
    private Boolean powerSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("to")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer to;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topic")
    private String topic;

    private GetLogsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.logstore = builder.logstore;
        this.from = builder.from;
        this.line = builder.line;
        this.offset = builder.offset;
        this.powerSql = builder.powerSql;
        this.query = builder.query;
        this.reverse = builder.reverse;
        this.to = builder.to;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogsRequest create() {
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

    public static final class Builder extends Request.Builder<GetLogsRequest, Builder> {
        private String project; 
        private String logstore; 
        private Integer from; 
        private Long line; 
        private Long offset; 
        private Boolean powerSql; 
        private String query; 
        private Boolean reverse; 
        private Integer to; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(GetLogsRequest request) {
            super(request);
            this.project = request.project;
            this.logstore = request.logstore;
            this.from = request.from;
            this.line = request.line;
            this.offset = request.offset;
            this.powerSql = request.powerSql;
            this.query = request.query;
            this.reverse = request.reverse;
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
         * <p>The Logstore whose logs you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-logstore</p>
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is the log time that is specified when log data is written.</p>
         * <ul>
         * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you specify the same value for the <strong>from</strong> and <strong>to</strong> parameters, the interval is invalid, and an error message is returned.</li>
         * <li>The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
         * </ul>
         * <blockquote>
         * <p>To ensure that full data can be queried, specify a query time range that is accurate to the minute. If you also specify a time range in an analytic statement, Simple Log Service uses the time range specified in the analytic statement for query and analysis.</p>
         * </blockquote>
         * <p>If you want to specify a time range that is accurate to the second in your analytic statement, you must use the from_unixtime or to_unixtime function to convert the time format. For more information about the functions, see <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> and <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a>. Examples:</p>
         * <ul>
         * <li><code>* | SELECT * FROM log WHERE from_unixtime(__time__) &gt; from_unixtime(1664186624) AND from_unixtime(__time__) &lt; now()</code></li>
         * <li><code>* | SELECT * FROM log WHERE __time__ &gt; to_unixtime(date_parse(\&quot;2022-10-19 15:46:05\&quot;, \&quot;%Y-%m-%d %H:%i:%s\&quot;)) AND __time__ &lt; to_unixtime(now())</code></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1627268185</p>
         */
        public Builder from(Integer from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The maximum number of logs to return for the request. This parameter takes effect only when the query parameter is set to a search statement. Minimum value: 0. Maximum value: 100. Default value: 100. For more information, see <a href="https://help.aliyun.com/document_detail/89994.html">Perform paged queries</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder line(Long line) {
            this.putQueryParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * <p>The line from which the query starts. This parameter takes effect only when the query parameter is set to a search statement. Default value: 0. For more information, see <a href="https://help.aliyun.com/document_detail/89994.html">Perform paged queries</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Dedicated SQL feature. For more information, see <a href="https://help.aliyun.com/document_detail/223777.html">Enable Dedicated SQL</a>. Valid values:</p>
         * <ul>
         * <li>true: enables the Dedicated SQL feature.</li>
         * <li>false (default): enables the Standard SQL feature.</li>
         * </ul>
         * <p>You can use the powerSql or <strong>query</strong> parameter to configure Dedicated SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder powerSql(Boolean powerSql) {
            this.putQueryParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
        }

        /**
         * <p>The search statement or the query statement. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>. If you add <code>set session parallel_sql=true;</code> to the analytic statement in the query parameter, Dedicated SQL is used. For example, you can set the query parameter to <code>* | set session parallel_sql=true; select count(*) as pv</code>. For more information about common errors that may occur during log query and analysis, see <a href="https://help.aliyun.com/document_detail/61628.html">How do I resolve common errors that occur when I query and analyze logs?</a></p>
         * <blockquote>
         * <p>If you specify an analytic statement in the value of the query parameter, the line and offset parameters do not take effect. In this case, we recommend that you set the line and offset parameters to 0 and use the LIMIT clause to limit the number of logs to return on each page. For more information, see <a href="https://help.aliyun.com/document_detail/89994.html">Paged query</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Specifies whether to return logs in reverse chronological order of log timestamps. The log timestamps are accurate to the minute. Valid values:</p>
         * <ul>
         * <li>true: returns logs in reverse chronological order of log timestamps.</li>
         * <li>false (default): returns logs in chronological order of log timestamps.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The reverse parameter takes effect only when the query parameter is set to a search statement. The reverse parameter specifies the method used to sort returned logs.</li>
         * <li>If the query parameter is set to a query statement, the reverse parameter does not take effect. The method used to sort returned logs is specified by the ORDER BY clause in the analytic statement. If you use the keyword asc in the ORDER BY clause, the logs are sorted in chronological order. If you use the keyword desc in the ORDER BY clause, the logs are sorted in reverse chronological order. By default, asc is used in the ORDER BY clause.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is the log time that is specified when log data is written.</p>
         * <ul>
         * <li>The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the <strong>from</strong> parameter, but does not include the end time specified by the <strong>to</strong> parameter. If you specify the same value for the <strong>from</strong> and <strong>to</strong> parameters, the interval is invalid, and an error message is returned.</li>
         * <li>The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</li>
         * </ul>
         * <blockquote>
         * <p>To ensure that full data can be queried, specify a query time range that is accurate to the minute. If you also specify a time range in an analytic statement, Simple Log Service uses the time range specified in the analytic statement for query and analysis.</p>
         * </blockquote>
         * <p>If you want to specify a time range that is accurate to the second in your analytic statement, you must use the from_unixtime or to_unixtime function to convert the time format. For more information about the functions, see <a href="https://help.aliyun.com/document_detail/63451.html">from_unixtime function</a> and <a href="https://help.aliyun.com/document_detail/63451.html">to_unixtime function</a>. Examples:</p>
         * <ul>
         * <li><code>* | SELECT * FROM log WHERE from_unixtime(__time__) &gt; from_unixtime(1664186624) AND from_unixtime(__time__) &lt; now()</code></li>
         * <li><code>* | SELECT * FROM log WHERE __time__ &gt; to_unixtime(date_parse(\&quot;2022-10-19 15:46:05\&quot;, \&quot;%Y-%m-%d %H:%i:%s\&quot;)) AND __time__ &lt; to_unixtime(now())</code></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1627269085</p>
         */
        public Builder to(Integer to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * <p>The topic of the logs. The default value is an empty string. For more information, see <a href="https://help.aliyun.com/document_detail/48881.html">Topic</a>.</p>
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
        public GetLogsRequest build() {
            return new GetLogsRequest(this);
        } 

    } 

}
