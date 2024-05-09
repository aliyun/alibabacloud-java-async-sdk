// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightItineraryScanQueryRequest} extends {@link RequestModel}
 *
 * <p>FlightItineraryScanQueryRequest</p>
 */
public class FlightItineraryScanQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String billDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bill_id")
    private Long billId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("invoice_sub_task_id")
    private Long invoiceSubTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("itinerary_num")
    private String itineraryNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_no")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ticket_no")
    private String ticketNo;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private FlightItineraryScanQueryRequest(Builder builder) {
        super(builder);
        this.billDate = builder.billDate;
        this.billId = builder.billId;
        this.invoiceSubTaskId = builder.invoiceSubTaskId;
        this.itineraryNum = builder.itineraryNum;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.ticketNo = builder.ticketNo;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightItineraryScanQueryRequest create() {
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
     * @return itineraryNum
     */
    public String getItineraryNum() {
        return this.itineraryNum;
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

    public static final class Builder extends Request.Builder<FlightItineraryScanQueryRequest, Builder> {
        private String billDate; 
        private Long billId; 
        private Long invoiceSubTaskId; 
        private String itineraryNum; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String ticketNo; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightItineraryScanQueryRequest request) {
            super(request);
            this.billDate = request.billDate;
            this.billId = request.billId;
            this.invoiceSubTaskId = request.invoiceSubTaskId;
            this.itineraryNum = request.itineraryNum;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
         * itinerary_num.
         */
        public Builder itineraryNum(String itineraryNum) {
            this.putQueryParameter("itinerary_num", itineraryNum);
            this.itineraryNum = itineraryNum;
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
        public FlightItineraryScanQueryRequest build() {
            return new FlightItineraryScanQueryRequest(this);
        } 

    } 

}
