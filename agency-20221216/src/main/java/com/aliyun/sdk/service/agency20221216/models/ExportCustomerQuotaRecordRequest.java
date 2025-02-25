// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ExportCustomerQuotaRecordRequest} extends {@link RequestModel}
 *
 * <p>ExportCustomerQuotaRecordRequest</p>
 */
public class ExportCustomerQuotaRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserPk")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endUserPk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private ExportCustomerQuotaRecordRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.endUserPk = builder.endUserPk;
        this.language = builder.language;
        this.operationType = builder.operationType;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportCustomerQuotaRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return endUserPk
     */
    public Long getEndUserPk() {
        return this.endUserPk;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<ExportCustomerQuotaRecordRequest, Builder> {
        private String endDate; 
        private Long endUserPk; 
        private String language; 
        private String operationType; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(ExportCustomerQuotaRecordRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.endUserPk = request.endUserPk;
            this.language = request.language;
            this.operationType = request.operationType;
            this.startDate = request.startDate;
        } 

        /**
         * <p>End Date Format:  yyyy-MM-dd</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Customer UID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5113766248601929</p>
         */
        public Builder endUserPk(Long endUserPk) {
            this.putQueryParameter("EndUserPk", endUserPk);
            this.endUserPk = endUserPk;
            return this;
        }

        /**
         * <p>Multilingual Parameters, the default language is English.</br>
         * en: English</br>
         * zh: Chinese</br>
         * ja: Japanese </br></p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>Operation Type Enum</br>
         * all All types</br>
         * quota_create Create quota</br>
         * quota_amount_adjust Adjust the amount of quota</br></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>Start Date Format:  yyyy-MM-dd</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-10</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public ExportCustomerQuotaRecordRequest build() {
            return new ExportCustomerQuotaRecordRequest(this);
        } 

    } 

}
