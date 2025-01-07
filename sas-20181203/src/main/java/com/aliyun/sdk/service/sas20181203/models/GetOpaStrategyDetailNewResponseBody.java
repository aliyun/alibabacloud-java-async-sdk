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
 * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpaStrategyDetailNewResponseBody</p>
 */
public class GetOpaStrategyDetailNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E819FD71-D240-5E54-AA7F-20FED2ECBEB6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOpaStrategyDetailNewResponseBody build() {
            return new GetOpaStrategyDetailNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The ID of the baseline check item.</p>
             * 
             * <strong>example:</strong>
             * <p>ak_leak</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the baseline check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Access Key plaintext storage</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The information about the baseline check item.</p>
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The risk levels.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The ID of the image build risk.</p>
             * <blockquote>
             * <p> You can call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query the ID of the malicious sample.</p>
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
             * <p>The name of the image build risk.</p>
             * <blockquote>
             * <p> You can call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query the ID of the malicious sample.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The configuration of image build risk.</p>
             */
            public Builder item(java.util.List<BuildRiskItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The risk levels.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The ID of the malicious sample.</p>
             * 
             * <strong>example:</strong>
             * <p>1811</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the malicious sample.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The information about the malicious sample.</p>
             */
            public Builder item(java.util.List<MaliciousFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The risk levels.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The ID of the sensitive files.</p>
             * <blockquote>
             * <p> You can call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query the ID of the malicious sample.</p>
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
             * <p>The name of the sensitive files.</p>
             * <blockquote>
             * <p> You can call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query the ID of the malicious sample.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The configuration of sensitive file.</p>
             */
            public Builder item(java.util.List<SensitiveFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The risk levels.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The ID of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>AVD-2023-1680169</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>ezOffice evoInterfaceServlet Info Leak</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The ID of the vulnerability types. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: system vulnerability</li>
             * <li><strong>app</strong>: application vulnerability</li>
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
             * <p>The name of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>system vulnerability</strong></li>
             * <li><strong>application vulnerability</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system vulnerability</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The information about the vulnerability.</p>
             */
            public Builder item(java.util.List<VulItem> item) {
                this.item = item;
                return this;
            }

            /**
             * <p>Risk type of vulnerability.</p>
             */
            public Builder riskClass(java.util.List<RiskClass> riskClass) {
                this.riskClass = riskClass;
                return this;
            }

            /**
             * <p>The risk levels.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The baseline check configuration.</p>
             */
            public Builder baseline(Baseline baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * <p>The configuration of image build risk.</p>
             */
            public Builder buildRisk(BuildRisk buildRisk) {
                this.buildRisk = buildRisk;
                return this;
            }

            /**
             * <p>The configuration of malicious samples.</p>
             */
            public Builder maliciousFile(MaliciousFile maliciousFile) {
                this.maliciousFile = maliciousFile;
                return this;
            }

            /**
             * <p>The configuration of sensitive file.</p>
             */
            public Builder sensitiveFile(SensitiveFile sensitiveFile) {
                this.sensitiveFile = sensitiveFile;
                return this;
            }

            /**
             * <p>The vulnerability configuration.</p>
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
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
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

            /**
             * <p>The rule instance ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-0</p>
             */
            public Builder ackPolicyInstanceId(String ackPolicyInstanceId) {
                this.ackPolicyInstanceId = ackPolicyInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether all namespaces are included. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
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
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c1fdb5fd8d**7163</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The namespaces.</p>
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
    /**
     * 
     * {@link GetOpaStrategyDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpaStrategyDetailNewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmDetail")
        private AlarmDetail alarmDetail;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private java.util.List<String> imageName;

        @com.aliyun.core.annotation.NameInMap("Label")
        private java.util.List<String> label;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("MaliciousImage")
        private Boolean maliciousImage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private Integer ruleAction;

        @com.aliyun.core.annotation.NameInMap("Scopes")
        private java.util.List<Scopes> scopes;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("StrategyTemplateId")
        private Long strategyTemplateId;

        @com.aliyun.core.annotation.NameInMap("UnScanedImage")
        private Boolean unScanedImage;

        @com.aliyun.core.annotation.NameInMap("WhiteList")
        private java.util.List<String> whiteList;

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

        public static final class Builder {
            private AlarmDetail alarmDetail; 
            private String clusterId; 
            private String clusterName; 
            private Integer currentPage; 
            private String description; 
            private java.util.List<String> imageName; 
            private java.util.List<String> label; 
            private String lang; 
            private Boolean maliciousImage; 
            private Integer pageSize; 
            private Integer ruleAction; 
            private java.util.List<Scopes> scopes; 
            private Long strategyId; 
            private String strategyName; 
            private Long strategyTemplateId; 
            private Boolean unScanedImage; 
            private java.util.List<String> whiteList; 

            /**
             * <p>The rule configuration.</p>
             */
            public Builder alarmDetail(AlarmDetail alarmDetail) {
                this.alarmDetail = alarmDetail;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The page number. Default value: <strong>1</strong>. Pages start from page 1.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom defense configuration</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The image names.</p>
             */
            public Builder imageName(java.util.List<String> imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The image tags.</p>
             */
            public Builder label(java.util.List<String> label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
             * <ul>
             * <li><strong>zh</strong>: Chinese</li>
             * <li><strong>en</strong>: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>Indicates whether the rule supports malicious Internet images. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder maliciousImage(Boolean maliciousImage) {
                this.maliciousImage = maliciousImage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The action that is performed when the rule is hit. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: trigger alerts</li>
             * <li><strong>2</strong>: block</li>
             * <li><strong>3</strong>: allow</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleAction(Integer ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>The application scope.</p>
             */
            public Builder scopes(java.util.List<Scopes> scopes) {
                this.scopes = scopes;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1005</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>test001</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The ID of the rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>1204</p>
             */
            public Builder strategyTemplateId(Long strategyTemplateId) {
                this.strategyTemplateId = strategyTemplateId;
                return this;
            }

            /**
             * <p>Indicates whether the rule supports unscanned images. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder unScanedImage(Boolean unScanedImage) {
                this.unScanedImage = unScanedImage;
                return this;
            }

            /**
             * <p>The image tags that are added to the whitelist.</p>
             */
            public Builder whiteList(java.util.List<String> whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
