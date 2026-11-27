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
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

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
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
        private Long resourceDirectoryAccountId; 
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
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
            this.targetOperations = request.targetOperations;
            this.targetType = request.targetType;
            this.type = request.type;
        } 

        /**
         * <p>The target type of the image switch. Valid values:</p>
         * <ul>
         * <li><strong>repoName</strong>: the repository name</li>
         * <li><strong>repoNamespace</strong>: the repository namespace name</li>
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
         * <p>The repository name or the repository namespace name.</p>
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
         * <p>The ID of the member accounts in the resource folder (Alibaba Cloud account).</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to retrieve this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The source IP address.</p>
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
         * <p>The parameters for configuring proactive defense for servers. This includes the following parameters:</p>
         * <ul>
         * <li><strong>targetType</strong>: the dimension of the defense configuration. Currently, only the UUID dimension is supported. Set the value to <strong>uuid</strong>.</li>
         * <li><strong>target</strong>: the UUID of the server for which you want to configure defense settings</li>
         * <li><strong>flag</strong>: specifies whether to enable or disable proactive defense for the server. Valid values: <strong>add</strong> (enable) and <strong>del</strong> (disable).</li>
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
         * <p>The target asset type. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: the server UUID</li>
         * <li><strong>Cluster</strong>: the cluster ID</li>
         * <li><strong>image_repo</strong>: the image repository name</li>
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
         * <p>The switch type. Valid values:</p>
         * <ul>
         * <li><strong>alidetect-scan-enable</strong>: local-only file detection</li>
         * <li><strong>ACTION-TRIAL-PERMISSION</strong>: ActionTrail data delivery</li>
         * <li><strong>alidetect</strong>: the local file detection engine</li>
         * <li><strong>container_prevent_escape</strong>: container escape prevention</li>
         * <li><strong>image_repo</strong>: repository image scanning</li>
         * <li><strong>proc_filter_switch</strong>: log filtering</li>
         * <li><strong>agentless</strong>: agentless detection</li>
         * <li><strong>rasp</strong>: application protection</li>
         * <li><strong>sensitiveFile</strong>: sensitive information scanning</li>
         * <li><strong>aliscriptengine</strong>: the deep detection engine</li>
         * <li><strong>containerNetwork</strong>: container visualization</li>
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
