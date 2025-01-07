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
