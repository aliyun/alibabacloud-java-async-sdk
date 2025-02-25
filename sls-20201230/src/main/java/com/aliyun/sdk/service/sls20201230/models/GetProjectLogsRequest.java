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
 * {@link GetProjectLogsRequest} extends {@link RequestModel}
 *
 * <p>GetProjectLogsRequest</p>
 */
public class GetProjectLogsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("powerSql")
    private Boolean powerSql;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to enable the Dedicated SQL feature. For more information, see <a href="https://help.aliyun.com/document_detail/223777.html">Enable Dedicated SQL</a>. Valid values:</p>
         * <ul>
         * <li>true</li>
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
         * <p>The standard SQL statement. In this example, the SQL statement queries the number of page views (PVs) from 2022-03-01 10:41:40 to 2022-03-01 10:56:40 in a Logstore whose name is nginx-moni.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT COUNT(*) as pv FROM nginx-moni where <strong>time</strong> &gt; 1646102500 and <strong>time</strong> &lt; 1646103400</p>
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
