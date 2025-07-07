// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseTodoQueryAccountTodoListRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseTodoQueryAccountTodoListRequest</p>
 */
public class EnterpriseTodoQueryAccountTodoListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperatePk")
    private String operatePk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowCompleteInfo")
    private Boolean showCompleteInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TodoType")
    private String todoType;

    private EnterpriseTodoQueryAccountTodoListRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.operatePk = builder.operatePk;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.showCompleteInfo = builder.showCompleteInfo;
        this.status = builder.status;
        this.todoType = builder.todoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseTodoQueryAccountTodoListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return operatePk
     */
    public String getOperatePk() {
        return this.operatePk;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return showCompleteInfo
     */
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return todoType
     */
    public String getTodoType() {
        return this.todoType;
    }

    public static final class Builder extends Request.Builder<EnterpriseTodoQueryAccountTodoListRequest, Builder> {
        private String appName; 
        private Integer maxResults; 
        private String nextToken; 
        private String operatePk; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private Integer page; 
        private Integer pageSize; 
        private Boolean showCompleteInfo; 
        private String status; 
        private String todoType; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseTodoQueryAccountTodoListRequest request) {
            super(request);
            this.appName = request.appName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.operatePk = request.operatePk;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.showCompleteInfo = request.showCompleteInfo;
            this.status = request.status;
            this.todoType = request.todoType;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OperatePk.
         */
        public Builder operatePk(String operatePk) {
            this.putBodyParameter("OperatePk", operatePk);
            this.operatePk = operatePk;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
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
         * ShowCompleteInfo.
         */
        public Builder showCompleteInfo(Boolean showCompleteInfo) {
            this.putBodyParameter("ShowCompleteInfo", showCompleteInfo);
            this.showCompleteInfo = showCompleteInfo;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TodoType.
         */
        public Builder todoType(String todoType) {
            this.putBodyParameter("TodoType", todoType);
            this.todoType = todoType;
            return this;
        }

        @Override
        public EnterpriseTodoQueryAccountTodoListRequest build() {
            return new EnterpriseTodoQueryAccountTodoListRequest(this);
        } 

    } 

}
