// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GeneralBillPageResult} extends {@link TeaModel}
 *
 * <p>GeneralBillPageResult</p>
 */
public class GeneralBillPageResult extends TeaModel {
    @NameInMap("generalBills")
    private java.util.List < GeneralBill > generalBills;

    @NameInMap("pageNumber")
    private Integer pageNumber;

    @NameInMap("pageSize")
    private Integer pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("total")
    private Integer total;

    private GeneralBillPageResult(Builder builder) {
        this.generalBills = builder.generalBills;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneralBillPageResult create() {
        return builder().build();
    }

    /**
     * @return generalBills
     */
    public java.util.List < GeneralBill > getGeneralBills() {
        return this.generalBills;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < GeneralBill > generalBills; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * generalBills.
         */
        public Builder generalBills(java.util.List < GeneralBill > generalBills) {
            this.generalBills = generalBills;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GeneralBillPageResult build() {
            return new GeneralBillPageResult(this);
        } 

    } 

}
