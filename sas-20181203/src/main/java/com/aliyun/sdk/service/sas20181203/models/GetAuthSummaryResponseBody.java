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
 * {@link GetAuthSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthSummaryResponseBody</p>
 */
public class GetAuthSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowPartialBuy")
    private Integer allowPartialBuy;

    @com.aliyun.core.annotation.NameInMap("AllowUpgradePartialBuy")
    private Integer allowUpgradePartialBuy;

    @com.aliyun.core.annotation.NameInMap("AllowUserUnbind")
    private Integer allowUserUnbind;

    @com.aliyun.core.annotation.NameInMap("AutoBind")
    private Integer autoBind;

    @com.aliyun.core.annotation.NameInMap("DefaultAuthToAll")
    private Integer defaultAuthToAll;

    @com.aliyun.core.annotation.NameInMap("HasPreBindSetting")
    private Boolean hasPreBindSetting;

    @com.aliyun.core.annotation.NameInMap("HighestVersion")
    private Integer highestVersion;

    @com.aliyun.core.annotation.NameInMap("IsMultiVersion")
    private Integer isMultiVersion;

    @com.aliyun.core.annotation.NameInMap("Machine")
    private Machine machine;

    @com.aliyun.core.annotation.NameInMap("PostPaidHighestVersion")
    private String postPaidHighestVersion;

    @com.aliyun.core.annotation.NameInMap("PostPaidHostAutoBind")
    private String postPaidHostAutoBind;

    @com.aliyun.core.annotation.NameInMap("PostPaidHostAutoBindVersion")
    private String postPaidHostAutoBindVersion;

    @com.aliyun.core.annotation.NameInMap("PostPaidVersionSummary")
    private java.util.List<PostPaidVersionSummary> postPaidVersionSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VersionSummary")
    private java.util.List<VersionSummary> versionSummary;

    private GetAuthSummaryResponseBody(Builder builder) {
        this.allowPartialBuy = builder.allowPartialBuy;
        this.allowUpgradePartialBuy = builder.allowUpgradePartialBuy;
        this.allowUserUnbind = builder.allowUserUnbind;
        this.autoBind = builder.autoBind;
        this.defaultAuthToAll = builder.defaultAuthToAll;
        this.hasPreBindSetting = builder.hasPreBindSetting;
        this.highestVersion = builder.highestVersion;
        this.isMultiVersion = builder.isMultiVersion;
        this.machine = builder.machine;
        this.postPaidHighestVersion = builder.postPaidHighestVersion;
        this.postPaidHostAutoBind = builder.postPaidHostAutoBind;
        this.postPaidHostAutoBindVersion = builder.postPaidHostAutoBindVersion;
        this.postPaidVersionSummary = builder.postPaidVersionSummary;
        this.requestId = builder.requestId;
        this.versionSummary = builder.versionSummary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowPartialBuy
     */
    public Integer getAllowPartialBuy() {
        return this.allowPartialBuy;
    }

    /**
     * @return allowUpgradePartialBuy
     */
    public Integer getAllowUpgradePartialBuy() {
        return this.allowUpgradePartialBuy;
    }

    /**
     * @return allowUserUnbind
     */
    public Integer getAllowUserUnbind() {
        return this.allowUserUnbind;
    }

    /**
     * @return autoBind
     */
    public Integer getAutoBind() {
        return this.autoBind;
    }

    /**
     * @return defaultAuthToAll
     */
    public Integer getDefaultAuthToAll() {
        return this.defaultAuthToAll;
    }

    /**
     * @return hasPreBindSetting
     */
    public Boolean getHasPreBindSetting() {
        return this.hasPreBindSetting;
    }

    /**
     * @return highestVersion
     */
    public Integer getHighestVersion() {
        return this.highestVersion;
    }

    /**
     * @return isMultiVersion
     */
    public Integer getIsMultiVersion() {
        return this.isMultiVersion;
    }

    /**
     * @return machine
     */
    public Machine getMachine() {
        return this.machine;
    }

    /**
     * @return postPaidHighestVersion
     */
    public String getPostPaidHighestVersion() {
        return this.postPaidHighestVersion;
    }

    /**
     * @return postPaidHostAutoBind
     */
    public String getPostPaidHostAutoBind() {
        return this.postPaidHostAutoBind;
    }

    /**
     * @return postPaidHostAutoBindVersion
     */
    public String getPostPaidHostAutoBindVersion() {
        return this.postPaidHostAutoBindVersion;
    }

    /**
     * @return postPaidVersionSummary
     */
    public java.util.List<PostPaidVersionSummary> getPostPaidVersionSummary() {
        return this.postPaidVersionSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return versionSummary
     */
    public java.util.List<VersionSummary> getVersionSummary() {
        return this.versionSummary;
    }

    public static final class Builder {
        private Integer allowPartialBuy; 
        private Integer allowUpgradePartialBuy; 
        private Integer allowUserUnbind; 
        private Integer autoBind; 
        private Integer defaultAuthToAll; 
        private Boolean hasPreBindSetting; 
        private Integer highestVersion; 
        private Integer isMultiVersion; 
        private Machine machine; 
        private String postPaidHighestVersion; 
        private String postPaidHostAutoBind; 
        private String postPaidHostAutoBindVersion; 
        private java.util.List<PostPaidVersionSummary> postPaidVersionSummary; 
        private String requestId; 
        private java.util.List<VersionSummary> versionSummary; 

        /**
         * <p>Indicates whether you can purchase protection quota on demand when you purchase Security Center. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowPartialBuy(Integer allowPartialBuy) {
            this.allowPartialBuy = allowPartialBuy;
            return this;
        }

        /**
         * <p>Indicates whether you can purchase protection quota on demand after an upgrade. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowUpgradePartialBuy(Integer allowUpgradePartialBuy) {
            this.allowUpgradePartialBuy = allowUpgradePartialBuy;
            return this;
        }

        /**
         * <p>Indicates whether all bound assets can be immediately unbound. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowUserUnbind(Integer allowUserUnbind) {
            this.allowUserUnbind = allowUserUnbind;
            return this;
        }

        /**
         * <p>Indicates whether automatic binding is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoBind(Integer autoBind) {
            this.autoBind = autoBind;
            return this;
        }

        /**
         * <p>Indicates whether the protection quota is supported for all assets. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defaultAuthToAll(Integer defaultAuthToAll) {
            this.defaultAuthToAll = defaultAuthToAll;
            return this;
        }

        /**
         * <p>Indicates whether pre-bound assets exist. If you select assets to bind when you purchase Security Center, pre-bound assets exist. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hasPreBindSetting(Boolean hasPreBindSetting) {
            this.hasPreBindSetting = hasPreBindSetting;
            return this;
        }

        /**
         * <p>The most advanced edition that is used. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * <li><strong>10</strong>: Value-added Plan edition</li>
         * </ul>
         * <blockquote>
         * <p> If you purchase Security Center Multi-edition, the value indicates the most advanced edition that is used. Otherwise, the value indicates the specific edition that is purchased.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder highestVersion(Integer highestVersion) {
            this.highestVersion = highestVersion;
            return this;
        }

        /**
         * <p>Indicates whether Security Center Multi-edition is purchased. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isMultiVersion(Integer isMultiVersion) {
            this.isMultiVersion = isMultiVersion;
            return this;
        }

        /**
         * <p>The statistics of the protection quota for assets.</p>
         */
        public Builder machine(Machine machine) {
            this.machine = machine;
            return this;
        }

        /**
         * <p>Activate the pay-as-you-go service protection version for hosts and container security, which is the highest protection version among all bound hosts. Values:   - <strong>1</strong>: Free Edition  - <strong>3</strong>: Enterprise Edition - <strong>5</strong>: Advanced Edition - <strong>6</strong>: Antivirus Edition     - <strong>7</strong>: Flagship Edition</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder postPaidHighestVersion(String postPaidHighestVersion) {
            this.postPaidHighestVersion = postPaidHighestVersion;
            return this;
        }

        /**
         * <p>The pay-as-you-go service for host and container security adds an automatic binding identifier for new hosts, with values: - <strong>0</strong>: Off - <strong>1</strong>: On</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder postPaidHostAutoBind(String postPaidHostAutoBind) {
            this.postPaidHostAutoBind = postPaidHostAutoBind;
            return this;
        }

        /**
         * <p>The version for the pay-as-you-go service of host and container security to automatically bind new assets, with values: - <strong>1</strong>: Free Edition - <strong>3</strong>: Enterprise Edition - <strong>5</strong>: Advanced Edition - <strong>6</strong>: Antivirus Edition - <strong>7</strong>: Flagship Edition</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder postPaidHostAutoBindVersion(String postPaidHostAutoBindVersion) {
            this.postPaidHostAutoBindVersion = postPaidHostAutoBindVersion;
            return this;
        }

        /**
         * <p>Statistics on pay-as-you-go service authorization for host and container security.</p>
         */
        public Builder postPaidVersionSummary(java.util.List<PostPaidVersionSummary> postPaidVersionSummary) {
            this.postPaidVersionSummary = postPaidVersionSummary;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-***-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The quota consumption statistics.</p>
         */
        public Builder versionSummary(java.util.List<VersionSummary> versionSummary) {
            this.versionSummary = versionSummary;
            return this;
        }

        public GetAuthSummaryResponseBody build() {
            return new GetAuthSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthSummaryResponseBody</p>
     */
    public static class Machine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindCoreCount")
        private Integer bindCoreCount;

        @com.aliyun.core.annotation.NameInMap("BindEcsCount")
        private Integer bindEcsCount;

        @com.aliyun.core.annotation.NameInMap("PostPaidBindCoreCount")
        private Integer postPaidBindCoreCount;

        @com.aliyun.core.annotation.NameInMap("PostPaidBindEcsCount")
        private Integer postPaidBindEcsCount;

        @com.aliyun.core.annotation.NameInMap("RiskCoreCount")
        private Integer riskCoreCount;

        @com.aliyun.core.annotation.NameInMap("RiskEcsCount")
        private Integer riskEcsCount;

        @com.aliyun.core.annotation.NameInMap("TotalCoreCount")
        private Integer totalCoreCount;

        @com.aliyun.core.annotation.NameInMap("TotalEcsCount")
        private Integer totalEcsCount;

        @com.aliyun.core.annotation.NameInMap("UnBindCoreCount")
        private Integer unBindCoreCount;

        @com.aliyun.core.annotation.NameInMap("UnBindEcsCount")
        private Integer unBindEcsCount;

        private Machine(Builder builder) {
            this.bindCoreCount = builder.bindCoreCount;
            this.bindEcsCount = builder.bindEcsCount;
            this.postPaidBindCoreCount = builder.postPaidBindCoreCount;
            this.postPaidBindEcsCount = builder.postPaidBindEcsCount;
            this.riskCoreCount = builder.riskCoreCount;
            this.riskEcsCount = builder.riskEcsCount;
            this.totalCoreCount = builder.totalCoreCount;
            this.totalEcsCount = builder.totalEcsCount;
            this.unBindCoreCount = builder.unBindCoreCount;
            this.unBindEcsCount = builder.unBindEcsCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Machine create() {
            return builder().build();
        }

        /**
         * @return bindCoreCount
         */
        public Integer getBindCoreCount() {
            return this.bindCoreCount;
        }

        /**
         * @return bindEcsCount
         */
        public Integer getBindEcsCount() {
            return this.bindEcsCount;
        }

        /**
         * @return postPaidBindCoreCount
         */
        public Integer getPostPaidBindCoreCount() {
            return this.postPaidBindCoreCount;
        }

        /**
         * @return postPaidBindEcsCount
         */
        public Integer getPostPaidBindEcsCount() {
            return this.postPaidBindEcsCount;
        }

        /**
         * @return riskCoreCount
         */
        public Integer getRiskCoreCount() {
            return this.riskCoreCount;
        }

        /**
         * @return riskEcsCount
         */
        public Integer getRiskEcsCount() {
            return this.riskEcsCount;
        }

        /**
         * @return totalCoreCount
         */
        public Integer getTotalCoreCount() {
            return this.totalCoreCount;
        }

        /**
         * @return totalEcsCount
         */
        public Integer getTotalEcsCount() {
            return this.totalEcsCount;
        }

        /**
         * @return unBindCoreCount
         */
        public Integer getUnBindCoreCount() {
            return this.unBindCoreCount;
        }

        /**
         * @return unBindEcsCount
         */
        public Integer getUnBindEcsCount() {
            return this.unBindEcsCount;
        }

        public static final class Builder {
            private Integer bindCoreCount; 
            private Integer bindEcsCount; 
            private Integer postPaidBindCoreCount; 
            private Integer postPaidBindEcsCount; 
            private Integer riskCoreCount; 
            private Integer riskEcsCount; 
            private Integer totalCoreCount; 
            private Integer totalEcsCount; 
            private Integer unBindCoreCount; 
            private Integer unBindEcsCount; 

            /**
             * <p>The number of cores of the assets that are bound to Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bindCoreCount(Integer bindCoreCount) {
                this.bindCoreCount = bindCoreCount;
                return this;
            }

            /**
             * <p>The number of the assets that are bound to Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bindEcsCount(Integer bindEcsCount) {
                this.bindEcsCount = bindEcsCount;
                return this;
            }

            /**
             * <p>Bind the number of cores for postpaid authorization assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder postPaidBindCoreCount(Integer postPaidBindCoreCount) {
                this.postPaidBindCoreCount = postPaidBindCoreCount;
                return this;
            }

            /**
             * <p>The number of assets bound to the postpaid authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder postPaidBindEcsCount(Integer postPaidBindEcsCount) {
                this.postPaidBindEcsCount = postPaidBindEcsCount;
                return this;
            }

            /**
             * <p>The number of cores of the assets that are at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder riskCoreCount(Integer riskCoreCount) {
                this.riskCoreCount = riskCoreCount;
                return this;
            }

            /**
             * <p>The number of the assets that are at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder riskEcsCount(Integer riskEcsCount) {
                this.riskEcsCount = riskEcsCount;
                return this;
            }

            /**
             * <p>The total number of asset cores.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCoreCount(Integer totalCoreCount) {
                this.totalCoreCount = totalCoreCount;
                return this;
            }

            /**
             * <p>The total number of assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalEcsCount(Integer totalEcsCount) {
                this.totalEcsCount = totalEcsCount;
                return this;
            }

            /**
             * <p>The number of cores of unbound assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unBindCoreCount(Integer unBindCoreCount) {
                this.unBindCoreCount = unBindCoreCount;
                return this;
            }

            /**
             * <p>The number of unbound assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unBindEcsCount(Integer unBindEcsCount) {
                this.unBindEcsCount = unBindEcsCount;
                return this;
            }

            public Machine build() {
                return new Machine(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAuthSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthSummaryResponseBody</p>
     */
    public static class PostPaidVersionSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthBindType")
        private String authBindType;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("UsedCoreCount")
        private Long usedCoreCount;

        @com.aliyun.core.annotation.NameInMap("UsedEcsCount")
        private Long usedEcsCount;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private PostPaidVersionSummary(Builder builder) {
            this.authBindType = builder.authBindType;
            this.index = builder.index;
            this.usedCoreCount = builder.usedCoreCount;
            this.usedEcsCount = builder.usedEcsCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostPaidVersionSummary create() {
            return builder().build();
        }

        /**
         * @return authBindType
         */
        public String getAuthBindType() {
            return this.authBindType;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return usedCoreCount
         */
        public Long getUsedCoreCount() {
            return this.usedCoreCount;
        }

        /**
         * @return usedEcsCount
         */
        public Long getUsedEcsCount() {
            return this.usedEcsCount;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String authBindType; 
            private Integer index; 
            private Long usedCoreCount; 
            private Long usedEcsCount; 
            private Integer version; 

            /**
             * <p>The type of authorization consumed during binding, with values: - <strong>ASSET</strong>: Consumes the number of authorized devices - <strong>CORE</strong>: Consumes the number of authorized cores - <strong>ASSET_AND_CORE</strong>: Consumes both the number of authorized devices and cores.</p>
             * 
             * <strong>example:</strong>
             * <p>ASSET</p>
             */
            public Builder authBindType(String authBindType) {
                this.authBindType = authBindType;
                return this;
            }

            /**
             * <p>Current version index, the higher the number, the newer the version, used for sorting. Values: - <strong>1</strong>: Free Edition - <strong>2</strong>: Anti-virus Edition - <strong>3</strong>: Advanced Edition - <strong>4</strong>: Enterprise Edition - <strong>5</strong>: Flagship Edition</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Number of authorized cores used. &gt; This parameter is valid when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedCoreCount(Long usedCoreCount) {
                this.usedCoreCount = usedCoreCount;
                return this;
            }

            /**
             * <p>Number of authorized devices used. &gt; This parameter is valid when AuthBindType is ASSET or ASSET_AND_CORE.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedEcsCount(Long usedEcsCount) {
                this.usedEcsCount = usedEcsCount;
                return this;
            }

            /**
             * <p>Bound host assets with postpaid versions, values:   - <strong>1</strong>: Free version  - <strong>3</strong>: Enterprise version - <strong>5</strong>: Advanced version - <strong>6</strong>: Anti-virus version     - <strong>7</strong>: Flagship version</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public PostPaidVersionSummary build() {
                return new PostPaidVersionSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAuthSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthSummaryResponseBody</p>
     */
    public static class VersionSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthBindType")
        private String authBindType;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("TotalCoreAuthCount")
        private Integer totalCoreAuthCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalEcsAuthCount")
        private Integer totalEcsAuthCount;

        @com.aliyun.core.annotation.NameInMap("UnUsedCount")
        private Integer unUsedCount;

        @com.aliyun.core.annotation.NameInMap("UnusedCoreAuthCount")
        private Integer unusedCoreAuthCount;

        @com.aliyun.core.annotation.NameInMap("UnusedEcsAuthCount")
        private Integer unusedEcsAuthCount;

        @com.aliyun.core.annotation.NameInMap("UsedCoreCount")
        private Integer usedCoreCount;

        @com.aliyun.core.annotation.NameInMap("UsedEcsCount")
        private Integer usedEcsCount;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private VersionSummary(Builder builder) {
            this.authBindType = builder.authBindType;
            this.index = builder.index;
            this.totalCoreAuthCount = builder.totalCoreAuthCount;
            this.totalCount = builder.totalCount;
            this.totalEcsAuthCount = builder.totalEcsAuthCount;
            this.unUsedCount = builder.unUsedCount;
            this.unusedCoreAuthCount = builder.unusedCoreAuthCount;
            this.unusedEcsAuthCount = builder.unusedEcsAuthCount;
            this.usedCoreCount = builder.usedCoreCount;
            this.usedEcsCount = builder.usedEcsCount;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionSummary create() {
            return builder().build();
        }

        /**
         * @return authBindType
         */
        public String getAuthBindType() {
            return this.authBindType;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return totalCoreAuthCount
         */
        public Integer getTotalCoreAuthCount() {
            return this.totalCoreAuthCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalEcsAuthCount
         */
        public Integer getTotalEcsAuthCount() {
            return this.totalEcsAuthCount;
        }

        /**
         * @return unUsedCount
         */
        public Integer getUnUsedCount() {
            return this.unUsedCount;
        }

        /**
         * @return unusedCoreAuthCount
         */
        public Integer getUnusedCoreAuthCount() {
            return this.unusedCoreAuthCount;
        }

        /**
         * @return unusedEcsAuthCount
         */
        public Integer getUnusedEcsAuthCount() {
            return this.unusedEcsAuthCount;
        }

        /**
         * @return usedCoreCount
         */
        public Integer getUsedCoreCount() {
            return this.usedCoreCount;
        }

        /**
         * @return usedEcsCount
         */
        public Integer getUsedEcsCount() {
            return this.usedEcsCount;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String authBindType; 
            private Integer index; 
            private Integer totalCoreAuthCount; 
            private Integer totalCount; 
            private Integer totalEcsAuthCount; 
            private Integer unUsedCount; 
            private Integer unusedCoreAuthCount; 
            private Integer unusedEcsAuthCount; 
            private Integer usedCoreCount; 
            private Integer usedEcsCount; 
            private Integer version; 

            /**
             * <p>The type of the quota that is consumed. Valid values:</p>
             * <ul>
             * <li>ASSET: quota of servers.</li>
             * <li>CORE: quota of server cores.</li>
             * <li>ASSET_AND_CORE: both.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ASSET</p>
             */
            public Builder authBindType(String authBindType) {
                this.authBindType = authBindType;
                return this;
            }

            /**
             * <p>The index of the current edition. The smaller the value, the higher the edition. The index is used for sorting.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The total quota of server cores.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to CORE or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCoreAuthCount(Integer totalCoreAuthCount) {
                this.totalCoreAuthCount = totalCoreAuthCount;
                return this;
            }

            /**
             * <p>The total quota of servers in the current edition.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total quota of servers.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalEcsAuthCount(Integer totalEcsAuthCount) {
                this.totalEcsAuthCount = totalEcsAuthCount;
                return this;
            }

            /**
             * <p>The remaining quota of servers.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unUsedCount(Integer unUsedCount) {
                this.unUsedCount = unUsedCount;
                return this;
            }

            /**
             * <p>The remaining quota of server cores.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to CORE or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unusedCoreAuthCount(Integer unusedCoreAuthCount) {
                this.unusedCoreAuthCount = unusedCoreAuthCount;
                return this;
            }

            /**
             * <p>The remaining quota of servers.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unusedEcsAuthCount(Integer unusedEcsAuthCount) {
                this.unusedEcsAuthCount = unusedEcsAuthCount;
                return this;
            }

            /**
             * <p>The consumed quota of server cores.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to CORE or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedCoreCount(Integer usedCoreCount) {
                this.usedCoreCount = usedCoreCount;
                return this;
            }

            /**
             * <p>The used quota of servers.</p>
             * <blockquote>
             * <p> This parameter takes effect only if AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedEcsCount(Integer usedEcsCount) {
                this.usedEcsCount = usedEcsCount;
                return this;
            }

            /**
             * <p>The edition of purchased Security Center. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic edition</li>
             * <li><strong>3</strong>: Enterprise edition</li>
             * <li><strong>5</strong>: Advanced edition</li>
             * <li><strong>6</strong>: Anti-virus edition</li>
             * <li><strong>7</strong>: Ultimate edition</li>
             * <li><strong>8</strong>: Multi-edition</li>
             * <li><strong>10</strong>: Value-added Plan edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
}
