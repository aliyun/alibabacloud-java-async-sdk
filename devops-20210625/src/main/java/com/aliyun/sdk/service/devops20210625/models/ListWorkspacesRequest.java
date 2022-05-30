// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspacesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkspacesRequest</p>
 */
public class ListWorkspacesRequest extends Request {
    @Query
    @NameInMap("maxResults")
    private Integer maxResults;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("statusList")
    private java.util.List < String > statusList;

    @Query
    @NameInMap("workspaceTemplateList")
    private java.util.List < String > workspaceTemplateList;

    private ListWorkspacesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.statusList = builder.statusList;
        this.workspaceTemplateList = builder.workspaceTemplateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    /**
     * @return workspaceTemplateList
     */
    public java.util.List < String > getWorkspaceTemplateList() {
        return this.workspaceTemplateList;
    }

    public static final class Builder extends Request.Builder<ListWorkspacesRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > statusList; 
        private java.util.List < String > workspaceTemplateList; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkspacesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.statusList = request.statusList;
            this.workspaceTemplateList = request.workspaceTemplateList;
        } 

        /**
         * 本次读取的最大数据记录数量，默认10，最大100
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 用来标记当前开始读取的位置，置空表示从头开始
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 枚举值：CREATING-创建中, SUCCESS-运行中, FROZEN-冻结中, RECOVERING-恢复中
         */
        public Builder statusList(java.util.List < String > statusList) {
            String statusListShrink = shrink(statusList, "statusList", "simple");
            this.putQueryParameter("statusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        /**
         * 空间模板列表
         */
        public Builder workspaceTemplateList(java.util.List < String > workspaceTemplateList) {
            String workspaceTemplateListShrink = shrink(workspaceTemplateList, "workspaceTemplateList", "simple");
            this.putQueryParameter("workspaceTemplateList", workspaceTemplateListShrink);
            this.workspaceTemplateList = workspaceTemplateList;
            return this;
        }

        @Override
        public ListWorkspacesRequest build() {
            return new ListWorkspacesRequest(this);
        } 

    } 

}
