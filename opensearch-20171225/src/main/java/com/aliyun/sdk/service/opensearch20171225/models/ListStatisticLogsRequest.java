// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStatisticLogsRequest} extends {@link RequestModel}
 *
 * <p>ListStatisticLogsRequest</p>
 */
public class ListStatisticLogsRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("moduleName")
    @Validation(required = true)
    private String moduleName;

    @Query
    @NameInMap("columns")
    private String columns;

    @Query
    @NameInMap("distinct")
    private Boolean distinct;

    @Query
    @NameInMap("pageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 10000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("query")
    private String query;

    @Query
    @NameInMap("sortBy")
    private String sortBy;

    @Query
    @NameInMap("startTime")
    @Validation(maximum = 9999999999D)
    private Integer startTime;

    @Query
    @NameInMap("stopTime")
    @Validation(maximum = 9999999999D)
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

        private Builder(ListStatisticLogsRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.moduleName = response.moduleName;
            this.columns = response.columns;
            this.distinct = response.distinct;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.query = response.query;
            this.sortBy = response.sortBy;
            this.startTime = response.startTime;
            this.stopTime = response.stopTime;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * moduleName.
         */
        public Builder moduleName(String moduleName) {
            this.putPathParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * columns.
         */
        public Builder columns(String columns) {
            this.putQueryParameter("columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * distinct.
         */
        public Builder distinct(Boolean distinct) {
            this.putQueryParameter("distinct", distinct);
            this.distinct = distinct;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
         * sortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("sortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * stopTime.
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
