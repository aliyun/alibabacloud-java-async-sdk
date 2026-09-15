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

    @com.aliyun.core.annotation.NameInMap("ClusterNodeCheck")
    private Integer clusterNodeCheck;

    @com.aliyun.core.annotation.NameInMap("DefaultAuthToAll")
    private Integer defaultAuthToAll;

    @com.aliyun.core.annotation.NameInMap("EdrSummary")
    private EdrSummary edrSummary;

    @com.aliyun.core.annotation.NameInMap("HasPreBindSetting")
    private Boolean hasPreBindSetting;

    @com.aliyun.core.annotation.NameInMap("HighestVersion")
    private Integer highestVersion;

    @com.aliyun.core.annotation.NameInMap("InvalidBindStatus")
    private String invalidBindStatus;

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
        this.clusterNodeCheck = builder.clusterNodeCheck;
        this.defaultAuthToAll = builder.defaultAuthToAll;
        this.edrSummary = builder.edrSummary;
        this.hasPreBindSetting = builder.hasPreBindSetting;
        this.highestVersion = builder.highestVersion;
        this.invalidBindStatus = builder.invalidBindStatus;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return clusterNodeCheck
     */
    public Integer getClusterNodeCheck() {
        return this.clusterNodeCheck;
    }

    /**
     * @return defaultAuthToAll
     */
    public Integer getDefaultAuthToAll() {
        return this.defaultAuthToAll;
    }

    /**
     * @return edrSummary
     */
    public EdrSummary getEdrSummary() {
        return this.edrSummary;
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
     * @return invalidBindStatus
     */
    public String getInvalidBindStatus() {
        return this.invalidBindStatus;
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
        private Integer clusterNodeCheck; 
        private Integer defaultAuthToAll; 
        private EdrSummary edrSummary; 
        private Boolean hasPreBindSetting; 
        private Integer highestVersion; 
        private String invalidBindStatus; 
        private Integer isMultiVersion; 
        private Machine machine; 
        private String postPaidHighestVersion; 
        private String postPaidHostAutoBind; 
        private String postPaidHostAutoBindVersion; 
        private java.util.List<PostPaidVersionSummary> postPaidVersionSummary; 
        private String requestId; 
        private java.util.List<VersionSummary> versionSummary; 

        private Builder() {
        } 

        private Builder(GetAuthSummaryResponseBody model) {
            this.allowPartialBuy = model.allowPartialBuy;
            this.allowUpgradePartialBuy = model.allowUpgradePartialBuy;
            this.allowUserUnbind = model.allowUserUnbind;
            this.autoBind = model.autoBind;
            this.clusterNodeCheck = model.clusterNodeCheck;
            this.defaultAuthToAll = model.defaultAuthToAll;
            this.edrSummary = model.edrSummary;
            this.hasPreBindSetting = model.hasPreBindSetting;
            this.highestVersion = model.highestVersion;
            this.invalidBindStatus = model.invalidBindStatus;
            this.isMultiVersion = model.isMultiVersion;
            this.machine = model.machine;
            this.postPaidHighestVersion = model.postPaidHighestVersion;
            this.postPaidHostAutoBind = model.postPaidHostAutoBind;
            this.postPaidHostAutoBindVersion = model.postPaidHostAutoBindVersion;
            this.postPaidVersionSummary = model.postPaidVersionSummary;
            this.requestId = model.requestId;
            this.versionSummary = model.versionSummary;
        } 

        /**
         * <p>Indicates whether on-demand authorization purchase is allowed during initial purchase. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not allowed.</li>
         * <li><strong>1</strong>: Allowed.</li>
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
         * <p>Indicates whether upgrading to on-demand authorization purchase is allowed during an upgrade. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not allowed.</li>
         * <li><strong>1</strong>: Allowed.</li>
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
         * <p>Indicates whether immediate unbinding of all bound assets is allowed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
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
         * <p>Indicates whether new subscription assets are automatically bound when the host and container security subscription service is activated. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
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
         * <p>Indicates whether cluster nodes require agent version verification. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not required.</li>
         * <li><strong>1</strong>: Required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clusterNodeCheck(Integer clusterNodeCheck) {
            this.clusterNodeCheck = clusterNodeCheck;
            return this;
        }

        /**
         * <p>Indicates whether all assets are authorized by default. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
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
         * EdrSummary.
         */
        public Builder edrSummary(EdrSummary edrSummary) {
            this.edrSummary = edrSummary;
            return this;
        }

        /**
         * <p>Indicates whether a pre-bindingasset configuration exists. Pre-binding refers to the asset binding configuration selected in advance during purchase. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Does not exist.</li>
         * <li><strong>1</strong>: Exists.</li>
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
         * <p>The highest purchased edition of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Premium Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * <li><strong>10</strong>: Value-added services only.<blockquote>
         * <p>If a single edition is purchased, this value indicates the corresponding edition. If multiple editions are purchased, this value indicates the highest sub-edition.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder highestVersion(Integer highestVersion) {
            this.highestVersion = highestVersion;
            return this;
        }

        /**
         * <p>The binding validity status. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: Valid.</li>
         * <li><strong>INVALID_NODE_VERSION</strong>: Invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INVALID_NODE_VERSION</p>
         */
        public Builder invalidBindStatus(String invalidBindStatus) {
            this.invalidBindStatus = invalidBindStatus;
            return this;
        }

        /**
         * <p>Indicates whether multiple versions exist. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
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
         * <p>The asset authorization statistics information.</p>
         */
        public Builder machine(Machine machine) {
            this.machine = machine;
            return this;
        }

        /**
         * <p>The protection edition of the host and container security pay-as-you-go service. This is the highest protection edition among all bound hosts. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition. </li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Premium Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.    </li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder postPaidHighestVersion(String postPaidHighestVersion) {
            this.postPaidHighestVersion = postPaidHighestVersion;
            return this;
        }

        /**
         * <p>Indicates whether automatic binding of new hosts is enabled for the host and container security pay-as-you-go service. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder postPaidHostAutoBind(String postPaidHostAutoBind) {
            this.postPaidHostAutoBind = postPaidHostAutoBind;
            return this;
        }

        /**
         * <p>The edition to which new assets are automatically bound for the host and container security pay-as-you-go service. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition. </li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Premium Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.    </li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder postPaidHostAutoBindVersion(String postPaidHostAutoBindVersion) {
            this.postPaidHostAutoBindVersion = postPaidHostAutoBindVersion;
            return this;
        }

        /**
         * <p>The service authorization statistics for the host and container security pay-as-you-go service.</p>
         */
        public Builder postPaidVersionSummary(java.util.List<PostPaidVersionSummary> postPaidVersionSummary) {
            this.postPaidVersionSummary = postPaidVersionSummary;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-***-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The authorization usage statistics information.</p>
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
    public static class EdrSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundCount")
        private String boundCount;

        @com.aliyun.core.annotation.NameInMap("HybridPaidAutoBind")
        private String hybridPaidAutoBind;

        @com.aliyun.core.annotation.NameInMap("PostPaidAutoBind")
        private String postPaidAutoBind;

        private EdrSummary(Builder builder) {
            this.boundCount = builder.boundCount;
            this.hybridPaidAutoBind = builder.hybridPaidAutoBind;
            this.postPaidAutoBind = builder.postPaidAutoBind;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdrSummary create() {
            return builder().build();
        }

        /**
         * @return boundCount
         */
        public String getBoundCount() {
            return this.boundCount;
        }

        /**
         * @return hybridPaidAutoBind
         */
        public String getHybridPaidAutoBind() {
            return this.hybridPaidAutoBind;
        }

        /**
         * @return postPaidAutoBind
         */
        public String getPostPaidAutoBind() {
            return this.postPaidAutoBind;
        }

        public static final class Builder {
            private String boundCount; 
            private String hybridPaidAutoBind; 
            private String postPaidAutoBind; 

            private Builder() {
            } 

            private Builder(EdrSummary model) {
                this.boundCount = model.boundCount;
                this.hybridPaidAutoBind = model.hybridPaidAutoBind;
                this.postPaidAutoBind = model.postPaidAutoBind;
            } 

            /**
             * BoundCount.
             */
            public Builder boundCount(String boundCount) {
                this.boundCount = boundCount;
                return this;
            }

            /**
             * HybridPaidAutoBind.
             */
            public Builder hybridPaidAutoBind(String hybridPaidAutoBind) {
                this.hybridPaidAutoBind = hybridPaidAutoBind;
                return this;
            }

            /**
             * PostPaidAutoBind.
             */
            public Builder postPaidAutoBind(String postPaidAutoBind) {
                this.postPaidAutoBind = postPaidAutoBind;
                return this;
            }

            public EdrSummary build() {
                return new EdrSummary(this);
            } 

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

            private Builder() {
            } 

            private Builder(Machine model) {
                this.bindCoreCount = model.bindCoreCount;
                this.bindEcsCount = model.bindEcsCount;
                this.postPaidBindCoreCount = model.postPaidBindCoreCount;
                this.postPaidBindEcsCount = model.postPaidBindEcsCount;
                this.riskCoreCount = model.riskCoreCount;
                this.riskEcsCount = model.riskEcsCount;
                this.totalCoreCount = model.totalCoreCount;
                this.totalEcsCount = model.totalEcsCount;
                this.unBindCoreCount = model.unBindCoreCount;
                this.unBindEcsCount = model.unBindEcsCount;
            } 

            /**
             * <p>The number of cores of assets that are bound with authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bindCoreCount(Integer bindCoreCount) {
                this.bindCoreCount = bindCoreCount;
                return this;
            }

            /**
             * <p>The number of bound assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder bindEcsCount(Integer bindEcsCount) {
                this.bindEcsCount = bindEcsCount;
                return this;
            }

            /**
             * <p>The number of cores of assets bound with pay-as-you-go authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder postPaidBindCoreCount(Integer postPaidBindCoreCount) {
                this.postPaidBindCoreCount = postPaidBindCoreCount;
                return this;
            }

            /**
             * <p>The number of assets bound with pay-as-you-go authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder postPaidBindEcsCount(Integer postPaidBindEcsCount) {
                this.postPaidBindEcsCount = postPaidBindEcsCount;
                return this;
            }

            /**
             * <p>The number of cores of assets that have security risks.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder riskCoreCount(Integer riskCoreCount) {
                this.riskCoreCount = riskCoreCount;
                return this;
            }

            /**
             * <p>The number of assets that have security risks.</p>
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

        @com.aliyun.core.annotation.NameInMap("FreeCoreCount")
        private Integer freeCoreCount;

        @com.aliyun.core.annotation.NameInMap("FreeEcsCount")
        private Integer freeEcsCount;

        @com.aliyun.core.annotation.NameInMap("FreeType")
        private String freeType;

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
            this.freeCoreCount = builder.freeCoreCount;
            this.freeEcsCount = builder.freeEcsCount;
            this.freeType = builder.freeType;
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
         * @return freeCoreCount
         */
        public Integer getFreeCoreCount() {
            return this.freeCoreCount;
        }

        /**
         * @return freeEcsCount
         */
        public Integer getFreeEcsCount() {
            return this.freeEcsCount;
        }

        /**
         * @return freeType
         */
        public String getFreeType() {
            return this.freeType;
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
            private Integer freeCoreCount; 
            private Integer freeEcsCount; 
            private String freeType; 
            private Integer index; 
            private Long usedCoreCount; 
            private Long usedEcsCount; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(PostPaidVersionSummary model) {
                this.authBindType = model.authBindType;
                this.freeCoreCount = model.freeCoreCount;
                this.freeEcsCount = model.freeEcsCount;
                this.freeType = model.freeType;
                this.index = model.index;
                this.usedCoreCount = model.usedCoreCount;
                this.usedEcsCount = model.usedEcsCount;
                this.version = model.version;
            } 

            /**
             * <p>The type of authorization consumed during binding. Valid values:</p>
             * <ul>
             * <li><strong>ASSET</strong>: consumes authorized asset count.</li>
             * <li><strong>CORE</strong>: consumes authorized core count.</li>
             * <li><strong>ASSET_AND_CORE</strong>: consumes both authorized asset count and authorized core count.</li>
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
             * FreeCoreCount.
             */
            public Builder freeCoreCount(Integer freeCoreCount) {
                this.freeCoreCount = freeCoreCount;
                return this;
            }

            /**
             * FreeEcsCount.
             */
            public Builder freeEcsCount(Integer freeEcsCount) {
                this.freeEcsCount = freeEcsCount;
                return this;
            }

            /**
             * FreeType.
             */
            public Builder freeType(String freeType) {
                this.freeType = freeType;
                return this;
            }

            /**
             * <p>The index of the current edition. A larger value indicates a higher edition. This field is used for sorting. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Free Edition. </li>
             * <li><strong>2</strong>: Anti-virus Edition.    </li>
             * <li><strong>3</strong>: Premium Edition.</li>
             * <li><strong>4</strong>: Enterprise Edition.</li>
             * <li><strong>5</strong>: Ultimate Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The number of authorized cores that have been used.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedCoreCount(Long usedCoreCount) {
                this.usedCoreCount = usedCoreCount;
                return this;
            }

            /**
             * <p>The number of authorized assets that have been used.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedEcsCount(Long usedEcsCount) {
                this.usedEcsCount = usedEcsCount;
                return this;
            }

            /**
             * <p>The pay-as-you-go edition bound to host assets. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Free Edition. </li>
             * <li><strong>3</strong>: Enterprise Edition.</li>
             * <li><strong>5</strong>: Premium Edition.</li>
             * <li><strong>6</strong>: Anti-virus Edition.    </li>
             * <li><strong>7</strong>: Ultimate Edition.</li>
             * </ul>
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

            private Builder() {
            } 

            private Builder(VersionSummary model) {
                this.authBindType = model.authBindType;
                this.index = model.index;
                this.totalCoreAuthCount = model.totalCoreAuthCount;
                this.totalCount = model.totalCount;
                this.totalEcsAuthCount = model.totalEcsAuthCount;
                this.unUsedCount = model.unUsedCount;
                this.unusedCoreAuthCount = model.unusedCoreAuthCount;
                this.unusedEcsAuthCount = model.unusedEcsAuthCount;
                this.usedCoreCount = model.usedCoreCount;
                this.usedEcsCount = model.usedEcsCount;
                this.version = model.version;
            } 

            /**
             * <p>The type of authorization consumed during binding. Valid values:</p>
             * <ul>
             * <li>ASSET: consumes authorized asset count.</li>
             * <li>CORE: consumes authorized core count.</li>
             * <li>ASSET_AND_CORE: consumes both authorized asset count and authorized core count.</li>
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
             * <p>The index of the current edition. A larger value indicates a higher edition. This field is used for sorting. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Free Edition. </li>
             * <li><strong>2</strong>: Anti-virus Edition.    </li>
             * <li><strong>3</strong>: Premium Edition.</li>
             * <li><strong>4</strong>: Enterprise Edition.</li>
             * <li><strong>5</strong>: Ultimate Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The total number of authorized cores.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
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
             * <p>The total number of authorized assets for the current edition.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
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
             * <p>The total number of authorized assets.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
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
             * <p>The number of unused authorized assets.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
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
             * <p>The number of unused authorized cores.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
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
             * <p>The number of unused authorized assets.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
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
             * <p>The number of authorized cores that have been used.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to CORE or ASSET_AND_CORE.</p>
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
             * <p>The number of authorized assets that have been used.</p>
             * <blockquote>
             * <p>This parameter is valid only when AuthBindType is set to ASSET or ASSET_AND_CORE.</p>
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
             * <p>The purchased edition of Security Center. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Free Edition. </li>
             * <li><strong>3</strong>: Enterprise Edition.</li>
             * <li><strong>5</strong>: Premium Edition.</li>
             * <li><strong>6</strong>: Anti-virus Edition.    </li>
             * <li><strong>7</strong>: Ultimate Edition.   </li>
             * <li><strong>8</strong>: Multi-version.   </li>
             * <li><strong>10</strong>: Value-added services only.</li>
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
