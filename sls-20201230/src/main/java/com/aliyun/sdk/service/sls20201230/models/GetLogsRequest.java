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
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * logstore 名称。
         */
        public Builder logstore(String logstore) {
            this.putPathParameter("logstore", logstore);
            this.logstore = logstore;
            return this;
        }

        /**
         * 查询开始时间点。该时间是指写入日志数据时指定的日志时间。
         * <p>
         * 
         * 请求参数from和to定义的时间区间遵循左闭右开原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
         * Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         */
        public Builder from(Integer from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * 仅当query参数为查询语句时，该参数有效，表示请求返回的最大日志条数。最小值为0，最大值为100，默认值为100。
         */
        public Builder line(Long line) {
            this.putQueryParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * 仅当query参数为查询语句时，该参数有效，表示查询开始行。默认值为0。
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * 用于指定返回结果是否按日志时间戳降序返回日志，精确到分钟级别。
         * <p>
         * 
         * true：按照日志时间戳降序返回日志。
         * false（默认值）：按照日志时间戳升序返回日志。
         * 注意
         * 当query参数为查询语句时，参数reverse有效，用于指定返回日志排序方式。
         * 当query参数为查询和分析语句时，参数reverse无效，由SQL分析语句中order by语法指定排序方式。如果order by为asc（默认），则为升序；如果order by为desc，则为降序。
         */
        public Builder powerSql(Boolean powerSql) {
            this.putQueryParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
        }

        /**
         * 查询语句或者分析语句。更多信息，请参见查询概述和分析概述。
         * <p>
         * 
         * 在query参数的分析语句中加上set session parallel_sql=true;，表示使用SQL独享版。例如* | set session parallel_sql=true; select count(*) as pv 。
         * 
         * 说明 当query参数中有分析语句（SQL语句）时，该接口的line参数和offset参数无效，建议设置为0，需通过SQL语句的LIMIT语法实现翻页。更多信息，请参见分页显示查询分析结果。
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * 用于指定返回结果是否按日志时间戳降序返回日志，精确到分钟级别。
         * <p>
         * 
         * true：按照日志时间戳降序返回日志。
         * false（默认值）：按照日志时间戳升序返回日志。
         * 注意
         * 当query参数为查询语句时，参数reverse有效，用于指定返回日志排序方式。
         * 当query参数为查询和分析语句时，参数reverse无效，由SQL分析语句中order by语法指定排序方式。如果order by为asc（默认），则为升序；如果order by为desc，则为降序。
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * 查询结束时间点。该时间是指写入日志数据时指定的日志时间。
         * <p>
         * 
         * 请求参数from和to定义的时间区间遵循左闭右开原则，即该时间区间包括区间开始时间点，但不包括区间结束时间点。如果from和to的值相同，则为无效区间，函数直接返回错误。
         * Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
         */
        public Builder to(Integer to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * status: 401 | SELECT remote_addr,COUNT(*) as pv GROUP by remote_addr ORDER by pv desc limit 5
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
