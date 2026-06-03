// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link DescribeLoginTicketResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoginTicketResponseBody</p>
 */
public class DescribeLoginTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginTicket")
    private LoginTicket loginTicket;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLoginTicketResponseBody(Builder builder) {
        this.loginTicket = builder.loginTicket;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoginTicketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginTicket
     */
    public LoginTicket getLoginTicket() {
        return this.loginTicket;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LoginTicket loginTicket; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLoginTicketResponseBody model) {
            this.loginTicket = model.loginTicket;
            this.requestId = model.requestId;
        } 

        /**
         * LoginTicket.
         */
        public Builder loginTicket(LoginTicket loginTicket) {
            this.loginTicket = loginTicket;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLoginTicketResponseBody build() {
            return new DescribeLoginTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoginTicketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoginTicketResponseBody</p>
     */
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.localName = builder.localName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String localName; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Zones model) {
                this.localName = model.localName;
                this.zoneId = model.zoneId;
            } 

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoginTicketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoginTicketResponseBody</p>
     */
    public static class LoginTicket extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificate")
        private String certificate;

        @com.aliyun.core.annotation.NameInMap("Ticket")
        private String ticket;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<Zones> zones;

        private LoginTicket(Builder builder) {
            this.certificate = builder.certificate;
            this.ticket = builder.ticket;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginTicket create() {
            return builder().build();
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return ticket
         */
        public String getTicket() {
            return this.ticket;
        }

        /**
         * @return zones
         */
        public java.util.List<Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String certificate; 
            private String ticket; 
            private java.util.List<Zones> zones; 

            private Builder() {
            } 

            private Builder(LoginTicket model) {
                this.certificate = model.certificate;
                this.ticket = model.ticket;
                this.zones = model.zones;
            } 

            /**
             * Certificate.
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * Ticket.
             */
            public Builder ticket(String ticket) {
                this.ticket = ticket;
                return this;
            }

            /**
             * Zones.
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public LoginTicket build() {
                return new LoginTicket(this);
            } 

        } 

    }
}
