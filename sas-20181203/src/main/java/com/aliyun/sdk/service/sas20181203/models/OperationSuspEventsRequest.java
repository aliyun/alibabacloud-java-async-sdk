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
 * {@link OperationSuspEventsRequest} extends {@link RequestModel}
 *
 * <p>OperationSuspEventsRequest</p>
 */
public class OperationSuspEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubOperation")
    private String subOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuspiciousEventIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String suspiciousEventIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarnType")
    private String warnType;

    private OperationSuspEventsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.operation = builder.operation;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sourceIp = builder.sourceIp;
        this.subOperation = builder.subOperation;
        this.suspiciousEventIds = builder.suspiciousEventIds;
        this.warnType = builder.warnType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperationSuspEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
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
     * @return subOperation
     */
    public String getSubOperation() {
        return this.subOperation;
    }

    /**
     * @return suspiciousEventIds
     */
    public String getSuspiciousEventIds() {
        return this.suspiciousEventIds;
    }

    /**
     * @return warnType
     */
    public String getWarnType() {
        return this.warnType;
    }

    public static final class Builder extends Request.Builder<OperationSuspEventsRequest, Builder> {
        private String from; 
        private String operation; 
        private Long resourceDirectoryAccountId; 
        private String sourceIp; 
        private String subOperation; 
        private String suspiciousEventIds; 
        private String warnType; 

        private Builder() {
            super();
        } 

        private Builder(OperationSuspEventsRequest request) {
            super(request);
            this.from = request.from;
            this.operation = request.operation;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sourceIp = request.sourceIp;
            this.subOperation = request.subOperation;
            this.suspiciousEventIds = request.suspiciousEventIds;
            this.warnType = request.warnType;
        } 

        /**
         * <p>The request source identifier.</p>
         * <p>Set this parameter to <strong>sas</strong>, which indicates a request from the Security Center client.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The operation to perform on the alert. Valid values:</p>
         * <ul>
         * <li><strong>deal</strong>: Handle the alert (quarantine).</li>
         * <li><strong>ignore</strong>: Ignore the alert.</li>
         * <li><strong>mark_mis_info</strong>: Mark as false positive (add to whitelist).</li>
         * <li><strong>rm_mark_mis_info</strong>: Unmark as false positive (remove from whitelist).</li>
         * <li><strong>offline_handled</strong>: Mark as handled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>deal</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of a member account in the resource directory.</p>
         * <blockquote>
         * <p>You can call <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> to obtain this parameter.</p>
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
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The sub-operation type to perform when quarantining the alert event. Valid values:</p>
         * <ul>
         * <li><strong>killAndQuaraFileByPidAndMd5andPath</strong>: Terminate the process by PID and quarantine the source file of the process.</li>
         * <li><strong>quaraFileByMd5andPath</strong>: Quarantine the source file of the process.</li>
         * <li><strong>killAndQuaraFileByMd5andPath</strong>: Terminate the process and quarantine the source file of the process.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>killAndQuaraFileByPidAndMd5andPath</p>
         */
        public Builder subOperation(String subOperation) {
            this.putQueryParameter("SubOperation", subOperation);
            this.subOperation = subOperation;
            return this;
        }

        /**
         * <p>The list of alert event IDs.</p>
         * <blockquote>
         * <p>You can call <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> to obtain alert event IDs from the SecurityEventIds response parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>290852</p>
         */
        public Builder suspiciousEventIds(String suspiciousEventIds) {
            this.putQueryParameter("SuspiciousEventIds", suspiciousEventIds);
            this.suspiciousEventIds = suspiciousEventIds;
            return this;
        }

        /**
         * <p>The type of the exception event to handle. Valid values:</p>
         * <ul>
         * <li><strong>alarm</strong>: alert</li>
         * <li><strong>Empty</strong>: exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alarm</p>
         */
        public Builder warnType(String warnType) {
            this.putQueryParameter("WarnType", warnType);
            this.warnType = warnType;
            return this;
        }

        @Override
        public OperationSuspEventsRequest build() {
            return new OperationSuspEventsRequest(this);
        } 

    } 

}
