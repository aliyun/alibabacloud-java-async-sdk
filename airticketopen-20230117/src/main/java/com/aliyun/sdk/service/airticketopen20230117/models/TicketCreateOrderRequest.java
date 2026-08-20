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
 * {@link TicketCreateOrderRequest} extends {@link RequestModel}
 *
 * <p>TicketCreateOrderRequest</p>
 */
public class TicketCreateOrderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Contact")
    @com.aliyun.core.annotation.Validation(required = true)
    private Contact contact;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistributorOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String distributorOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderProduct")
    @com.aliyun.core.annotation.Validation(required = true)
    private OrderProduct orderProduct;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer quantity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TotalDistributionPrice")
    @com.aliyun.core.annotation.Validation(required = true)
    private TotalDistributionPrice totalDistributionPrice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Travelers")
    private java.util.List<Travelers> travelers;

    private TicketCreateOrderRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.contact = builder.contact;
        this.distributorOrderId = builder.distributorOrderId;
        this.orderProduct = builder.orderProduct;
        this.quantity = builder.quantity;
        this.totalDistributionPrice = builder.totalDistributionPrice;
        this.travelers = builder.travelers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketCreateOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNo
     */
    public Long getAccountNo() {
        return this.accountNo;
    }

    /**
     * @return contact
     */
    public Contact getContact() {
        return this.contact;
    }

    /**
     * @return distributorOrderId
     */
    public String getDistributorOrderId() {
        return this.distributorOrderId;
    }

    /**
     * @return orderProduct
     */
    public OrderProduct getOrderProduct() {
        return this.orderProduct;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return totalDistributionPrice
     */
    public TotalDistributionPrice getTotalDistributionPrice() {
        return this.totalDistributionPrice;
    }

    /**
     * @return travelers
     */
    public java.util.List<Travelers> getTravelers() {
        return this.travelers;
    }

    public static final class Builder extends Request.Builder<TicketCreateOrderRequest, Builder> {
        private Long accountNo; 
        private Contact contact; 
        private String distributorOrderId; 
        private OrderProduct orderProduct; 
        private Integer quantity; 
        private TotalDistributionPrice totalDistributionPrice; 
        private java.util.List<Travelers> travelers; 

        private Builder() {
            super();
        } 

        private Builder(TicketCreateOrderRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.contact = request.contact;
            this.distributorOrderId = request.distributorOrderId;
            this.orderProduct = request.orderProduct;
            this.quantity = request.quantity;
            this.totalDistributionPrice = request.totalDistributionPrice;
            this.travelers = request.travelers;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder accountNo(Long accountNo) {
            this.putBodyParameter("AccountNo", accountNo);
            this.accountNo = accountNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contact(Contact contact) {
            String contactShrink = shrink(contact, "Contact", "json");
            this.putBodyParameter("Contact", contactShrink);
            this.contact = contact;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder distributorOrderId(String distributorOrderId) {
            this.putBodyParameter("DistributorOrderId", distributorOrderId);
            this.distributorOrderId = distributorOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder orderProduct(OrderProduct orderProduct) {
            String orderProductShrink = shrink(orderProduct, "OrderProduct", "json");
            this.putBodyParameter("OrderProduct", orderProductShrink);
            this.orderProduct = orderProduct;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putBodyParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder totalDistributionPrice(TotalDistributionPrice totalDistributionPrice) {
            String totalDistributionPriceShrink = shrink(totalDistributionPrice, "TotalDistributionPrice", "json");
            this.putBodyParameter("TotalDistributionPrice", totalDistributionPriceShrink);
            this.totalDistributionPrice = totalDistributionPrice;
            return this;
        }

        /**
         * Travelers.
         */
        public Builder travelers(java.util.List<Travelers> travelers) {
            String travelersShrink = shrink(travelers, "Travelers", "json");
            this.putBodyParameter("Travelers", travelersShrink);
            this.travelers = travelers;
            return this;
        }

        @Override
        public TicketCreateOrderRequest build() {
            return new TicketCreateOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link TicketCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>TicketCreateOrderRequest</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateNo")
        private String certificateNo;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private Integer certificateType;

        @com.aliyun.core.annotation.NameInMap("DialingCode")
        private String dialingCode;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("FirstName")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Contact(Builder builder) {
            this.certificateNo = builder.certificateNo;
            this.certificateType = builder.certificateType;
            this.dialingCode = builder.dialingCode;
            this.email = builder.email;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.mobile = builder.mobile;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
        }

        /**
         * @return certificateNo
         */
        public String getCertificateNo() {
            return this.certificateNo;
        }

        /**
         * @return certificateType
         */
        public Integer getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return dialingCode
         */
        public String getDialingCode() {
            return this.dialingCode;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String certificateNo; 
            private Integer certificateType; 
            private String dialingCode; 
            private String email; 
            private String firstName; 
            private String lastName; 
            private String mobile; 
            private String name; 

            private Builder() {
            } 

            private Builder(Contact model) {
                this.certificateNo = model.certificateNo;
                this.certificateType = model.certificateType;
                this.dialingCode = model.dialingCode;
                this.email = model.email;
                this.firstName = model.firstName;
                this.lastName = model.lastName;
                this.mobile = model.mobile;
                this.name = model.name;
            } 

            /**
             * CertificateNo.
             */
            public Builder certificateNo(String certificateNo) {
                this.certificateNo = certificateNo;
                return this;
            }

            /**
             * CertificateType.
             */
            public Builder certificateType(Integer certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * DialingCode.
             */
            public Builder dialingCode(String dialingCode) {
                this.dialingCode = dialingCode;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * FirstName.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * LastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>TicketCreateOrderRequest</p>
     */
    public static class DistributionPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String currencyCode;

        private DistributionPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistributionPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(DistributionPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public DistributionPrice build() {
                return new DistributionPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>TicketCreateOrderRequest</p>
     */
    public static class OrderProduct extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributionPrice")
        @com.aliyun.core.annotation.Validation(required = true)
        private DistributionPrice distributionPrice;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productId;

        @com.aliyun.core.annotation.NameInMap("TravelDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String travelDate;

        private OrderProduct(Builder builder) {
            this.distributionPrice = builder.distributionPrice;
            this.productId = builder.productId;
            this.travelDate = builder.travelDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderProduct create() {
            return builder().build();
        }

        /**
         * @return distributionPrice
         */
        public DistributionPrice getDistributionPrice() {
            return this.distributionPrice;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return travelDate
         */
        public String getTravelDate() {
            return this.travelDate;
        }

        public static final class Builder {
            private DistributionPrice distributionPrice; 
            private String productId; 
            private String travelDate; 

            private Builder() {
            } 

            private Builder(OrderProduct model) {
                this.distributionPrice = model.distributionPrice;
                this.productId = model.productId;
                this.travelDate = model.travelDate;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder distributionPrice(DistributionPrice distributionPrice) {
                this.distributionPrice = distributionPrice;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-01</p>
             */
            public Builder travelDate(String travelDate) {
                this.travelDate = travelDate;
                return this;
            }

            public OrderProduct build() {
                return new OrderProduct(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>TicketCreateOrderRequest</p>
     */
    public static class TotalDistributionPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long amount;

        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String currencyCode;

        private TotalDistributionPrice(Builder builder) {
            this.amount = builder.amount;
            this.currencyCode = builder.currencyCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalDistributionPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public static final class Builder {
            private Long amount; 
            private String currencyCode; 

            private Builder() {
            } 

            private Builder(TotalDistributionPrice model) {
                this.amount = model.amount;
                this.currencyCode = model.currencyCode;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder amount(Long amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>USD</p>
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            public TotalDistributionPrice build() {
                return new TotalDistributionPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketCreateOrderRequest} extends {@link TeaModel}
     *
     * <p>TicketCreateOrderRequest</p>
     */
    public static class Travelers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Birthday")
        private String birthday;

        @com.aliyun.core.annotation.NameInMap("CertificateNo")
        private String certificateNo;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private Integer certificateType;

        @com.aliyun.core.annotation.NameInMap("DialingCode")
        private String dialingCode;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("FirstName")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private Integer gender;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Nationality")
        private String nationality;

        private Travelers(Builder builder) {
            this.birthday = builder.birthday;
            this.certificateNo = builder.certificateNo;
            this.certificateType = builder.certificateType;
            this.dialingCode = builder.dialingCode;
            this.email = builder.email;
            this.firstName = builder.firstName;
            this.gender = builder.gender;
            this.lastName = builder.lastName;
            this.mobile = builder.mobile;
            this.name = builder.name;
            this.nationality = builder.nationality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Travelers create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return certificateNo
         */
        public String getCertificateNo() {
            return this.certificateNo;
        }

        /**
         * @return certificateType
         */
        public Integer getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return dialingCode
         */
        public String getDialingCode() {
            return this.dialingCode;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
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
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        public static final class Builder {
            private String birthday; 
            private String certificateNo; 
            private Integer certificateType; 
            private String dialingCode; 
            private String email; 
            private String firstName; 
            private Integer gender; 
            private String lastName; 
            private String mobile; 
            private String name; 
            private String nationality; 

            private Builder() {
            } 

            private Builder(Travelers model) {
                this.birthday = model.birthday;
                this.certificateNo = model.certificateNo;
                this.certificateType = model.certificateType;
                this.dialingCode = model.dialingCode;
                this.email = model.email;
                this.firstName = model.firstName;
                this.gender = model.gender;
                this.lastName = model.lastName;
                this.mobile = model.mobile;
                this.name = model.name;
                this.nationality = model.nationality;
            } 

            /**
             * Birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * CertificateNo.
             */
            public Builder certificateNo(String certificateNo) {
                this.certificateNo = certificateNo;
                return this;
            }

            /**
             * CertificateType.
             */
            public Builder certificateType(Integer certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * DialingCode.
             */
            public Builder dialingCode(String dialingCode) {
                this.dialingCode = dialingCode;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * FirstName.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * LastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            public Travelers build() {
                return new Travelers(this);
            } 

        } 

    }
}
