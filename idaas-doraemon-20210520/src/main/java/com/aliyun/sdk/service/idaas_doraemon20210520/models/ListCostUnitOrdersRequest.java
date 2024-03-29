// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCostUnitOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListCostUnitOrdersRequest</p>
 */
public class ListCostUnitOrdersRequest extends Request {
    @Query
    @NameInMap("BeginDate")
    private String beginDate;

    @Query
    @NameInMap("FinalDate")
    private String finalDate;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListCostUnitOrdersRequest(Builder builder) {
        super(builder);
        this.beginDate = builder.beginDate;
        this.finalDate = builder.finalDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCostUnitOrdersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginDate
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return finalDate
     */
    public String getFinalDate() {
        return this.finalDate;
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

    public static final class Builder extends Request.Builder<ListCostUnitOrdersRequest, Builder> {
        private String beginDate; 
        private String finalDate; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListCostUnitOrdersRequest request) {
            super(request);
            this.beginDate = request.beginDate;
            this.finalDate = request.finalDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * BeginDate.
         */
        public Builder beginDate(String beginDate) {
            this.putQueryParameter("BeginDate", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * FinalDate.
         */
        public Builder finalDate(String finalDate) {
            this.putQueryParameter("FinalDate", finalDate);
            this.finalDate = finalDate;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public ListCostUnitOrdersRequest build() {
            return new ListCostUnitOrdersRequest(this);
        } 

    } 

}
