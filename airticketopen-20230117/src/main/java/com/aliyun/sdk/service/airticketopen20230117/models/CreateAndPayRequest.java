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
 * {@link CreateAndPayRequest} extends {@link RequestModel}
 *
 * <p>CreateAndPayRequest</p>
 */
public class CreateAndPayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Contact")
    @com.aliyun.core.annotation.Validation(required = true)
    private Contact contact;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalOrderNo")
    private String externalOrderNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Guests")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.List<Guests>> guests;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemOfferId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemOfferId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoomCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer roomCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private CreateAndPayRequest(Builder builder) {
        super(builder);
        this.accountNo = builder.accountNo;
        this.contact = builder.contact;
        this.externalOrderNo = builder.externalOrderNo;
        this.guests = builder.guests;
        this.itemOfferId = builder.itemOfferId;
        this.roomCount = builder.roomCount;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndPayRequest create() {
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
     * @return externalOrderNo
     */
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    /**
     * @return guests
     */
    public java.util.List<java.util.List<Guests>> getGuests() {
        return this.guests;
    }

    /**
     * @return itemOfferId
     */
    public String getItemOfferId() {
        return this.itemOfferId;
    }

    /**
     * @return roomCount
     */
    public Integer getRoomCount() {
        return this.roomCount;
    }

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder extends Request.Builder<CreateAndPayRequest, Builder> {
        private Long accountNo; 
        private Contact contact; 
        private String externalOrderNo; 
        private java.util.List<java.util.List<Guests>> guests; 
        private String itemOfferId; 
        private Integer roomCount; 
        private String tracerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAndPayRequest request) {
            super(request);
            this.accountNo = request.accountNo;
            this.contact = request.contact;
            this.externalOrderNo = request.externalOrderNo;
            this.guests = request.guests;
            this.itemOfferId = request.itemOfferId;
            this.roomCount = request.roomCount;
            this.tracerId = request.tracerId;
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
         * ExternalOrderNo.
         */
        public Builder externalOrderNo(String externalOrderNo) {
            this.putBodyParameter("ExternalOrderNo", externalOrderNo);
            this.externalOrderNo = externalOrderNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder guests(java.util.List<java.util.List<Guests>> guests) {
            String guestsShrink = shrink(guests, "Guests", "json");
            this.putBodyParameter("Guests", guestsShrink);
            this.guests = guests;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>itemOffer_123</p>
         */
        public Builder itemOfferId(String itemOfferId) {
            this.putBodyParameter("ItemOfferId", itemOfferId);
            this.itemOfferId = itemOfferId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roomCount(Integer roomCount) {
            this.putBodyParameter("RoomCount", roomCount);
            this.roomCount = roomCount;
            return this;
        }

        /**
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        public Builder tracerId(String tracerId) {
            this.putBodyParameter("TracerId", tracerId);
            this.tracerId = tracerId;
            return this;
        }

        @Override
        public CreateAndPayRequest build() {
            return new CreateAndPayRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAndPayRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPayRequest</p>
     */
    public static class Contact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("FirstName")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Contact(Builder builder) {
            this.email = builder.email;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.phone = builder.phone;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contact create() {
            return builder().build();
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
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String email; 
            private String firstName; 
            private String lastName; 
            private String phone; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Contact model) {
                this.email = model.email;
                this.firstName = model.firstName;
                this.lastName = model.lastName;
                this.phone = model.phone;
                this.tracerId = model.tracerId;
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
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateAndPayRequest} extends {@link TeaModel}
     *
     * <p>CreateAndPayRequest</p>
     */
    public static class Guests extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstName")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Guests(Builder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Guests create() {
            return builder().build();
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
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String firstName; 
            private String lastName; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Guests model) {
                this.firstName = model.firstName;
                this.lastName = model.lastName;
                this.tracerId = model.tracerId;
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
             * <p>TracerId</p>
             * 
             * <strong>example:</strong>
             * <p>TracerId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Guests build() {
                return new Guests(this);
            } 

        } 

    }
}
