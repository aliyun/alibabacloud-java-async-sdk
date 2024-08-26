// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoryListByBizTypeRequest} extends {@link RequestModel}
 *
 * <p>GetHistoryListByBizTypeRequest</p>
 */
public class GetHistoryListByBizTypeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private GetHistoryListByBizTypeRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoryListByBizTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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

    public static final class Builder extends Request.Builder<GetHistoryListByBizTypeRequest, Builder> {
        private String workspaceId; 
        private String bizId; 
        private String bizType; 
        private Integer page; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoryListByBizTypeRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.page = request.page;
            this.pageSize = request.pageSize;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * bizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("bizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * bizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("bizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
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

        @Override
        public GetHistoryListByBizTypeRequest build() {
            return new GetHistoryListByBizTypeRequest(this);
        } 

    } 

}
