// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksByOrganizationRequest} extends {@link RequestModel}
 *
 * <p>QueryWorksByOrganizationRequest</p>
 */
public class QueryWorksByOrganizationRequest extends Request {
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

    private QueryWorksByOrganizationRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.thirdPartAuthFlag = builder.thirdPartAuthFlag;
        this.worksType = builder.worksType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorksByOrganizationRequest create() {
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

    public static final class Builder extends Request.Builder<QueryWorksByOrganizationRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer status; 
        private Integer thirdPartAuthFlag; 
        private String worksType; 

        private Builder() {
            super();
        } 

        private Builder(QueryWorksByOrganizationRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.thirdPartAuthFlag = request.thirdPartAuthFlag;
            this.worksType = request.worksType;
        } 

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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

        /**
         * ThirdPartAuthFlag.
         */
        public Builder thirdPartAuthFlag(Integer thirdPartAuthFlag) {
            this.putQueryParameter("ThirdPartAuthFlag", thirdPartAuthFlag);
            this.thirdPartAuthFlag = thirdPartAuthFlag;
            return this;
        }

        /**
         * WorksType.
         */
        public Builder worksType(String worksType) {
            this.putQueryParameter("WorksType", worksType);
            this.worksType = worksType;
            return this;
        }

        @Override
        public QueryWorksByOrganizationRequest build() {
            return new QueryWorksByOrganizationRequest(this);
        } 

    } 

}
