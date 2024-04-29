// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStrategyTemplateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStrategyTemplateDetailResponseBody</p>
 */
public class GetStrategyTemplateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStrategyTemplateDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStrategyTemplateDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the template.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStrategyTemplateDetailResponseBody build() {
            return new GetStrategyTemplateDetailResponseBody(this);
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
             * The unique identifier of the baseline check item.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the baseline check item.
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
             * The baseline items.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            /**
             * The severities of the baselines. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
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
             * The unique identifier of the malicious sample.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the malicious sample.
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
             * The items on which malicious samples are detected.
             */
            public Builder item(java.util.List < MaliciousFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * The severities of the malicious samples.
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
             * The ID of the vulnerability.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The alias of the vulnerability.
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
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List < VulItem> item;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
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
             * The items on which vulnerabilities are detected.
             */
            public Builder item(java.util.List < VulItem> item) {
                this.item = item;
                return this;
            }

            /**
             * The severities of the vulnerabilities.
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

        @com.aliyun.core.annotation.NameInMap("MaliciousFile")
        private MaliciousFile maliciousFile;

        @com.aliyun.core.annotation.NameInMap("Vul")
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
             * The configuration of the baseline.
             */
            public Builder baseline(Baseline baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * The configuration of the alert rule for the malicious sample.
             */
            public Builder maliciousFile(MaliciousFile maliciousFile) {
                this.maliciousFile = maliciousFile;
                return this;
            }

            /**
             * The configuration of the vulnerability detection rule.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmDetail")
        private AlarmDetail alarmDetail;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private java.util.List < String > imageName;

        @com.aliyun.core.annotation.NameInMap("Label")
        private java.util.List < String > label;

        @com.aliyun.core.annotation.NameInMap("MaliciousImage")
        private Boolean maliciousImage;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private java.util.List < String > namespace;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private Integer ruleAction;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("StrategyTemplateId")
        private Long strategyTemplateId;

        @com.aliyun.core.annotation.NameInMap("UnScanedImage")
        private Boolean unScanedImage;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private java.util.List < String > whiteList;

        private Data(Builder builder) {
            this.alarmDetail = builder.alarmDetail;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.description = builder.description;
            this.imageName = builder.imageName;
            this.label = builder.label;
            this.maliciousImage = builder.maliciousImage;
            this.namespace = builder.namespace;
            this.ruleAction = builder.ruleAction;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.strategyTemplateId = builder.strategyTemplateId;
            this.unScanedImage = builder.unScanedImage;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return namespace
         */
        public java.util.List < String > getNamespace() {
            return this.namespace;
        }

        /**
         * @return ruleAction
         */
        public Integer getRuleAction() {
            return this.ruleAction;
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

        public static final class Builder {
            private AlarmDetail alarmDetail; 
            private String clusterId; 
            private String clusterName; 
            private String description; 
            private java.util.List < String > imageName; 
            private java.util.List < String > label; 
            private Boolean maliciousImage; 
            private java.util.List < String > namespace; 
            private Integer ruleAction; 
            private Long strategyId; 
            private String strategyName; 
            private Long strategyTemplateId; 
            private Boolean unScanedImage; 
            private java.util.List < String > whiteList; 

            /**
             * The configuration of the rule.
             */
            public Builder alarmDetail(AlarmDetail alarmDetail) {
                this.alarmDetail = alarmDetail;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The names of images.
             */
            public Builder imageName(java.util.List < String > imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The tags that are added to the containers.
             */
            public Builder label(java.util.List < String > label) {
                this.label = label;
                return this;
            }

            /**
             * Indicates whether the rule supports malicious Internet images. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder maliciousImage(Boolean maliciousImage) {
                this.maliciousImage = maliciousImage;
                return this;
            }

            /**
             * The namespaces.
             */
            public Builder namespace(java.util.List < String > namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The action on requests. Valid values:
             * <p>
             * 
             * *   **1**: trigger alerts
             * *   **2**: block
             * *   **3**: allow
             */
            public Builder ruleAction(Integer ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder strategyTemplateId(Long strategyTemplateId) {
                this.strategyTemplateId = strategyTemplateId;
                return this;
            }

            /**
             * Indicates whether the rule supports unscanned images. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder unScanedImage(Boolean unScanedImage) {
                this.unScanedImage = unScanedImage;
                return this;
            }

            /**
             * The whitelists of tags that are added to images.
             */
            public Builder whiteList(java.util.List < String > whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
