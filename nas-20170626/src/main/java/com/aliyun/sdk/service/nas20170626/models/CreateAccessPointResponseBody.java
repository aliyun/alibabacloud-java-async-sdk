// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessPointResponseBody</p>
 */
public class CreateAccessPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPoint")
    private AccessPoint accessPoint;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAccessPointResponseBody(Builder builder) {
        this.accessPoint = builder.accessPoint;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessPointResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessPoint
     */
    public AccessPoint getAccessPoint() {
        return this.accessPoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AccessPoint accessPoint; 
        private String requestId; 

        /**
         * The access point.
         */
        public Builder accessPoint(AccessPoint accessPoint) {
            this.accessPoint = accessPoint;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessPointResponseBody build() {
            return new CreateAccessPointResponseBody(this);
        } 

    } 

    public static class AccessPoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessPointDomain")
        private String accessPointDomain;

        @com.aliyun.core.annotation.NameInMap("AccessPointId")
        private String accessPointId;

        private AccessPoint(Builder builder) {
            this.accessPointDomain = builder.accessPointDomain;
            this.accessPointId = builder.accessPointId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPoint create() {
            return builder().build();
        }

        /**
         * @return accessPointDomain
         */
        public String getAccessPointDomain() {
            return this.accessPointDomain;
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public static final class Builder {
            private String accessPointDomain; 
            private String accessPointId; 

            /**
             * The domain name of the access point.
             */
            public Builder accessPointDomain(String accessPointDomain) {
                this.accessPointDomain = accessPointDomain;
                return this;
            }

            /**
             * The ID of the access point.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            public AccessPoint build() {
                return new AccessPoint(this);
            } 

        } 

    }
}
