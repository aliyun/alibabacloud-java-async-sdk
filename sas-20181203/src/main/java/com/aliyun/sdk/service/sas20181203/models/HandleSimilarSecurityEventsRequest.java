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
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The whitelist rule. For example, if you want to add a file that contains the string a to the whitelist based on the MD5 hash value, set this parameter to {&quot;field&quot;:&quot;md5&quot;,&quot;operate&quot;:&quot;contains&quot;,&quot;fieldValue&quot;:&quot;aa&quot;}.</p>
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
         * <p>The operation that you want to perform to handle the alert events.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSecurityEventOperations~~">DescribeSecurityEventOperations</a> operation to query the operations.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>offline_handled</p>
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * <p>The configuration of the operation that you want to perform to handle the alert events. The value of this parameter is in the JSON format.</p>
         * <blockquote>
         * <p> If you set <strong>OperationCode</strong> to <strong>kill_and_quara</strong>, <strong>block_ip</strong>, or <strong>virus_quara</strong>, you must specify OperationParams. If you set <strong>OperationCode</strong> to other values, you can leave OperationParams empty. If you set <strong>OperationCode</strong> to <strong>block_ip</strong>, the value of OperationParams must consist of the following fields:</p>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li><strong>expireTime</strong>: the end time of locking. Unit: milliseconds.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p> If you set <strong>OperationCode</strong> to <strong>kill_and_quara</strong>, the value of OperationParams must consist of the following fields:</p>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li><strong>subOperation</strong>: the method of detection and removal. Valid values:</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <pre><code>*   **killAndQuaraFileByMd5andPath**: terminates the process and quarantines the source file of the process.
         * *   **killByMd5andPath**: terminates the running process.
         * </code></pre>
         * </blockquote>
         * <blockquote>
         * <p> If you set <strong>OperationCode</strong> to <strong>virus_quara</strong>, the value of OperationParams consists of the following fields:</p>
         * </blockquote>
         * <blockquote>
         * <ul>
         * <li><strong>subOperation</strong>: the method of detection and removal. Valid values:</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <pre><code>*   **quaraFileByMd5andPath**: quarantines the source file of the process.
         * </code></pre>
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
         * <p>The remark of the operation.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
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
         * <p>The ID of the task that handles the alert events at a time.</p>
         * <blockquote>
         * <p> You can call the <a href="~~CreateSimilarSecurityEventsQueryTask~~">CreateSimilarSecurityEventsQueryTask</a> operation to query the IDs of tasks.</p>
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
