// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessGroupAllRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessGroupAllRequest</p>
 */
public class GetBusinessGroupAllRequest extends Request {
    @Query
    @NameInMap("BusinessGroupName")
    private String businessGroupName;

    @Query
    @NameInMap("CurrentPage")
    private Long currentPage;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("Status")
    private Long status;

    private GetBusinessGroupAllRequest(Builder builder) {
        super(builder);
        this.businessGroupName = builder.businessGroupName;
        this.currentPage = builder.currentPage;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessGroupAllRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupName
     */
    public String getBusinessGroupName() {
        return this.businessGroupName;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
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
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetBusinessGroupAllRequest, Builder> {
        private String businessGroupName; 
        private Long currentPage; 
        private String operaUid; 
        private Long pageSize; 
        private Long status; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessGroupAllRequest request) {
            super(request);
            this.businessGroupName = request.businessGroupName;
            this.currentPage = request.currentPage;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * BusinessGroupName.
         */
        public Builder businessGroupName(String businessGroupName) {
            this.putQueryParameter("BusinessGroupName", businessGroupName);
            this.businessGroupName = businessGroupName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
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
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetBusinessGroupAllRequest build() {
            return new GetBusinessGroupAllRequest(this);
        } 

    } 

}
