// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QuerySessionInfoRequest} extends {@link RequestModel}
 *
 * <p>QuerySessionInfoRequest</p>
 */
public class QuerySessionInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("statusList")
    private java.util.List<String> statusList;

    private QuerySessionInfoRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<QuerySessionInfoRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String projectId; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(QuerySessionInfoRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.statusList = request.statusList;
        } 

        /**
         * pageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("pageNo", pageNo);
            this.pageNo = pageNo;
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
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * statusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "statusList", "simple");
            this.putQueryParameter("statusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        @Override
        public QuerySessionInfoRequest build() {
            return new QuerySessionInfoRequest(this);
        } 

    } 

}
