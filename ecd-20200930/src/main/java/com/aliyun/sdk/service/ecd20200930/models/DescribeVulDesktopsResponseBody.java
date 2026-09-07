// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeVulDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulDesktopsResponseBody</p>
 */
public class DescribeVulDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VulDesktops")
    private java.util.List<VulDesktops> vulDesktops;

    private DescribeVulDesktopsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vulDesktops = builder.vulDesktops;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDesktopsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vulDesktops
     */
    public java.util.List<VulDesktops> getVulDesktops() {
        return this.vulDesktops;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VulDesktops> vulDesktops; 

        private Builder() {
        } 

        private Builder(DescribeVulDesktopsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vulDesktops = model.vulDesktops;
        } 

        /**
         * <p>The number of entries per page in a paged query.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. An empty value indicates that no more results exist.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kRxd1mKkNnHlUy14zdjl/I</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of cloud computers affected by the vulnerability.</p>
         */
        public Builder vulDesktops(java.util.List<VulDesktops> vulDesktops) {
            this.vulDesktops = vulDesktops;
            return this;
        }

        public DescribeVulDesktopsResponseBody build() {
            return new DescribeVulDesktopsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulDesktopsResponseBody</p>
     */
    public static class Cves extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("CveLevel")
        private String cveLevel;

        @com.aliyun.core.annotation.NameInMap("CveTitle")
        private String cveTitle;

        @com.aliyun.core.annotation.NameInMap("CveUrl")
        private String cveUrl;

        @com.aliyun.core.annotation.NameInMap("ImpactScore")
        private String impactScore;

        @com.aliyun.core.annotation.NameInMap("ReferenceUrl")
        private String referenceUrl;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        private Cves(Builder builder) {
            this.cveId = builder.cveId;
            this.cveLevel = builder.cveLevel;
            this.cveTitle = builder.cveTitle;
            this.cveUrl = builder.cveUrl;
            this.impactScore = builder.impactScore;
            this.referenceUrl = builder.referenceUrl;
            this.releaseTime = builder.releaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cves create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cveLevel
         */
        public String getCveLevel() {
            return this.cveLevel;
        }

        /**
         * @return cveTitle
         */
        public String getCveTitle() {
            return this.cveTitle;
        }

        /**
         * @return cveUrl
         */
        public String getCveUrl() {
            return this.cveUrl;
        }

        /**
         * @return impactScore
         */
        public String getImpactScore() {
            return this.impactScore;
        }

        /**
         * @return referenceUrl
         */
        public String getReferenceUrl() {
            return this.referenceUrl;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public static final class Builder {
            private String cveId; 
            private String cveLevel; 
            private String cveTitle; 
            private String cveUrl; 
            private String impactScore; 
            private String referenceUrl; 
            private String releaseTime; 

            private Builder() {
            } 

            private Builder(Cves model) {
                this.cveId = model.cveId;
                this.cveLevel = model.cveLevel;
                this.cveTitle = model.cveTitle;
                this.cveUrl = model.cveUrl;
                this.impactScore = model.impactScore;
                this.referenceUrl = model.referenceUrl;
                this.releaseTime = model.releaseTime;
            } 

            /**
             * <p>The CVE ID.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2026-62690</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The vulnerability level.</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder cveLevel(String cveLevel) {
                this.cveLevel = cveLevel;
                return this;
            }

            /**
             * <p>The vulnerability name.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows Push Notification Elevation of Privilege Vulnerability</p>
             */
            public Builder cveTitle(String cveTitle) {
                this.cveTitle = cveTitle;
                return this;
            }

            /**
             * <p>The CVE URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://avd.aliyun.com/detail/CVE-2026-62690">https://avd.aliyun.com/detail/CVE-2026-62690</a></p>
             */
            public Builder cveUrl(String cveUrl) {
                this.cveUrl = cveUrl;
                return this;
            }

            /**
             * <p>The vulnerability score.</p>
             * 
             * <strong>example:</strong>
             * <p>7.0</p>
             */
            public Builder impactScore(String impactScore) {
                this.impactScore = impactScore;
                return this;
            }

            /**
             * <p>The reference URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://msrc.microsoft.com/update-guide/vulnerability/CVE-2026-62690">https://msrc.microsoft.com/update-guide/vulnerability/CVE-2026-62690</a></p>
             */
            public Builder referenceUrl(String referenceUrl) {
                this.referenceUrl = referenceUrl;
                return this;
            }

            /**
             * <p>The release time. The time follows the ISO 8601 standard in UTC: yyyy-MM-ddTHH:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-11 07:00:00</p>
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            public Cves build() {
                return new Cves(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVulDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulDesktopsResponseBody</p>
     */
    public static class FixRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("FixFailureReason")
        private String fixFailureReason;

        @com.aliyun.core.annotation.NameInMap("FixResult")
        private String fixResult;

        @com.aliyun.core.annotation.NameInMap("FixTime")
        private String fixTime;

        @com.aliyun.core.annotation.NameInMap("FixType")
        private String fixType;

        private FixRecords(Builder builder) {
            this.batchId = builder.batchId;
            this.fixFailureReason = builder.fixFailureReason;
            this.fixResult = builder.fixResult;
            this.fixTime = builder.fixTime;
            this.fixType = builder.fixType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixRecords create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return fixFailureReason
         */
        public String getFixFailureReason() {
            return this.fixFailureReason;
        }

        /**
         * @return fixResult
         */
        public String getFixResult() {
            return this.fixResult;
        }

        /**
         * @return fixTime
         */
        public String getFixTime() {
            return this.fixTime;
        }

        /**
         * @return fixType
         */
        public String getFixType() {
            return this.fixType;
        }

        public static final class Builder {
            private String batchId; 
            private String fixFailureReason; 
            private String fixResult; 
            private String fixTime; 
            private String fixType; 

            private Builder() {
            } 

            private Builder(FixRecords model) {
                this.batchId = model.batchId;
                this.fixFailureReason = model.fixFailureReason;
                this.fixResult = model.fixResult;
                this.fixTime = model.fixTime;
                this.fixType = model.fixType;
            } 

            /**
             * <p>The batch ID of the scheduled task execution.</p>
             * 
             * <strong>example:</strong>
             * <p>d7f3d7bc-b98b-4da8-95ae-fea21b604b34</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The failure reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Update failed</p>
             */
            public Builder fixFailureReason(String fixFailureReason) {
                this.fixFailureReason = fixFailureReason;
                return this;
            }

            /**
             * <p>The fix result.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEED</p>
             */
            public Builder fixResult(String fixResult) {
                this.fixResult = fixResult;
                return this;
            }

            /**
             * <p>The timestamp when the fix task ended, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-05 13:57:31</p>
             */
            public Builder fixTime(String fixTime) {
                this.fixTime = fixTime;
                return this;
            }

            /**
             * <p>The fix type.</p>
             * 
             * <strong>example:</strong>
             * <p>AutoTask</p>
             */
            public Builder fixType(String fixType) {
                this.fixType = fixType;
                return this;
            }

            public FixRecords build() {
                return new FixRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVulDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulDesktopsResponseBody</p>
     */
    public static class VulDesktops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigGroupId")
        private String configGroupId;

        @com.aliyun.core.annotation.NameInMap("CveCount")
        private Integer cveCount;

        @com.aliyun.core.annotation.NameInMap("Cves")
        private java.util.List<Cves> cves;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("FirstFoundTime")
        private String firstFoundTime;

        @com.aliyun.core.annotation.NameInMap("FixRecords")
        private java.util.List<FixRecords> fixRecords;

        @com.aliyun.core.annotation.NameInMap("PatchIds")
        private java.util.List<String> patchIds;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VulLevel")
        private String vulLevel;

        private VulDesktops(Builder builder) {
            this.configGroupId = builder.configGroupId;
            this.cveCount = builder.cveCount;
            this.cves = builder.cves;
            this.desktopId = builder.desktopId;
            this.disabled = builder.disabled;
            this.firstFoundTime = builder.firstFoundTime;
            this.fixRecords = builder.fixRecords;
            this.patchIds = builder.patchIds;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.vulLevel = builder.vulLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulDesktops create() {
            return builder().build();
        }

        /**
         * @return configGroupId
         */
        public String getConfigGroupId() {
            return this.configGroupId;
        }

        /**
         * @return cveCount
         */
        public Integer getCveCount() {
            return this.cveCount;
        }

        /**
         * @return cves
         */
        public java.util.List<Cves> getCves() {
            return this.cves;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return firstFoundTime
         */
        public String getFirstFoundTime() {
            return this.firstFoundTime;
        }

        /**
         * @return fixRecords
         */
        public java.util.List<FixRecords> getFixRecords() {
            return this.fixRecords;
        }

        /**
         * @return patchIds
         */
        public java.util.List<String> getPatchIds() {
            return this.patchIds;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vulLevel
         */
        public String getVulLevel() {
            return this.vulLevel;
        }

        public static final class Builder {
            private String configGroupId; 
            private Integer cveCount; 
            private java.util.List<Cves> cves; 
            private String desktopId; 
            private Boolean disabled; 
            private String firstFoundTime; 
            private java.util.List<FixRecords> fixRecords; 
            private java.util.List<String> patchIds; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private String vulLevel; 

            private Builder() {
            } 

            private Builder(VulDesktops model) {
                this.configGroupId = model.configGroupId;
                this.cveCount = model.cveCount;
                this.cves = model.cves;
                this.desktopId = model.desktopId;
                this.disabled = model.disabled;
                this.firstFoundTime = model.firstFoundTime;
                this.fixRecords = model.fixRecords;
                this.patchIds = model.patchIds;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.vulLevel = model.vulLevel;
            } 

            /**
             * <p>The configuration task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccg-0bbay4w7bwbxd****</p>
             */
            public Builder configGroupId(String configGroupId) {
                this.configGroupId = configGroupId;
                return this;
            }

            /**
             * <p>The number of vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder cveCount(Integer cveCount) {
                this.cveCount = cveCount;
                return this;
            }

            /**
             * <p>The list of vulnerability details.</p>
             */
            public Builder cves(java.util.List<Cves> cves) {
                this.cves = cves;
                return this;
            }

            /**
             * <p>The ID of the cloud computer affected by the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-0jtd4z5binubxe32e</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>Indicates whether the activation code is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The time when the vulnerability was first discovered.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-05 00:00:00</p>
             */
            public Builder firstFoundTime(String firstFoundTime) {
                this.firstFoundTime = firstFoundTime;
                return this;
            }

            /**
             * <p>The list of fix records for the cloud computer.</p>
             */
            public Builder fixRecords(java.util.List<FixRecords> fixRecords) {
                this.fixRecords = fixRecords;
                return this;
            }

            /**
             * <p>The list of patch IDs.</p>
             */
            public Builder patchIds(java.util.List<String> patchIds) {
                this.patchIds = patchIds;
                return this;
            }

            /**
             * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The enterprise resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2tswogr****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The fix status of the patch.</p>
             * 
             * <strong>example:</strong>
             * <p>Fixed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The patch level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder vulLevel(String vulLevel) {
                this.vulLevel = vulLevel;
                return this;
            }

            public VulDesktops build() {
                return new VulDesktops(this);
            } 

        } 

    }
}
