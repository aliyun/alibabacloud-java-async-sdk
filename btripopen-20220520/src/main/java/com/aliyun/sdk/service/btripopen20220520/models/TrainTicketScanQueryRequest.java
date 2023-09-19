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
    @Validation(maximum = 100)
    private Integer pageSize;

    @Query
    @NameInMap("serial_number")
    private String serialNumber;

    @Query
    @NameInMap("ticket_no")
    private String ticketNo;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private TrainTicketScanQueryRequest(Builder builder) {
        super(builder);
        this.billDate = builder.billDate;
        this.billId = builder.billId;
        this.invoiceSubTaskId = builder.invoiceSubTaskId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.serialNumber = builder.serialNumber;
        this.ticketNo = builder.ticketNo;
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
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return ticketNo
     */
    public String getTicketNo() {
        return this.ticketNo;
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
        private String serialNumber; 
        private String ticketNo; 
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
            this.serialNumber = request.serialNumber;
            this.ticketNo = request.ticketNo;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * bill_date.
         */
        public Builder billDate(String billDate) {
            this.putQueryParameter("bill_date", billDate);
            this.billDate = billDate;
            return this;
        }

        /**
         * bill_id.
         */
        public Builder billId(Long billId) {
            this.putQueryParameter("bill_id", billId);
            this.billId = billId;
            return this;
        }

        /**
         * invoice_sub_task_id.
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
         * serial_number.
         */
        public Builder serialNumber(String serialNumber) {
            this.putQueryParameter("serial_number", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * ticket_no.
         */
        public Builder ticketNo(String ticketNo) {
            this.putQueryParameter("ticket_no", ticketNo);
            this.ticketNo = ticketNo;
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
