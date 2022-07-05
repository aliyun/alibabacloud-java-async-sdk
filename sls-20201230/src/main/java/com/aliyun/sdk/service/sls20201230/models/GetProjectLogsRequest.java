// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetProjectLogsRequest} extends {@link RequestModel}
 *
 * <p>GetProjectLogsRequest</p>
 */
public class GetProjectLogsRequest extends Request {
    @Query
    @NameInMap("powerSql")
    private Boolean powerSql;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("query")
    @Validation(required = true)
    private String query;

    private GetProjectLogsRequest(Builder builder) {
        super(builder);
        this.powerSql = builder.powerSql;
        this.project = builder.project;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return powerSql
     */
    public Boolean getPowerSql() {
        return this.powerSql;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<GetProjectLogsRequest, Builder> {
        private Boolean powerSql; 
        private String project; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectLogsRequest request) {
            super(request);
            this.powerSql = request.powerSql;
            this.project = request.project;
            this.query = request.query;
        } 

        /**
         * 是否使用SQL独享版。更多信息，请参见开启SQL独享版。
         * <p>
         * 
         * true：使用SQL独享版。
         * false（默认值）：使用SQL普通版。
         * 除通过powerSql参数配置SQL独享版外，您还可以使用query参数。
         */
        public Builder powerSql(Boolean powerSql) {
            this.putQueryParameter("powerSql", powerSql);
            this.powerSql = powerSql;
            return this;
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
         * 标准SQL语句。例如日志库名称为nginx-moni，查询时间区间在2022-03-01 10:41:40到2022-03-01 10:56:40之间的访问数量。
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public GetProjectLogsRequest build() {
            return new GetProjectLogsRequest(this);
        } 

    } 

}
