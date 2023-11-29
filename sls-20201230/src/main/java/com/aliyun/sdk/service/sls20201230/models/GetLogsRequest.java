// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLogsRequest} extends {@link RequestModel}
 *
 * <p>GetLogsRequest</p>
 */
public class GetLogsRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("logstore")
    @Validation(required = true)
    private String logstore;

    @Query
    @NameInMap("from")
    @Validation(required = true)
    private Integer from;

    @Query
    @NameInMap("line")
    @Validation(maximum = 100)
    private Long line;

    @Query
    @NameInMap("offset")
    private Long offset;

    @Query
    @NameInMap("powerSql")
    private Boolean powerSql;

    @Query
    @NameInMap("query")
    private String query;

    @Query
    @NameInMap("reverse")
    private Boolean reverse;

    @Query
    @NameInMap("to")
    @Validation(required = true)
    private Integer to;

    @Query
    @NameInMap("topic")
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
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The Logstore whose logs you want to query.
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is the log time that is specified when log data is written.
         * <p>
         * 
         * *   The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the **from** parameter, but does not include the end time specified by the **to** parameter. If you specify the same value for the **from** and **to** parameters, the interval is invalid, and an error message is returned.
         * *   The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * 
         * > To ensure that full data can be queried, specify a query time range that is accurate to the minute. If you also specify a time range in an analytic statement, Simple Log Service uses the time range specified in the analytic statement for query and analysis.
         * 
         * If you want to specify a time range that is accurate to the second in your analytic statement, you must use the from_unixtime or to_unixtime function to convert the time format. For more information about the functions, see [from_unixtime function](~~63451~~) and [to_unixtime function](~~63451~~). Examples:
         * 
         * *   `* | SELECT * FROM log WHERE from_unixtime(__time__) > from_unixtime(1664186624) AND from_unixtime(__time__) < now()`
         * *   `* | SELECT * FROM log WHERE __time__ > to_unixtime(date_parse(\"2022-10-19 15:46:05\", \"%Y-%m-%d %H:%i:%s\")) AND __time__ < to_unixtime(now())`
         */
        public Builder from(Integer from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * The maximum number of logs to return for the request. This parameter takes effect only when the query parameter is set to a search statement. Minimum value: 0. Maximum value: 100. Default value: 100.
         */
        public Builder line(Long line) {
            this.putQueryParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * The line from which the query starts. This parameter takes effect only when the query parameter is set to a search statement. Default value: 0.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * Specifies whether to enable the Dedicated SQL feature. For more information, see [Enable Dedicated SQL](~~223777~~). Valid values:
         * <p>
         * 
         * *   true: enables the Dedicated SQL feature.
         * *   false (default): enables the Standard SQL feature.
         * 
         * You can use the powerSql or **query** parameter to configure Dedicated SQL.
         */
        public Builder powerSql(Boolean powerSql) {
            this.putQueryParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
        }

        /**
         * The search statement or the query statement. For more information, see [Log search overview](~~43772~~) and [Log analysis overview](~~53608~~). If you add `set session parallel_sql=true;` to the analytic statement in the query parameter, Dedicated SQL is used. For example, you can set the query parameter to `* | set session parallel_sql=true; select count(*) as pv`. For more information about common errors that may occur during log query and analysis, see [How do I resolve common errors that occur when I query and analyze logs?](~~61628~~)
         * <p>
         * 
         * > If you specify an analytic statement in the value of the query parameter, the line and offset parameters do not take effect. In this case, we recommend that you set the line and offset parameters to 0 and use the LIMIT clause to limit the number of logs to return on each page. For more information, see [Paged query](~~89994~~).
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * Specifies whether to return logs in reverse chronological order of log timestamps. The log timestamps are accurate to the minute. Valid values:
         * <p>
         * 
         * *   true: returns logs in reverse chronological order of log timestamps.
         * *   false (default): returns logs in chronological order of log timestamps.
         * 
         * > 
         * 
         * *   The reverse parameter takes effect only when the query parameter is set to a search statement. The reverse parameter specifies the method used to sort returned logs.
         * *   If the query parameter is set to a query statement, the reverse parameter does not take effect. The method used to sort returned logs is specified by the ORDER BY clause in the analytic statement. If you use the keyword asc in the ORDER BY clause, the logs are sorted in chronological order. If you use the keyword desc in the ORDER BY clause, the logs are sorted in reverse chronological order. By default, asc is used in the ORDER BY clause.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * The end of the time range to query. The value is the log time that is specified when log data is written.
         * <p>
         * 
         * *   The time range that is specified in this operation is a left-closed, right-open interval. The interval includes the start time specified by the **from** parameter, but does not include the end time specified by the **to** parameter. If you specify the same value for the **from** and **to** parameters, the interval is invalid, and an error message is returned.
         * *   The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * 
         * > To ensure that full data can be queried, specify a query time range that is accurate to the minute. If you also specify a time range in an analytic statement, Simple Log Service uses the time range specified in the analytic statement for query and analysis.
         * 
         * If you want to specify a time range that is accurate to the second in your analytic statement, you must use the from_unixtime or to_unixtime function to convert the time format. For more information about the functions, see [from_unixtime function](~~63451~~) and [to_unixtime function](~~63451~~). Examples:
         * 
         * *   `* | SELECT * FROM log WHERE from_unixtime(__time__) > from_unixtime(1664186624) AND from_unixtime(__time__) < now()`
         * *   `* | SELECT * FROM log WHERE __time__ > to_unixtime(date_parse(\"2022-10-19 15:46:05\", \"%Y-%m-%d %H:%i:%s\")) AND __time__ < to_unixtime(now())`
         */
        public Builder to(Integer to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * The topic of the logs. The default value is double quotation marks (""). For more information, see [Topic](~~48881~~).
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
