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
 * {@link ModifyFlowLogAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowLogAttributeRequest</p>
 */
public class ModifyFlowLogAttributeRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowLogId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowLogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowLogName")
    private String flowLogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplingRate")
    private String samplingRate;

    private ModifyFlowLogAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.flowLogId = builder.flowLogId;
        this.flowLogName = builder.flowLogName;
        this.interval = builder.interval;
        this.samplingRate = builder.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowLogAttributeRequest create() {
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
     * @return flowLogId
     */
    public String getFlowLogId() {
        return this.flowLogId;
    }

    /**
     * @return flowLogName
     */
    public String getFlowLogName() {
        return this.flowLogName;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return samplingRate
     */
    public String getSamplingRate() {
        return this.samplingRate;
    }

    public static final class Builder extends Request.Builder<ModifyFlowLogAttributeRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String ecrId; 
        private String flowLogId; 
        private String flowLogName; 
        private Integer interval; 
        private String samplingRate; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowLogAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.flowLogId = request.flowLogId;
            this.flowLogName = request.flowLogName;
            this.interval = request.interval;
            this.samplingRate = request.samplingRate;
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
         * <p>The description of the flow log.
         * The description can be empty or 0 to 256 characters in length.</p>
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
         * <p>The ECR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-fu8rszhgv7623c****</p>
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * <p>The ID of the flow log.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flowlog-m5evbtbpt****</p>
         */
        public Builder flowLogId(String flowLogId) {
            this.putQueryParameter("FlowLogId", flowLogId);
            this.flowLogId = flowLogId;
            return this;
        }

        /**
         * <p>The new name of the flow log. The name must be 0 to 128 characters in length.</p>
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
         * <p>The time window for collecting log data. Unit: seconds. Valid values:</p>
         * <ul>
         * <li><strong>60</strong></li>
         * <li><strong>600</strong></li>
         * </ul>
         * <p>Default value: <strong>600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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

        @Override
        public ModifyFlowLogAttributeRequest build() {
            return new ModifyFlowLogAttributeRequest(this);
        } 

    } 

}
