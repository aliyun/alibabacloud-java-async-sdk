// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link UpdateAggregateRemediationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAggregateRemediationRequest</p>
 */
public class UpdateAggregateRemediationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InvokeType")
    private String invokeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remediationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationTemplateId")
    private String remediationTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemediationType")
    private String remediationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private UpdateAggregateRemediationRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.invokeType = builder.invokeType;
        this.params = builder.params;
        this.remediationId = builder.remediationId;
        this.remediationTemplateId = builder.remediationTemplateId;
        this.remediationType = builder.remediationType;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateRemediationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return invokeType
     */
    public String getInvokeType() {
        return this.invokeType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return remediationId
     */
    public String getRemediationId() {
        return this.remediationId;
    }

    /**
     * @return remediationTemplateId
     */
    public String getRemediationTemplateId() {
        return this.remediationTemplateId;
    }

    /**
     * @return remediationType
     */
    public String getRemediationType() {
        return this.remediationType;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<UpdateAggregateRemediationRequest, Builder> {
        private String aggregatorId; 
        private String invokeType; 
        private String params; 
        private String remediationId; 
        private String remediationTemplateId; 
        private String remediationType; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAggregateRemediationRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.invokeType = request.invokeType;
            this.params = request.params;
            this.remediationId = request.remediationId;
            this.remediationTemplateId = request.remediationTemplateId;
            this.remediationType = request.remediationType;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>You can the <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a> operation to obtain the ID of the account group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-6b4a626622af0012****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putBodyParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The execution mode of the remediation. Valid values:</p>
         * <ul>
         * <li>NON_EXECUTION: The remediation is not executed.</li>
         * <li>AUTO_EXECUTION: The remediation is automatically executed.</li>
         * <li>MANUAL_EXECUTION: The remediation is manually executed.</li>
         * <li>NOT_CONFIG: The execution mode is not specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO_EXECUTION</p>
         */
        public Builder invokeType(String invokeType) {
            this.putBodyParameter("InvokeType", invokeType);
            this.invokeType = invokeType;
            return this;
        }

        /**
         * <p>The desired parameter values of the remediation setting.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;properties&quot;:[{&quot;name&quot;:&quot;regionId&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;{regionId}&quot;,&quot;allowedValues&quot;:[]},{&quot;name&quot;:&quot;bucketName&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;{resourceId}&quot;,&quot;allowedValues&quot;:[],&quot;description&quot;:&quot;OSS Bucket Name.&quot;},{&quot;name&quot;:&quot;permissionName&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;private&quot;,&quot;allowedValues&quot;:[&quot;public-read-write&quot;,&quot;public-read&quot;,&quot;private&quot;],&quot;description&quot;:&quot;ACL Permission Name.&quot;}]}</p>
         */
        public Builder params(String params) {
            this.putBodyParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the remediation setting.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/270036.html">ListAggregateRemediations</a> operation to obtain the ID of the remediation setting.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-909ba2d4716700eb****</p>
         */
        public Builder remediationId(String remediationId) {
            this.putBodyParameter("RemediationId", remediationId);
            this.remediationId = remediationId;
            return this;
        }

        /**
         * <p>The ID of the remediation template.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/270066.html">ListRemediationTemplates</a> operation to obtain the ID of the remediation template.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-OSS-PutBucketAcl</p>
         */
        public Builder remediationTemplateId(String remediationTemplateId) {
            this.putBodyParameter("RemediationTemplateId", remediationTemplateId);
            this.remediationTemplateId = remediationTemplateId;
            return this;
        }

        /**
         * <p>The type of the remediation template. Valid values:</p>
         * <ul>
         * <li>OOS: Operation Orchestration Service (OOS)</li>
         * <li>FC: Function Compute. You can use Function Compute to configure custom remediation settings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        public Builder remediationType(String remediationType) {
            this.putBodyParameter("RemediationType", remediationType);
            this.remediationType = remediationType;
            return this;
        }

        /**
         * <p>The type of the rule for which the remediation template is configured. Valid values:</p>
         * <ul>
         * <li>ALIYUN: managed rule.</li>
         * <li>CUSTOM: custom rule.</li>
         * <li>NONE: The rule is not specified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public UpdateAggregateRemediationRequest build() {
            return new UpdateAggregateRemediationRequest(this);
        } 

    } 

}
