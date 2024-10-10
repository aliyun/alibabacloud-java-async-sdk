// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link HandleSecurityEventsRequest} extends {@link RequestModel}
 *
 * <p>HandleSecurityEventsRequest</p>
 */
public class HandleSecurityEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MarkBatch")
    private String markBatch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MarkMissParam")
    private String markMissParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationParams")
    private String operationParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > securityEventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private HandleSecurityEventsRequest(Builder builder) {
        super(builder);
        this.markBatch = builder.markBatch;
        this.markMissParam = builder.markMissParam;
        this.operationCode = builder.operationCode;
        this.operationParams = builder.operationParams;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.securityEventIds = builder.securityEventIds;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSecurityEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return markBatch
     */
    public String getMarkBatch() {
        return this.markBatch;
    }

    /**
     * @return markMissParam
     */
    public String getMarkMissParam() {
        return this.markMissParam;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return operationParams
     */
    public String getOperationParams() {
        return this.operationParams;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return securityEventIds
     */
    public java.util.List < String > getSecurityEventIds() {
        return this.securityEventIds;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<HandleSecurityEventsRequest, Builder> {
        private String markBatch; 
        private String markMissParam; 
        private String operationCode; 
        private String operationParams; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private java.util.List < String > securityEventIds; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(HandleSecurityEventsRequest request) {
            super(request);
            this.markBatch = request.markBatch;
            this.markMissParam = request.markMissParam;
            this.operationCode = request.operationCode;
            this.operationParams = request.operationParams;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.securityEventIds = request.securityEventIds;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>Specifies whether to add multiple alert events to the whitelist at a time. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder markBatch(String markBatch) {
            this.putQueryParameter("MarkBatch", markBatch);
            this.markBatch = markBatch;
            return this;
        }

        /**
         * <p>The whitelist rule. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>field</strong>: The field based on which alert events are added to the whitelist.</p>
         * </li>
         * <li><p><strong>operate</strong>: The method that is used to added alert events to the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>notContains</strong>: does not contain</li>
         * <li><strong>contains</strong>: contains</li>
         * <li><strong>regex</strong>: matches by regular expression</li>
         * <li><strong>strEqual</strong>: equals</li>
         * <li><strong>strNotEqual</strong>: does not equal</li>
         * </ul>
         * </li>
         * <li><p><strong>fieldValue</strong>: The value of the field based on which alert events are added to the whitelist.</p>
         * </li>
         * <li><p><strong>uuid</strong>: The application scope of the whitelist rule. Valid values:</p>
         * <ul>
         * <li><strong>part</strong>: the current asset</li>
         * <li><strong>ALL</strong>: all assets</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSecurityEventOperations~~">DescribeSecurityEventOperations</a> operation to obtain the fields that you can specify for <strong>field</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;gmtModified&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;asd&quot;},{&quot;uuid&quot;:&quot;part&quot;,&quot;field&quot;:&quot;loginUser&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;vff&quot;}]</p>
         */
        public Builder markMissParam(String markMissParam) {
            this.putQueryParameter("MarkMissParam", markMissParam);
            this.markMissParam = markMissParam;
            return this;
        }

        /**
         * <p>The operation that you want to perform to handle the alert events. Valid values:</p>
         * <ul>
         * <li><strong>block_ip</strong>: blocks the source IP address.</li>
         * <li><strong>advance_mark_mis_info</strong>: adds the alert events to the whitelist.</li>
         * <li><strong>ignore</strong>: ignores the alert events.</li>
         * <li><strong>manual_handled</strong>: marks the alert events as manually handled.</li>
         * <li><strong>kill_process</strong>: terminates the malicious process.</li>
         * <li><strong>cleanup</strong>: performs in-depth virus detection and removal.</li>
         * <li><strong>kill_and_quara</strong>: kills the malicious processes and quarantines the source file.</li>
         * <li><strong>disable_malicious_defense</strong>: stops the container on which the alerting files or processes exist.</li>
         * <li><strong>client_problem_check</strong>: performs troubleshooting.</li>
         * <li><strong>quara</strong>: quarantines the source file of the malicious process.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>block_ip</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * <p>The configuration of the operation that you want to perform to handle the alert events.</p>
         * <blockquote>
         * <p> If you set OperationCode to <code>kill_and_quara</code> or <code>block_ip</code>, you must specify OperationParams. If you set OperationCode to other values, you can leave OperationParams empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * <p>The remarks of the handling operation.</p>
         * 
         * <strong>example:</strong>
         * <p>remark test.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16670360956*****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The IDs of the alert events.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;909361&quot;]</p>
         */
        public Builder securityEventIds(java.util.List < String > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public HandleSecurityEventsRequest build() {
            return new HandleSecurityEventsRequest(this);
        } 

    } 

}
