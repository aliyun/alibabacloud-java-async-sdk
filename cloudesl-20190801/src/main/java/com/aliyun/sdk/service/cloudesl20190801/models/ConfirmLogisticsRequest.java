// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmLogisticsRequest} extends {@link RequestModel}
 *
 * <p>ConfirmLogisticsRequest</p>
 */
public class ConfirmLogisticsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogisticsDocuments")
    private String logisticsDocuments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PoNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ConfirmLogisticsRequest(Builder builder) {
        super(builder);
        this.logisticsDocuments = builder.logisticsDocuments;
        this.poNumber = builder.poNumber;
        this.prNumber = builder.prNumber;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmLogisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logisticsDocuments
     */
    public String getLogisticsDocuments() {
        return this.logisticsDocuments;
    }

    /**
     * @return poNumber
     */
    public String getPoNumber() {
        return this.poNumber;
    }

    /**
     * @return prNumber
     */
    public String getPrNumber() {
        return this.prNumber;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ConfirmLogisticsRequest, Builder> {
        private String logisticsDocuments; 
        private String poNumber; 
        private String prNumber; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmLogisticsRequest request) {
            super(request);
            this.logisticsDocuments = request.logisticsDocuments;
            this.poNumber = request.poNumber;
            this.prNumber = request.prNumber;
            this.status = request.status;
        } 

        /**
         * LogisticsDocuments.
         */
        public Builder logisticsDocuments(String logisticsDocuments) {
            this.putBodyParameter("LogisticsDocuments", logisticsDocuments);
            this.logisticsDocuments = logisticsDocuments;
            return this;
        }

        /**
         * PoNumber.
         */
        public Builder poNumber(String poNumber) {
            this.putBodyParameter("PoNumber", poNumber);
            this.poNumber = poNumber;
            return this;
        }

        /**
         * PrNumber.
         */
        public Builder prNumber(String prNumber) {
            this.putBodyParameter("PrNumber", prNumber);
            this.prNumber = prNumber;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ConfirmLogisticsRequest build() {
            return new ConfirmLogisticsRequest(this);
        } 

    } 

}
