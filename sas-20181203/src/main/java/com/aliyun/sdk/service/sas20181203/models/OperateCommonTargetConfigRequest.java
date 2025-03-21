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
 * {@link OperateCommonTargetConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateCommonTargetConfigRequest</p>
 */
public class OperateCommonTargetConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldName")
    private String fieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOperations")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetOperations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private OperateCommonTargetConfigRequest(Builder builder) {
        super(builder);
        this.fieldName = builder.fieldName;
        this.fieldValue = builder.fieldValue;
        this.sourceIp = builder.sourceIp;
        this.targetOperations = builder.targetOperations;
        this.targetType = builder.targetType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateCommonTargetConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return targetOperations
     */
    public String getTargetOperations() {
        return this.targetOperations;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateCommonTargetConfigRequest, Builder> {
        private String fieldName; 
        private String fieldValue; 
        private String sourceIp; 
        private String targetOperations; 
        private String targetType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateCommonTargetConfigRequest request) {
            super(request);
            this.fieldName = request.fieldName;
            this.fieldValue = request.fieldValue;
            this.sourceIp = request.sourceIp;
            this.targetOperations = request.targetOperations;
            this.targetType = request.targetType;
            this.type = request.type;
        } 

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li><strong>repoName</strong>: the name of the image repository</li>
         * <li><strong>repoNamespace</strong>: the namespace of the image repository</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>repoName</p>
         */
        public Builder fieldName(String fieldName) {
            this.putQueryParameter("FieldName", fieldName);
            this.fieldName = fieldName;
            return this;
        }

        /**
         * <p>The name of the image repository or the namespace of the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>cafcmc-dev</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>182.92.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The configuration of proactive defense for your server. The value includes the following fields:</p>
         * <ul>
         * <li><strong>targetType</strong>: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to <strong>uuid</strong>.</li>
         * <li><strong>target</strong>: specifies the UUID of the server for which you want to configure proactive defense.</li>
         * <li><strong>flag</strong>: specifies whether to enable or disable proactive defense for your server. Valid values are <strong>add</strong> and <strong>del</strong>. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;targetType&quot;: &quot;uuid&quot;,
         *             &quot;target&quot;: &quot;f329a044-6a2f-49a0-9d33-352f6c1d****&quot;,
         *             &quot;flag&quot;: &quot;del&quot;
         *       }
         * ]</p>
         */
        public Builder targetOperations(String targetOperations) {
            this.putQueryParameter("TargetOperations", targetOperations);
            this.targetOperations = targetOperations;
            return this;
        }

        /**
         * <p>The dimension based on which the asset is selected. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: the UUID of the server</li>
         * <li><strong>Cluster</strong>: the ID of the cluster</li>
         * <li><strong>image_repo</strong>: the name of the image repository</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li><strong>alidetect-scan-enable</strong>: local file detection</li>
         * <li><strong>ACTION-TRIAL-PERMISSION</strong>: data delivery to ActionTrail</li>
         * <li><strong>alidetect</strong>: local file detection engine</li>
         * <li><strong>container_prevent_escape</strong>: container escape prevention</li>
         * <li><strong>image_repo</strong>: repository image scan</li>
         * <li><strong>proc_filter_switch</strong>: log filtering</li>
         * <li><strong>agentless</strong>: agentless detection</li>
         * <li><strong>rasp</strong>: application protection</li>
         * <li><strong>sensitiveFile</strong>: sensitive file detection</li>
         * <li><strong>aliscriptengine</strong>: in-depth detection engine</li>
         * <li><strong>containerNetwork</strong>: container network visualization</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alidetect</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateCommonTargetConfigRequest build() {
            return new OperateCommonTargetConfigRequest(this);
        } 

    } 

}
