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
 * {@link UpdateMultiUserInstancesRequest} extends {@link RequestModel}
 *
 * <p>UpdateMultiUserInstancesRequest</p>
 */
public class UpdateMultiUserInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberInstances")
    private java.util.List<MemberInstances> memberInstances;

    private UpdateMultiUserInstancesRequest(Builder builder) {
        super(builder);
        this.memberInstances = builder.memberInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMultiUserInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberInstances
     */
    public java.util.List<MemberInstances> getMemberInstances() {
        return this.memberInstances;
    }

    public static final class Builder extends Request.Builder<UpdateMultiUserInstancesRequest, Builder> {
        private java.util.List<MemberInstances> memberInstances; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMultiUserInstancesRequest request) {
            super(request);
            this.memberInstances = request.memberInstances;
        } 

        /**
         * <p>Member instances.</p>
         */
        public Builder memberInstances(java.util.List<MemberInstances> memberInstances) {
            this.putQueryParameter("MemberInstances", memberInstances);
            this.memberInstances = memberInstances;
            return this;
        }

        @Override
        public UpdateMultiUserInstancesRequest build() {
            return new UpdateMultiUserInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMultiUserInstancesRequest} extends {@link TeaModel}
     *
     * <p>UpdateMultiUserInstancesRequest</p>
     */
    public static class VersionSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CoreCount")
        private Long coreCount;

        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Long ecsCount;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private VersionSummary(Builder builder) {
            this.coreCount = builder.coreCount;
            this.ecsCount = builder.ecsCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionSummary create() {
            return builder().build();
        }

        /**
         * @return coreCount
         */
        public Long getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return ecsCount
         */
        public Long getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long coreCount; 
            private Long ecsCount; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(VersionSummary model) {
                this.coreCount = model.coreCount;
                this.ecsCount = model.ecsCount;
                this.version = model.version;
            } 

            /**
             * <p>Number of cores authorized for the member.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder coreCount(Long coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * <p>Number of authorizations allocated to the member.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder ecsCount(Long ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * <p>Version of the Cloud Security Center for the member account. Values:  </p>
             * <ul>
             * <li><strong>1</strong>: Free Edition </li>
             * <li><strong>3</strong>: Enterprise Edition</li>
             * <li><strong>5</strong>: Advanced Edition</li>
             * <li><strong>6</strong>: Antivirus Edition    </li>
             * <li><strong>7</strong>: Flagship Edition   </li>
             * <li><strong>8</strong>: Multiple Versions   </li>
             * <li><strong>10</strong>: Only Purchase Value-Added Services</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public VersionSummary build() {
                return new VersionSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMultiUserInstancesRequest} extends {@link TeaModel}
     *
     * <p>UpdateMultiUserInstancesRequest</p>
     */
    public static class MemberInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AntiRansomwareCapacity")
        private Long antiRansomwareCapacity;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CspmCapacity")
        private Long cspmCapacity;

        @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
        private Long honeypotCapacity;

        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private Long imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OptType")
        private String optType;

        @com.aliyun.core.annotation.NameInMap("RaspCapacity")
        private Long raspCapacity;

        @com.aliyun.core.annotation.NameInMap("SdkCapacity")
        private Long sdkCapacity;

        @com.aliyun.core.annotation.NameInMap("SlsCapacity")
        private Long slsCapacity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisCapacity")
        private Long threatAnalysisCapacity;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisFlow")
        private Long threatAnalysisFlow;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionSummary")
        private java.util.List<VersionSummary> versionSummary;

        @com.aliyun.core.annotation.NameInMap("WebLockCapacity")
        private Long webLockCapacity;

        private MemberInstances(Builder builder) {
            this.aliUid = builder.aliUid;
            this.antiRansomwareCapacity = builder.antiRansomwareCapacity;
            this.chargeType = builder.chargeType;
            this.cspmCapacity = builder.cspmCapacity;
            this.honeypotCapacity = builder.honeypotCapacity;
            this.imageScanCapacity = builder.imageScanCapacity;
            this.instanceId = builder.instanceId;
            this.optType = builder.optType;
            this.raspCapacity = builder.raspCapacity;
            this.sdkCapacity = builder.sdkCapacity;
            this.slsCapacity = builder.slsCapacity;
            this.status = builder.status;
            this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
            this.threatAnalysisFlow = builder.threatAnalysisFlow;
            this.version = builder.version;
            this.versionSummary = builder.versionSummary;
            this.webLockCapacity = builder.webLockCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberInstances create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return antiRansomwareCapacity
         */
        public Long getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return cspmCapacity
         */
        public Long getCspmCapacity() {
            return this.cspmCapacity;
        }

        /**
         * @return honeypotCapacity
         */
        public Long getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        /**
         * @return imageScanCapacity
         */
        public Long getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return optType
         */
        public String getOptType() {
            return this.optType;
        }

        /**
         * @return raspCapacity
         */
        public Long getRaspCapacity() {
            return this.raspCapacity;
        }

        /**
         * @return sdkCapacity
         */
        public Long getSdkCapacity() {
            return this.sdkCapacity;
        }

        /**
         * @return slsCapacity
         */
        public Long getSlsCapacity() {
            return this.slsCapacity;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatAnalysisCapacity
         */
        public Long getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        /**
         * @return threatAnalysisFlow
         */
        public Long getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionSummary
         */
        public java.util.List<VersionSummary> getVersionSummary() {
            return this.versionSummary;
        }

        /**
         * @return webLockCapacity
         */
        public Long getWebLockCapacity() {
            return this.webLockCapacity;
        }

        public static final class Builder {
            private Long aliUid; 
            private Long antiRansomwareCapacity; 
            private String chargeType; 
            private Long cspmCapacity; 
            private Long honeypotCapacity; 
            private Long imageScanCapacity; 
            private String instanceId; 
            private String optType; 
            private Long raspCapacity; 
            private Long sdkCapacity; 
            private Long slsCapacity; 
            private Integer status; 
            private Long threatAnalysisCapacity; 
            private Long threatAnalysisFlow; 
            private String version; 
            private java.util.List<VersionSummary> versionSummary; 
            private Long webLockCapacity; 

            private Builder() {
            } 

            private Builder(MemberInstances model) {
                this.aliUid = model.aliUid;
                this.antiRansomwareCapacity = model.antiRansomwareCapacity;
                this.chargeType = model.chargeType;
                this.cspmCapacity = model.cspmCapacity;
                this.honeypotCapacity = model.honeypotCapacity;
                this.imageScanCapacity = model.imageScanCapacity;
                this.instanceId = model.instanceId;
                this.optType = model.optType;
                this.raspCapacity = model.raspCapacity;
                this.sdkCapacity = model.sdkCapacity;
                this.slsCapacity = model.slsCapacity;
                this.status = model.status;
                this.threatAnalysisCapacity = model.threatAnalysisCapacity;
                this.threatAnalysisFlow = model.threatAnalysisFlow;
                this.version = model.version;
                this.versionSummary = model.versionSummary;
                this.webLockCapacity = model.webLockCapacity;
            } 

            /**
             * <p>The Alibaba Cloud account UID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>1766185894104675</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>Anti-ransomware capacity allocated to the member, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder antiRansomwareCapacity(Long antiRansomwareCapacity) {
                this.antiRansomwareCapacity = antiRansomwareCapacity;
                return this;
            }

            /**
             * <p>Charge type, values:</p>
             * <ul>
             * <li><strong>PREPAID</strong>: Prepaid.</li>
             * <li><strong>POSTPAID</strong> (default): Postpaid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAID</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Cloud platform configuration check scan count allocated to the member. Unit: times per month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cspmCapacity(Long cspmCapacity) {
                this.cspmCapacity = cspmCapacity;
                return this;
            }

            /**
             * <p>Honeypot authorization count allocated to the member.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder honeypotCapacity(Long honeypotCapacity) {
                this.honeypotCapacity = honeypotCapacity;
                return this;
            }

            /**
             * <p>Image scan authorization count allocated to the member.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder imageScanCapacity(Long imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * <p>The Cloud Security Center instance ID purchased by the member account.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-p0anpb26my69</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Operation type. Values:  </p>
             * <ul>
             * <li><strong>ADD</strong>: Add </li>
             * <li><strong>CHANGE</strong>: Change</li>
             * <li><strong>DEL</strong>: Delete</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHANGE</p>
             */
            public Builder optType(String optType) {
                this.optType = optType;
                return this;
            }

            /**
             * <p>Application protection count allocated to the member. Unit: per month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder raspCapacity(Long raspCapacity) {
                this.raspCapacity = raspCapacity;
                return this;
            }

            /**
             * <p>Malicious file detection SDK authorization count allocated to the member.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sdkCapacity(Long sdkCapacity) {
                this.sdkCapacity = sdkCapacity;
                return this;
            }

            /**
             * <p>Log storage capacity allocated to the member, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder slsCapacity(Long slsCapacity) {
                this.slsCapacity = slsCapacity;
                return this;
            }

            /**
             * <p>Status of the member account instance. Values: </p>
             * <ul>
             * <li><strong>1</strong>: Valid. </li>
             * <li><strong>2</strong>: Invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Threat analysis capacity allocated to the member. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threatAnalysisCapacity(Long threatAnalysisCapacity) {
                this.threatAnalysisCapacity = threatAnalysisCapacity;
                return this;
            }

            /**
             * <p>Threat analysis and response log access traffic allocated to the member. Unit: GB/day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder threatAnalysisFlow(Long threatAnalysisFlow) {
                this.threatAnalysisFlow = threatAnalysisFlow;
                return this;
            }

            /**
             * <p>The version of Cloud Security Center protection to be bound. Values:  </p>
             * <ul>
             * <li><strong>1</strong>: Free Edition </li>
             * <li><strong>3</strong>: Enterprise Edition</li>
             * <li><strong>5</strong>: Advanced Edition</li>
             * <li><strong>6</strong>: Antivirus Edition    </li>
             * <li><strong>7</strong>: Flagship Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Member account authorization usage information.</p>
             */
            public Builder versionSummary(java.util.List<VersionSummary> versionSummary) {
                this.versionSummary = versionSummary;
                return this;
            }

            /**
             * <p>Web tamper-proof authorization count allocated to the member.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder webLockCapacity(Long webLockCapacity) {
                this.webLockCapacity = webLockCapacity;
                return this;
            }

            public MemberInstances build() {
                return new MemberInstances(this);
            } 

        } 

    }
}
