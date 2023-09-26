// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstallCodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstallCodesResponseBody</p>
 */
public class DescribeInstallCodesResponseBody extends TeaModel {
    @NameInMap("InstallCodes")
    private java.util.List < InstallCodes> installCodes;

    @NameInMap("RequestId")
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

    /**
     * @return installCodes
     */
    public java.util.List < InstallCodes> getInstallCodes() {
        return this.installCodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstallCodes> installCodes; 
        private String requestId; 

        /**
         * The information about the installation commands.
         */
        public Builder installCodes(java.util.List < InstallCodes> installCodes) {
            this.installCodes = installCodes;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstallCodesResponseBody build() {
            return new DescribeInstallCodesResponseBody(this);
        } 

    } 

    public static class InstallCodes extends TeaModel {
        @NameInMap("CaptchaCode")
        private String captchaCode;

        @NameInMap("ExpiredDate")
        private Long expiredDate;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("OnlyImage")
        private Boolean onlyImage;

        @NameInMap("Os")
        private String os;

        @NameInMap("ProxyCluster")
        private String proxyCluster;

        @NameInMap("VendorName")
        private String vendorName;

        private InstallCodes(Builder builder) {
            this.captchaCode = builder.captchaCode;
            this.expiredDate = builder.expiredDate;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.onlyImage = builder.onlyImage;
            this.os = builder.os;
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
            private String proxyCluster; 
            private String vendorName; 

            /**
             * The verification code for you to manually install the Security Center agent.
             */
            public Builder captchaCode(String captchaCode) {
                this.captchaCode = captchaCode;
                return this;
            }

            /**
             * The timestamp generated when the commands used to install the Security Center agent expire. Unit: milliseconds.
             */
            public Builder expiredDate(Long expiredDate) {
                this.expiredDate = expiredDate;
                return this;
            }

            /**
             * The ID of the server group to which the server belongs.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the server group to which the server belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Indicates whether an image is used to install the Security Center agent. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder onlyImage(Boolean onlyImage) {
                this.onlyImage = onlyImage;
                return this;
            }

            /**
             * The operating system of the server. Valid values:
             * <p>
             * 
             * *   **linux**
             * *   **windows**
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The name of the proxy cluster.
             */
            public Builder proxyCluster(String proxyCluster) {
                this.proxyCluster = proxyCluster;
                return this;
            }

            /**
             * The name of the server provider.
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
