// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrderConsumeStatisticRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListOrderConsumeStatisticRecordsRequest</p>
 */
public class ListOrderConsumeStatisticRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliOrderCode")
    private String aliOrderCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationExternalId")
    private String applicationExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticTimeMax")
    private String statisticTimeMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatisticTimeMin")
    private String statisticTimeMin;

    private ListOrderConsumeStatisticRecordsRequest(Builder builder) {
        super(builder);
        this.aliOrderCode = builder.aliOrderCode;
        this.applicationExternalId = builder.applicationExternalId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serviceCode = builder.serviceCode;
        this.statisticTimeMax = builder.statisticTimeMax;
        this.statisticTimeMin = builder.statisticTimeMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrderConsumeStatisticRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliOrderCode
     */
    public String getAliOrderCode() {
        return this.aliOrderCode;
    }

    /**
     * @return applicationExternalId
     */
    public String getApplicationExternalId() {
        return this.applicationExternalId;
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
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return statisticTimeMax
     */
    public String getStatisticTimeMax() {
        return this.statisticTimeMax;
    }

    /**
     * @return statisticTimeMin
     */
    public String getStatisticTimeMin() {
        return this.statisticTimeMin;
    }

    public static final class Builder extends Request.Builder<ListOrderConsumeStatisticRecordsRequest, Builder> {
        private String aliOrderCode; 
        private String applicationExternalId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serviceCode; 
        private String statisticTimeMax; 
        private String statisticTimeMin; 

        private Builder() {
            super();
        } 

        private Builder(ListOrderConsumeStatisticRecordsRequest request) {
            super(request);
            this.aliOrderCode = request.aliOrderCode;
            this.applicationExternalId = request.applicationExternalId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serviceCode = request.serviceCode;
            this.statisticTimeMax = request.statisticTimeMax;
            this.statisticTimeMin = request.statisticTimeMin;
        } 

        /**
         * AliOrderCode.
         */
        public Builder aliOrderCode(String aliOrderCode) {
            this.putQueryParameter("AliOrderCode", aliOrderCode);
            this.aliOrderCode = aliOrderCode;
            return this;
        }

        /**
         * ApplicationExternalId.
         */
        public Builder applicationExternalId(String applicationExternalId) {
            this.putQueryParameter("ApplicationExternalId", applicationExternalId);
            this.applicationExternalId = applicationExternalId;
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

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * StatisticTimeMax.
         */
        public Builder statisticTimeMax(String statisticTimeMax) {
            this.putQueryParameter("StatisticTimeMax", statisticTimeMax);
            this.statisticTimeMax = statisticTimeMax;
            return this;
        }

        /**
         * StatisticTimeMin.
         */
        public Builder statisticTimeMin(String statisticTimeMin) {
            this.putQueryParameter("StatisticTimeMin", statisticTimeMin);
            this.statisticTimeMin = statisticTimeMin;
            return this;
        }

        @Override
        public ListOrderConsumeStatisticRecordsRequest build() {
            return new ListOrderConsumeStatisticRecordsRequest(this);
        } 

    } 

}
