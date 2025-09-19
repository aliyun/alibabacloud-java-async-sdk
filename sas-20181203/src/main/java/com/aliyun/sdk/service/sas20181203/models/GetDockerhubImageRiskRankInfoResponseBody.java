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
 * {@link GetDockerhubImageRiskRankInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDockerhubImageRiskRankInfoResponseBody</p>
 */
public class GetDockerhubImageRiskRankInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskRankInfo")
    private RiskRankInfo riskRankInfo;

    private GetDockerhubImageRiskRankInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskRankInfo = builder.riskRankInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDockerhubImageRiskRankInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskRankInfo
     */
    public RiskRankInfo getRiskRankInfo() {
        return this.riskRankInfo;
    }

    public static final class Builder {
        private String requestId; 
        private RiskRankInfo riskRankInfo; 

        private Builder() {
        } 

        private Builder(GetDockerhubImageRiskRankInfoResponseBody model) {
            this.requestId = model.requestId;
            this.riskRankInfo = model.riskRankInfo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The risk information.</p>
         */
        public Builder riskRankInfo(RiskRankInfo riskRankInfo) {
            this.riskRankInfo = riskRankInfo;
            return this;
        }

        public GetDockerhubImageRiskRankInfoResponseBody build() {
            return new GetDockerhubImageRiskRankInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDockerhubImageRiskRankInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDockerhubImageRiskRankInfoResponseBody</p>
     */
    public static class Baseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("HcCount")
        private Integer hcCount;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private Long imageSize;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RiskLevelDetail")
        private String riskLevelDetail;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        private Baseline(Builder builder) {
            this.digest = builder.digest;
            this.hcCount = builder.hcCount;
            this.imageId = builder.imageId;
            this.imageSize = builder.imageSize;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.riskLevelDetail = builder.riskLevelDetail;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
            this.vulCount = builder.vulCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Baseline create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return hcCount
         */
        public Integer getHcCount() {
            return this.hcCount;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageSize
         */
        public Long getImageSize() {
            return this.imageSize;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return riskLevelDetail
         */
        public String getRiskLevelDetail() {
            return this.riskLevelDetail;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        public static final class Builder {
            private String digest; 
            private Integer hcCount; 
            private String imageId; 
            private Long imageSize; 
            private String repoName; 
            private String repoNamespace; 
            private String riskLevelDetail; 
            private String tag; 
            private String uuid; 
            private Integer vulCount; 

            private Builder() {
            } 

            private Builder(Baseline model) {
                this.digest = model.digest;
                this.hcCount = model.hcCount;
                this.imageId = model.imageId;
                this.imageSize = model.imageSize;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.riskLevelDetail = model.riskLevelDetail;
                this.tag = model.tag;
                this.uuid = model.uuid;
                this.vulCount = model.vulCount;
            } 

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>f28ecca63bfaf22ead4b28b63d752a21e4d2c1de90b8549fbde880d619f3****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The number of baseline risks detected on the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>7c5ad02865aef575387a05bb3c81b27e0d8ed1f2e3f722ea05523b72882f****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image size.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder imageSize(Long imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The name of the Container Registry repository.</p>
             * 
             * <strong>example:</strong>
             * <p>glz123</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace-01</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The risk statistics of all hosts, images, and containers.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;account&quot;:0,&quot;agentlessAll&quot;:0,&quot;agentlessBaseline&quot;:0,&quot;agentlessMalicious&quot;:0,&quot;agentlessSensitiveFile&quot;:0,&quot;agentlessVulCve&quot;:0,&quot;agentlessVulSca&quot;:0,&quot;agentlessVulSys&quot;:0,&quot;appNum&quot;:0,&quot;asapVulCount&quot;:0,&quot;baselineHigh&quot;:0,&quot;baselineLow&quot;:0,&quot;baselineMedium&quot;:0,&quot;baselineNum&quot;:0,&quot;cmsNum&quot;:0,&quot;containerAsap&quot;:0,&quot;containerLater&quot;:0,&quot;containerNntf&quot;:0,&quot;containerRemind&quot;:0,&quot;containerSerious&quot;:0,&quot;containerSuspicious&quot;:0,&quot;cveNum&quot;:0,&quot;emgNum&quot;:0,&quot;health&quot;:0,&quot;imageBaselineHigh&quot;:1,&quot;imageBaselineLow&quot;:0,&quot;imageBaselineMedium&quot;:0,&quot;imageBaselineNum&quot;:1,&quot;imageMaliciousFileRemind&quot;:0,&quot;imageMaliciousFileSerious&quot;:0,&quot;imageMaliciousFileSuspicious&quot;:0,&quot;imageVulAsap&quot;:0,&quot;imageVulLater&quot;:0,&quot;imageVulNntf&quot;:0,&quot;laterVulCount&quot;:0,&quot;newSuspicious&quot;:0,&quot;nntfVulCount&quot;:0,&quot;remindNum&quot;:0,&quot;scaNum&quot;:0,&quot;seriousNum&quot;:0,&quot;suspNum&quot;:0,&quot;suspicious&quot;:0,&quot;sysNum&quot;:0,&quot;trojan&quot;:0,&quot;uuid&quot;:&quot;009635bf00c0585e3122ab92f5449919&quot;,&quot;vul&quot;:0,&quot;weakPWNum&quot;:0}</p>
             */
            public Builder riskLevelDetail(String riskLevelDetail) {
                this.riskLevelDetail = riskLevelDetail;
                return this;
            }

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>machineResource</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The UUID of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>5583aa03-922e-4709-a888-389f2489****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The number of detected vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            public Baseline build() {
                return new Baseline(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDockerhubImageRiskRankInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDockerhubImageRiskRankInfoResponseBody</p>
     */
    public static class VulAsap extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("HcCount")
        private Integer hcCount;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private Long imageSize;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RiskLevelDetail")
        private String riskLevelDetail;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        private VulAsap(Builder builder) {
            this.digest = builder.digest;
            this.hcCount = builder.hcCount;
            this.imageId = builder.imageId;
            this.imageSize = builder.imageSize;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.riskLevelDetail = builder.riskLevelDetail;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
            this.vulCount = builder.vulCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulAsap create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return hcCount
         */
        public Integer getHcCount() {
            return this.hcCount;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageSize
         */
        public Long getImageSize() {
            return this.imageSize;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return riskLevelDetail
         */
        public String getRiskLevelDetail() {
            return this.riskLevelDetail;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        public static final class Builder {
            private String digest; 
            private Integer hcCount; 
            private String imageId; 
            private Long imageSize; 
            private String repoName; 
            private String repoNamespace; 
            private String riskLevelDetail; 
            private String tag; 
            private String uuid; 
            private Integer vulCount; 

            private Builder() {
            } 

            private Builder(VulAsap model) {
                this.digest = model.digest;
                this.hcCount = model.hcCount;
                this.imageId = model.imageId;
                this.imageSize = model.imageSize;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.riskLevelDetail = model.riskLevelDetail;
                this.tag = model.tag;
                this.uuid = model.uuid;
                this.vulCount = model.vulCount;
            } 

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>d97c1348e56eb52902888e6e5673623321b1f19ac45ed532c3114dc0f989****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The number of risks detected on the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fabe4203a89765a2c99554040bda51eac7885a18216f4ac0be82710cff60****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image size.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder imageSize(Long imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>lkl-zf-ss-ordapi-labs</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace-01</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The risk statistics of all hosts, images, and containers.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;account&quot;:0,&quot;agentlessAll&quot;:0,&quot;agentlessBaseline&quot;:0,&quot;agentlessMalicious&quot;:0,&quot;agentlessSensitiveFile&quot;:0,&quot;agentlessVulCve&quot;:0,&quot;agentlessVulSca&quot;:0,&quot;agentlessVulSys&quot;:0,&quot;appNum&quot;:0,&quot;asapVulCount&quot;:0,&quot;baselineHigh&quot;:0,&quot;baselineLow&quot;:0,&quot;baselineMedium&quot;:0,&quot;baselineNum&quot;:0,&quot;cmsNum&quot;:0,&quot;containerAsap&quot;:0,&quot;containerLater&quot;:0,&quot;containerNntf&quot;:0,&quot;containerRemind&quot;:0,&quot;containerSerious&quot;:0,&quot;containerSuspicious&quot;:0,&quot;cveNum&quot;:513,&quot;emgNum&quot;:0,&quot;health&quot;:0,&quot;imageBaselineHigh&quot;:0,&quot;imageBaselineLow&quot;:0,&quot;imageBaselineMedium&quot;:0,&quot;imageBaselineNum&quot;:0,&quot;imageMaliciousFileRemind&quot;:0,&quot;imageMaliciousFileSerious&quot;:0,&quot;imageMaliciousFileSuspicious&quot;:0,&quot;imageVulAsap&quot;:3,&quot;imageVulLater&quot;:182,&quot;imageVulNntf&quot;:328,&quot;laterVulCount&quot;:0,&quot;newSuspicious&quot;:0,&quot;nntfVulCount&quot;:0,&quot;remindNum&quot;:0,&quot;scaNum&quot;:0,&quot;seriousNum&quot;:0,&quot;suspNum&quot;:0,&quot;suspicious&quot;:0,&quot;sysNum&quot;:0,&quot;trojan&quot;:0,&quot;uuid&quot;:&quot;44ffb29d6f66d8509598bcdfa660a21d&quot;,&quot;vul&quot;:513,&quot;weakPWNum&quot;:0}</p>
             */
            public Builder riskLevelDetail(String riskLevelDetail) {
                this.riskLevelDetail = riskLevelDetail;
                return this;
            }

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>app:app01-ubuntu</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The UUID of the record.</p>
             * 
             * <strong>example:</strong>
             * <p>6636c286-8063-4c97-8508-6aaf16a8****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The number of vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            public VulAsap build() {
                return new VulAsap(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDockerhubImageRiskRankInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDockerhubImageRiskRankInfoResponseBody</p>
     */
    public static class RiskRankInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Baseline")
        private java.util.List<Baseline> baseline;

        @com.aliyun.core.annotation.NameInMap("VulAsap")
        private java.util.List<VulAsap> vulAsap;

        private RiskRankInfo(Builder builder) {
            this.baseline = builder.baseline;
            this.vulAsap = builder.vulAsap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskRankInfo create() {
            return builder().build();
        }

        /**
         * @return baseline
         */
        public java.util.List<Baseline> getBaseline() {
            return this.baseline;
        }

        /**
         * @return vulAsap
         */
        public java.util.List<VulAsap> getVulAsap() {
            return this.vulAsap;
        }

        public static final class Builder {
            private java.util.List<Baseline> baseline; 
            private java.util.List<VulAsap> vulAsap; 

            private Builder() {
            } 

            private Builder(RiskRankInfo model) {
                this.baseline = model.baseline;
                this.vulAsap = model.vulAsap;
            } 

            /**
             * <p>The baseline risks.</p>
             */
            public Builder baseline(java.util.List<Baseline> baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * <p>The risk information of high-risk vulnerabilities.</p>
             */
            public Builder vulAsap(java.util.List<VulAsap> vulAsap) {
                this.vulAsap = vulAsap;
                return this;
            }

            public RiskRankInfo build() {
                return new RiskRankInfo(this);
            } 

        } 

    }
}
