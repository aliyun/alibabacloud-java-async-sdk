// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Specifies whether to add multiple alert events to the whitelist at a time. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder markBatch(String markBatch) {
            this.putQueryParameter("MarkBatch", markBatch);
            this.markBatch = markBatch;
            return this;
        }

        /**
         * The whitelist rule. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **field**: The field based on which alert events are added to the whitelist.
         * 
         * *   **operate**: The method that is used to added alert events to the whitelist. Valid values:
         * 
         *     *   **notContains**: does not contain
         *     *   **contains**: contains
         *     *   **regex**: matches by regular expression
         *     *   **strEqual**: equals
         *     *   **strNotEqual**: does not equal
         * 
         * *   **fieldValue**: The value of the field based on which alert events are added to the whitelist.
         * 
         * *   **uuid**: The application scope of the whitelist rule. Valid values:
         * 
         *     *   **part**: the current asset
         *     *   **ALL**: all assets
         * 
         * >  You can call the [DescribeSecurityEventOperations](~~DescribeSecurityEventOperations~~) operation to obtain the fields that you can specify for **field**.
         */
        public Builder markMissParam(String markMissParam) {
            this.putQueryParameter("MarkMissParam", markMissParam);
            this.markMissParam = markMissParam;
            return this;
        }

        /**
         * The operation that you want to perform to handle the alert events. Valid values:
         * <p>
         * 
         * *   **block_ip**: blocks the source IP address.
         * *   **advance\_mark\_mis_info**: adds the alert events to the whitelist.
         * *   **ignore**: ignores the alert events.
         * *   **manual_handled**: marks the alert events as manually handled.
         * *   **kill_process**: terminates the malicious process.
         * *   **cleanup**: performs in-depth virus detection and removal.
         * *   **kill\_and_quara**: kills the malicious processes and quarantines the source file.
         * *   **disable\_malicious_defense**: stops the container on which the alerting files or processes exist.
         * *   **client\_problem_check**: performs troubleshooting.
         * *   **quara**: quarantines the source file of the malicious process.
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * The configuration of the operation that you want to perform to handle the alert events.
         * <p>
         * 
         * >  If you set OperationCode to `kill_and_quara` or `block_ip`, you must specify OperationParams. If you set OperationCode to other values, you can leave OperationParams empty.
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * The remarks of the handling operation.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the member in the resource directory.
         * <p>
         * 
         * >  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * The IDs of the alert events.
         */
        public Builder securityEventIds(java.util.List < String > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
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

        @Override
        public HandleSecurityEventsRequest build() {
            return new HandleSecurityEventsRequest(this);
        } 

    } 

}
