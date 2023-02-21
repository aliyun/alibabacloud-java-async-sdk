// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationPurchaseLandRequest} extends {@link RequestModel}
 *
 * <p>GetOcOperationPurchaseLandRequest</p>
 */
public class GetOcOperationPurchaseLandRequest extends Request {
    @Body
    @NameInMap("PageNo")
    private Integer pageNo;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SearchKey")
    @Validation(required = true)
    private String searchKey;

    private GetOcOperationPurchaseLandRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcOperationPurchaseLandRequest create() {
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
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    public static final class Builder extends Request.Builder<GetOcOperationPurchaseLandRequest, Builder> {
        private Integer pageNo; 
        private Integer pageSize; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(GetOcOperationPurchaseLandRequest request) {
            super(request);
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
        } 

        /**
         * 页码
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * 每页条数
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 查询参数：企业名称/注册号/统一社会信用编码
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public GetOcOperationPurchaseLandRequest build() {
            return new GetOcOperationPurchaseLandRequest(this);
        } 

    } 

}
