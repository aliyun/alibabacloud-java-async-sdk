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
 * {@link HandleSimilarSecurityEventsRequest} extends {@link RequestModel}
 *
 * <p>HandleSimilarSecurityEventsRequest</p>
 */
public class HandleSimilarSecurityEventsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private HandleSimilarSecurityEventsRequest(Builder builder) {
        super(builder);
        this.markMissParam = builder.markMissParam;
        this.operationCode = builder.operationCode;
        this.operationParams = builder.operationParams;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSimilarSecurityEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<HandleSimilarSecurityEventsRequest, Builder> {
        private String markMissParam; 
        private String operationCode; 
        private String operationParams; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(HandleSimilarSecurityEventsRequest request) {
            super(request);
            this.markMissParam = request.markMissParam;
            this.operationCode = request.operationCode;
            this.operationParams = request.operationParams;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The rule for adding to the whitelist. For example, to add a whitelist rule based on the file MD5 where the file contains the string &quot;a&quot;, set this parameter to {&quot;field&quot;:&quot;md5&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;aa&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;field&quot;:&quot;md5&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;aa&quot;}</p>
         */
        public Builder markMissParam(String markMissParam) {
            this.putQueryParameter("MarkMissParam", markMissParam);
            this.markMissParam = markMissParam;
            return this;
        }

        /**
         * <p>The operation type for batch processing alert events of the same type.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeSecurityEventOperations~~">DescribeSecurityEventOperations</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>You can use kill_process to terminate a process. Obtain the specific valid operation values dynamically by calling the DescribeSecurityEventOperations operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kill_process</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * <p>The configuration of the sub-operation for handling alerting events. The value is in JSON format.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, <strong>block_ip</strong>, or <strong>virus_quara</strong>. For other values of <strong>OperationCode</strong>, this parameter can be left empty.</p>
         * </blockquote>
         * <blockquote>
         * <p>When <strong>OperationCode</strong> is set to <strong>block_ip</strong>, the following field is included:</p>
         * <ul>
         * <li><strong>expireTime</strong>: The lock expiration time. Unit: milliseconds.</li>
         * </ul>
         * <p>When <strong>OperationCode</strong> is set to <strong>kill_and_quara</strong>, the following field is included:</p>
         * <ul>
         * <li><strong>subOperation</strong>: The method used for trojan scan. Valid values:<ul>
         * <li><strong>killAndQuaraFileByMd5andPath</strong>: Terminates the process and moves the file to quarantined file.</li>
         * <li><strong>killByMd5andPath</strong>: Terminates the running process.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>When <strong>OperationCode</strong> is set to <strong>virus_quara</strong>, the following field is included:</p>
         * <ul>
         * <li><strong>subOperation</strong>: The method used for trojan scan. Valid values:<ul>
         * <li><strong>quaraFileByMd5andPath</strong>: Moves the source file of the process to quarantined file.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expireTime&quot;:1646208726195}</p>
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * <p>The remarks for the operation.</p>
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
         * <p>The ID of the Alibaba Cloud account of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The ID of the task that batch processes all alert events of the same type.</p>
         * <blockquote>
         * <p>Call the <a href="~~CreateSimilarSecurityEventsQueryTask~~">CreateSimilarSecurityEventsQueryTask</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>666038</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public HandleSimilarSecurityEventsRequest build() {
            return new HandleSimilarSecurityEventsRequest(this);
        } 

    } 

}
