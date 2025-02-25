// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceApplyRequest} extends {@link RequestModel}
 *
 * <p>ListServiceApplyRequest</p>
 */
public class ListServiceApplyRequest extends Request {
    @Body
    @NameInMap("applyType")
    private java.util.List < String > applyType;

    @Body
    @NameInMap("endDate")
    private Long endDate;

    @Body
    @NameInMap("pageNum")
    private Integer pageNum;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    @Body
    @NameInMap("productCode")
    private Integer productCode;

    @Body
    @NameInMap("startDate")
    private Long startDate;

    @Body
    @NameInMap("status")
    private String status;

    private ListServiceApplyRequest(Builder builder) {
        super(builder);
        this.applyType = builder.applyType;
        this.endDate = builder.endDate;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.startDate = builder.startDate;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyType
     */
    public java.util.List < String > getApplyType() {
        return this.applyType;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
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
     * @return productCode
     */
    public Integer getProductCode() {
        return this.productCode;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListServiceApplyRequest, Builder> {
        private java.util.List < String > applyType; 
        private Long endDate; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Integer productCode; 
        private Long startDate; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceApplyRequest request) {
            super(request);
            this.applyType = request.applyType;
            this.endDate = request.endDate;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.startDate = request.startDate;
            this.status = request.status;
        } 

        /**
         * applyType.
         */
        public Builder applyType(java.util.List < String > applyType) {
            this.putBodyParameter("applyType", applyType);
            this.applyType = applyType;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * productCode.
         */
        public Builder productCode(Integer productCode) {
            this.putBodyParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListServiceApplyRequest build() {
            return new ListServiceApplyRequest(this);
        } 

    } 

}
