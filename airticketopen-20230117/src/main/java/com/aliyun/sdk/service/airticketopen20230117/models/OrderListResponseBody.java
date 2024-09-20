// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderListResponseBody} extends {@link TeaModel}
 *
 * <p>OrderListResponseBody</p>
 */
public class OrderListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_data")
    private Object errorData;

    @com.aliyun.core.annotation.NameInMap("error_msg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private OrderListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public Object getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 
        private String errorCode; 
        private Object errorData; 
        private String errorMsg; 
        private Integer status; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_data.
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * error_msg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OrderListResponseBody build() {
            return new OrderListResponseBody(this);
        } 

    } 

    public static class Credential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cert_issue_place")
        private String certIssuePlace;

        @com.aliyun.core.annotation.NameInMap("credential_num")
        private String credentialNum;

        @com.aliyun.core.annotation.NameInMap("credential_type")
        private Integer credentialType;

        @com.aliyun.core.annotation.NameInMap("expire_date")
        private String expireDate;

        private Credential(Builder builder) {
            this.certIssuePlace = builder.certIssuePlace;
            this.credentialNum = builder.credentialNum;
            this.credentialType = builder.credentialType;
            this.expireDate = builder.expireDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credential create() {
            return builder().build();
        }

        /**
         * @return certIssuePlace
         */
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        /**
         * @return credentialNum
         */
        public String getCredentialNum() {
            return this.credentialNum;
        }

        /**
         * @return credentialType
         */
        public Integer getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        public static final class Builder {
            private String certIssuePlace; 
            private String credentialNum; 
            private Integer credentialType; 
            private String expireDate; 

            /**
             * cert_issue_place.
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * credential_num.
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * credential_type.
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * expire_date.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            public Credential build() {
                return new Credential(this);
            } 

        } 

    }
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("credential")
        private Credential credential;

        @com.aliyun.core.annotation.NameInMap("first_name")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("last_name")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @com.aliyun.core.annotation.NameInMap("mobile_phone_number")
        private String mobilePhoneNumber;

        @com.aliyun.core.annotation.NameInMap("nationality")
        private String nationality;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.credential = builder.credential;
            this.firstName = builder.firstName;
            this.gender = builder.gender;
            this.lastName = builder.lastName;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.mobilePhoneNumber = builder.mobilePhoneNumber;
            this.nationality = builder.nationality;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return credential
         */
        public Credential getCredential() {
            return this.credential;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return mobileCountryCode
         */
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        /**
         * @return mobilePhoneNumber
         */
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String birthday; 
            private Credential credential; 
            private String firstName; 
            private Integer gender; 
            private String lastName; 
            private String mobileCountryCode; 
            private String mobilePhoneNumber; 
            private String nationality; 
            private Integer type; 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * credential.
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
                return this;
            }

            /**
             * first_name.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * last_name.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * mobile_country_code.
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * mobile_phone_number.
             */
            public Builder mobilePhoneNumber(String mobilePhoneNumber) {
                this.mobilePhoneNumber = mobilePhoneNumber;
                return this;
            }

            /**
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("book_time")
        private Long bookTime;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private String orderStatus;

        @com.aliyun.core.annotation.NameInMap("out_order_num")
        private String outOrderNum;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List < PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("pay_status")
        private String payStatus;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private Long payTime;

        @com.aliyun.core.annotation.NameInMap("promotion_price")
        private Double promotionPrice;

        @com.aliyun.core.annotation.NameInMap("real_pay_price")
        private Double realPayPrice;

        @com.aliyun.core.annotation.NameInMap("session_nick")
        private String sessionNick;

        @com.aliyun.core.annotation.NameInMap("succeed_time")
        private Long succeedTime;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private Double totalPrice;

        @com.aliyun.core.annotation.NameInMap("transaction_no")
        private String transactionNo;

        private List(Builder builder) {
            this.bookTime = builder.bookTime;
            this.orderNum = builder.orderNum;
            this.orderStatus = builder.orderStatus;
            this.outOrderNum = builder.outOrderNum;
            this.passengerList = builder.passengerList;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.promotionPrice = builder.promotionPrice;
            this.realPayPrice = builder.realPayPrice;
            this.sessionNick = builder.sessionNick;
            this.succeedTime = builder.succeedTime;
            this.totalPrice = builder.totalPrice;
            this.transactionNo = builder.transactionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return bookTime
         */
        public Long getBookTime() {
            return this.bookTime;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return outOrderNum
         */
        public String getOutOrderNum() {
            return this.outOrderNum;
        }

        /**
         * @return passengerList
         */
        public java.util.List < PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return payStatus
         */
        public String getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return payTime
         */
        public Long getPayTime() {
            return this.payTime;
        }

        /**
         * @return promotionPrice
         */
        public Double getPromotionPrice() {
            return this.promotionPrice;
        }

        /**
         * @return realPayPrice
         */
        public Double getRealPayPrice() {
            return this.realPayPrice;
        }

        /**
         * @return sessionNick
         */
        public String getSessionNick() {
            return this.sessionNick;
        }

        /**
         * @return succeedTime
         */
        public Long getSucceedTime() {
            return this.succeedTime;
        }

        /**
         * @return totalPrice
         */
        public Double getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return transactionNo
         */
        public String getTransactionNo() {
            return this.transactionNo;
        }

        public static final class Builder {
            private Long bookTime; 
            private Long orderNum; 
            private String orderStatus; 
            private String outOrderNum; 
            private java.util.List < PassengerList> passengerList; 
            private String payStatus; 
            private Long payTime; 
            private Double promotionPrice; 
            private Double realPayPrice; 
            private String sessionNick; 
            private Long succeedTime; 
            private Double totalPrice; 
            private String transactionNo; 

            /**
             * book_time.
             */
            public Builder bookTime(Long bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * order_num.
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * out_order_num.
             */
            public Builder outOrderNum(String outOrderNum) {
                this.outOrderNum = outOrderNum;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List < PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * pay_status.
             */
            public Builder payStatus(String payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(Long payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * promotion_price.
             */
            public Builder promotionPrice(Double promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * real_pay_price.
             */
            public Builder realPayPrice(Double realPayPrice) {
                this.realPayPrice = realPayPrice;
                return this;
            }

            /**
             * session_nick.
             */
            public Builder sessionNick(String sessionNick) {
                this.sessionNick = sessionNick;
                return this;
            }

            /**
             * succeed_time.
             */
            public Builder succeedTime(Long succeedTime) {
                this.succeedTime = succeedTime;
                return this;
            }

            /**
             * total_price.
             */
            public Builder totalPrice(Double totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * transaction_no.
             */
            public Builder transactionNo(String transactionNo) {
                this.transactionNo = transactionNo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("current_page")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("total_page")
        private Integer totalPage;

        private Pagination(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPage; 

            /**
             * current_page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_count.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * total_page.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("pagination")
        private Pagination pagination;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
