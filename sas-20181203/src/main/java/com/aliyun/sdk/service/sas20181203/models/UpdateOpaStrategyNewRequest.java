// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private java.util.List < String > label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaliciousImage")
    private Boolean maliciousImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private Integer ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scopes")
    private java.util.List < Scopes> scopes;

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
    private java.util.List < String > whiteList;

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
    public java.util.List < String > getImageName() {
        return this.imageName;
    }

    /**
     * @return label
     */
    public java.util.List < String > getLabel() {
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
    public java.util.List < Scopes> getScopes() {
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
    public java.util.List < String > getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<UpdateOpaStrategyNewRequest, Builder> {
        private AlarmDetail alarmDetail; 
        private String clusterId; 
        private String clusterName; 
        private String description; 
        private java.util.List < String > imageName; 
        private java.util.List < String > label; 
        private Boolean maliciousImage; 
        private Integer ruleAction; 
        private java.util.List < Scopes> scopes; 
        private Long strategyId; 
        private String strategyName; 
        private Long strategyTemplateId; 
        private Boolean unScanedImage; 
        private java.util.List < String > whiteList; 

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
         * The rule configuration.
         */
        public Builder alarmDetail(AlarmDetail alarmDetail) {
            String alarmDetailShrink = shrink(alarmDetail, "AlarmDetail", "json");
            this.putQueryParameter("AlarmDetail", alarmDetailShrink);
            this.alarmDetail = alarmDetail;
            return this;
        }

        /**
         * The cluster ID.
         * <p>
         * 
         * > This parameter is deprecated. You can use the Scopes parameter to specify a scope in which cluster parameters take effect.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The cluster name.
         * <p>
         * 
         * > This parameter is deprecated.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The rule description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The image names.
         */
        public Builder imageName(java.util.List < String > imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The image tags.
         */
        public Builder label(java.util.List < String > label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Specifies whether the rule supports malicious Internet images. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder maliciousImage(Boolean maliciousImage) {
            this.putQueryParameter("MaliciousImage", maliciousImage);
            this.maliciousImage = maliciousImage;
            return this;
        }

        /**
         * The action that is performed when the rule is hit. Valid values:
         * <p>
         * 
         * *   **1**: alert
         * *   **2**: block
         * *   **3**: allow
         */
        public Builder ruleAction(Integer ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * The application scope.
         */
        public Builder scopes(java.util.List < Scopes> scopes) {
            this.putQueryParameter("Scopes", scopes);
            this.scopes = scopes;
            return this;
        }

        /**
         * The rule ID.
         * <p>
         * 
         * >  You can call the [ListOpaClusterStrategyNew](~~2623574~~) operation to query the rule ID.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The rule name.
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * The ID of the rule template.
         * <p>
         * 
         * >  You can call the [GetOpaStrategyTemplateSummary](~~2539952~~) operation to query the ID of the rule template.
         */
        public Builder strategyTemplateId(Long strategyTemplateId) {
            this.putQueryParameter("StrategyTemplateId", strategyTemplateId);
            this.strategyTemplateId = strategyTemplateId;
            return this;
        }

        /**
         * Specifies whether the rule supports unscanned images. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder unScanedImage(Boolean unScanedImage) {
            this.putQueryParameter("UnScanedImage", unScanedImage);
            this.unScanedImage = unScanedImage;
            return this;
        }

        /**
         * The whitelists.
         */
        public Builder whiteList(java.util.List < String > whiteList) {
            this.putQueryParameter("WhiteList", whiteList);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public UpdateOpaStrategyNewRequest build() {
            return new UpdateOpaStrategyNewRequest(this);
        } 

    } 

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

            /**
             * The ID of the baseline check item.
             * <p>
             * 
             * >  You can call the [GetOpaClusterBaseLineList](~~2539883~~) operation to query the ID of the baseline check item.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the baseline check item.
             * <p>
             * 
             * >  You can call the [GetOpaClusterBaseLineList](~~2539883~~) operation to query the name of the baseline check item.
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
    public static class Baseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List < Item> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

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
        public java.util.List < Item> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < Item> item; 
            private java.util.List < String > riskLevel; 

            /**
             * The baseline check configuration.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            /**
             * The risk levels.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Baseline build() {
                return new Baseline(this);
            } 

        } 

    }
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

            /**
             * The ID of the image build risk.
             * <p>
             * 
             * >  You can call the [ListImageBuildRiskItem](~~ListImageBuildRiskItem~~) operation to query the ID of the malicious sample.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the image build risk.
             * <p>
             * 
             * >  You can call the [ListImageBuildRiskItem](~~ListImageBuildRiskItem~~) operation to query the ID of the malicious sample.
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
    public static class BuildRisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List < BuildRiskItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

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
        public java.util.List < BuildRiskItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < BuildRiskItem> item; 
            private java.util.List < String > riskLevel; 

            /**
             * The configuration of image build risk.
             */
            public Builder item(java.util.List < BuildRiskItem> item) {
                this.item = item;
                return this;
            }

            /**
             * The risk levels.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public BuildRisk build() {
                return new BuildRisk(this);
            } 

        } 

    }
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

            /**
             * The ID of the malicious sample.
             * <p>
             * 
             * >  You can call the [DescribeMatchedMaliciousNames](~~DescribeMatchedMaliciousNames~~) operation to query the ID of the malicious sample.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the malicious sample.
             * <p>
             * 
             * >  You can call the [DescribeMatchedMaliciousNames](~~DescribeMatchedMaliciousNames~~) operation to query the name of the malicious sample.
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
    public static class MaliciousFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List < MaliciousFileItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

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
        public java.util.List < MaliciousFileItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < MaliciousFileItem> item; 
            private java.util.List < String > riskLevel; 

            /**
             * The configuration of malicious samples.
             */
            public Builder item(java.util.List < MaliciousFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * The risk levels.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public MaliciousFile build() {
                return new MaliciousFile(this);
            } 

        } 

    }
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

            /**
             * The ID of the sensitive files.
             * <p>
             * 
             * >  You can call the [GetSensitiveDefineRuleConfig](~~GetSensitiveDefineRuleConfig~~) operation to query the ID of the malicious sample.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the sensitive files.
             * <p>
             * 
             * >  You can call the [GetSensitiveDefineRuleConfig](~~GetSensitiveDefineRuleConfig~~) operation to query the ID of the malicious sample.
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
    public static class SensitiveFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List < SensitiveFileItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

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
        public java.util.List < SensitiveFileItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < SensitiveFileItem> item; 
            private java.util.List < String > riskLevel; 

            /**
             * The configuration of sensitive file.
             */
            public Builder item(java.util.List < SensitiveFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * The risk levels.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public SensitiveFile build() {
                return new SensitiveFile(this);
            } 

        } 

    }
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

            /**
             * The vulnerability ID.
             * <p>
             * 
             * >  You can call the [DescribeVulListPage](~~471928~~) operation to query the vulnerability ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The vulnerability name.
             * <p>
             * 
             * >  You can call the [DescribeVulListPage](~~471928~~) operation to query the vulnerability name.
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

            /**
             * The ID of the vulnerability types. Valid values:
             * <p>
             * 
             * *   **cve**: system vulnerability
             * *   **app**: application vulnerability
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the vulnerability. Valid values:
             * <p>
             * 
             * *   **system vulnerability**
             * *   **application vulnerability**
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
    public static class Vul extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List < VulItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskClass")
        private java.util.List < RiskClass> riskClass;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

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
        public java.util.List < VulItem> getItem() {
            return this.item;
        }

        /**
         * @return riskClass
         */
        public java.util.List < RiskClass> getRiskClass() {
            return this.riskClass;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < VulItem> item; 
            private java.util.List < RiskClass> riskClass; 
            private java.util.List < String > riskLevel; 

            /**
             * The information about the vulnerability.
             */
            public Builder item(java.util.List < VulItem> item) {
                this.item = item;
                return this;
            }

            /**
             * Risk type of vulnerability.
             */
            public Builder riskClass(java.util.List < RiskClass> riskClass) {
                this.riskClass = riskClass;
                return this;
            }

            /**
             * The risk levels.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Vul build() {
                return new Vul(this);
            } 

        } 

    }
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

            /**
             * The baseline check configuration.
             */
            public Builder baseline(Baseline baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * The configuration of image build risk.
             */
            public Builder buildRisk(BuildRisk buildRisk) {
                this.buildRisk = buildRisk;
                return this;
            }

            /**
             * The configuration of malicious samples.
             */
            public Builder maliciousFile(MaliciousFile maliciousFile) {
                this.maliciousFile = maliciousFile;
                return this;
            }

            /**
             * The configuration of sensitive file.
             */
            public Builder sensitiveFile(SensitiveFile sensitiveFile) {
                this.sensitiveFile = sensitiveFile;
                return this;
            }

            /**
             * The vulnerability configuration.
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
    public static class Scopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AckPolicyInstanceId")
        private String ackPolicyInstanceId;

        @com.aliyun.core.annotation.NameInMap("AllNamespace")
        private Integer allNamespace;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("NamespaceList")
        private java.util.List < String > namespaceList;

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
        public java.util.List < String > getNamespaceList() {
            return this.namespaceList;
        }

        public static final class Builder {
            private String ackPolicyInstanceId; 
            private Integer allNamespace; 
            private String clusterId; 
            private java.util.List < String > namespaceList; 

            /**
             * The ID of the cluster node to which the rule is applied.
             * <p>
             * 
             * >  You can call the [GetOpaStrategyDetailNew](~~GetOpaStrategyDetailNew~~) operation to query the ID of the cluster node to which the rule is applied.
             */
            public Builder ackPolicyInstanceId(String ackPolicyInstanceId) {
                this.ackPolicyInstanceId = ackPolicyInstanceId;
                return this;
            }

            /**
             * Specifies whether all namespaces are included. Valid values:
             * <p>
             * 
             * *   **0**: Not all namespaces are included.
             * *   **1**: All namespaces are included.
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * The cluster ID.
             * <p>
             * 
             * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The namespaces.
             * <p>
             * 
             * > This parameter is valid only when the AllNamespace parameter is set to 0.
             */
            public Builder namespaceList(java.util.List < String > namespaceList) {
                this.namespaceList = namespaceList;
                return this;
            }

            public Scopes build() {
                return new Scopes(this);
            } 

        } 

    }
}
