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
 * {@link DescribeAIAssetSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIAssetSummaryResponseBody</p>
 */
public class DescribeAIAssetSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAIAssetSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIAssetSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAIAssetSummaryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIAssetSummaryResponseBody build() {
            return new DescribeAIAssetSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIAssetSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIAssetSummaryResponseBody</p>
     */
    public static class SensitiveSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerImageCnt")
        private Integer containerImageCnt;

        @com.aliyun.core.annotation.NameInMap("EcsCnt")
        private Integer ecsCnt;

        @com.aliyun.core.annotation.NameInMap("ImageCnt")
        private Integer imageCnt;

        @com.aliyun.core.annotation.NameInMap("SnapshotCnt")
        private Integer snapshotCnt;

        @com.aliyun.core.annotation.NameInMap("TotalCnt")
        private Integer totalCnt;

        private SensitiveSummary(Builder builder) {
            this.containerImageCnt = builder.containerImageCnt;
            this.ecsCnt = builder.ecsCnt;
            this.imageCnt = builder.imageCnt;
            this.snapshotCnt = builder.snapshotCnt;
            this.totalCnt = builder.totalCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveSummary create() {
            return builder().build();
        }

        /**
         * @return containerImageCnt
         */
        public Integer getContainerImageCnt() {
            return this.containerImageCnt;
        }

        /**
         * @return ecsCnt
         */
        public Integer getEcsCnt() {
            return this.ecsCnt;
        }

        /**
         * @return imageCnt
         */
        public Integer getImageCnt() {
            return this.imageCnt;
        }

        /**
         * @return snapshotCnt
         */
        public Integer getSnapshotCnt() {
            return this.snapshotCnt;
        }

        /**
         * @return totalCnt
         */
        public Integer getTotalCnt() {
            return this.totalCnt;
        }

        public static final class Builder {
            private Integer containerImageCnt; 
            private Integer ecsCnt; 
            private Integer imageCnt; 
            private Integer snapshotCnt; 
            private Integer totalCnt; 

            private Builder() {
            } 

            private Builder(SensitiveSummary model) {
                this.containerImageCnt = model.containerImageCnt;
                this.ecsCnt = model.ecsCnt;
                this.imageCnt = model.imageCnt;
                this.snapshotCnt = model.snapshotCnt;
                this.totalCnt = model.totalCnt;
            } 

            /**
             * <p>The number of images that have AI-related keys are stored in plaintext detected by image scan.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder containerImageCnt(Integer containerImageCnt) {
                this.containerImageCnt = containerImageCnt;
                return this;
            }

            /**
             * <p>The number of servers that have AI-related keys are stored in plaintext detected by agentless scan.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ecsCnt(Integer ecsCnt) {
                this.ecsCnt = ecsCnt;
                return this;
            }

            /**
             * <p>The number of images that have AI-related keys are stored in plaintext detected by agentless scan.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder imageCnt(Integer imageCnt) {
                this.imageCnt = imageCnt;
                return this;
            }

            /**
             * <p>The number of snapshots that have AI-related keys are stored in plaintext detected by agentless scan.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder snapshotCnt(Integer snapshotCnt) {
                this.snapshotCnt = snapshotCnt;
                return this;
            }

            /**
             * <p>The total number of assets that have AI-related keys are stored in plaintext.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder totalCnt(Integer totalCnt) {
                this.totalCnt = totalCnt;
                return this;
            }

            public SensitiveSummary build() {
                return new SensitiveSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIAssetSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIAssetSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AispmRiskAssetCnt")
        private Integer aispmRiskAssetCnt;

        @com.aliyun.core.annotation.NameInMap("EcsAssetCnt")
        private Integer ecsAssetCnt;

        @com.aliyun.core.annotation.NameInMap("ExposedRiskAssetCnt")
        private Integer exposedRiskAssetCnt;

        @com.aliyun.core.annotation.NameInMap("ImageAssetCnt")
        private Integer imageAssetCnt;

        @com.aliyun.core.annotation.NameInMap("LingjunAssetCnt")
        private Integer lingjunAssetCnt;

        @com.aliyun.core.annotation.NameInMap("PaiContainerCnt")
        private Integer paiContainerCnt;

        @com.aliyun.core.annotation.NameInMap("PaiInstanceCnt")
        private Integer paiInstanceCnt;

        @com.aliyun.core.annotation.NameInMap("PaiServerlessAssetCnt")
        private Integer paiServerlessAssetCnt;

        @com.aliyun.core.annotation.NameInMap("SensitiveSummary")
        private SensitiveSummary sensitiveSummary;

        @com.aliyun.core.annotation.NameInMap("SnapshotAssetCnt")
        private Integer snapshotAssetCnt;

        @com.aliyun.core.annotation.NameInMap("TotalAssetCnt")
        private Integer totalAssetCnt;

        @com.aliyun.core.annotation.NameInMap("TotalRiskCnt")
        private Integer totalRiskCnt;

        @com.aliyun.core.annotation.NameInMap("VulRiskAssetCnt")
        private Integer vulRiskAssetCnt;

        private Data(Builder builder) {
            this.aispmRiskAssetCnt = builder.aispmRiskAssetCnt;
            this.ecsAssetCnt = builder.ecsAssetCnt;
            this.exposedRiskAssetCnt = builder.exposedRiskAssetCnt;
            this.imageAssetCnt = builder.imageAssetCnt;
            this.lingjunAssetCnt = builder.lingjunAssetCnt;
            this.paiContainerCnt = builder.paiContainerCnt;
            this.paiInstanceCnt = builder.paiInstanceCnt;
            this.paiServerlessAssetCnt = builder.paiServerlessAssetCnt;
            this.sensitiveSummary = builder.sensitiveSummary;
            this.snapshotAssetCnt = builder.snapshotAssetCnt;
            this.totalAssetCnt = builder.totalAssetCnt;
            this.totalRiskCnt = builder.totalRiskCnt;
            this.vulRiskAssetCnt = builder.vulRiskAssetCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aispmRiskAssetCnt
         */
        public Integer getAispmRiskAssetCnt() {
            return this.aispmRiskAssetCnt;
        }

        /**
         * @return ecsAssetCnt
         */
        public Integer getEcsAssetCnt() {
            return this.ecsAssetCnt;
        }

        /**
         * @return exposedRiskAssetCnt
         */
        public Integer getExposedRiskAssetCnt() {
            return this.exposedRiskAssetCnt;
        }

        /**
         * @return imageAssetCnt
         */
        public Integer getImageAssetCnt() {
            return this.imageAssetCnt;
        }

        /**
         * @return lingjunAssetCnt
         */
        public Integer getLingjunAssetCnt() {
            return this.lingjunAssetCnt;
        }

        /**
         * @return paiContainerCnt
         */
        public Integer getPaiContainerCnt() {
            return this.paiContainerCnt;
        }

        /**
         * @return paiInstanceCnt
         */
        public Integer getPaiInstanceCnt() {
            return this.paiInstanceCnt;
        }

        /**
         * @return paiServerlessAssetCnt
         */
        public Integer getPaiServerlessAssetCnt() {
            return this.paiServerlessAssetCnt;
        }

        /**
         * @return sensitiveSummary
         */
        public SensitiveSummary getSensitiveSummary() {
            return this.sensitiveSummary;
        }

        /**
         * @return snapshotAssetCnt
         */
        public Integer getSnapshotAssetCnt() {
            return this.snapshotAssetCnt;
        }

        /**
         * @return totalAssetCnt
         */
        public Integer getTotalAssetCnt() {
            return this.totalAssetCnt;
        }

        /**
         * @return totalRiskCnt
         */
        public Integer getTotalRiskCnt() {
            return this.totalRiskCnt;
        }

        /**
         * @return vulRiskAssetCnt
         */
        public Integer getVulRiskAssetCnt() {
            return this.vulRiskAssetCnt;
        }

        public static final class Builder {
            private Integer aispmRiskAssetCnt; 
            private Integer ecsAssetCnt; 
            private Integer exposedRiskAssetCnt; 
            private Integer imageAssetCnt; 
            private Integer lingjunAssetCnt; 
            private Integer paiContainerCnt; 
            private Integer paiInstanceCnt; 
            private Integer paiServerlessAssetCnt; 
            private SensitiveSummary sensitiveSummary; 
            private Integer snapshotAssetCnt; 
            private Integer totalAssetCnt; 
            private Integer totalRiskCnt; 
            private Integer vulRiskAssetCnt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aispmRiskAssetCnt = model.aispmRiskAssetCnt;
                this.ecsAssetCnt = model.ecsAssetCnt;
                this.exposedRiskAssetCnt = model.exposedRiskAssetCnt;
                this.imageAssetCnt = model.imageAssetCnt;
                this.lingjunAssetCnt = model.lingjunAssetCnt;
                this.paiContainerCnt = model.paiContainerCnt;
                this.paiInstanceCnt = model.paiInstanceCnt;
                this.paiServerlessAssetCnt = model.paiServerlessAssetCnt;
                this.sensitiveSummary = model.sensitiveSummary;
                this.snapshotAssetCnt = model.snapshotAssetCnt;
                this.totalAssetCnt = model.totalAssetCnt;
                this.totalRiskCnt = model.totalRiskCnt;
                this.vulRiskAssetCnt = model.vulRiskAssetCnt;
            } 

            /**
             * <p>The number of cloud assets with AI security posture management risks.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder aispmRiskAssetCnt(Integer aispmRiskAssetCnt) {
                this.aispmRiskAssetCnt = aispmRiskAssetCnt;
                return this;
            }

            /**
             * <p>The number of servers on which AI components are installed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ecsAssetCnt(Integer ecsAssetCnt) {
                this.ecsAssetCnt = ecsAssetCnt;
                return this;
            }

            /**
             * <p>The number of servers that have exposed AI components.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exposedRiskAssetCnt(Integer exposedRiskAssetCnt) {
                this.exposedRiskAssetCnt = exposedRiskAssetCnt;
                return this;
            }

            /**
             * <p>The number of AI images.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder imageAssetCnt(Integer imageAssetCnt) {
                this.imageAssetCnt = imageAssetCnt;
                return this;
            }

            /**
             * <p>The number of LINGJUN assets.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lingjunAssetCnt(Integer lingjunAssetCnt) {
                this.lingjunAssetCnt = lingjunAssetCnt;
                return this;
            }

            /**
             * <p>The number of container image assets in PAI.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder paiContainerCnt(Integer paiContainerCnt) {
                this.paiContainerCnt = paiContainerCnt;
                return this;
            }

            /**
             * <p>The total number of cloud asset instances in Platform for AI (PAI).</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder paiInstanceCnt(Integer paiInstanceCnt) {
                this.paiInstanceCnt = paiInstanceCnt;
                return this;
            }

            /**
             * <p>The number of serverless assets in PAI.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder paiServerlessAssetCnt(Integer paiServerlessAssetCnt) {
                this.paiServerlessAssetCnt = paiServerlessAssetCnt;
                return this;
            }

            /**
             * <p>The statistics on assets that have AI-related keys are stored in plaintext.</p>
             */
            public Builder sensitiveSummary(SensitiveSummary sensitiveSummary) {
                this.sensitiveSummary = sensitiveSummary;
                return this;
            }

            /**
             * <p>The number of AI snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder snapshotAssetCnt(Integer snapshotAssetCnt) {
                this.snapshotAssetCnt = snapshotAssetCnt;
                return this;
            }

            /**
             * <p>The total number of AI assets.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder totalAssetCnt(Integer totalAssetCnt) {
                this.totalAssetCnt = totalAssetCnt;
                return this;
            }

            /**
             * <p>The total number of assets with AI risks.</p>
             * 
             * <strong>example:</strong>
             * <p>26</p>
             */
            public Builder totalRiskCnt(Integer totalRiskCnt) {
                this.totalRiskCnt = totalRiskCnt;
                return this;
            }

            /**
             * <p>The number of servers with AI application vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder vulRiskAssetCnt(Integer vulRiskAssetCnt) {
                this.vulRiskAssetCnt = vulRiskAssetCnt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
