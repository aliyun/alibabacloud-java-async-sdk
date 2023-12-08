// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpaStrategyDetailNewResponseBody</p>
 */
public class GetOpaStrategyDetailNewResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetOpaStrategyDetailNewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpaStrategyDetailNewResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetOpaStrategyDetailNewResponseBody build() {
            return new GetOpaStrategyDetailNewResponseBody(this);
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
             * The baseline information.
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
             * The information about the malicious samples.
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
             * The vulnerability ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The vulnerability name.
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
             * The vulnerability information.
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
             * The baseline configuration information.
             */
            public Builder baseline(Baseline baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * The configuration information about the malicious sample.
             */
            public Builder maliciousFile(MaliciousFile maliciousFile) {
                this.maliciousFile = maliciousFile;
                return this;
            }

            /**
             * The vulnerability configuration information.
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
             * The ID of the rule in the cluster.
             */
            public Builder ackPolicyInstanceId(String ackPolicyInstanceId) {
                this.ackPolicyInstanceId = ackPolicyInstanceId;
                return this;
            }

            /**
             * Specifies whether all namespaces are included. Valid values:
             * <p>
             * 
             * *   **1**: All namespaces are included.
             * *   **0**: Not all namespaces are included.
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
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
             * The namespaces.
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
    public static class Data extends TeaModel {
        @NameInMap("AlarmDetail")
        private AlarmDetail alarmDetail;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageName")
        private java.util.List < String > imageName;

        @NameInMap("Label")
        private java.util.List < String > label;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("MaliciousImage")
        private Boolean maliciousImage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("RuleAction")
        private Integer ruleAction;

        @NameInMap("Scopes")
        private java.util.List < Scopes> scopes;

        @NameInMap("StrategyId")
        private Long strategyId;

        @NameInMap("StrategyName")
        private String strategyName;

        @NameInMap("StrategyTemplateId")
        private Long strategyTemplateId;

        @NameInMap("UnScanedImage")
        private Boolean unScanedImage;

        @NameInMap("WhiteList")
        private java.util.List < String > whiteList;

        private Data(Builder builder) {
            this.alarmDetail = builder.alarmDetail;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.currentPage = builder.currentPage;
            this.description = builder.description;
            this.imageName = builder.imageName;
            this.label = builder.label;
            this.lang = builder.lang;
            this.maliciousImage = builder.maliciousImage;
            this.pageSize = builder.pageSize;
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
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return maliciousImage
         */
        public Boolean getMaliciousImage() {
            return this.maliciousImage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
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

        public static final class Builder {
            private AlarmDetail alarmDetail; 
            private String clusterId; 
            private String clusterName; 
            private Integer currentPage; 
            private String description; 
            private java.util.List < String > imageName; 
            private java.util.List < String > label; 
            private String lang; 
            private Boolean maliciousImage; 
            private Integer pageSize; 
            private Integer ruleAction; 
            private java.util.List < Scopes> scopes; 
            private Long strategyId; 
            private String strategyName; 
            private Long strategyTemplateId; 
            private Boolean unScanedImage; 
            private java.util.List < String > whiteList; 

            /**
             * The rule configuration information.
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
             * The cluster name.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The page number. Default value: **1**. Pages start from page 1.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The rule description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The image names.
             */
            public Builder imageName(java.util.List < String > imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The image tags.
             */
            public Builder label(java.util.List < String > label) {
                this.label = label;
                return this;
            }

            /**
             * The language of the content within the request and response. Default value: **zh**. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * Indicates whether the rule applies to malicious Internet images. Valid values:
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
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
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
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * The scope.
             */
            public Builder scopes(java.util.List < Scopes> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * The rule ID.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * The rule name.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * The ID of the rule template.
             */
            public Builder strategyTemplateId(Long strategyTemplateId) {
                this.strategyTemplateId = strategyTemplateId;
                return this;
            }

            /**
             * Indicates whether the rule applies to unscanned images. Valid values:
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
             * The image tags that are added to the whitelist.
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
