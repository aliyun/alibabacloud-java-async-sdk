// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link AddDeviceBelongIdentifiersRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceBelongIdentifiersRequest</p>
 */
public class AddDeviceBelongIdentifiersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Identifiers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Identifiers> identifiers;

    private AddDeviceBelongIdentifiersRequest(Builder builder) {
        super(builder);
        this.identifiers = builder.identifiers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceBelongIdentifiersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifiers
     */
    public java.util.List<Identifiers> getIdentifiers() {
        return this.identifiers;
    }

    public static final class Builder extends Request.Builder<AddDeviceBelongIdentifiersRequest, Builder> {
        private java.util.List<Identifiers> identifiers; 

        private Builder() {
            super();
        } 

        private Builder(AddDeviceBelongIdentifiersRequest request) {
            super(request);
            this.identifiers = request.identifiers;
        } 

        /**
         * <p>The list of device ownership identifiers to add. Each batch supports 1 to 1,000 items. Each item must include IdentifierType and IdentifierValue.</p>
         * <p>This parameter is required.</p>
         */
        public Builder identifiers(java.util.List<Identifiers> identifiers) {
            this.putBodyParameter("Identifiers", identifiers);
            this.identifiers = identifiers;
            return this;
        }

        @Override
        public AddDeviceBelongIdentifiersRequest build() {
            return new AddDeviceBelongIdentifiersRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDeviceBelongIdentifiersRequest} extends {@link TeaModel}
     *
     * <p>AddDeviceBelongIdentifiersRequest</p>
     */
    public static class Identifiers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdentifierType")
        private String identifierType;

        @com.aliyun.core.annotation.NameInMap("IdentifierValue")
        private String identifierValue;

        private Identifiers(Builder builder) {
            this.identifierType = builder.identifierType;
            this.identifierValue = builder.identifierValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identifiers create() {
            return builder().build();
        }

        /**
         * @return identifierType
         */
        public String getIdentifierType() {
            return this.identifierType;
        }

        /**
         * @return identifierValue
         */
        public String getIdentifierValue() {
            return this.identifierValue;
        }

        public static final class Builder {
            private String identifierType; 
            private String identifierValue; 

            private Builder() {
            } 

            private Builder(Identifiers model) {
                this.identifierType = model.identifierType;
                this.identifierValue = model.identifierValue;
            } 

            /**
             * <p>The identifier type. MAC indicates a network interface controller (NIC) MAC address, SystemSN indicates a system serial number, and BIOSSN indicates a BIOS serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>MAC</p>
             */
            public Builder identifierType(String identifierType) {
                this.identifierType = identifierType;
                return this;
            }

            /**
             * <p>The identifier value. A MAC address must be a 6-byte address. A system serial number accepts 1 to 64 characters, and a BIOS serial number accepts 1 to 128 characters. MAC addresses are converted to the lowercase colon-separated format when stored, while system serial numbers and BIOS serial numbers retain their original values.</p>
             * 
             * <strong>example:</strong>
             * <p>02:00:00:00:00:01</p>
             */
            public Builder identifierValue(String identifierValue) {
                this.identifierValue = identifierValue;
                return this;
            }

            public Identifiers build() {
                return new Identifiers(this);
            } 

        } 

    }
}
