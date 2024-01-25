// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudResourceRequest} extends {@link RequestModel}
 *
 * <p>GetCloudResourceRequest</p>
 */
public class GetCloudResourceRequest extends Request {
    @Query
    @NameInMap("CloudTypeName")
    private String cloudTypeName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private Integer status;

    private GetCloudResourceRequest(Builder builder) {
        super(builder);
        this.cloudTypeName = builder.cloudTypeName;
        this.currentPage = builder.currentPage;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudTypeName
     */
    public String getCloudTypeName() {
        return this.cloudTypeName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
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

    public static final class Builder extends Request.Builder<GetCloudResourceRequest, Builder> {
        private String cloudTypeName; 
        private Integer currentPage; 
        private String operaUid; 
        private Integer pageSize; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudResourceRequest request) {
            super(request);
            this.cloudTypeName = request.cloudTypeName;
            this.currentPage = request.currentPage;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * CloudTypeName.
         */
        public Builder cloudTypeName(String cloudTypeName) {
            this.putQueryParameter("CloudTypeName", cloudTypeName);
            this.cloudTypeName = cloudTypeName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetCloudResourceRequest build() {
            return new GetCloudResourceRequest(this);
        } 

    } 

}
