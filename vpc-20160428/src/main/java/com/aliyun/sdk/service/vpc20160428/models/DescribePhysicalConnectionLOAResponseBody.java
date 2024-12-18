// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribePhysicalConnectionLOAResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhysicalConnectionLOAResponseBody</p>
 */
public class DescribePhysicalConnectionLOAResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionLOAType")
    private PhysicalConnectionLOAType physicalConnectionLOAType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePhysicalConnectionLOAResponseBody(Builder builder) {
        this.physicalConnectionLOAType = builder.physicalConnectionLOAType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhysicalConnectionLOAResponseBody create() {
        return builder().build();
    }

    /**
     * @return physicalConnectionLOAType
     */
    public PhysicalConnectionLOAType getPhysicalConnectionLOAType() {
        return this.physicalConnectionLOAType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PhysicalConnectionLOAType physicalConnectionLOAType; 
        private String requestId; 

        /**
         * <p>The LOA information about the Express Connect circuit.</p>
         */
        public Builder physicalConnectionLOAType(PhysicalConnectionLOAType physicalConnectionLOAType) {
            this.physicalConnectionLOAType = physicalConnectionLOAType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>318BB676-0A2B-43A0-9AD8-F1D34E93750F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhysicalConnectionLOAResponseBody build() {
            return new DescribePhysicalConnectionLOAResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhysicalConnectionLOAResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionLOAResponseBody</p>
     */
    public static class PMInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PMCertificateNo")
        private String PMCertificateNo;

        @com.aliyun.core.annotation.NameInMap("PMCertificateType")
        private String PMCertificateType;

        @com.aliyun.core.annotation.NameInMap("PMContactInfo")
        private String PMContactInfo;

        @com.aliyun.core.annotation.NameInMap("PMGender")
        private String PMGender;

        @com.aliyun.core.annotation.NameInMap("PMName")
        private String PMName;

        private PMInfo(Builder builder) {
            this.PMCertificateNo = builder.PMCertificateNo;
            this.PMCertificateType = builder.PMCertificateType;
            this.PMContactInfo = builder.PMContactInfo;
            this.PMGender = builder.PMGender;
            this.PMName = builder.PMName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PMInfo create() {
            return builder().build();
        }

        /**
         * @return PMCertificateNo
         */
        public String getPMCertificateNo() {
            return this.PMCertificateNo;
        }

        /**
         * @return PMCertificateType
         */
        public String getPMCertificateType() {
            return this.PMCertificateType;
        }

        /**
         * @return PMContactInfo
         */
        public String getPMContactInfo() {
            return this.PMContactInfo;
        }

        /**
         * @return PMGender
         */
        public String getPMGender() {
            return this.PMGender;
        }

        /**
         * @return PMName
         */
        public String getPMName() {
            return this.PMName;
        }

        public static final class Builder {
            private String PMCertificateNo; 
            private String PMCertificateType; 
            private String PMContactInfo; 
            private String PMGender; 
            private String PMName; 

            /**
             * <p>The identity document number of the construction worker.</p>
             * 
             * <strong>example:</strong>
             * <p>12345671****</p>
             */
            public Builder PMCertificateNo(String PMCertificateNo) {
                this.PMCertificateNo = PMCertificateNo;
                return this;
            }

            /**
             * <p>The identity document type of the construction worker. Valid values:</p>
             * <ul>
             * <li><strong>IDCard</strong></li>
             * <li><strong>Passport</strong></li>
             * <li><strong>Other</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Other</p>
             */
            public Builder PMCertificateType(String PMCertificateType) {
                this.PMCertificateType = PMCertificateType;
                return this;
            }

            /**
             * <p>The phone number of the construction worker.</p>
             * 
             * <strong>example:</strong>
             * <p>18910010****</p>
             */
            public Builder PMContactInfo(String PMContactInfo) {
                this.PMContactInfo = PMContactInfo;
                return this;
            }

            /**
             * <p>The gender of the construction worker. Valid values:</p>
             * <ul>
             * <li><strong>Male</strong></li>
             * <li><strong>Female</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Male</p>
             */
            public Builder PMGender(String PMGender) {
                this.PMGender = PMGender;
                return this;
            }

            /**
             * <p>The name of the construction worker.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder PMName(String PMName) {
                this.PMName = PMName;
                return this;
            }

            public PMInfo build() {
                return new PMInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePhysicalConnectionLOAResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionLOAResponseBody</p>
     */
    public static class PhysicalConnectionLOATypePMInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PMInfo")
        private java.util.List<PMInfo> PMInfo;

        private PhysicalConnectionLOATypePMInfo(Builder builder) {
            this.PMInfo = builder.PMInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionLOATypePMInfo create() {
            return builder().build();
        }

        /**
         * @return PMInfo
         */
        public java.util.List<PMInfo> getPMInfo() {
            return this.PMInfo;
        }

        public static final class Builder {
            private java.util.List<PMInfo> PMInfo; 

            /**
             * PMInfo.
             */
            public Builder PMInfo(java.util.List<PMInfo> PMInfo) {
                this.PMInfo = PMInfo;
                return this;
            }

            public PhysicalConnectionLOATypePMInfo build() {
                return new PhysicalConnectionLOATypePMInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePhysicalConnectionLOAResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhysicalConnectionLOAResponseBody</p>
     */
    public static class PhysicalConnectionLOAType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompanyLocalizedName")
        private String companyLocalizedName;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("ConstructionTime")
        private String constructionTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LineCode")
        private String lineCode;

        @com.aliyun.core.annotation.NameInMap("LineLabel")
        private String lineLabel;

        @com.aliyun.core.annotation.NameInMap("LineSPContactInfo")
        private String lineSPContactInfo;

        @com.aliyun.core.annotation.NameInMap("LineServiceProvider")
        private String lineServiceProvider;

        @com.aliyun.core.annotation.NameInMap("LineType")
        private String lineType;

        @com.aliyun.core.annotation.NameInMap("LoaUrl")
        private String loaUrl;

        @com.aliyun.core.annotation.NameInMap("PMInfo")
        private PhysicalConnectionLOATypePMInfo PMInfo;

        @com.aliyun.core.annotation.NameInMap("SI")
        private String si;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PhysicalConnectionLOAType(Builder builder) {
            this.companyLocalizedName = builder.companyLocalizedName;
            this.companyName = builder.companyName;
            this.constructionTime = builder.constructionTime;
            this.instanceId = builder.instanceId;
            this.lineCode = builder.lineCode;
            this.lineLabel = builder.lineLabel;
            this.lineSPContactInfo = builder.lineSPContactInfo;
            this.lineServiceProvider = builder.lineServiceProvider;
            this.lineType = builder.lineType;
            this.loaUrl = builder.loaUrl;
            this.PMInfo = builder.PMInfo;
            this.si = builder.si;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhysicalConnectionLOAType create() {
            return builder().build();
        }

        /**
         * @return companyLocalizedName
         */
        public String getCompanyLocalizedName() {
            return this.companyLocalizedName;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return constructionTime
         */
        public String getConstructionTime() {
            return this.constructionTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lineCode
         */
        public String getLineCode() {
            return this.lineCode;
        }

        /**
         * @return lineLabel
         */
        public String getLineLabel() {
            return this.lineLabel;
        }

        /**
         * @return lineSPContactInfo
         */
        public String getLineSPContactInfo() {
            return this.lineSPContactInfo;
        }

        /**
         * @return lineServiceProvider
         */
        public String getLineServiceProvider() {
            return this.lineServiceProvider;
        }

        /**
         * @return lineType
         */
        public String getLineType() {
            return this.lineType;
        }

        /**
         * @return loaUrl
         */
        public String getLoaUrl() {
            return this.loaUrl;
        }

        /**
         * @return PMInfo
         */
        public PhysicalConnectionLOATypePMInfo getPMInfo() {
            return this.PMInfo;
        }

        /**
         * @return si
         */
        public String getSi() {
            return this.si;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String companyLocalizedName; 
            private String companyName; 
            private String constructionTime; 
            private String instanceId; 
            private String lineCode; 
            private String lineLabel; 
            private String lineSPContactInfo; 
            private String lineServiceProvider; 
            private String lineType; 
            private String loaUrl; 
            private PhysicalConnectionLOATypePMInfo PMInfo; 
            private String si; 
            private String status; 

            /**
             * <p>The name of the construction company.</p>
             * 
             * <strong>example:</strong>
             * <p>company</p>
             */
            public Builder companyLocalizedName(String companyLocalizedName) {
                this.companyLocalizedName = companyLocalizedName;
                return this;
            }

            /**
             * <p>The name of the organization that requires the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>test1234</p>
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * <p>The time when construction starts.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-26T08:00:00Z</p>
             */
            public Builder constructionTime(String constructionTime) {
                this.constructionTime = constructionTime;
                return this;
            }

            /**
             * <p>The ID of the Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-bp1ca4wca27****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The circuit code provided by the connectivity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa111</p>
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * <p>The label of the cable in the data center.</p>
             * 
             * <strong>example:</strong>
             * <p>bbb222</p>
             */
            public Builder lineLabel(String lineLabel) {
                this.lineLabel = lineLabel;
                return this;
            }

            /**
             * <p>The contact information about line O&amp;M.</p>
             * 
             * <strong>example:</strong>
             * <p>1388888****</p>
             */
            public Builder lineSPContactInfo(String lineSPContactInfo) {
                this.lineSPContactInfo = lineSPContactInfo;
                return this;
            }

            /**
             * <p>The ISP. Valid values:</p>
             * <ul>
             * <li><strong>China Telecom</strong></li>
             * <li><strong>China Unicom</strong></li>
             * <li><strong>China Mobile</strong></li>
             * <li><strong>Other ISPs in China</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Other ISPs in China</p>
             */
            public Builder lineServiceProvider(String lineServiceProvider) {
                this.lineServiceProvider = lineServiceProvider;
                return this;
            }

            /**
             * <p>The type of the Express Connect circuit. Valid values:</p>
             * <ul>
             * <li><strong>MSTP</strong></li>
             * <li><strong>MPLSVPN</strong></li>
             * <li><strong>FIBRE</strong></li>
             * <li><strong>Other</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FIBRE</p>
             */
            public Builder lineType(String lineType) {
                this.lineType = lineType;
                return this;
            }

            /**
             * <p>The download URL of the LOA file.</p>
             * 
             * <strong>example:</strong>
             * <p>http://******</p>
             */
            public Builder loaUrl(String loaUrl) {
                this.loaUrl = loaUrl;
                return this;
            }

            /**
             * <p>The information about the construction workers.</p>
             */
            public Builder PMInfo(PhysicalConnectionLOATypePMInfo PMInfo) {
                this.PMInfo = PMInfo;
                return this;
            }

            /**
             * <p>The on-site construction company.</p>
             * 
             * <strong>example:</strong>
             * <p>ctcu</p>
             */
            public Builder si(String si) {
                this.si = si;
                return this;
            }

            /**
             * <p>The status of the LOA. Valid values:</p>
             * <ul>
             * <li><strong>Applying</strong>: The LOA is pending for approval.</li>
             * <li><strong>Accept</strong>: The LOA is approved.</li>
             * <li><strong>Available</strong>: The LOA is available.</li>
             * <li><strong>Rejected</strong>: The LOA is rejected.</li>
             * <li><strong>Completing</strong>: The Express Connect circuit is under construction.</li>
             * <li><strong>Complete</strong>: The Express Connect circuit is installed.</li>
             * <li><strong>Deleted</strong>: The LOA is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PhysicalConnectionLOAType build() {
                return new PhysicalConnectionLOAType(this);
            } 

        } 

    }
}
