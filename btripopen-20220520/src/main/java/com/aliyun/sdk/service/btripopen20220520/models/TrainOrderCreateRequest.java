// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TrainOrderCreateRequest} extends {@link RequestModel}
 *
 * <p>TrainOrderCreateRequest</p>
 */
public class TrainOrderCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accept_no_seat")
    private String acceptNoSeat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("book_train_infos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<BookTrainInfos> bookTrainInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("btrip_user_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String btripUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("business_info")
    private BusinessInfo businessInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contact_info")
    @com.aliyun.core.annotation.Validation(required = true)
    private ContactInfo contactInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("force_match")
    private String forceMatch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_pay_now")
    private Boolean isPayNow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_open_info_s")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PassengerOpenInfoS> passengerOpenInfoS;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainOrderCreateRequest(Builder builder) {
        super(builder);
        this.acceptNoSeat = builder.acceptNoSeat;
        this.bookTrainInfos = builder.bookTrainInfos;
        this.btripUserId = builder.btripUserId;
        this.btripUserName = builder.btripUserName;
        this.businessInfo = builder.businessInfo;
        this.contactInfo = builder.contactInfo;
        this.forceMatch = builder.forceMatch;
        this.isPayNow = builder.isPayNow;
        this.outOrderId = builder.outOrderId;
        this.passengerOpenInfoS = builder.passengerOpenInfoS;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainOrderCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptNoSeat
     */
    public String getAcceptNoSeat() {
        return this.acceptNoSeat;
    }

    /**
     * @return bookTrainInfos
     */
    public java.util.List<BookTrainInfos> getBookTrainInfos() {
        return this.bookTrainInfos;
    }

    /**
     * @return btripUserId
     */
    public String getBtripUserId() {
        return this.btripUserId;
    }

    /**
     * @return btripUserName
     */
    public String getBtripUserName() {
        return this.btripUserName;
    }

    /**
     * @return businessInfo
     */
    public BusinessInfo getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return contactInfo
     */
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return forceMatch
     */
    public String getForceMatch() {
        return this.forceMatch;
    }

    /**
     * @return isPayNow
     */
    public Boolean getIsPayNow() {
        return this.isPayNow;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return passengerOpenInfoS
     */
    public java.util.List<PassengerOpenInfoS> getPassengerOpenInfoS() {
        return this.passengerOpenInfoS;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainOrderCreateRequest, Builder> {
        private String acceptNoSeat; 
        private java.util.List<BookTrainInfos> bookTrainInfos; 
        private String btripUserId; 
        private String btripUserName; 
        private BusinessInfo businessInfo; 
        private ContactInfo contactInfo; 
        private String forceMatch; 
        private Boolean isPayNow; 
        private String outOrderId; 
        private java.util.List<PassengerOpenInfoS> passengerOpenInfoS; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainOrderCreateRequest request) {
            super(request);
            this.acceptNoSeat = request.acceptNoSeat;
            this.bookTrainInfos = request.bookTrainInfos;
            this.btripUserId = request.btripUserId;
            this.btripUserName = request.btripUserName;
            this.businessInfo = request.businessInfo;
            this.contactInfo = request.contactInfo;
            this.forceMatch = request.forceMatch;
            this.isPayNow = request.isPayNow;
            this.outOrderId = request.outOrderId;
            this.passengerOpenInfoS = request.passengerOpenInfoS;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * accept_no_seat.
         */
        public Builder acceptNoSeat(String acceptNoSeat) {
            this.putBodyParameter("accept_no_seat", acceptNoSeat);
            this.acceptNoSeat = acceptNoSeat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder bookTrainInfos(java.util.List<BookTrainInfos> bookTrainInfos) {
            String bookTrainInfosShrink = shrink(bookTrainInfos, "book_train_infos", "json");
            this.putBodyParameter("book_train_infos", bookTrainInfosShrink);
            this.bookTrainInfos = bookTrainInfos;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12344321</p>
         */
        public Builder btripUserId(String btripUserId) {
            this.putBodyParameter("btrip_user_id", btripUserId);
            this.btripUserId = btripUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder btripUserName(String btripUserName) {
            this.putBodyParameter("btrip_user_name", btripUserName);
            this.btripUserName = btripUserName;
            return this;
        }

        /**
         * business_info.
         */
        public Builder businessInfo(BusinessInfo businessInfo) {
            String businessInfoShrink = shrink(businessInfo, "business_info", "json");
            this.putBodyParameter("business_info", businessInfoShrink);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactInfo(ContactInfo contactInfo) {
            String contactInfoShrink = shrink(contactInfo, "contact_info", "json");
            this.putBodyParameter("contact_info", contactInfoShrink);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * force_match.
         */
        public Builder forceMatch(String forceMatch) {
            this.putBodyParameter("force_match", forceMatch);
            this.forceMatch = forceMatch;
            return this;
        }

        /**
         * is_pay_now.
         */
        public Builder isPayNow(Boolean isPayNow) {
            this.putBodyParameter("is_pay_now", isPayNow);
            this.isPayNow = isPayNow;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder passengerOpenInfoS(java.util.List<PassengerOpenInfoS> passengerOpenInfoS) {
            String passengerOpenInfoSShrink = shrink(passengerOpenInfoS, "passenger_open_info_s", "json");
            this.putBodyParameter("passenger_open_info_s", passengerOpenInfoSShrink);
            this.passengerOpenInfoS = passengerOpenInfoS;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TrainOrderCreateRequest build() {
            return new TrainOrderCreateRequest(this);
        } 

    } 

    /**
     * 
     * {@link TrainOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>TrainOrderCreateRequest</p>
     */
    public static class BookTicketInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long ticketPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ticketType;

        private BookTicketInfos(Builder builder) {
            this.passengerId = builder.passengerId;
            this.seatType = builder.seatType;
            this.ticketPrice = builder.ticketPrice;
            this.ticketType = builder.ticketType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookTicketInfos create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketType
         */
        public String getTicketType() {
            return this.ticketType;
        }

        public static final class Builder {
            private String passengerId; 
            private String seatType; 
            private Long ticketPrice; 
            private String ticketType; 

            private Builder() {
            } 

            private Builder(BookTicketInfos model) {
                this.passengerId = model.passengerId;
                this.seatType = model.seatType;
                this.ticketPrice = model.ticketPrice;
                this.ticketType = model.ticketType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ticketType(String ticketType) {
                this.ticketType = ticketType;
                return this;
            }

            public BookTicketInfos build() {
                return new BookTicketInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>TrainOrderCreateRequest</p>
     */
    public static class BookTrainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("book_ticket_infos")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<BookTicketInfos> bookTicketInfos;

        @com.aliyun.core.annotation.NameInMap("choose_beds")
        private String chooseBeds;

        @com.aliyun.core.annotation.NameInMap("choose_seats")
        private String chooseSeats;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("train_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String trainNo;

        private BookTrainInfos(Builder builder) {
            this.arrStationCode = builder.arrStationCode;
            this.bookTicketInfos = builder.bookTicketInfos;
            this.chooseBeds = builder.chooseBeds;
            this.chooseSeats = builder.chooseSeats;
            this.depStationCode = builder.depStationCode;
            this.depTime = builder.depTime;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookTrainInfos create() {
            return builder().build();
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        /**
         * @return bookTicketInfos
         */
        public java.util.List<BookTicketInfos> getBookTicketInfos() {
            return this.bookTicketInfos;
        }

        /**
         * @return chooseBeds
         */
        public String getChooseBeds() {
            return this.chooseBeds;
        }

        /**
         * @return chooseSeats
         */
        public String getChooseSeats() {
            return this.chooseSeats;
        }

        /**
         * @return depStationCode
         */
        public String getDepStationCode() {
            return this.depStationCode;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationCode; 
            private java.util.List<BookTicketInfos> bookTicketInfos; 
            private String chooseBeds; 
            private String chooseSeats; 
            private String depStationCode; 
            private String depTime; 
            private String trainNo; 

            private Builder() {
            } 

            private Builder(BookTrainInfos model) {
                this.arrStationCode = model.arrStationCode;
                this.bookTicketInfos = model.bookTicketInfos;
                this.chooseBeds = model.chooseBeds;
                this.chooseSeats = model.chooseSeats;
                this.depStationCode = model.depStationCode;
                this.depTime = model.depTime;
                this.trainNo = model.trainNo;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BDC</p>
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder bookTicketInfos(java.util.List<BookTicketInfos> bookTicketInfos) {
                this.bookTicketInfos = bookTicketInfos;
                return this;
            }

            /**
             * choose_beds.
             */
            public Builder chooseBeds(String chooseBeds) {
                this.chooseBeds = chooseBeds;
                return this;
            }

            /**
             * choose_seats.
             */
            public Builder chooseSeats(String chooseSeats) {
                this.chooseSeats = chooseSeats;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BTC</p>
             */
            public Builder depStationCode(String depStationCode) {
                this.depStationCode = depStationCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-06 15:19:01</p>
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>K123456</p>
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public BookTrainInfos build() {
                return new BookTrainInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>TrainOrderCreateRequest</p>
     */
    public static class BusinessInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customer_apply_id")
        private String customerApplyId;

        @com.aliyun.core.annotation.NameInMap("customer_itinerary_id")
        private String customerItineraryId;

        private BusinessInfo(Builder builder) {
            this.customerApplyId = builder.customerApplyId;
            this.customerItineraryId = builder.customerItineraryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessInfo create() {
            return builder().build();
        }

        /**
         * @return customerApplyId
         */
        public String getCustomerApplyId() {
            return this.customerApplyId;
        }

        /**
         * @return customerItineraryId
         */
        public String getCustomerItineraryId() {
            return this.customerItineraryId;
        }

        public static final class Builder {
            private String customerApplyId; 
            private String customerItineraryId; 

            private Builder() {
            } 

            private Builder(BusinessInfo model) {
                this.customerApplyId = model.customerApplyId;
                this.customerItineraryId = model.customerItineraryId;
            } 

            /**
             * customer_apply_id.
             */
            public Builder customerApplyId(String customerApplyId) {
                this.customerApplyId = customerApplyId;
                return this;
            }

            /**
             * customer_itinerary_id.
             */
            public Builder customerItineraryId(String customerItineraryId) {
                this.customerItineraryId = customerItineraryId;
                return this;
            }

            public BusinessInfo build() {
                return new BusinessInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>TrainOrderCreateRequest</p>
     */
    public static class ContactInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("passenger_mobile")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerMobile;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerName;

        private ContactInfo(Builder builder) {
            this.passengerId = builder.passengerId;
            this.passengerMobile = builder.passengerMobile;
            this.passengerName = builder.passengerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfo create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return passengerMobile
         */
        public String getPassengerMobile() {
            return this.passengerMobile;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        public static final class Builder {
            private String passengerId; 
            private String passengerMobile; 
            private String passengerName; 

            private Builder() {
            } 

            private Builder(ContactInfo model) {
                this.passengerId = model.passengerId;
                this.passengerMobile = model.passengerMobile;
                this.passengerName = model.passengerName;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>b6a6fc1bdf1ba60e25c2e132b612c8819</p>
             */
            public Builder passengerMobile(String passengerMobile) {
                this.passengerMobile = passengerMobile;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            public ContactInfo build() {
                return new ContactInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>TrainOrderCreateRequest</p>
     */
    public static class CostCenterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cascade_dept_name")
        private String cascadeDeptName;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private String costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("cost_center_no")
        private String costCenterNo;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private String invoiceId;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        private CostCenterInfo(Builder builder) {
            this.cascadeDeptName = builder.cascadeDeptName;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNo = builder.costCenterNo;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.invoiceId = builder.invoiceId;
            this.invoiceTitle = builder.invoiceTitle;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterInfo create() {
            return builder().build();
        }

        /**
         * @return cascadeDeptName
         */
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        /**
         * @return costCenterId
         */
        public String getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterNo
         */
        public String getCostCenterNo() {
            return this.costCenterNo;
        }

        /**
         * @return departId
         */
        public String getDepartId() {
            return this.departId;
        }

        /**
         * @return departName
         */
        public String getDepartName() {
            return this.departName;
        }

        /**
         * @return invoiceId
         */
        public String getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public static final class Builder {
            private String cascadeDeptName; 
            private String costCenterId; 
            private String costCenterName; 
            private String costCenterNo; 
            private String departId; 
            private String departName; 
            private String invoiceId; 
            private String invoiceTitle; 
            private String projectCode; 
            private String projectTitle; 

            private Builder() {
            } 

            private Builder(CostCenterInfo model) {
                this.cascadeDeptName = model.cascadeDeptName;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.costCenterNo = model.costCenterNo;
                this.departId = model.departId;
                this.departName = model.departName;
                this.invoiceId = model.invoiceId;
                this.invoiceTitle = model.invoiceTitle;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
            } 

            /**
             * cascade_dept_name.
             */
            public Builder cascadeDeptName(String cascadeDeptName) {
                this.cascadeDeptName = cascadeDeptName;
                return this;
            }

            /**
             * cost_center_id.
             */
            public Builder costCenterId(String costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * cost_center_no.
             */
            public Builder costCenterNo(String costCenterNo) {
                this.costCenterNo = costCenterNo;
                return this;
            }

            /**
             * depart_id.
             */
            public Builder departId(String departId) {
                this.departId = departId;
                return this;
            }

            /**
             * depart_name.
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * invoice_id.
             */
            public Builder invoiceId(String invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            public CostCenterInfo build() {
                return new CostCenterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderCreateRequest} extends {@link TeaModel}
     *
     * <p>TrainOrderCreateRequest</p>
     */
    public static class PassengerOpenInfoS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_info")
        private CostCenterInfo costCenterInfo;

        @com.aliyun.core.annotation.NameInMap("country_code")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("passenger_cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerCertNo;

        @com.aliyun.core.annotation.NameInMap("passenger_cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerCertType;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("passenger_mobile")
        private String passengerMobile;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("valid_date_end")
        private String validDateEnd;

        private PassengerOpenInfoS(Builder builder) {
            this.costCenterInfo = builder.costCenterInfo;
            this.countryCode = builder.countryCode;
            this.passengerCertNo = builder.passengerCertNo;
            this.passengerCertType = builder.passengerCertType;
            this.passengerId = builder.passengerId;
            this.passengerMobile = builder.passengerMobile;
            this.passengerName = builder.passengerName;
            this.validDateEnd = builder.validDateEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerOpenInfoS create() {
            return builder().build();
        }

        /**
         * @return costCenterInfo
         */
        public CostCenterInfo getCostCenterInfo() {
            return this.costCenterInfo;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return passengerCertNo
         */
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        /**
         * @return passengerCertType
         */
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return passengerMobile
         */
        public String getPassengerMobile() {
            return this.passengerMobile;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return validDateEnd
         */
        public String getValidDateEnd() {
            return this.validDateEnd;
        }

        public static final class Builder {
            private CostCenterInfo costCenterInfo; 
            private String countryCode; 
            private String passengerCertNo; 
            private String passengerCertType; 
            private String passengerId; 
            private String passengerMobile; 
            private String passengerName; 
            private String validDateEnd; 

            private Builder() {
            } 

            private Builder(PassengerOpenInfoS model) {
                this.costCenterInfo = model.costCenterInfo;
                this.countryCode = model.countryCode;
                this.passengerCertNo = model.passengerCertNo;
                this.passengerCertType = model.passengerCertType;
                this.passengerId = model.passengerId;
                this.passengerMobile = model.passengerMobile;
                this.passengerName = model.passengerName;
                this.validDateEnd = model.validDateEnd;
            } 

            /**
             * cost_center_info.
             */
            public Builder costCenterInfo(CostCenterInfo costCenterInfo) {
                this.costCenterInfo = costCenterInfo;
                return this;
            }

            /**
             * country_code.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
             */
            public Builder passengerCertNo(String passengerCertNo) {
                this.passengerCertNo = passengerCertNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
             */
            public Builder passengerCertType(String passengerCertType) {
                this.passengerCertType = passengerCertType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>b6a6fc1bdf1ba60e25c2e132b612c8819</p>
             */
            public Builder passengerMobile(String passengerMobile) {
                this.passengerMobile = passengerMobile;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * valid_date_end.
             */
            public Builder validDateEnd(String validDateEnd) {
                this.validDateEnd = validDateEnd;
                return this;
            }

            public PassengerOpenInfoS build() {
                return new PassengerOpenInfoS(this);
            } 

        } 

    }
}
