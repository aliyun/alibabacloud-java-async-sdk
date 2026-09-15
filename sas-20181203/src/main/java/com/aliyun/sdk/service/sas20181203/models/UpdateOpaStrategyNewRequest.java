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
 * {@link UpdateOpaStrategyNewRequest} extends {@link RequestModel}
 *
 * <p>UpdateOpaStrategyNewRequest</p>
 */
public class UpdateOpaStrategyNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmDetail")
    private AlarmDetail alarmDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private java.util.List<String> imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private java.util.List<String> label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaliciousImage")
    private Boolean maliciousImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private Integer ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scopes")
    private java.util.List<Scopes> scopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyTemplateId")
    private Long strategyTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnScanedImage")
    private Boolean unScanedImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteList")
    private java.util.List<String> whiteList;

    private UpdateOpaStrategyNewRequest(Builder builder) {
        super(builder);
        this.alarmDetail = builder.alarmDetail;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.description = builder.description;
        this.imageName = builder.imageName;
        this.label = builder.label;
        this.maliciousImage = builder.maliciousImage;
        this.ruleAction = builder.ruleAction;
        this.scopes = builder.scopes;
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
        this.strategyTemplateId = builder.strategyTemplateId;
        this.unScanedImage = builder.unScanedImage;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOpaStrategyNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmDetail
     */
    public AlarmDetail getAlarmDetail() {
        return this.alarmDetail;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageName
     */
    public java.util.List<String> getImageName() {
        return this.imageName;
    }

    /**
     * @return label
     */
    public java.util.List<String> getLabel() {
        return this.label;
    }

    /**
     * @return maliciousImage
     */
    public Boolean getMaliciousImage() {
        return this.maliciousImage;
    }

    /**
     * @return ruleAction
     */
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return scopes
     */
    public java.util.List<Scopes> getScopes() {
        return this.scopes;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return strategyTemplateId
     */
    public Long getStrategyTemplateId() {
        return this.strategyTemplateId;
    }

    /**
     * @return unScanedImage
     */
    public Boolean getUnScanedImage() {
        return this.unScanedImage;
    }

    /**
     * @return whiteList
     */
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<UpdateOpaStrategyNewRequest, Builder> {
        private AlarmDetail alarmDetail; 
        private String clusterId; 
        private String clusterName; 
        private String description; 
        private java.util.List<String> imageName; 
        private java.util.List<String> label; 
        private Boolean maliciousImage; 
        private Integer ruleAction; 
        private java.util.List<Scopes> scopes; 
        private Long strategyId; 
        private String strategyName; 
        private Long strategyTemplateId; 
        private Boolean unScanedImage; 
        private java.util.List<String> whiteList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOpaStrategyNewRequest request) {
            super(request);
            this.alarmDetail = request.alarmDetail;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.description = request.description;
            this.imageName = request.imageName;
            this.label = request.label;
            this.maliciousImage = request.maliciousImage;
            this.ruleAction = request.ruleAction;
            this.scopes = request.scopes;
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
            this.strategyTemplateId = request.strategyTemplateId;
            this.unScanedImage = request.unScanedImage;
            this.whiteList = request.whiteList;
        } 

        /**
         * <p>The alert content details included in the policy.</p>
         */
        public Builder alarmDetail(AlarmDetail alarmDetail) {
            String alarmDetailShrink = shrink(alarmDetail, "AlarmDetail", "json");
            this.putQueryParameter("AlarmDetail", alarmDetailShrink);
            this.alarmDetail = alarmDetail;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>Notice: This parameter is deprecated. Use the Scopes parameter to specify the scope of clusters to which the policy applies..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c870ec78ecbcb41d2a35c679823ef****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * <blockquote>
         * <p>Notice: This parameter is deprecated..</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>docker-law</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>4566</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The list of image names included in the policy.</p>
         */
        public Builder imageName(java.util.List<String> imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The list of image tags included in the policy.</p>
         */
        public Builder label(java.util.List<String> label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>Specifies whether the policy supports Internet malicious images. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder maliciousImage(Boolean maliciousImage) {
            this.putQueryParameter("MaliciousImage", maliciousImage);
            this.maliciousImage = maliciousImage;
            return this;
        }

        /**
         * <p>The action to take when the policy is hit. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Alert.</li>
         * <li><strong>2</strong>: Block.</li>
         * <li><strong>3</strong>: Allow.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleAction(Integer ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>The scope of the policy.</p>
         */
        public Builder scopes(java.util.List<Scopes> scopes) {
            this.putQueryParameter("Scopes", scopes);
            this.scopes = scopes;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">ListOpaClusterStrategyNew</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1003</p>
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The policy template ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2539952.html">GetOpaStrategyTemplateSummary</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>109</p>
         */
        public Builder strategyTemplateId(Long strategyTemplateId) {
            this.putQueryParameter("StrategyTemplateId", strategyTemplateId);
            this.strategyTemplateId = strategyTemplateId;
            return this;
        }

        /**
         * <p>Specifies whether the policy supports unscanned images. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder unScanedImage(Boolean unScanedImage) {
            this.putQueryParameter("UnScanedImage", unScanedImage);
            this.unScanedImage = unScanedImage;
            return this;
        }

        /**
         * <p>The whitelist.</p>
         */
        public Builder whiteList(java.util.List<String> whiteList) {
            this.putQueryParameter("WhiteList", whiteList);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public UpdateOpaStrategyNewRequest build() {
            return new UpdateOpaStrategyNewRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Item(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The baseline check item ID.</p>
             * <blockquote>
             * <p>Call the <a href="https://help.aliyun.com/document_detail/2539883.html">GetOpaClusterBaseLineList</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hc.image.checklist.identify.hc_exploit_couchdb_linux.item</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The baseline check item name.</p>
             * <blockquote>
             * <p>Call the <a href="https://help.aliyun.com/document_detail/2539883.html">GetOpaClusterBaseLineList</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>passwd</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class Baseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List<String> riskLevel;

        private Baseline(Builder builder) {
            this.item = builder.item;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Baseline create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<Item> item; 
            private java.util.List<String> riskLevel; 

            private Builder() {
            } 

            private Builder(Baseline model) {
                this.item = model.item;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The baseline item information.</p>
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The list of risk levels.</p>
             */
            public Builder riskLevel(java.util.List<String> riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Baseline build() {
                return new Baseline(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class BuildRiskItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BuildRiskItem(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRiskItem create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(BuildRiskItem model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The risky image build command type ID.</p>
             * <blockquote>
             * <p>Call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The risky image build command type name.</p>
             * <blockquote>
             * <p>Call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BuildRiskItem build() {
                return new BuildRiskItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class BuildRisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<BuildRiskItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List<String> riskLevel;

        private BuildRisk(Builder builder) {
            this.item = builder.item;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuildRisk create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<BuildRiskItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<BuildRiskItem> item; 
            private java.util.List<String> riskLevel; 

            private Builder() {
            } 

            private Builder(BuildRisk model) {
                this.item = model.item;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The list of risk items.</p>
             */
            public Builder item(java.util.List<BuildRiskItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The list of risk levels.</p>
             */
            public Builder riskLevel(java.util.List<String> riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public BuildRisk build() {
                return new BuildRisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class MaliciousFileItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MaliciousFileItem(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaliciousFileItem create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(MaliciousFileItem model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The malicious sample ID.</p>
             * <blockquote>
             * <p>Call the <a href="~~DescribeMatchedMaliciousNames~~">DescribeMatchedMaliciousNames</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>65201</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The malicious sample name.</p>
             * <blockquote>
             * <p>Call the <a href="~~DescribeMatchedMaliciousNames~~">DescribeMatchedMaliciousNames</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>abnormal binary file</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MaliciousFileItem build() {
                return new MaliciousFileItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class MaliciousFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<MaliciousFileItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List<String> riskLevel;

        private MaliciousFile(Builder builder) {
            this.item = builder.item;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaliciousFile create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<MaliciousFileItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<MaliciousFileItem> item; 
            private java.util.List<String> riskLevel; 

            private Builder() {
            } 

            private Builder(MaliciousFile model) {
                this.item = model.item;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The malicious sample list.</p>
             */
            public Builder item(java.util.List<MaliciousFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The list of risk levels.</p>
             */
            public Builder riskLevel(java.util.List<String> riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public MaliciousFile build() {
                return new MaliciousFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class SensitiveFileItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SensitiveFileItem(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveFileItem create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(SensitiveFileItem model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The sensitive file type ID.</p>
             * <blockquote>
             * <p>Call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The sensitive file type name.</p>
             * <blockquote>
             * <p>Call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SensitiveFileItem build() {
                return new SensitiveFileItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class SensitiveFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<SensitiveFileItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List<String> riskLevel;

        private SensitiveFile(Builder builder) {
            this.item = builder.item;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveFile create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<SensitiveFileItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<SensitiveFileItem> item; 
            private java.util.List<String> riskLevel; 

            private Builder() {
            } 

            private Builder(SensitiveFile model) {
                this.item = model.item;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The list of sensitive file check items.</p>
             */
            public Builder item(java.util.List<SensitiveFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The list of risk levels.</p>
             */
            public Builder riskLevel(java.util.List<String> riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public SensitiveFile build() {
                return new SensitiveFile(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class VulItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private VulItem(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulItem create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(VulItem model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The vulnerability ID.</p>
             * <blockquote>
             * <p>Call the <a href="https://help.aliyun.com/document_detail/471928.html">DescribeVulListPage</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CVE-2023-36034</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The vulnerability name.</p>
             * <blockquote>
             * <p>Call the <a href="https://help.aliyun.com/document_detail/471928.html">DescribeVulListPage</a> operation to query this value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20227002</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VulItem build() {
                return new VulItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class RiskClass extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RiskClass(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskClass create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(RiskClass model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The vulnerability type ID. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: system vulnerability</li>
             * <li><strong>app</strong>: application vulnerability.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The vulnerability type name. Valid values:</p>
             * <ul>
             * <li><strong>system vulnerability</strong></li>
             * <li><strong>application vulnerability</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>系统漏洞</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RiskClass build() {
                return new RiskClass(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class Vul extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<VulItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskClass")
        private java.util.List<RiskClass> riskClass;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List<String> riskLevel;

        private Vul(Builder builder) {
            this.item = builder.item;
            this.riskClass = builder.riskClass;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vul create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<VulItem> getItem() {
            return this.item;
        }

        /**
         * @return riskClass
         */
        public java.util.List<RiskClass> getRiskClass() {
            return this.riskClass;
        }

        /**
         * @return riskLevel
         */
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<VulItem> item; 
            private java.util.List<RiskClass> riskClass; 
            private java.util.List<String> riskLevel; 

            private Builder() {
            } 

            private Builder(Vul model) {
                this.item = model.item;
                this.riskClass = model.riskClass;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The vulnerability list.</p>
             */
            public Builder item(java.util.List<VulItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The list of vulnerability types.</p>
             */
            public Builder riskClass(java.util.List<RiskClass> riskClass) {
                this.riskClass = riskClass;
                return this;
            }

            /**
             * <p>The list of risk levels.</p>
             */
            public Builder riskLevel(java.util.List<String> riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Vul build() {
                return new Vul(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class AlarmDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Baseline")
        private Baseline baseline;

        @com.aliyun.core.annotation.NameInMap("BuildRisk")
        private BuildRisk buildRisk;

        @com.aliyun.core.annotation.NameInMap("MaliciousFile")
        private MaliciousFile maliciousFile;

        @com.aliyun.core.annotation.NameInMap("SensitiveFile")
        private SensitiveFile sensitiveFile;

        @com.aliyun.core.annotation.NameInMap("Vul")
        private Vul vul;

        private AlarmDetail(Builder builder) {
            this.baseline = builder.baseline;
            this.buildRisk = builder.buildRisk;
            this.maliciousFile = builder.maliciousFile;
            this.sensitiveFile = builder.sensitiveFile;
            this.vul = builder.vul;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmDetail create() {
            return builder().build();
        }

        /**
         * @return baseline
         */
        public Baseline getBaseline() {
            return this.baseline;
        }

        /**
         * @return buildRisk
         */
        public BuildRisk getBuildRisk() {
            return this.buildRisk;
        }

        /**
         * @return maliciousFile
         */
        public MaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        /**
         * @return sensitiveFile
         */
        public SensitiveFile getSensitiveFile() {
            return this.sensitiveFile;
        }

        /**
         * @return vul
         */
        public Vul getVul() {
            return this.vul;
        }

        public static final class Builder {
            private Baseline baseline; 
            private BuildRisk buildRisk; 
            private MaliciousFile maliciousFile; 
            private SensitiveFile sensitiveFile; 
            private Vul vul; 

            private Builder() {
            } 

            private Builder(AlarmDetail model) {
                this.baseline = model.baseline;
                this.buildRisk = model.buildRisk;
                this.maliciousFile = model.maliciousFile;
                this.sensitiveFile = model.sensitiveFile;
                this.vul = model.vul;
            } 

            /**
             * <p>The baseline risk information.</p>
             */
            public Builder baseline(Baseline baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * <p>The risky image build command information.</p>
             */
            public Builder buildRisk(BuildRisk buildRisk) {
                this.buildRisk = buildRisk;
                return this;
            }

            /**
             * <p>The malicious sample information.</p>
             */
            public Builder maliciousFile(MaliciousFile maliciousFile) {
                this.maliciousFile = maliciousFile;
                return this;
            }

            /**
             * <p>The sensitive file information.</p>
             */
            public Builder sensitiveFile(SensitiveFile sensitiveFile) {
                this.sensitiveFile = sensitiveFile;
                return this;
            }

            /**
             * <p>The vulnerability item information.</p>
             */
            public Builder vul(Vul vul) {
                this.vul = vul;
                return this;
            }

            public AlarmDetail build() {
                return new AlarmDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateOpaStrategyNewRequest} extends {@link TeaModel}
     *
     * <p>UpdateOpaStrategyNewRequest</p>
     */
    public static class Scopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AckPolicyInstanceId")
        private String ackPolicyInstanceId;

        @com.aliyun.core.annotation.NameInMap("AllNamespace")
        private Integer allNamespace;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("NamespaceList")
        private java.util.List<String> namespaceList;

        private Scopes(Builder builder) {
            this.ackPolicyInstanceId = builder.ackPolicyInstanceId;
            this.allNamespace = builder.allNamespace;
            this.clusterId = builder.clusterId;
            this.namespaceList = builder.namespaceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scopes create() {
            return builder().build();
        }

        /**
         * @return ackPolicyInstanceId
         */
        public String getAckPolicyInstanceId() {
            return this.ackPolicyInstanceId;
        }

        /**
         * @return allNamespace
         */
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return namespaceList
         */
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

        public static final class Builder {
            private String ackPolicyInstanceId; 
            private Integer allNamespace; 
            private String clusterId; 
            private java.util.List<String> namespaceList; 

            private Builder() {
            } 

            private Builder(Scopes model) {
                this.ackPolicyInstanceId = model.ackPolicyInstanceId;
                this.allNamespace = model.allNamespace;
                this.clusterId = model.clusterId;
                this.namespaceList = model.namespaceList;
            } 

            /**
             * <p>The policy instance ID in the cluster.</p>
             * <blockquote>
             * <p>Call the <a href="~~GetOpaStrategyDetailNew~~">GetOpaStrategyDetailNew</a> operation to obtain this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ack-1</p>
             */
            public Builder ackPolicyInstanceId(String ackPolicyInstanceId) {
                this.ackPolicyInstanceId = ackPolicyInstanceId;
                return this;
            }

            /**
             * <p>Specifies whether all namespaces are included. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No.</li>
             * <li><strong>1</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * <blockquote>
             * <p>Call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cdcb56a931c**</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The list of namespaces.</p>
             * <blockquote>
             * <p>Notice: This parameter takes effect only when AllNamespace is set to 0..</p>
             * </blockquote>
             */
            public Builder namespaceList(java.util.List<String> namespaceList) {
                this.namespaceList = namespaceList;
                return this;
            }

            public Scopes build() {
                return new Scopes(this);
            } 

        } 

    }
}
