// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link SearchHotelListRequest} extends {@link RequestModel}
 *
 * <p>SearchHotelListRequest</p>
 */
public class SearchHotelListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cityCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private SearchHotelListRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.cityCode = builder.cityCode;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchHotelListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
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
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<SearchHotelListRequest, Builder> {
        private Long accountNo; 
        private String cityCode; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(SearchHotelListRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.cityCode = request.cityCode;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.tracerId = request.tracerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing</p>
         */
        public Builder cityCode(String cityCode) {
            this.putBodyParameter("CityCode", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public SearchHotelListRequest build() {
            return new SearchHotelListRequest(this);
        } 

    } 

}
