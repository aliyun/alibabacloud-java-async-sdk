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
 * {@link GetInstanceAuthRangeResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceAuthRangeResponseBody</p>
 */
public class GetInstanceAuthRangeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceAuthRange")
    private InstanceAuthRange instanceAuthRange;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInstanceAuthRangeResponseBody(Builder builder) {
        this.instanceAuthRange = builder.instanceAuthRange;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceAuthRangeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceAuthRange
     */
    public InstanceAuthRange getInstanceAuthRange() {
        return this.instanceAuthRange;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceAuthRange instanceAuthRange; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInstanceAuthRangeResponseBody model) {
            this.instanceAuthRange = model.instanceAuthRange;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceAuthRange.
         */
        public Builder instanceAuthRange(InstanceAuthRange instanceAuthRange) {
            this.instanceAuthRange = instanceAuthRange;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceAuthRangeResponseBody build() {
            return new GetInstanceAuthRangeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceAuthRangeResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceAuthRangeResponseBody</p>
     */
    public static class InstanceAuthRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdvancedCount")
        private String advancedCount;

        @com.aliyun.core.annotation.NameInMap("AntiRansomwareCapacity")
        private String antiRansomwareCapacity;

        @com.aliyun.core.annotation.NameInMap("AntiRansomwareService")
        private Integer antiRansomwareService;

        @com.aliyun.core.annotation.NameInMap("AntiVirusCore")
        private String antiVirusCore;

        @com.aliyun.core.annotation.NameInMap("ContainerCore")
        private String containerCore;

        @com.aliyun.core.annotation.NameInMap("ContainerCount")
        private String containerCount;

        @com.aliyun.core.annotation.NameInMap("CspmCapacity")
        private String cspmCapacity;

        @com.aliyun.core.annotation.NameInMap("EnterpriseCount")
        private String enterpriseCount;

        @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
        private String honeypotCapacity;

        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private String imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("RaspCapacity")
        private String raspCapacity;

        @com.aliyun.core.annotation.NameInMap("SdkCapacity")
        private String sdkCapacity;

        @com.aliyun.core.annotation.NameInMap("SlsCapacity")
        private String slsCapacity;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisCapacity")
        private String threatAnalysisCapacity;

        @com.aliyun.core.annotation.NameInMap("ThreatAnalysisFlow")
        private String threatAnalysisFlow;

        @com.aliyun.core.annotation.NameInMap("WebLockCapacity")
        private String webLockCapacity;

        private InstanceAuthRange(Builder builder) {
            this.advancedCount = builder.advancedCount;
            this.antiRansomwareCapacity = builder.antiRansomwareCapacity;
            this.antiRansomwareService = builder.antiRansomwareService;
            this.antiVirusCore = builder.antiVirusCore;
            this.containerCore = builder.containerCore;
            this.containerCount = builder.containerCount;
            this.cspmCapacity = builder.cspmCapacity;
            this.enterpriseCount = builder.enterpriseCount;
            this.honeypotCapacity = builder.honeypotCapacity;
            this.imageScanCapacity = builder.imageScanCapacity;
            this.raspCapacity = builder.raspCapacity;
            this.sdkCapacity = builder.sdkCapacity;
            this.slsCapacity = builder.slsCapacity;
            this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
            this.threatAnalysisFlow = builder.threatAnalysisFlow;
            this.webLockCapacity = builder.webLockCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceAuthRange create() {
            return builder().build();
        }

        /**
         * @return advancedCount
         */
        public String getAdvancedCount() {
            return this.advancedCount;
        }

        /**
         * @return antiRansomwareCapacity
         */
        public String getAntiRansomwareCapacity() {
            return this.antiRansomwareCapacity;
        }

        /**
         * @return antiRansomwareService
         */
        public Integer getAntiRansomwareService() {
            return this.antiRansomwareService;
        }

        /**
         * @return antiVirusCore
         */
        public String getAntiVirusCore() {
            return this.antiVirusCore;
        }

        /**
         * @return containerCore
         */
        public String getContainerCore() {
            return this.containerCore;
        }

        /**
         * @return containerCount
         */
        public String getContainerCount() {
            return this.containerCount;
        }

        /**
         * @return cspmCapacity
         */
        public String getCspmCapacity() {
            return this.cspmCapacity;
        }

        /**
         * @return enterpriseCount
         */
        public String getEnterpriseCount() {
            return this.enterpriseCount;
        }

        /**
         * @return honeypotCapacity
         */
        public String getHoneypotCapacity() {
            return this.honeypotCapacity;
        }

        /**
         * @return imageScanCapacity
         */
        public String getImageScanCapacity() {
            return this.imageScanCapacity;
        }

        /**
         * @return raspCapacity
         */
        public String getRaspCapacity() {
            return this.raspCapacity;
        }

        /**
         * @return sdkCapacity
         */
        public String getSdkCapacity() {
            return this.sdkCapacity;
        }

        /**
         * @return slsCapacity
         */
        public String getSlsCapacity() {
            return this.slsCapacity;
        }

        /**
         * @return threatAnalysisCapacity
         */
        public String getThreatAnalysisCapacity() {
            return this.threatAnalysisCapacity;
        }

        /**
         * @return threatAnalysisFlow
         */
        public String getThreatAnalysisFlow() {
            return this.threatAnalysisFlow;
        }

        /**
         * @return webLockCapacity
         */
        public String getWebLockCapacity() {
            return this.webLockCapacity;
        }

        public static final class Builder {
            private String advancedCount; 
            private String antiRansomwareCapacity; 
            private Integer antiRansomwareService; 
            private String antiVirusCore; 
            private String containerCore; 
            private String containerCount; 
            private String cspmCapacity; 
            private String enterpriseCount; 
            private String honeypotCapacity; 
            private String imageScanCapacity; 
            private String raspCapacity; 
            private String sdkCapacity; 
            private String slsCapacity; 
            private String threatAnalysisCapacity; 
            private String threatAnalysisFlow; 
            private String webLockCapacity; 

            private Builder() {
            } 

            private Builder(InstanceAuthRange model) {
                this.advancedCount = model.advancedCount;
                this.antiRansomwareCapacity = model.antiRansomwareCapacity;
                this.antiRansomwareService = model.antiRansomwareService;
                this.antiVirusCore = model.antiVirusCore;
                this.containerCore = model.containerCore;
                this.containerCount = model.containerCount;
                this.cspmCapacity = model.cspmCapacity;
                this.enterpriseCount = model.enterpriseCount;
                this.honeypotCapacity = model.honeypotCapacity;
                this.imageScanCapacity = model.imageScanCapacity;
                this.raspCapacity = model.raspCapacity;
                this.sdkCapacity = model.sdkCapacity;
                this.slsCapacity = model.slsCapacity;
                this.threatAnalysisCapacity = model.threatAnalysisCapacity;
                this.threatAnalysisFlow = model.threatAnalysisFlow;
                this.webLockCapacity = model.webLockCapacity;
            } 

            /**
             * AdvancedCount.
             */
            public Builder advancedCount(String advancedCount) {
                this.advancedCount = advancedCount;
                return this;
            }

            /**
             * AntiRansomwareCapacity.
             */
            public Builder antiRansomwareCapacity(String antiRansomwareCapacity) {
                this.antiRansomwareCapacity = antiRansomwareCapacity;
                return this;
            }

            /**
             * AntiRansomwareService.
             */
            public Builder antiRansomwareService(Integer antiRansomwareService) {
                this.antiRansomwareService = antiRansomwareService;
                return this;
            }

            /**
             * AntiVirusCore.
             */
            public Builder antiVirusCore(String antiVirusCore) {
                this.antiVirusCore = antiVirusCore;
                return this;
            }

            /**
             * ContainerCore.
             */
            public Builder containerCore(String containerCore) {
                this.containerCore = containerCore;
                return this;
            }

            /**
             * ContainerCount.
             */
            public Builder containerCount(String containerCount) {
                this.containerCount = containerCount;
                return this;
            }

            /**
             * CspmCapacity.
             */
            public Builder cspmCapacity(String cspmCapacity) {
                this.cspmCapacity = cspmCapacity;
                return this;
            }

            /**
             * EnterpriseCount.
             */
            public Builder enterpriseCount(String enterpriseCount) {
                this.enterpriseCount = enterpriseCount;
                return this;
            }

            /**
             * HoneypotCapacity.
             */
            public Builder honeypotCapacity(String honeypotCapacity) {
                this.honeypotCapacity = honeypotCapacity;
                return this;
            }

            /**
             * ImageScanCapacity.
             */
            public Builder imageScanCapacity(String imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * RaspCapacity.
             */
            public Builder raspCapacity(String raspCapacity) {
                this.raspCapacity = raspCapacity;
                return this;
            }

            /**
             * SdkCapacity.
             */
            public Builder sdkCapacity(String sdkCapacity) {
                this.sdkCapacity = sdkCapacity;
                return this;
            }

            /**
             * SlsCapacity.
             */
            public Builder slsCapacity(String slsCapacity) {
                this.slsCapacity = slsCapacity;
                return this;
            }

            /**
             * ThreatAnalysisCapacity.
             */
            public Builder threatAnalysisCapacity(String threatAnalysisCapacity) {
                this.threatAnalysisCapacity = threatAnalysisCapacity;
                return this;
            }

            /**
             * ThreatAnalysisFlow.
             */
            public Builder threatAnalysisFlow(String threatAnalysisFlow) {
                this.threatAnalysisFlow = threatAnalysisFlow;
                return this;
            }

            /**
             * WebLockCapacity.
             */
            public Builder webLockCapacity(String webLockCapacity) {
                this.webLockCapacity = webLockCapacity;
                return this;
            }

            public InstanceAuthRange build() {
                return new InstanceAuthRange(this);
            } 

        } 

    }
}
