// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListArtifactRisksResponseBody} extends {@link TeaModel}
 *
 * <p>ListArtifactRisksResponseBody</p>
 */
public class ListArtifactRisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactRiskList")
    private java.util.List<ArtifactRiskList> artifactRiskList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListArtifactRisksResponseBody(Builder builder) {
        this.artifactRiskList = builder.artifactRiskList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactRisksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactRiskList
     */
    public java.util.List<ArtifactRiskList> getArtifactRiskList() {
        return this.artifactRiskList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ArtifactRiskList> artifactRiskList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListArtifactRisksResponseBody model) {
            this.artifactRiskList = model.artifactRiskList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of artifact risks</p>
         */
        public Builder artifactRiskList(java.util.List<ArtifactRiskList> artifactRiskList) {
            this.artifactRiskList = artifactRiskList;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52919DB1-03A0-55F5-BDD4-DB6DEBB8267A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListArtifactRisksResponseBody build() {
            return new ListArtifactRisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListArtifactRisksResponseBody} extends {@link TeaModel}
     *
     * <p>ListArtifactRisksResponseBody</p>
     */
    public static class ArtifactRiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CveNos")
        private String cveNos;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("RiskTypeName")
        private String riskTypeName;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        private ArtifactRiskList(Builder builder) {
            this.cveNos = builder.cveNos;
            this.extendInfo = builder.extendInfo;
            this.level = builder.level;
            this.riskName = builder.riskName;
            this.riskType = builder.riskType;
            this.riskTypeName = builder.riskTypeName;
            this.solution = builder.solution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactRiskList create() {
            return builder().build();
        }

        /**
         * @return cveNos
         */
        public String getCveNos() {
            return this.cveNos;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return riskTypeName
         */
        public String getRiskTypeName() {
            return this.riskTypeName;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        public static final class Builder {
            private String cveNos; 
            private String extendInfo; 
            private String level; 
            private String riskName; 
            private String riskType; 
            private String riskTypeName; 
            private String solution; 

            private Builder() {
            } 

            private Builder(ArtifactRiskList model) {
                this.cveNos = model.cveNos;
                this.extendInfo = model.extendInfo;
                this.level = model.level;
                this.riskName = model.riskName;
                this.riskType = model.riskType;
                this.riskTypeName = model.riskTypeName;
                this.solution = model.solution;
            } 

            /**
             * <p>CVE numbers</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2023-4911</p>
             */
            public Builder cveNos(String cveNos) {
                this.cveNos = cveNos;
                return this;
            }

            /**
             * <p>Extended information, in JSON format, to be parsed according to the risk category</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;feature&quot;: &quot;ntpdate&quot;, 
             *   &quot;version&quot;: &quot;4.2.6&quot;, 
             *   &quot;cveLocation&quot;: &quot;/usr/lib&quot; 
             * }</p>
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * <p>Risk level:</p>
             * <ul>
             * <li>high represents high</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Risk name.</p>
             * 
             * <strong>example:</strong>
             * <p>USN-3686-1: file vulnerabilities</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * <p>Risk type. Values:</p>
             * <ul>
             * <li>AcrCve  Container image system vulnerability</li>
             * <li>AcrSca  Container image application vulnerability</li>
             * <li>EcsVulnerability  ECS image vulnerability information</li>
             * <li>EcsAlarm  ECS image security alarm</li>
             * <li>EcsBaseline  ECS image baseline check</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AcrCve</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * <p>Risk Type name</p>
             * 
             * <strong>example:</strong>
             * <p>Container System Vulner</p>
             */
            public Builder riskTypeName(String riskTypeName) {
                this.riskTypeName = riskTypeName;
                return this;
            }

            /**
             * <p>Solution for the risk item.</p>
             * 
             * <strong>example:</strong>
             * <p>apt-get update &amp;&amp; apt-get install ntpdate --only-upgrade</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            public ArtifactRiskList build() {
                return new ArtifactRiskList(this);
            } 

        } 

    }
}
