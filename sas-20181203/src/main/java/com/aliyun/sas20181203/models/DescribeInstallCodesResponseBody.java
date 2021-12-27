// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>InstallCodes.</p>
         */
        public Builder installCodes(java.util.List < InstallCodes> installCodes) {
            this.installCodes = installCodes;
            return this;
        }

        /**
         * <p>RequestId.</p>
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

        @NameInMap("VendorName")
        private String vendorName;


        private InstallCodes(Builder builder) {
            this.captchaCode = builder.captchaCode;
            this.expiredDate = builder.expiredDate;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.onlyImage = builder.onlyImage;
            this.os = builder.os;
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
            private String vendorName; 

            /**
             * <p>CaptchaCode.</p>
             */
            public Builder captchaCode(String captchaCode) {
                this.captchaCode = captchaCode;
                return this;
            }

            /**
             * <p>ExpiredDate.</p>
             */
            public Builder expiredDate(Long expiredDate) {
                this.expiredDate = expiredDate;
                return this;
            }

            /**
             * <p>GroupId.</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>GroupName.</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>OnlyImage.</p>
             */
            public Builder onlyImage(Boolean onlyImage) {
                this.onlyImage = onlyImage;
                return this;
            }

            /**
             * <p>Os.</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>VendorName.</p>
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
