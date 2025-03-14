// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeInstallCodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstallCodesResponseBody</p>
 */
public class DescribeInstallCodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstallCodes")
    private java.util.List<InstallCodes> installCodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstallCodesResponseBody(Builder builder) {
        this.installCodes = builder.installCodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstallCodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return installCodes
     */
    public java.util.List<InstallCodes> getInstallCodes() {
        return this.installCodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstallCodes> installCodes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstallCodesResponseBody model) {
            this.installCodes = model.installCodes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the installation commands.</p>
         */
        public Builder installCodes(java.util.List<InstallCodes> installCodes) {
            this.installCodes = installCodes;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>C0D6119F-92EE-1276-B8B6-C81A7F9D57F5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstallCodesResponseBody build() {
            return new DescribeInstallCodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstallCodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstallCodesResponseBody</p>
     */
    public static class InstallCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaptchaCode")
        private String captchaCode;

        @com.aliyun.core.annotation.NameInMap("ExpiredDate")
        private Long expiredDate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("OnlyImage")
        private Boolean onlyImage;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("PrivateLinkEndpointId")
        private Long privateLinkEndpointId;

        @com.aliyun.core.annotation.NameInMap("ProxyCluster")
        private String proxyCluster;

        @com.aliyun.core.annotation.NameInMap("VendorName")
        private String vendorName;

        private InstallCodes(Builder builder) {
            this.captchaCode = builder.captchaCode;
            this.expiredDate = builder.expiredDate;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.onlyImage = builder.onlyImage;
            this.os = builder.os;
            this.privateLinkEndpointId = builder.privateLinkEndpointId;
            this.proxyCluster = builder.proxyCluster;
            this.vendorName = builder.vendorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstallCodes create() {
            return builder().build();
        }

        /**
         * @return captchaCode
         */
        public String getCaptchaCode() {
            return this.captchaCode;
        }

        /**
         * @return expiredDate
         */
        public Long getExpiredDate() {
            return this.expiredDate;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return onlyImage
         */
        public Boolean getOnlyImage() {
            return this.onlyImage;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return privateLinkEndpointId
         */
        public Long getPrivateLinkEndpointId() {
            return this.privateLinkEndpointId;
        }

        /**
         * @return proxyCluster
         */
        public String getProxyCluster() {
            return this.proxyCluster;
        }

        /**
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        public static final class Builder {
            private String captchaCode; 
            private Long expiredDate; 
            private Long groupId; 
            private String groupName; 
            private Boolean onlyImage; 
            private String os; 
            private Long privateLinkEndpointId; 
            private String proxyCluster; 
            private String vendorName; 

            private Builder() {
            } 

            private Builder(InstallCodes model) {
                this.captchaCode = model.captchaCode;
                this.expiredDate = model.expiredDate;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.onlyImage = model.onlyImage;
                this.os = model.os;
                this.privateLinkEndpointId = model.privateLinkEndpointId;
                this.proxyCluster = model.proxyCluster;
                this.vendorName = model.vendorName;
            } 

            /**
             * <p>The verification code for you to manually install the Security Center agent.</p>
             * 
             * <strong>example:</strong>
             * <p>15v02r</p>
             */
            public Builder captchaCode(String captchaCode) {
                this.captchaCode = captchaCode;
                return this;
            }

            /**
             * <p>The timestamp generated when the commands used to install the Security Center agent expire. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637810007000</p>
             */
            public Builder expiredDate(Long expiredDate) {
                this.expiredDate = expiredDate;
                return this;
            }

            /**
             * <p>The ID of the server group to which the server belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>9165712</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the server group to which the server belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Indicates whether an image is used to install the Security Center agent. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder onlyImage(Boolean onlyImage) {
                this.onlyImage = onlyImage;
                return this;
            }

            /**
             * <p>The operating system of the server. Valid values:</p>
             * <ul>
             * <li><strong>linux</strong></li>
             * <li><strong>windows</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The ID of the PrivateLink endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder privateLinkEndpointId(Long privateLinkEndpointId) {
                this.privateLinkEndpointId = privateLinkEndpointId;
                return this;
            }

            /**
             * <p>The name of the proxy cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>proxy_test</p>
             */
            public Builder proxyCluster(String proxyCluster) {
                this.proxyCluster = proxyCluster;
                return this;
            }

            /**
             * <p>The name of the server provider.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            public InstallCodes build() {
                return new InstallCodes(this);
            } 

        } 

    }
}
