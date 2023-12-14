// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOpaStrategyNewRequest} extends {@link RequestModel}
 *
 * <p>UpdateOpaStrategyNewRequest</p>
 */
public class UpdateOpaStrategyNewRequest extends Request {
    @Query
    @NameInMap("AlarmDetail")
    private AlarmDetail alarmDetail;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterName")
    private String clusterName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageName")
    private java.util.List < String > imageName;

    @Query
    @NameInMap("Label")
    private java.util.List < String > label;

    @Query
    @NameInMap("MaliciousImage")
    private Boolean maliciousImage;

    @Query
    @NameInMap("RuleAction")
    private Integer ruleAction;

    @Query
    @NameInMap("Scopes")
    private java.util.List < Scopes> scopes;

    @Query
    @NameInMap("StrategyId")
    private Long strategyId;

    @Query
    @NameInMap("StrategyName")
    private String strategyName;

    @Query
    @NameInMap("StrategyTemplateId")
    private Long strategyTemplateId;

    @Query
    @NameInMap("UnScanedImage")
    private Boolean unScanedImage;

    @Query
    @NameInMap("WhiteList")
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
         * The risks that you want to detect by using the rule on images.
         */
        public Builder alarmDetail(AlarmDetail alarmDetail) {
            String alarmDetailShrink = shrink(alarmDetail, "AlarmDetail", "json");
            this.putQueryParameter("AlarmDetail", alarmDetailShrink);
            this.alarmDetail = alarmDetail;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * > This parameter is deprecated. We recommend that you use the Scopes parameter to specify the clusters in which the rule takes effect.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the cluster.
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
         * The description of the rule.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The names of the images in the rule.
         */
        public Builder imageName(java.util.List < String > imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The tags that are added to the images in the rule.
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
         * *   **1**: trigger alerts
         * *   **2**: block
         * *   **3**: allow
         */
        public Builder ruleAction(Integer ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * The effective scope of the rule.
         */
        public Builder scopes(java.util.List < Scopes> scopes) {
            this.putQueryParameter("Scopes", scopes);
            this.scopes = scopes;
            return this;
        }

        /**
         * The ID of the rule.
         * <p>
         * 
         * >  You can call the \[ListOpaClusterStrategyNew]\(~~2623574~~) operation to query the IDs of rules.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The name of the rule.
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
         * >  You can call the [GetOpaStrategyTemplateSummary](~~2539952~~) operation to query the IDs of rule templates.
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
         * The whitelist.
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
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
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
             * >  You can call the [GetOpaClusterBaseLineList](~~2539883~~) operation to query the IDs of check items.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the baseline check item.
             * <p>
             * 
             * >  You can call the [GetOpaClusterBaseLineList](~~2539883~~) operation to query the names of check items.
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
        @NameInMap("Item")
        private java.util.List < Item> item;

        @NameInMap("RiskLevel")
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
             * The baseline check items.
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
    public static class MaliciousFileItem extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
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
             * >  You can call the [DescribeMatchedMaliciousNames](~~DescribeMatchedMaliciousNames~~) operation to query the IDs of malicious samples.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the malicious sample.
             * <p>
             * 
             * >  You can call the [DescribeMatchedMaliciousNames](~~DescribeMatchedMaliciousNames~~) operation to query the names of malicious samples.
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
        @NameInMap("Item")
        private java.util.List < MaliciousFileItem> item;

        @NameInMap("RiskLevel")
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
             * The malicious samples.
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
    public static class VulItem extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
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
             * The ID of the vulnerability.
             * <p>
             * 
             * >  You can call the [DescribeVulListPage](~~471928~~) operation to query the IDs of vulnerabilities.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the vulnerability.
             * <p>
             * 
             * >  You can call the [DescribeVulListPage](~~471928~~) operation to query the names of vulnerabilities.
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
    public static class Vul extends TeaModel {
        @NameInMap("Item")
        private java.util.List < VulItem> item;

        @NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

        private Vul(Builder builder) {
            this.item = builder.item;
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
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < VulItem> item; 
            private java.util.List < String > riskLevel; 

            /**
             * The vulnerabilities.
             */
            public Builder item(java.util.List < VulItem> item) {
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

            public Vul build() {
                return new Vul(this);
            } 

        } 

    }
    public static class AlarmDetail extends TeaModel {
        @NameInMap("Baseline")
        private Baseline baseline;

        @NameInMap("MaliciousFile")
        private MaliciousFile maliciousFile;

        @NameInMap("Vul")
        private Vul vul;

        private AlarmDetail(Builder builder) {
            this.baseline = builder.baseline;
            this.maliciousFile = builder.maliciousFile;
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
         * @return maliciousFile
         */
        public MaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        /**
         * @return vul
         */
        public Vul getVul() {
            return this.vul;
        }

        public static final class Builder {
            private Baseline baseline; 
            private MaliciousFile maliciousFile; 
            private Vul vul; 

            /**
             * The baseline risks.
             */
            public Builder baseline(Baseline baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * The malicious sample risks.
             */
            public Builder maliciousFile(MaliciousFile maliciousFile) {
                this.maliciousFile = maliciousFile;
                return this;
            }

            /**
             * The vulnerability risks.
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
        @NameInMap("AckPolicyInstanceId")
        private String ackPolicyInstanceId;

        @NameInMap("AllNamespace")
        private Integer allNamespace;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("NamespaceList")
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
             * The instance ID of the rule in the cluster.
             * <p>
             * 
             * >  You can call the [GetOpaStrategyDetailNew](~~GetOpaStrategyDetailNew~~) operation to query the instance IDs of rules.
             */
            public Builder ackPolicyInstanceId(String ackPolicyInstanceId) {
                this.ackPolicyInstanceId = ackPolicyInstanceId;
                return this;
            }

            /**
             * Specifies whether to include all namespaces.
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * The ID of the container cluster.
             * <p>
             * 
             * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The namespaces.
             * <p>
             * 
             * > This parameter is valid only when AllNamespace is set to 0.
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
