// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainTicketScanQueryRequest} extends {@link RequestModel}
 *
 * <p>TrainTicketScanQueryRequest</p>
 */
public class TrainTicketScanQueryRequest extends Request {
    @Query
    @NameInMap("bill_date")
    @Validation(required = true)
    private String billDate;

    @Query
    @NameInMap("bill_id")
    private Long billId;

    @Query
    @NameInMap("invoice_sub_task_id")
    private Long invoiceSubTaskId;

    @Query
    @NameInMap("page_no")
    private Integer pageNo;

    @Query
    @NameInMap("page_size")
    private Integer pageSize;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
    private String xAcsBtripSoCorpToken;

    private TrainTicketScanQueryRequest(Builder builder) {
        super(builder);
        this.billDate = builder.billDate;
        this.billId = builder.billId;
        this.invoiceSubTaskId = builder.invoiceSubTaskId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainTicketScanQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billDate
     */
    public String getBillDate() {
        return this.billDate;
    }

    /**
     * @return billId
     */
    public Long getBillId() {
        return this.billId;
    }

    /**
     * @return invoiceSubTaskId
     */
    public Long getInvoiceSubTaskId() {
        return this.invoiceSubTaskId;
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
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainTicketScanQueryRequest, Builder> {
        private String billDate; 
        private Long billId; 
        private Long invoiceSubTaskId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainTicketScanQueryRequest request) {
            super(request);
            this.billDate = request.billDate;
            this.billId = request.billId;
            this.invoiceSubTaskId = request.invoiceSubTaskId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * 出账日
         */
        public Builder billDate(String billDate) {
            this.putQueryParameter("bill_date", billDate);
            this.billDate = billDate;
            return this;
        }

        /**
         * 账单id
         */
        public Builder billId(Long billId) {
            this.putQueryParameter("bill_id", billId);
            this.billId = billId;
            return this;
        }

        /**
         * 发票子任务id
         */
        public Builder invoiceSubTaskId(Long invoiceSubTaskId) {
            this.putQueryParameter("invoice_sub_task_id", invoiceSubTaskId);
            this.invoiceSubTaskId = invoiceSubTaskId;
            return this;
        }

        /**
         * page_no.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public TrainTicketScanQueryRequest build() {
            return new TrainTicketScanQueryRequest(this);
        } 

    } 

}
