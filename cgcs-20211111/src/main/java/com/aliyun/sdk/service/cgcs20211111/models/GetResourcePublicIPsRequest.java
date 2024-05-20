// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourcePublicIPsRequest} extends {@link RequestModel}
 *
 * <p>GetResourcePublicIPsRequest</p>
 */
public class GetResourcePublicIPsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    private GetResourcePublicIPsRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourcePublicIPsRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetResourcePublicIPsRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourcePublicIPsRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
        } 

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetResourcePublicIPsRequest build() {
            return new GetResourcePublicIPsRequest(this);
        } 

    } 

}
