// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOfficeSitesResponseBody</p>
 */
public class DescribeOfficeSitesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OfficeSites")
    private java.util.List<OfficeSites> officeSites;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return officeSites
     */
    public java.util.List<OfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OfficeSites> officeSites; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOfficeSitesResponseBody model) {
            this.officeSites = model.officeSites;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The office networks.</p>
         */
        public Builder officeSites(java.util.List<OfficeSites> officeSites) {
            this.officeSites = officeSites;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOfficeSitesResponseBody build() {
            return new DescribeOfficeSitesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOfficeSitesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOfficeSitesResponseBody</p>
     */
    public static class OfficeSites extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private Integer bizType;

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
            this.aliUid = builder.aliUid;
            this.bizType = builder.bizType;
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
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bizType
         */
        public Integer getBizType() {
            return this.bizType;
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
            private Long aliUid; 
            private Integer bizType; 
            private String desktopAccessType; 
            private String desktopVpcEndpoint; 
            private String officeSiteId; 
            private String officeSiteType; 
            private String providerId; 
            private String ssoServiceUrl; 

            private Builder() {
            } 

            private Builder(OfficeSites model) {
                this.aliUid = model.aliUid;
                this.bizType = model.bizType;
                this.desktopAccessType = model.desktopAccessType;
                this.desktopVpcEndpoint = model.desktopVpcEndpoint;
                this.officeSiteId = model.officeSiteId;
                this.officeSiteType = model.officeSiteType;
                this.providerId = model.providerId;
                this.ssoServiceUrl = model.ssoServiceUrl;
            } 

            /**
             * <p>aliuid</p>
             * 
             * <strong>example:</strong>
             * <p>125552</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>biztype</p>
             * 
             * <strong>example:</strong>
             * <p>ENTERPRISE</p>
             */
            public Builder bizType(Integer bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The allowed connection types for accessing the office network.</p>
             * <blockquote>
             * <p>The VPC connection type depends on the Alibaba Cloud PrivateLink service, which incurs no fee. When this parameter is set to VPC or Any, the system automatically enables the PrivateLink service for you.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder desktopAccessType(String desktopAccessType) {
                this.desktopAccessType = desktopAccessType;
                return this;
            }

            /**
             * <p>The endpoint used when connecting to cloud desktops through a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com">http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com</a></p>
             */
            public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
                this.desktopVpcEndpoint = desktopVpcEndpoint;
                return this;
            }

            /**
             * <p>Office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-363353****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The type of account system used by the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder officeSiteType(String officeSiteType) {
                this.officeSiteType = officeSiteType;
                return this;
            }

            /**
             * <p>User Account BID.</p>
             * 
             * <strong>example:</strong>
             * <p>268****</p>
             */
            public Builder providerId(String providerId) {
                this.providerId = providerId;
                return this;
            }

            /**
             * <p>SSO connection.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eds-cn-shanghai-67">https://eds-cn-shanghai-67</a>****</p>
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
