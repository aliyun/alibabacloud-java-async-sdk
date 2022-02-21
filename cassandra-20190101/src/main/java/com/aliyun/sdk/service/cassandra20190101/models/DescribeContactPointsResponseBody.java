// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactPointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContactPointsResponseBody</p>
 */
public class DescribeContactPointsResponseBody extends TeaModel {
    @NameInMap("ContactPoints")
    private ContactPoints contactPoints;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeContactPointsResponseBody(Builder builder) {
        this.contactPoints = builder.contactPoints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return contactPoints
     */
    public ContactPoints getContactPoints() {
        return this.contactPoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ContactPoints contactPoints; 
        private String requestId; 

        /**
         * ContactPoints.
         */
        public Builder contactPoints(ContactPoints contactPoints) {
            this.contactPoints = contactPoints;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContactPointsResponseBody build() {
            return new DescribeContactPointsResponseBody(this);
        } 

    } 

    public static class PrivateAddresses extends TeaModel {
        @NameInMap("PrivateAddress")
        private java.util.List < String > privateAddress;

        private PrivateAddresses(Builder builder) {
            this.privateAddress = builder.privateAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateAddresses create() {
            return builder().build();
        }

        /**
         * @return privateAddress
         */
        public java.util.List < String > getPrivateAddress() {
            return this.privateAddress;
        }

        public static final class Builder {
            private java.util.List < String > privateAddress; 

            /**
             * PrivateAddress.
             */
            public Builder privateAddress(java.util.List < String > privateAddress) {
                this.privateAddress = privateAddress;
                return this;
            }

            public PrivateAddresses build() {
                return new PrivateAddresses(this);
            } 

        } 

    }
    public static class PublicAddresses extends TeaModel {
        @NameInMap("PublicAddress")
        private java.util.List < String > publicAddress;

        private PublicAddresses(Builder builder) {
            this.publicAddress = builder.publicAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicAddresses create() {
            return builder().build();
        }

        /**
         * @return publicAddress
         */
        public java.util.List < String > getPublicAddress() {
            return this.publicAddress;
        }

        public static final class Builder {
            private java.util.List < String > publicAddress; 

            /**
             * PublicAddress.
             */
            public Builder publicAddress(java.util.List < String > publicAddress) {
                this.publicAddress = publicAddress;
                return this;
            }

            public PublicAddresses build() {
                return new PublicAddresses(this);
            } 

        } 

    }
    public static class ContactPoint extends TeaModel {
        @NameInMap("DataCenterId")
        private String dataCenterId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("PrivateAddresses")
        private PrivateAddresses privateAddresses;

        @NameInMap("PublicAddresses")
        private PublicAddresses publicAddresses;

        private ContactPoint(Builder builder) {
            this.dataCenterId = builder.dataCenterId;
            this.port = builder.port;
            this.privateAddresses = builder.privateAddresses;
            this.publicAddresses = builder.publicAddresses;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactPoint create() {
            return builder().build();
        }

        /**
         * @return dataCenterId
         */
        public String getDataCenterId() {
            return this.dataCenterId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return privateAddresses
         */
        public PrivateAddresses getPrivateAddresses() {
            return this.privateAddresses;
        }

        /**
         * @return publicAddresses
         */
        public PublicAddresses getPublicAddresses() {
            return this.publicAddresses;
        }

        public static final class Builder {
            private String dataCenterId; 
            private Integer port; 
            private PrivateAddresses privateAddresses; 
            private PublicAddresses publicAddresses; 

            /**
             * DataCenterId.
             */
            public Builder dataCenterId(String dataCenterId) {
                this.dataCenterId = dataCenterId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * PrivateAddresses.
             */
            public Builder privateAddresses(PrivateAddresses privateAddresses) {
                this.privateAddresses = privateAddresses;
                return this;
            }

            /**
             * PublicAddresses.
             */
            public Builder publicAddresses(PublicAddresses publicAddresses) {
                this.publicAddresses = publicAddresses;
                return this;
            }

            public ContactPoint build() {
                return new ContactPoint(this);
            } 

        } 

    }
    public static class ContactPoints extends TeaModel {
        @NameInMap("ContactPoint")
        private java.util.List < ContactPoint> contactPoint;

        private ContactPoints(Builder builder) {
            this.contactPoint = builder.contactPoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactPoints create() {
            return builder().build();
        }

        /**
         * @return contactPoint
         */
        public java.util.List < ContactPoint> getContactPoint() {
            return this.contactPoint;
        }

        public static final class Builder {
            private java.util.List < ContactPoint> contactPoint; 

            /**
             * ContactPoint.
             */
            public Builder contactPoint(java.util.List < ContactPoint> contactPoint) {
                this.contactPoint = contactPoint;
                return this;
            }

            public ContactPoints build() {
                return new ContactPoints(this);
            } 

        } 

    }
}
