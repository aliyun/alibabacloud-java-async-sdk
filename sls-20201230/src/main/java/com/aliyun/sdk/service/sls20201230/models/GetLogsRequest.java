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
         * from.
         */
        public Builder from(Integer from) {
            this.putQueryParameter("from", from);
            this.from = from;
            return this;
        }

        /**
         * line.
         */
        public Builder line(Long line) {
            this.putQueryParameter("line", line);
            this.line = line;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * powerSql.
         */
        public Builder powerSql(Boolean powerSql) {
            this.putQueryParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * reverse.
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Integer to) {
            this.putQueryParameter("to", to);
            this.to = to;
            return this;
        }

        /**
         * topic.
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
