// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleSimilarSecurityEventsRequest} extends {@link RequestModel}
 *
 * <p>HandleSimilarSecurityEventsRequest</p>
 */
public class HandleSimilarSecurityEventsRequest extends Request {
    @Query
    @NameInMap("MarkMissParam")
    private String markMissParam;

    @Query
    @NameInMap("OperationCode")
    @Validation(required = true)
    private String operationCode;

    @Query
    @NameInMap("OperationParams")
    private String operationParams;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
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
         * The whitelist rule. For example, if you want to add a file that contains the string a to the whitelist based on the MD5 hash value, set this parameter to {"field":"md5","operate":"contains","fieldValue":"aa"}.
         */
        public Builder markMissParam(String markMissParam) {
            this.putQueryParameter("MarkMissParam", markMissParam);
            this.markMissParam = markMissParam;
            return this;
        }

        /**
         * The operation that you want to perform to handle the alert events.
         * <p>
         * 
         * >  You can call the [DescribeSecurityEventOperations](~~DescribeSecurityEventOperations~~) operation to query the operations.
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * The configuration of the operation that you want to perform to handle the alert events. The value of this parameter is in the JSON format.
         * <p>
         * 
         * >  If you set **OperationCode** to **kill\_and\_quara**, **block\_ip**, or **virus\_quara**, you must specify OperationParams. If you set **OperationCode** to other values, you can leave OperationParams empty. If you set **OperationCode** to **block_ip**, the value of OperationParams must consist of the following fields:
         * 
         * > *   **expireTime**: the end time of locking. Unit: milliseconds.
         * 
         * >  If you set **OperationCode** to **kill\_and_quara**, the value of OperationParams must consist of the following fields:
         * 
         * > *   **subOperation**: the method of detection and removal. Valid values:
         * 
         * >     *   **killAndQuaraFileByMd5andPath**: terminates the process and quarantines the source file of the process.
         * >     *   **killByMd5andPath**: terminates the running process.
         * 
         * >  If you set **OperationCode** to **virus_quara**, the value of OperationParams consists of the following fields:
         * 
         * > *   **subOperation**: the method of detection and removal. Valid values:
         * 
         * >     *   **quaraFileByMd5andPath**: quarantines the source file of the process.
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * Remark.
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
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The ID of the task that handles the alert events at a time.
         * <p>
         * 
         * >  You can call the [CreateSimilarSecurityEventsQueryTask](~~CreateSimilarSecurityEventsQueryTask~~) operation to query the IDs of tasks.
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
