// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetPageByCondLicenseInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetPageByCondLicenseInstanceRequest</p>
 */
public class GetPageByCondLicenseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractNo")
    private String contractNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private GetPageByCondLicenseInstanceRequest(Builder builder) {
        super(builder);
        this.contractNo = builder.contractNo;
        this.instanceId = builder.instanceId;
        this.needTotalCount = builder.needTotalCount;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPageByCondLicenseInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contractNo
     */
    public String getContractNo() {
        return this.contractNo;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<GetPageByCondLicenseInstanceRequest, Builder> {
        private String contractNo; 
        private String instanceId; 
        private Boolean needTotalCount; 
        private Long pageNo; 
        private Long pageSize; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(GetPageByCondLicenseInstanceRequest request) {
            super(request);
            this.contractNo = request.contractNo;
            this.instanceId = request.instanceId;
            this.needTotalCount = request.needTotalCount;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
        } 

        /**
         * ContractNo.
         */
        public Builder contractNo(String contractNo) {
            this.putQueryParameter("ContractNo", contractNo);
            this.contractNo = contractNo;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NeedTotalCount.
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putQueryParameter("NeedTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public GetPageByCondLicenseInstanceRequest build() {
            return new GetPageByCondLicenseInstanceRequest(this);
        } 

    } 

}
