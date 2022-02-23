// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySqlAnalysisDataRequest} extends {@link RequestModel}
 *
 * <p>QuerySqlAnalysisDataRequest</p>
 */
public class QuerySqlAnalysisDataRequest extends Request {
    @Query
    @NameInMap("ConsoleContext")
    private String consoleContext;

    @Body
    @NameInMap("PageNo")
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SqlIdList")
    private String sqlIdList;

    @Body
    @NameInMap("SqlTextFeature")
    private String sqlTextFeature;

    @Body
    @NameInMap("SqlType")
    private String sqlType;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("Type")
    private String type;

    private QuerySqlAnalysisDataRequest(Builder builder) {
        super(builder);
        this.consoleContext = builder.consoleContext;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sqlIdList = builder.sqlIdList;
        this.sqlTextFeature = builder.sqlTextFeature;
        this.sqlType = builder.sqlType;
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySqlAnalysisDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consoleContext
     */
    public String getConsoleContext() {
        return this.consoleContext;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sqlIdList
     */
    public String getSqlIdList() {
        return this.sqlIdList;
    }

    /**
     * @return sqlTextFeature
     */
    public String getSqlTextFeature() {
        return this.sqlTextFeature;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QuerySqlAnalysisDataRequest, Builder> {
        private String consoleContext; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String sqlIdList; 
        private String sqlTextFeature; 
        private String sqlType; 
        private String taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QuerySqlAnalysisDataRequest response) {
            super(response);
            this.consoleContext = response.consoleContext;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.sqlIdList = response.sqlIdList;
            this.sqlTextFeature = response.sqlTextFeature;
            this.sqlType = response.sqlType;
            this.taskId = response.taskId;
            this.type = response.type;
        } 

        /**
         * ConsoleContext.
         */
        public Builder consoleContext(String consoleContext) {
            this.putQueryParameter("ConsoleContext", consoleContext);
            this.consoleContext = consoleContext;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SqlIdList.
         */
        public Builder sqlIdList(String sqlIdList) {
            this.putBodyParameter("SqlIdList", sqlIdList);
            this.sqlIdList = sqlIdList;
            return this;
        }

        /**
         * SqlTextFeature.
         */
        public Builder sqlTextFeature(String sqlTextFeature) {
            this.putBodyParameter("SqlTextFeature", sqlTextFeature);
            this.sqlTextFeature = sqlTextFeature;
            return this;
        }

        /**
         * SqlType.
         */
        public Builder sqlType(String sqlType) {
            this.putBodyParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QuerySqlAnalysisDataRequest build() {
            return new QuerySqlAnalysisDataRequest(this);
        } 

    } 

}
