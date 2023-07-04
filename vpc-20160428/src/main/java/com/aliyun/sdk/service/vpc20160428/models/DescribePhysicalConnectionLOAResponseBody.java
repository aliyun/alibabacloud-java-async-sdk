// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhysicalConnectionLOAResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhysicalConnectionLOAResponseBody</p>
 */
public class DescribePhysicalConnectionLOAResponseBody extends TeaModel {
    @NameInMap("PhysicalConnectionLOAType")
    private PhysicalConnectionLOAType physicalConnectionLOAType;

    @NameInMap("RequestId")
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
         * The LOA information about the Express Connect circuit.
         */
        public Builder physicalConnectionLOAType(PhysicalConnectionLOAType physicalConnectionLOAType) {
            this.physicalConnectionLOAType = physicalConnectionLOAType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhysicalConnectionLOAResponseBody build() {
            return new DescribePhysicalConnectionLOAResponseBody(this);
        } 

    } 

    public static class PMInfo extends TeaModel {
        @NameInMap("PMCertificateNo")
        private String PMCertificateNo;

        @NameInMap("PMCertificateType")
        private String PMCertificateType;

        @NameInMap("PMContactInfo")
        private String PMContactInfo;

        @NameInMap("PMGender")
        private String PMGender;

        @NameInMap("PMName")
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
             * The identity document number of the construction worker.
             */
            public Builder PMCertificateNo(String PMCertificateNo) {
                this.PMCertificateNo = PMCertificateNo;
                return this;
            }

            /**
             * The identity document type of the construction worker. Valid values:
             * <p>
             * 
             * *   **IDCard**: identity card
             * *   **Passport**: passport
             * *   **Other**: other identity documents
             */
            public Builder PMCertificateType(String PMCertificateType) {
                this.PMCertificateType = PMCertificateType;
                return this;
            }

            /**
             * The phone number of the construction worker.
             */
            public Builder PMContactInfo(String PMContactInfo) {
                this.PMContactInfo = PMContactInfo;
                return this;
            }

            /**
             * The gender of the construction worker. Valid values:
             * <p>
             * 
             * *   **Male**: male
             * *   **Female**: female
             */
            public Builder PMGender(String PMGender) {
                this.PMGender = PMGender;
                return this;
            }

            /**
             * The name of the construction worker.
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
    public static class PhysicalConnectionLOATypePMInfo extends TeaModel {
        @NameInMap("PMInfo")
        private java.util.List < PMInfo> PMInfo;

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
        public java.util.List < PMInfo> getPMInfo() {
            return this.PMInfo;
        }

        public static final class Builder {
            private java.util.List < PMInfo> PMInfo; 

            /**
             * PMInfo.
             */
            public Builder PMInfo(java.util.List < PMInfo> PMInfo) {
                this.PMInfo = PMInfo;
                return this;
            }

            public PhysicalConnectionLOATypePMInfo build() {
                return new PhysicalConnectionLOATypePMInfo(this);
            } 

        } 

    }
    public static class PhysicalConnectionLOAType extends TeaModel {
        @NameInMap("CompanyLocalizedName")
        private String companyLocalizedName;

        @NameInMap("CompanyName")
        private String companyName;

        @NameInMap("ConstructionTime")
        private String constructionTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LineCode")
        private String lineCode;

        @NameInMap("LineLabel")
        private String lineLabel;

        @NameInMap("LineType")
        private String lineType;

        @NameInMap("LoaUrl")
        private String loaUrl;

        @NameInMap("PMInfo")
        private PhysicalConnectionLOATypePMInfo PMInfo;

        @NameInMap("SI")
        private String si;

        @NameInMap("Status")
        private String status;

        private PhysicalConnectionLOAType(Builder builder) {
            this.companyLocalizedName = builder.companyLocalizedName;
            this.companyName = builder.companyName;
            this.constructionTime = builder.constructionTime;
            this.instanceId = builder.instanceId;
            this.lineCode = builder.lineCode;
            this.lineLabel = builder.lineLabel;
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
            private String lineType; 
            private String loaUrl; 
            private PhysicalConnectionLOATypePMInfo PMInfo; 
            private String si; 
            private String status; 

            /**
             * The name of the construction company.
             */
            public Builder companyLocalizedName(String companyLocalizedName) {
                this.companyLocalizedName = companyLocalizedName;
                return this;
            }

            /**
             * The name of the organization that requires the Express Connect circuit.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * The time when construction starts.
             */
            public Builder constructionTime(String constructionTime) {
                this.constructionTime = constructionTime;
                return this;
            }

            /**
             * The ID of the Express Connect circuit.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The circuit code provided by the connectivity provider.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * The label of the cable in the data center.
             */
            public Builder lineLabel(String lineLabel) {
                this.lineLabel = lineLabel;
                return this;
            }

            /**
             * The type of the Express Connect circuit. Valid values:
             * <p>
             * 
             * *   **MSTP**
             * *   **MPLSVPN**
             * *   **FIBRE**
             * *   **Other**
             */
            public Builder lineType(String lineType) {
                this.lineType = lineType;
                return this;
            }

            /**
             * The download URL of the LOA file.
             */
            public Builder loaUrl(String loaUrl) {
                this.loaUrl = loaUrl;
                return this;
            }

            /**
             * The information about the construction workers.
             */
            public Builder PMInfo(PhysicalConnectionLOATypePMInfo PMInfo) {
                this.PMInfo = PMInfo;
                return this;
            }

            /**
             * The on-site construction company.
             */
            public Builder si(String si) {
                this.si = si;
                return this;
            }

            /**
             * The status of the LOA. Valid values:
             * <p>
             * 
             * *   **Applying**: The LOA is pending for approval.
             * *   **Accept**: The LOA is approved.
             * *   **Available**: The LOA is available.
             * *   **Rejected**: The LOA is rejected.
             * *   **Completing**: The Express Connect circuit is under construction.
             * *   **Complete**: The Express Connect circuit is installed.
             * *   **Deleted**: The LOA is deleted.
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
