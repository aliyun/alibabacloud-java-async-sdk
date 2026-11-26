// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link TypedAIAsset} extends {@link TeaModel}
 *
 * <p>TypedAIAsset</p>
 */
public class TypedAIAsset extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.NameInMap("ConfigPath")
    private String configPath;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("EndpointType")
    private String endpointType;

    @com.aliyun.core.annotation.NameInMap("FirstSeen")
    private String firstSeen;

    @com.aliyun.core.annotation.NameInMap("Form")
    private String form;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("IdentityIdentifiers")
    private IdentityIdentifiers identityIdentifiers;

    @com.aliyun.core.annotation.NameInMap("InstallPath")
    private String installPath;

    @com.aliyun.core.annotation.NameInMap("InstanceLocalId")
    private String instanceLocalId;

    @com.aliyun.core.annotation.NameInMap("LastCheckTime")
    private String lastCheckTime;

    @com.aliyun.core.annotation.NameInMap("LastDetectTaskId")
    private String lastDetectTaskId;

    @com.aliyun.core.annotation.NameInMap("LastSeen")
    private String lastSeen;

    @com.aliyun.core.annotation.NameInMap("MatchedRules")
    private java.util.List<String> matchedRules;

    @com.aliyun.core.annotation.NameInMap("McpId")
    private String mcpId;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("ProviderId")
    private String providerId;

    @com.aliyun.core.annotation.NameInMap("ProviderName")
    private String providerName;

    @com.aliyun.core.annotation.NameInMap("ProviderNameCn")
    private String providerNameCn;

    @com.aliyun.core.annotation.NameInMap("ProviderNameEn")
    private String providerNameEn;

    @com.aliyun.core.annotation.NameInMap("ProviderType")
    private String providerType;

    @com.aliyun.core.annotation.NameInMap("RecognitionEvidence")
    private RecognitionEvidence recognitionEvidence;

    @com.aliyun.core.annotation.NameInMap("RecognitionStatus")
    private String recognitionStatus;

    @com.aliyun.core.annotation.NameInMap("RiskInfo")
    private RiskInfo riskInfo;

    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    @com.aliyun.core.annotation.NameInMap("ScanId")
    private String scanId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("StandardSha256")
    private String standardSha256;

    @com.aliyun.core.annotation.NameInMap("Transport")
    private String transport;

    @com.aliyun.core.annotation.NameInMap("Vendor")
    private Integer vendor;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private TypedAIAsset(Builder builder) {
        this.accessType = builder.accessType;
        this.agentId = builder.agentId;
        this.configPath = builder.configPath;
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.endpointType = builder.endpointType;
        this.firstSeen = builder.firstSeen;
        this.form = builder.form;
        this.id = builder.id;
        this.identityIdentifiers = builder.identityIdentifiers;
        this.installPath = builder.installPath;
        this.instanceLocalId = builder.instanceLocalId;
        this.lastCheckTime = builder.lastCheckTime;
        this.lastDetectTaskId = builder.lastDetectTaskId;
        this.lastSeen = builder.lastSeen;
        this.matchedRules = builder.matchedRules;
        this.mcpId = builder.mcpId;
        this.productCode = builder.productCode;
        this.providerId = builder.providerId;
        this.providerName = builder.providerName;
        this.providerNameCn = builder.providerNameCn;
        this.providerNameEn = builder.providerNameEn;
        this.providerType = builder.providerType;
        this.recognitionEvidence = builder.recognitionEvidence;
        this.recognitionStatus = builder.recognitionStatus;
        this.riskInfo = builder.riskInfo;
        this.riskLevel = builder.riskLevel;
        this.scanId = builder.scanId;
        this.sourceType = builder.sourceType;
        this.standardSha256 = builder.standardSha256;
        this.transport = builder.transport;
        this.vendor = builder.vendor;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TypedAIAsset create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return configPath
     */
    public String getConfigPath() {
        return this.configPath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return firstSeen
     */
    public String getFirstSeen() {
        return this.firstSeen;
    }

    /**
     * @return form
     */
    public String getForm() {
        return this.form;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return identityIdentifiers
     */
    public IdentityIdentifiers getIdentityIdentifiers() {
        return this.identityIdentifiers;
    }

    /**
     * @return installPath
     */
    public String getInstallPath() {
        return this.installPath;
    }

    /**
     * @return instanceLocalId
     */
    public String getInstanceLocalId() {
        return this.instanceLocalId;
    }

    /**
     * @return lastCheckTime
     */
    public String getLastCheckTime() {
        return this.lastCheckTime;
    }

    /**
     * @return lastDetectTaskId
     */
    public String getLastDetectTaskId() {
        return this.lastDetectTaskId;
    }

    /**
     * @return lastSeen
     */
    public String getLastSeen() {
        return this.lastSeen;
    }

    /**
     * @return matchedRules
     */
    public java.util.List<String> getMatchedRules() {
        return this.matchedRules;
    }

    /**
     * @return mcpId
     */
    public String getMcpId() {
        return this.mcpId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return providerId
     */
    public String getProviderId() {
        return this.providerId;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    /**
     * @return providerNameCn
     */
    public String getProviderNameCn() {
        return this.providerNameCn;
    }

    /**
     * @return providerNameEn
     */
    public String getProviderNameEn() {
        return this.providerNameEn;
    }

    /**
     * @return providerType
     */
    public String getProviderType() {
        return this.providerType;
    }

    /**
     * @return recognitionEvidence
     */
    public RecognitionEvidence getRecognitionEvidence() {
        return this.recognitionEvidence;
    }

    /**
     * @return recognitionStatus
     */
    public String getRecognitionStatus() {
        return this.recognitionStatus;
    }

    /**
     * @return riskInfo
     */
    public RiskInfo getRiskInfo() {
        return this.riskInfo;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    /**
     * @return scanId
     */
    public String getScanId() {
        return this.scanId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return standardSha256
     */
    public String getStandardSha256() {
        return this.standardSha256;
    }

    /**
     * @return transport
     */
    public String getTransport() {
        return this.transport;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String accessType; 
        private String agentId; 
        private String configPath; 
        private String description; 
        private String endpoint; 
        private String endpointType; 
        private String firstSeen; 
        private String form; 
        private String id; 
        private IdentityIdentifiers identityIdentifiers; 
        private String installPath; 
        private String instanceLocalId; 
        private String lastCheckTime; 
        private String lastDetectTaskId; 
        private String lastSeen; 
        private java.util.List<String> matchedRules; 
        private String mcpId; 
        private String productCode; 
        private String providerId; 
        private String providerName; 
        private String providerNameCn; 
        private String providerNameEn; 
        private String providerType; 
        private RecognitionEvidence recognitionEvidence; 
        private String recognitionStatus; 
        private RiskInfo riskInfo; 
        private String riskLevel; 
        private String scanId; 
        private String sourceType; 
        private String standardSha256; 
        private String transport; 
        private Integer vendor; 
        private String version; 

        private Builder() {
        } 

        private Builder(TypedAIAsset model) {
            this.accessType = model.accessType;
            this.agentId = model.agentId;
            this.configPath = model.configPath;
            this.description = model.description;
            this.endpoint = model.endpoint;
            this.endpointType = model.endpointType;
            this.firstSeen = model.firstSeen;
            this.form = model.form;
            this.id = model.id;
            this.identityIdentifiers = model.identityIdentifiers;
            this.installPath = model.installPath;
            this.instanceLocalId = model.instanceLocalId;
            this.lastCheckTime = model.lastCheckTime;
            this.lastDetectTaskId = model.lastDetectTaskId;
            this.lastSeen = model.lastSeen;
            this.matchedRules = model.matchedRules;
            this.mcpId = model.mcpId;
            this.productCode = model.productCode;
            this.providerId = model.providerId;
            this.providerName = model.providerName;
            this.providerNameCn = model.providerNameCn;
            this.providerNameEn = model.providerNameEn;
            this.providerType = model.providerType;
            this.recognitionEvidence = model.recognitionEvidence;
            this.recognitionStatus = model.recognitionStatus;
            this.riskInfo = model.riskInfo;
            this.riskLevel = model.riskLevel;
            this.scanId = model.scanId;
            this.sourceType = model.sourceType;
            this.standardSha256 = model.standardSha256;
            this.transport = model.transport;
            this.vendor = model.vendor;
            this.version = model.version;
        } 

        /**
         * <p>The access method for the MCP. Valid values: local_process for local processes, remote_service for remote services, and unknown for undetermined methods.</p>
         * 
         * <strong>example:</strong>
         * <p>local_process</p>
         */
        public Builder accessType(String accessType) {
            this.accessType = accessType;
            return this;
        }

        /**
         * <p>The database primary key of the agent instance associated with the leaf asset, returned as a decimal numeric string. The value can be 0 when no agent is associated, and it can also be 0 in the details of the agent itself. This field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456789</p>
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The configuration path where the LLM, MCP, or tool declaration is located. This is not a skill package identifier. It is returned in instance details but not in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/example/.config/example-agent/config.json</p>
         */
        public Builder configPath(String configPath) {
            this.configPath = configPath;
            return this;
        }

        /**
         * <p>The description text collected for an MCP, tool, or skill. This is not returned if missing. Aggregated lists only return descriptions that are consistent within the group.</p>
         * 
         * <strong>example:</strong>
         * <p>Read and organize the documents in the specified directory.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The configured service endpoint for an LLM model service or remote MCP. Local stdio MCPs may not have this field. Its presence does not indicate a successful connection or actual invocation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.example.com/v1">https://api.example.com/v1</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The classification of the LLM service endpoint. Valid values: official for official services, third_party for third-party services, and unknown for undetermined services. This classification does not represent a security detection conclusion.</p>
         * 
         * <strong>example:</strong>
         * <p>official</p>
         */
        public Builder endpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * <p>The time when the asset instance was first observed. The value is a database datetime string that may include six decimal places for seconds, without a unified time zone indicator. This field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16 10:30:00.000000</p>
         */
        public Builder firstSeen(String firstSeen) {
            this.firstSeen = firstSeen;
            return this;
        }

        /**
         * <p>The installation form of the agent, such as desktop_app, ide_extension, cli, or sdk. This is not the endpoint operating system such as Windows or macOS. The specific value is subject to the instance recognition result.</p>
         * 
         * <strong>example:</strong>
         * <p>cli</p>
         */
        public Builder form(String form) {
            this.form = form;
            return this;
        }

        /**
         * <p>The database primary key of the table where the asset instance is located, returned as a decimal numeric string to prevent precision loss of large integers. This is not the asset aggregation key AssetKey, and this instance field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456789</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The collected product identity clues and their categorization by identifier type. These are used for auxiliary identification and do not indicate that signatures, publishers, or file contents have been authenticated through security authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;macos_bundle_id&quot;:[&quot;com.example.agent&quot;],&quot;npm_package&quot;:[&quot;@example/agent-cli&quot;]}</p>
         */
        public Builder identityIdentifiers(IdentityIdentifiers identityIdentifiers) {
            this.identityIdentifiers = identityIdentifiers;
            return this;
        }

        /**
         * <p>The installation path of the agent instance. This field is used only for instance details and is not returned in aggregated lists. It is not applicable to other asset types.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/example-agent</p>
         */
        public Builder installPath(String installPath) {
            this.installPath = installPath;
            return this;
        }

        /**
         * <p>The instance identity installed or declared within the endpoint, calculated by the script based on the asset type, ownership, and location. The identity scope must still include the tenant and endpoint, and it cannot be used as a globally unique ID across endpoints. This field is not returned in aggregation lists.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:70e28ce51d55863f2ac5bb81efcee54026ff9fdde9b52346c659f4e24017e7f6</p>
         */
        public Builder instanceLocalId(String instanceLocalId) {
            this.instanceLocalId = instanceLocalId;
            return this;
        }

        /**
         * <p>The time of the last successful detection for the current skill content. This field is empty or not returned if no saved successful detection record exists. The value is a database datetime string without a unified time zone indicator. This field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16 10:30:00.000000</p>
         */
        public Builder lastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }

        /**
         * <p>The database ID of the latest detection task associated with the current skill content, returned as a decimal numeric string. The value can be 0 if no task is associated. The presence of a task ID does not indicate that the detection is complete. This field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456791</p>
         */
        public Builder lastDetectTaskId(String lastDetectTaskId) {
            this.lastDetectTaskId = lastDetectTaskId;
            return this;
        }

        /**
         * <p>The time when the asset instance was last actually observed. The value is a database datetime string that may include six decimal places for seconds. This is not the page query time. This field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16 11:30:00.000000</p>
         */
        public Builder lastSeen(String lastSeen) {
            this.lastSeen = lastSeen;
            return this;
        }

        /**
         * <p>The array of static recognition basis tags matched by the agent, which can include model_call, tool_call, autonomous_execution, state_management, and agent_declaration. This does not indicate that the agent was actually executed or passed security certification.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;model_call&quot;,&quot;tool_call&quot;]</p>
         */
        public Builder matchedRules(java.util.List<String> matchedRules) {
            this.matchedRules = matchedRules;
            return this;
        }

        /**
         * <p>The database primary key of the MCP instance associated with the tool, returned as a decimal numeric string. The value can be 0 when no MCP is associated, and this field is not applicable to other asset types. This field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456790</p>
         */
        public Builder mcpId(String mcpId) {
            this.mcpId = mcpId;
            return this;
        }

        /**
         * <p>The product code of the agent. The specific value is subject to the product catalog in the recognition rules. This field is not returned when it is not applicable, unidentified, or inconsistent across aggregated attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>example_agent</p>
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The provider identifier matched based on the service endpoint and provider directory. This may not be returned if no match is found and is not the product code of the associated agent.</p>
         * 
         * <strong>example:</strong>
         * <p>example_provider</p>
         */
        public Builder providerId(String providerId) {
            this.providerId = providerId;
            return this;
        }

        /**
         * <p>The provider display name of the tool. This is generated from the associated MCP, agent, or declaration source and is not a proof of security or trust.</p>
         * 
         * <strong>example:</strong>
         * <p>Example MCP</p>
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            return this;
        }

        /**
         * <p>The Chinese display name of the service provider. The directory name is prioritized. The name parsed from the service endpoint may be used if no match is found. The presence of this field does not indicate that the service provider is identified.</p>
         * 
         * <strong>example:</strong>
         * <p>示例模型服务商</p>
         */
        public Builder providerNameCn(String providerNameCn) {
            this.providerNameCn = providerNameCn;
            return this;
        }

        /**
         * <p>The English display name of the service provider. The directory name is prioritized. The name parsed from the service endpoint may be used if no match is found. The presence of this field does not indicate that the service provider is identified.</p>
         * 
         * <strong>example:</strong>
         * <p>Example Model Provider</p>
         */
        public Builder providerNameEn(String providerNameEn) {
            this.providerNameEn = providerNameEn;
            return this;
        }

        /**
         * <p>The declared provider type of the tool. Valid values: mcp, agent, software, file, or unknown. This describes the declaration source and does not represent the actual caller, authorization status, or vendor identity.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp</p>
         */
        public Builder providerType(String providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * <p>The static recognition basis of the agent, which lists the source paths and evidence text grouped by recognition tags. This is not a runtime audit record, and instance-level evidence is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;model_call&quot;:[{&quot;source_path&quot;:&quot;/opt/example-agent/model.py&quot;}]}</p>
         */
        public Builder recognitionEvidence(RecognitionEvidence recognitionEvidence) {
            this.recognitionEvidence = recognitionEvidence;
            return this;
        }

        /**
         * <p>The product recognition status of the agent. identified indicates recognized, unidentified indicates pending recognition, and conflict indicates a recognition conflict. This status does not indicate whether the asset is secure.</p>
         * 
         * <strong>example:</strong>
         * <p>identified</p>
         */
        public Builder recognitionStatus(String recognitionStatus) {
            this.recognitionStatus = recognitionStatus;
            return this;
        }

        /**
         * <p>The counts of high, medium, and low-risk items saved for the current skill content. This may be empty or not returned when no detection results are available. A missing value cannot be interpreted as a zero risk count or an indication of security.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;highRiskCnt&quot;:1,&quot;mediumRiskCnt&quot;:0,&quot;lowRiskCnt&quot;:0}</p>
         */
        public Builder riskInfo(RiskInfo riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }

        /**
         * <p>The final risk level saved for the current skill content. This is not returned when no detection conclusion is available. The value high is provided only as a format example and does not serve as a new enumeration constraint.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        /**
         * <p>The scan batch identifier of the most recent scan where the instance was actually observed. This is not a database primary key or asset content hash. This field is not returned in aggregated lists.</p>
         * 
         * <strong>example:</strong>
         * <p>scan-0123456789abcdef0123456789abcdef</p>
         */
        public Builder scanId(String scanId) {
            this.scanId = scanId;
            return this;
        }

        /**
         * <p>The source channel classification of the skill. The default value for current collection and storage is unknown. The unknown value cannot be inferred as an official or community source.</p>
         * 
         * <strong>example:</strong>
         * <p>unknown</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The SHA-256 hash of the complete skill package bytes. The format is a 64-character lowercase hexadecimal string without the sha256: prefix. The current script uses the skill-canonical-zip-v1 specification for compression. This is not equivalent to the installation instance ID and does not indicate that the package has been inspected or is secure.</p>
         * 
         * <strong>example:</strong>
         * <p>60d3292dd23fe7d2760d6a228123d1e4eb3d91bdb511089015e854d68ea9e460</p>
         */
        public Builder standardSha256(String standardSha256) {
            this.standardSha256 = standardSha256;
            return this;
        }

        /**
         * <p>The transport protocol declared in the MCP configuration. The collected value is retained as-is, such as stdio, sse, or streamable_http. This cannot be used to determine whether the service is running or has been invoked.</p>
         * 
         * <strong>example:</strong>
         * <p>stdio</p>
         */
        public Builder transport(String transport) {
            this.transport = transport;
            return this;
        }

        /**
         * <p>The vendor code for the collected and stored skill. The current default value is 1000. This cannot be used to infer a specific vendor or security status.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder vendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }

        /**
         * <p>The collected installation version of the agent. This field is not returned when the version is not collected. In aggregated lists, this field is returned only when the versions of all instances in the group are identical and not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public TypedAIAsset build() {
            return new TypedAIAsset(this);
        } 

    } 

    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class PeProductIdentity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("company_name")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("product_name")
        private String productName;

        private PeProductIdentity(Builder builder) {
            this.companyName = builder.companyName;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeProductIdentity create() {
            return builder().build();
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private String companyName; 
            private String productName; 

            private Builder() {
            } 

            private Builder(PeProductIdentity model) {
                this.companyName = model.companyName;
                this.productName = model.productName;
            } 

            /**
             * <p>The CompanyName field in a Windows PE version resource. This is not a certified vendor identity.</p>
             * 
             * <strong>example:</strong>
             * <p>Example Corp</p>
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * <p>The ProductName field in a Windows PE version resource.</p>
             * 
             * <strong>example:</strong>
             * <p>Example Agent</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public PeProductIdentity build() {
                return new PeProductIdentity(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class WindowsAppxIdentity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("publisher")
        private String publisher;

        private WindowsAppxIdentity(Builder builder) {
            this.name = builder.name;
            this.publisher = builder.publisher;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WindowsAppxIdentity create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publisher
         */
        public String getPublisher() {
            return this.publisher;
        }

        public static final class Builder {
            private String name; 
            private String publisher; 

            private Builder() {
            } 

            private Builder(WindowsAppxIdentity model) {
                this.name = model.name;
                this.publisher = model.publisher;
            } 

            /**
             * <p>The original package name of the Identity.Name in a Windows AppX/MSIX manifest.</p>
             * 
             * <strong>example:</strong>
             * <p>Example.Agent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The publisher string of the Identity.Publisher in a Windows AppX/MSIX manifest. This is not equivalent to the signature verification result.</p>
             * 
             * <strong>example:</strong>
             * <p>CN=Example Corp, O=Example Corp, C=US</p>
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            public WindowsAppxIdentity build() {
                return new WindowsAppxIdentity(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class IdentityIdentifiers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desktop_manifest_name")
        private java.util.List<String> desktopManifestName;

        @com.aliyun.core.annotation.NameInMap("jetbrains_plugin_id")
        private java.util.List<String> jetbrainsPluginId;

        @com.aliyun.core.annotation.NameInMap("macos_bundle_id")
        private java.util.List<String> macosBundleId;

        @com.aliyun.core.annotation.NameInMap("npm_package")
        private java.util.List<String> npmPackage;

        @com.aliyun.core.annotation.NameInMap("pe_product_identity")
        private java.util.List<PeProductIdentity> peProductIdentity;

        @com.aliyun.core.annotation.NameInMap("pypi_package")
        private java.util.List<String> pypiPackage;

        @com.aliyun.core.annotation.NameInMap("vscode_extension_id")
        private java.util.List<String> vscodeExtensionId;

        @com.aliyun.core.annotation.NameInMap("windows_appx_identity")
        private java.util.List<WindowsAppxIdentity> windowsAppxIdentity;

        @com.aliyun.core.annotation.NameInMap("windows_package_family_name")
        private java.util.List<String> windowsPackageFamilyName;

        private IdentityIdentifiers(Builder builder) {
            this.desktopManifestName = builder.desktopManifestName;
            this.jetbrainsPluginId = builder.jetbrainsPluginId;
            this.macosBundleId = builder.macosBundleId;
            this.npmPackage = builder.npmPackage;
            this.peProductIdentity = builder.peProductIdentity;
            this.pypiPackage = builder.pypiPackage;
            this.vscodeExtensionId = builder.vscodeExtensionId;
            this.windowsAppxIdentity = builder.windowsAppxIdentity;
            this.windowsPackageFamilyName = builder.windowsPackageFamilyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdentityIdentifiers create() {
            return builder().build();
        }

        /**
         * @return desktopManifestName
         */
        public java.util.List<String> getDesktopManifestName() {
            return this.desktopManifestName;
        }

        /**
         * @return jetbrainsPluginId
         */
        public java.util.List<String> getJetbrainsPluginId() {
            return this.jetbrainsPluginId;
        }

        /**
         * @return macosBundleId
         */
        public java.util.List<String> getMacosBundleId() {
            return this.macosBundleId;
        }

        /**
         * @return npmPackage
         */
        public java.util.List<String> getNpmPackage() {
            return this.npmPackage;
        }

        /**
         * @return peProductIdentity
         */
        public java.util.List<PeProductIdentity> getPeProductIdentity() {
            return this.peProductIdentity;
        }

        /**
         * @return pypiPackage
         */
        public java.util.List<String> getPypiPackage() {
            return this.pypiPackage;
        }

        /**
         * @return vscodeExtensionId
         */
        public java.util.List<String> getVscodeExtensionId() {
            return this.vscodeExtensionId;
        }

        /**
         * @return windowsAppxIdentity
         */
        public java.util.List<WindowsAppxIdentity> getWindowsAppxIdentity() {
            return this.windowsAppxIdentity;
        }

        /**
         * @return windowsPackageFamilyName
         */
        public java.util.List<String> getWindowsPackageFamilyName() {
            return this.windowsPackageFamilyName;
        }

        public static final class Builder {
            private java.util.List<String> desktopManifestName; 
            private java.util.List<String> jetbrainsPluginId; 
            private java.util.List<String> macosBundleId; 
            private java.util.List<String> npmPackage; 
            private java.util.List<PeProductIdentity> peProductIdentity; 
            private java.util.List<String> pypiPackage; 
            private java.util.List<String> vscodeExtensionId; 
            private java.util.List<WindowsAppxIdentity> windowsAppxIdentity; 
            private java.util.List<String> windowsPackageFamilyName; 

            private Builder() {
            } 

            private Builder(IdentityIdentifiers model) {
                this.desktopManifestName = model.desktopManifestName;
                this.jetbrainsPluginId = model.jetbrainsPluginId;
                this.macosBundleId = model.macosBundleId;
                this.npmPackage = model.npmPackage;
                this.peProductIdentity = model.peProductIdentity;
                this.pypiPackage = model.pypiPackage;
                this.vscodeExtensionId = model.vscodeExtensionId;
                this.windowsAppxIdentity = model.windowsAppxIdentity;
                this.windowsPackageFamilyName = model.windowsPackageFamilyName;
            } 

            /**
             * <p>The array of application names declared in desktop application manifests.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Example Agent&quot;]</p>
             */
            public Builder desktopManifestName(java.util.List<String> desktopManifestName) {
                this.desktopManifestName = desktopManifestName;
                return this;
            }

            /**
             * <p>The array of plugin IDs declared in JetBrains plugin manifests.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;com.example.agent.plugin&quot;]</p>
             */
            public Builder jetbrainsPluginId(java.util.List<String> jetbrainsPluginId) {
                this.jetbrainsPluginId = jetbrainsPluginId;
                return this;
            }

            /**
             * <p>The array of macOS application bundle identifiers. These describe collected product identity clues and do not indicate that signatures are verified.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;com.example.agent&quot;]</p>
             */
            public Builder macosBundleId(java.util.List<String> macosBundleId) {
                this.macosBundleId = macosBundleId;
                return this;
            }

            /**
             * <p>The array of npm package names. Scoped packages retain the @scope/name format.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;@example/agent-cli&quot;]</p>
             */
            public Builder npmPackage(java.util.List<String> npmPackage) {
                this.npmPackage = npmPackage;
                return this;
            }

            /**
             * <p>The array of product name and company name combinations in Windows PE version resources. These are not file hashes or verified signature identities.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;product_name&quot;:&quot;Example Agent&quot;,&quot;company_name&quot;:&quot;Example Corp&quot;}]</p>
             */
            public Builder peProductIdentity(java.util.List<PeProductIdentity> peProductIdentity) {
                this.peProductIdentity = peProductIdentity;
                return this;
            }

            /**
             * <p>The array of Python package distribution names. These are used for product identity identification and are not a list of import module names.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;example-agent-sdk&quot;]</p>
             */
            public Builder pypiPackage(java.util.List<String> pypiPackage) {
                this.pypiPackage = pypiPackage;
                return this;
            }

            /**
             * <p>The array of VS Code extension identifiers. Each is typically the publisher name and extension name connected by a dot.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;example.agent-assistant&quot;]</p>
             */
            public Builder vscodeExtensionId(java.util.List<String> vscodeExtensionId) {
                this.vscodeExtensionId = vscodeExtensionId;
                return this;
            }

            /**
             * <p>The array of Windows AppX/MSIX manifest identities. Each item provides both the package name and publisher. This does not indicate that the publisher signature is verified.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;name&quot;:&quot;Example.Agent&quot;,&quot;publisher&quot;:&quot;CN=Example Corp, O=Example Corp, C=US&quot;}]</p>
             */
            public Builder windowsAppxIdentity(java.util.List<WindowsAppxIdentity> windowsAppxIdentity) {
                this.windowsAppxIdentity = windowsAppxIdentity;
                return this;
            }

            /**
             * <p>The array of Windows application package family names. Each includes the package name and publisher identifier suffix and is not the application installation path.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Example.Agent_123456789abcd&quot;]</p>
             */
            public Builder windowsPackageFamilyName(java.util.List<String> windowsPackageFamilyName) {
                this.windowsPackageFamilyName = windowsPackageFamilyName;
                return this;
            }

            public IdentityIdentifiers build() {
                return new IdentityIdentifiers(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class AgentDeclaration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("source_path")
        private String sourcePath;

        private AgentDeclaration(Builder builder) {
            this.content = builder.content;
            this.sourcePath = builder.sourcePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentDeclaration create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        public static final class Builder {
            private String content; 
            private String sourcePath; 

            private Builder() {
            } 

            private Builder(AgentDeclaration model) {
                this.content = model.content;
                this.sourcePath = model.sourcePath;
            } 

            /**
             * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
             * 
             * <strong>example:</strong>
             * <p>An AI agent that plans tasks and uses configured tools.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/example-agent/package.json</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            public AgentDeclaration build() {
                return new AgentDeclaration(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class AutonomousExecution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("source_path")
        private String sourcePath;

        private AutonomousExecution(Builder builder) {
            this.content = builder.content;
            this.sourcePath = builder.sourcePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutonomousExecution create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        public static final class Builder {
            private String content; 
            private String sourcePath; 

            private Builder() {
            } 

            private Builder(AutonomousExecution model) {
                this.content = model.content;
                this.sourcePath = model.sourcePath;
            } 

            /**
             * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
             * 
             * <strong>example:</strong>
             * <p>An AI agent that plans tasks and uses configured tools.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/example-agent/package.json</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            public AutonomousExecution build() {
                return new AutonomousExecution(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class ModelCall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("source_path")
        private String sourcePath;

        private ModelCall(Builder builder) {
            this.content = builder.content;
            this.sourcePath = builder.sourcePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelCall create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        public static final class Builder {
            private String content; 
            private String sourcePath; 

            private Builder() {
            } 

            private Builder(ModelCall model) {
                this.content = model.content;
                this.sourcePath = model.sourcePath;
            } 

            /**
             * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
             * 
             * <strong>example:</strong>
             * <p>An AI agent that plans tasks and uses configured tools.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/example-agent/package.json</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            public ModelCall build() {
                return new ModelCall(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class StateManagement extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("source_path")
        private String sourcePath;

        private StateManagement(Builder builder) {
            this.content = builder.content;
            this.sourcePath = builder.sourcePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateManagement create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        public static final class Builder {
            private String content; 
            private String sourcePath; 

            private Builder() {
            } 

            private Builder(StateManagement model) {
                this.content = model.content;
                this.sourcePath = model.sourcePath;
            } 

            /**
             * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
             * 
             * <strong>example:</strong>
             * <p>An AI agent that plans tasks and uses configured tools.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/example-agent/package.json</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            public StateManagement build() {
                return new StateManagement(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class ToolCall extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("source_path")
        private String sourcePath;

        private ToolCall(Builder builder) {
            this.content = builder.content;
            this.sourcePath = builder.sourcePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCall create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        public static final class Builder {
            private String content; 
            private String sourcePath; 

            private Builder() {
            } 

            private Builder(ToolCall model) {
                this.content = model.content;
                this.sourcePath = model.sourcePath;
            } 

            /**
             * <p>The collected declaration text related to the recognition basis. This is currently used mainly for agent_declaration, and other recognition evidence may not return content. This should not be interpreted as an actual execution log.</p>
             * 
             * <strong>example:</strong>
             * <p>An AI agent that plans tasks and uses configured tools.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The local file or configuration path where the recognition evidence is located. This is used to display and locate static clues, and is not a server-side downloadable URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/opt/example-agent/package.json</p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            public ToolCall build() {
                return new ToolCall(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class RecognitionEvidence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agent_declaration")
        private java.util.List<AgentDeclaration> agentDeclaration;

        @com.aliyun.core.annotation.NameInMap("autonomous_execution")
        private java.util.List<AutonomousExecution> autonomousExecution;

        @com.aliyun.core.annotation.NameInMap("model_call")
        private java.util.List<ModelCall> modelCall;

        @com.aliyun.core.annotation.NameInMap("state_management")
        private java.util.List<StateManagement> stateManagement;

        @com.aliyun.core.annotation.NameInMap("tool_call")
        private java.util.List<ToolCall> toolCall;

        private RecognitionEvidence(Builder builder) {
            this.agentDeclaration = builder.agentDeclaration;
            this.autonomousExecution = builder.autonomousExecution;
            this.modelCall = builder.modelCall;
            this.stateManagement = builder.stateManagement;
            this.toolCall = builder.toolCall;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecognitionEvidence create() {
            return builder().build();
        }

        /**
         * @return agentDeclaration
         */
        public java.util.List<AgentDeclaration> getAgentDeclaration() {
            return this.agentDeclaration;
        }

        /**
         * @return autonomousExecution
         */
        public java.util.List<AutonomousExecution> getAutonomousExecution() {
            return this.autonomousExecution;
        }

        /**
         * @return modelCall
         */
        public java.util.List<ModelCall> getModelCall() {
            return this.modelCall;
        }

        /**
         * @return stateManagement
         */
        public java.util.List<StateManagement> getStateManagement() {
            return this.stateManagement;
        }

        /**
         * @return toolCall
         */
        public java.util.List<ToolCall> getToolCall() {
            return this.toolCall;
        }

        public static final class Builder {
            private java.util.List<AgentDeclaration> agentDeclaration; 
            private java.util.List<AutonomousExecution> autonomousExecution; 
            private java.util.List<ModelCall> modelCall; 
            private java.util.List<StateManagement> stateManagement; 
            private java.util.List<ToolCall> toolCall; 

            private Builder() {
            } 

            private Builder(RecognitionEvidence model) {
                this.agentDeclaration = model.agentDeclaration;
                this.autonomousExecution = model.autonomousExecution;
                this.modelCall = model.modelCall;
                this.stateManagement = model.stateManagement;
                this.toolCall = model.toolCall;
            } 

            /**
             * <p>The array of evidence for explicit declarations of agent roles, capabilities, or usage methods. The declaration content itself does not constitute security certification.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/package.json&quot;,&quot;content&quot;:&quot;An AI agent that plans tasks and uses configured tools.&quot;}]</p>
             */
            public Builder agentDeclaration(java.util.List<AgentDeclaration> agentDeclaration) {
                this.agentDeclaration = agentDeclaration;
                return this;
            }

            /**
             * <p>The array of static evidence related to autonomous task execution or agent loops. This does not indicate that actual execution was observed during this scan.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/agent.py&quot;}]</p>
             */
            public Builder autonomousExecution(java.util.List<AutonomousExecution> autonomousExecution) {
                this.autonomousExecution = autonomousExecution;
                return this;
            }

            /**
             * <p>The array of static evidence related to model clients, requests, or configurations. This does not indicate that model requests were actually sent.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/model.py&quot;}]</p>
             */
            public Builder modelCall(java.util.List<ModelCall> modelCall) {
                this.modelCall = modelCall;
                return this;
            }

            /**
             * <p>The array of static evidence related to sessions, memory, or state management. This does not prove actual data persistence or runtime behavior.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/session.py&quot;}]</p>
             */
            public Builder stateManagement(java.util.List<StateManagement> stateManagement) {
                this.stateManagement = stateManagement;
                return this;
            }

            /**
             * <p>The array of static evidence related to tool declarations or code to invoke tools. This does not indicate that the tools were actually executed.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;source_path&quot;:&quot;/opt/example-agent/tools.py&quot;}]</p>
             */
            public Builder toolCall(java.util.List<ToolCall> toolCall) {
                this.toolCall = toolCall;
                return this;
            }

            public RecognitionEvidence build() {
                return new RecognitionEvidence(this);
            } 

        } 

    }
    /**
     * 
     * {@link TypedAIAsset} extends {@link TeaModel}
     *
     * <p>TypedAIAsset</p>
     */
    public static class RiskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("highRiskCnt")
        private Long highRiskCnt;

        @com.aliyun.core.annotation.NameInMap("lowRiskCnt")
        private Long lowRiskCnt;

        @com.aliyun.core.annotation.NameInMap("mediumRiskCnt")
        private Long mediumRiskCnt;

        private RiskInfo(Builder builder) {
            this.highRiskCnt = builder.highRiskCnt;
            this.lowRiskCnt = builder.lowRiskCnt;
            this.mediumRiskCnt = builder.mediumRiskCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskInfo create() {
            return builder().build();
        }

        /**
         * @return highRiskCnt
         */
        public Long getHighRiskCnt() {
            return this.highRiskCnt;
        }

        /**
         * @return lowRiskCnt
         */
        public Long getLowRiskCnt() {
            return this.lowRiskCnt;
        }

        /**
         * @return mediumRiskCnt
         */
        public Long getMediumRiskCnt() {
            return this.mediumRiskCnt;
        }

        public static final class Builder {
            private Long highRiskCnt; 
            private Long lowRiskCnt; 
            private Long mediumRiskCnt; 

            private Builder() {
            } 

            private Builder(RiskInfo model) {
                this.highRiskCnt = model.highRiskCnt;
                this.lowRiskCnt = model.lowRiskCnt;
                this.mediumRiskCnt = model.mediumRiskCnt;
            } 

            /**
             * <p>The number of high-risk items in the currently saved detection results. This is interpreted as an actual count only when detection results are available.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder highRiskCnt(Long highRiskCnt) {
                this.highRiskCnt = highRiskCnt;
                return this;
            }

            /**
             * <p>The number of low-risk items in the currently saved detection results. A value of zero indicates no low-risk items in the results but does not indicate overall security.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowRiskCnt(Long lowRiskCnt) {
                this.lowRiskCnt = lowRiskCnt;
                return this;
            }

            /**
             * <p>The number of medium-risk items in the currently saved detection results. A value of zero indicates no medium-risk items in the results but does not indicate the absence of other risks.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mediumRiskCnt(Long mediumRiskCnt) {
                this.mediumRiskCnt = mediumRiskCnt;
                return this;
            }

            public RiskInfo build() {
                return new RiskInfo(this);
            } 

        } 

    }
}
