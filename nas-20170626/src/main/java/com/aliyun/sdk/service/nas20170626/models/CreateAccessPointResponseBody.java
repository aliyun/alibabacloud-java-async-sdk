// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The access point.</p>
         */
        public Builder accessPoint(AccessPoint accessPoint) {
            this.accessPoint = accessPoint;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAccessPointResponseBody build() {
            return new CreateAccessPointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAccessPointResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAccessPointResponseBody</p>
     */
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
             * <p>The domain name of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-ie15ydanoz.001014****-w****.cn-hangzhou.nas.aliyuncs.com</p>
             */
            public Builder accessPointDomain(String accessPointDomain) {
                this.accessPointDomain = accessPointDomain;
                return this;
            }

            /**
             * <p>The ID of the access point.</p>
             * 
             * <strong>example:</strong>
             * <p>ap-ie15yd****</p>
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
