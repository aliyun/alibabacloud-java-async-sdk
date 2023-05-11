// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksByWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>QueryWorksByWorkspaceRequest</p>
 */
public class QueryWorksByWorkspaceRequest extends Request {
    @Query
    @NameInMap("PageNum")
    @Validation(maximum = 99999999, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("ThirdPartAuthFlag")
    private Integer thirdPartAuthFlag;

    @Query
    @NameInMap("WorksType")
    private String worksType;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private QueryWorksByWorkspaceRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.thirdPartAuthFlag = builder.thirdPartAuthFlag;
        this.worksType = builder.worksType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorksByWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return thirdPartAuthFlag
     */
    public Integer getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    /**
     * @return worksType
     */
    public String getWorksType() {
        return this.worksType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryWorksByWorkspaceRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer status; 
        private Integer thirdPartAuthFlag; 
        private String worksType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryWorksByWorkspaceRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.thirdPartAuthFlag = request.thirdPartAuthFlag;
            this.worksType = request.worksType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * The page number of the returned page.
         * <p>
         * 
         * *   Default value: 1.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries returned per page.
         * <p>
         * 
         * *   Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of the work. Valid values:
         * <p>
         * 
         * *   0: unpublished
         * *   1: published
         * *   2: modified but not published
         * *   3: unpublished
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Third-party embedding status. Valid values:
         * <p>
         * 
         * *   0: The embed service is not enabled.
         * *   1: Embed is enabled.
         */
        public Builder thirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.putQueryParameter("ThirdPartAuthFlag", thirdPartAuthFlag);
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }

        /**
         * The type of the work. Valid values:
         * <p>
         * 
         * *   DATAPRODUCT: BI portal
         * *   PAGE: Dashboard
         * *   FULLPAGE: full-screen dashboards
         * *   REPORT: workbook
         */
        public Builder worksType(String worksType) {
            this.putQueryParameter("WorksType", worksType);
            this.worksType = worksType;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryWorksByWorkspaceRequest build() {
            return new QueryWorksByWorkspaceRequest(this);
        } 

    } 

}
