// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStatisticLogsRequest} extends {@link RequestModel}
 *
 * <p>ListStatisticLogsRequest</p>
 */
public class ListStatisticLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("columns")
    private String columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("distinct")
    private Boolean distinct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(maximum = 9999999999D)
    private Integer startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("stopTime")
    @com.aliyun.core.annotation.Validation(maximum = 9999999999D)
    private Integer stopTime;

    private ListStatisticLogsRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.moduleName = builder.moduleName;
        this.columns = builder.columns;
        this.distinct = builder.distinct;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.stopTime = builder.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatisticLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return columns
     */
    public String getColumns() {
        return this.columns;
    }

    /**
     * @return distinct
     */
    public Boolean getDistinct() {
        return this.distinct;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    /**
     * @return stopTime
     */
    public Integer getStopTime() {
        return this.stopTime;
    }

    public static final class Builder extends Request.Builder<ListStatisticLogsRequest, Builder> {
        private String appGroupIdentity; 
        private String moduleName; 
        private String columns; 
        private Boolean distinct; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private String sortBy; 
        private Integer startTime; 
        private Integer stopTime; 

        private Builder() {
            super();
        } 

        private Builder(ListStatisticLogsRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.moduleName = request.moduleName;
            this.columns = request.columns;
            this.distinct = request.distinct;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.stopTime = request.stopTime;
        } 

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_group_name</p>
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * <p>The module name. Valid values:</p>
         * <ul>
         * <li>hot: rankings of hotwords.</li>
         * <li>error: application error logs.</li>
         * <li>slow-log: slow query logs.</li>
         * </ul>
         * <p>Set the value to hot.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hot</p>
         */
        public Builder moduleName(String moduleName) {
            this.putPathParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The fields to query. Format: columns=wordsTopPv.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/187665.html">Metrics in statistical reports</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>wordsTopPv</p>
         */
        public Builder columns(String columns) {
            this.putQueryParameter("columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * <p>Specifies whether to use the distinct clause.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder distinct(Boolean distinct) {
            this.putQueryParameter("distinct", distinct);
            this.distinct = distinct;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The content of the query clause.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;default:&quot;OpenSearch&quot;&quot;</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The content of the sort clause.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;-id&quot;</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("sortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The default value is the timestamp of 00:00:00 on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>1582214400</p>
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The end of the time range to query. The default value is the timestamp of 24:00:00 on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>1682222400</p>
         */
        public Builder stopTime(Integer stopTime) {
            this.putQueryParameter("stopTime", stopTime);
            this.stopTime = stopTime;
            return this;
        }

        @Override
        public ListStatisticLogsRequest build() {
            return new ListStatisticLogsRequest(this);
        } 

    } 

}
