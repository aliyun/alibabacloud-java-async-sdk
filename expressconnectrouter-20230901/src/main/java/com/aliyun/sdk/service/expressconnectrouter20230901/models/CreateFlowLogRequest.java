// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link CreateFlowLogRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowLogRequest</p>
 */
public class CreateFlowLogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowLogName")
    private String flowLogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplingRate")
    private String samplingRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateFlowLogRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.flowLogName = builder.flowLogName;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.interval = builder.interval;
        this.logStoreName = builder.logStoreName;
        this.projectName = builder.projectName;
        this.resourceGroupId = builder.resourceGroupId;
        this.samplingRate = builder.samplingRate;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
    }

    /**
     * @return flowLogName
     */
    public String getFlowLogName() {
        return this.flowLogName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return samplingRate
     */
    public String getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateFlowLogRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String ecrId; 
        private String flowLogName; 
        private String instanceId; 
        private String instanceType; 
        private Integer interval; 
        private String logStoreName; 
        private String projectName; 
        private String resourceGroupId; 
        private String samplingRate; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowLogRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.flowLogName = request.flowLogName;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.interval = request.interval;
            this.logStoreName = request.logStoreName;
            this.projectName = request.projectName;
            this.resourceGroupId = request.resourceGroupId;
            this.samplingRate = request.samplingRate;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the flow log.</p>
         * <blockquote>
         * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the ECR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * <p>The name of the flow log.</p>
         * <blockquote>
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>myFlowlog</p>
         */
        public Builder flowLogName(String flowLogName) {
            this.putBodyParameter("FlowLogName", flowLogName);
            this.flowLogName = flowLogName;
            return this;
        }

        /**
         * <p>The VBR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of network instance. Valid values:</p>
         * <ul>
         * <li><strong>VBR</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The time window for collecting log data. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><strong>60</strong></li>
         * <li><strong>600</strong></li>
         * </ul>
         * <p>Default value: <strong>600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The Logstore that stores the captured traffic data.</p>
         * <ul>
         * <li>If a Logstore is already created in the selected region, enter the name of the Logstore.</li>
         * <li>If no Logstores are created in the selected region, enter a name and the system automatically creates a Logstore. The name of the Logstore. The name must meet the following requirements:</li>
         * <li>The name must be unique in a project.</li>
         * <li>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start and end with a lowercase letter or a digit.</li>
         * <li>The name must be 3 to 63 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flowlog-logstore</p>
         */
        public Builder logStoreName(String logStoreName) {
            this.putQueryParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * <p>The project that stores the captured traffic data.</p>
         * <ul>
         * <li>If a project is already created in the selected region, enter the name of the project.</li>
         * <li>If no projects are created in the selected region, enter a name and the system automatically creates a project.</li>
         * </ul>
         * <p>The project name must be unique in a region. You cannot change the name after the project is created. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be globally unique.</li>
         * <li>The name can contain only lowercase letters,</li>
         * <li>digits, and hyphens (-).</li>
         * <li>The name must start and end with a lowercase letter or a digit.</li>
         * <li>The name must be 3 to 63 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flowlog-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The sampling proportion. Valid values:</p>
         * <ul>
         * <li><strong>1:4096</strong></li>
         * <li><strong>1:2048</strong></li>
         * <li><strong>1:1024</strong></li>
         * </ul>
         * <p>Default value: <strong>1:4096</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1:4096</p>
         */
        public Builder samplingRate(String samplingRate) {
            this.putQueryParameter("SamplingRate", samplingRate);
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateFlowLogRequest build() {
            return new CreateFlowLogRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFlowLogRequest} extends {@link TeaModel}
     *
     * <p>CreateFlowLogRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
