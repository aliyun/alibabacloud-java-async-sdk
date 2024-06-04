// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSitesResponseBody</p>
 */
public class DescribeOfficeSitesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OfficeSites")
    private java.util.List < OfficeSites> officeSites;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOfficeSitesResponseBody(Builder builder) {
        this.officeSites = builder.officeSites;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOfficeSitesResponseBody create() {
        return builder().build();
    }

    /**
     * @return officeSites
     */
    public java.util.List < OfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OfficeSites> officeSites; 
        private String requestId; 

        /**
         * OfficeSites.
         */
        public Builder officeSites(java.util.List < OfficeSites> officeSites) {
            this.officeSites = officeSites;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOfficeSitesResponseBody build() {
            return new DescribeOfficeSitesResponseBody(this);
        } 

    } 

    public static class OfficeSites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopAccessType")
        private String desktopAccessType;

        @com.aliyun.core.annotation.NameInMap("DesktopVpcEndpoint")
        private String desktopVpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteType")
        private String officeSiteType;

        @com.aliyun.core.annotation.NameInMap("ProviderId")
        private String providerId;

        @com.aliyun.core.annotation.NameInMap("SsoServiceUrl")
        private String ssoServiceUrl;

        private OfficeSites(Builder builder) {
            this.desktopAccessType = builder.desktopAccessType;
            this.desktopVpcEndpoint = builder.desktopVpcEndpoint;
            this.officeSiteId = builder.officeSiteId;
            this.officeSiteType = builder.officeSiteType;
            this.providerId = builder.providerId;
            this.ssoServiceUrl = builder.ssoServiceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfficeSites create() {
            return builder().build();
        }

        /**
         * @return desktopAccessType
         */
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        /**
         * @return desktopVpcEndpoint
         */
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return officeSiteType
         */
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        /**
         * @return providerId
         */
        public String getProviderId() {
            return this.providerId;
        }

        /**
         * @return ssoServiceUrl
         */
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

        public static final class Builder {
            private String desktopAccessType; 
            private String desktopVpcEndpoint; 
            private String officeSiteId; 
            private String officeSiteType; 
            private String providerId; 
            private String ssoServiceUrl; 

            /**
             * DesktopAccessType.
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * DesktopVpcEndpoint.
             */
            public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
                this.desktopVpcEndpoint = desktopVpcEndpoint;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * OfficeSiteType.
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * ProviderId.
             */
            public Builder providerId(String providerId) {
                this.providerId = providerId;
                return this;
            }

            /**
             * SsoServiceUrl.
             */
            public Builder ssoServiceUrl(String ssoServiceUrl) {
                this.ssoServiceUrl = ssoServiceUrl;
                return this;
            }

            public OfficeSites build() {
                return new OfficeSites(this);
            } 

        } 

    }
}
