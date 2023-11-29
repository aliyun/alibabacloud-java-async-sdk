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
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("powerSql")
    private Boolean powerSql;

    @Query
    @NameInMap("query")
    @Validation(required = true)
    private String query;

    private GetProjectLogsRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.powerSql = builder.powerSql;
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
     * @return project
     */
    public String getProject() {
        return this.project;
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

    public static final class Builder extends Request.Builder<GetProjectLogsRequest, Builder> {
        private String project; 
        private Boolean powerSql; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectLogsRequest request) {
            super(request);
            this.project = request.project;
            this.powerSql = request.powerSql;
            this.query = request.query;
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
         * Specifies whether to enable the Dedicated SQL feature. For more information, see [Enable Dedicated SQL](~~223777~~). Valid values:
         * <p>
         * 
         * *   true
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
         * The standard SQL statement. In this example, the SQL statement queries the number of page views (PVs) from 2022-03-01 10:41:40 to 2022-03-01 10:56:40 in a Logstore whose name is nginx-moni.
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
