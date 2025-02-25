// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
         * <p>request ID</p>
         * 
         * <strong>example:</strong>
         * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>error code</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>error data</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * <p>error message</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>http reqeust has been processed successfully，status code is 200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>true represents success, false represents failure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public OrderListResponseBody build() {
            return new OrderListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OrderListResponseBody} extends {@link TeaModel}
     *
     * <p>OrderListResponseBody</p>
     */
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
             * <p>issuing place (two-letter code)</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder certIssuePlace(String certIssuePlace) {
                this.certIssuePlace = certIssuePlace;
                return this;
            }

            /**
             * <p>credential number</p>
             * 
             * <strong>example:</strong>
             * <p>E1***5674</p>
             */
            public Builder credentialNum(String credentialNum) {
                this.credentialNum = credentialNum;
                return this;
            }

            /**
             * <p>credential type , only support &quot;1&quot;(1 means passport) currently.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder credentialType(Integer credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * <p>credential expiration date</p>
             * 
             * <strong>example:</strong>
             * <p>20290101</p>
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
    /**
     * 
     * {@link OrderListResponseBody} extends {@link TeaModel}
     *
     * <p>OrderListResponseBody</p>
     */
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
             * <p>date of birth (yyyyMMdd)</p>
             * 
             * <strong>example:</strong>
             * <p>20020301</p>
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * <p>credential</p>
             */
            public Builder credential(Credential credential) {
                this.credential = credential;
                return this;
            }

            /**
             * <p>first name</p>
             * 
             * <strong>example:</strong>
             * <p>SAN</p>
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * <p>gender 0: MALE; 1: FEMALE</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * <p>last name</p>
             * 
             * <strong>example:</strong>
             * <p>ZHANG</p>
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * <p>mobile country code</p>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * <p>mobile phone number</p>
             * 
             * <strong>example:</strong>
             * <p>183******96</p>
             */
            public Builder mobilePhoneNumber(String mobilePhoneNumber) {
                this.mobilePhoneNumber = mobilePhoneNumber;
                return this;
            }

            /**
             * <p>nationality (two-letter code)</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * <p>passenger type 0: adult; 1: child; 8: infant</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link OrderListResponseBody} extends {@link TeaModel}
     *
     * <p>OrderListResponseBody</p>
     */
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
        private java.util.List<PassengerList> passengerList;

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
        public java.util.List<PassengerList> getPassengerList() {
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
            private java.util.List<PassengerList> passengerList; 
            private String payStatus; 
            private Long payTime; 
            private Double promotionPrice; 
            private Double realPayPrice; 
            private String sessionNick; 
            private Long succeedTime; 
            private Double totalPrice; 
            private String transactionNo; 

            /**
             * <p>book time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677210784000</p>
             */
            public Builder bookTime(Long bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * <p>order number created by book</p>
             * 
             * <strong>example:</strong>
             * <p>4966***617111</p>
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>order status</p>
             * <p>1: order reservation in process</p>
             * <p>2: order reservation successful</p>
             * <p>3: order paid</p>
             * <p>4: order successful</p>
             * <p>5: order closed</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * <p>external order number(customized by buyer when book)</p>
             * 
             * <strong>example:</strong>
             * <p>x091-2023-0220-j-0001</p>
             */
            public Builder outOrderNum(String outOrderNum) {
                this.outOrderNum = outOrderNum;
                return this;
            }

            /**
             * <p>the information about all passenger of current order</p>
             */
            public Builder passengerList(java.util.List<PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * <p>payment status</p>
             * <p>1: payment in process</p>
             * <p>2: deduction successful</p>
             * <p>3: paid to the seller</p>
             * <p>4: transaction closed</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder payStatus(String payStatus) {
                this.payStatus = payStatus;
                return this;
            }

            /**
             * <p>pay time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677210788000</p>
             */
            public Builder payTime(Long payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * <p>discount amount</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder promotionPrice(Double promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * <p>actual payment amount</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder realPayPrice(Double realPayPrice) {
                this.realPayPrice = realPayPrice;
                return this;
            }

            /**
             * <p>buyer nickname</p>
             * 
             * <strong>example:</strong>
             * <p>nick</p>
             */
            public Builder sessionNick(String sessionNick) {
                this.sessionNick = sessionNick;
                return this;
            }

            /**
             * <p>order success time(timestamp)</p>
             * 
             * <strong>example:</strong>
             * <p>1677210786000</p>
             */
            public Builder succeedTime(Long succeedTime) {
                this.succeedTime = succeedTime;
                return this;
            }

            /**
             * <p>total price of current order</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder totalPrice(Double totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * <p>transaction number</p>
             * 
             * <strong>example:</strong>
             * <p>hkduendkd-2023-dj0</p>
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
    /**
     * 
     * {@link OrderListResponseBody} extends {@link TeaModel}
     *
     * <p>OrderListResponseBody</p>
     */
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
             * <p>current page index</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>the number of total orders</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>the number of total pages</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link OrderListResponseBody} extends {@link TeaModel}
     *
     * <p>OrderListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Pagination pagination; 

            /**
             * <p>order list</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>information of pagination</p>
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
