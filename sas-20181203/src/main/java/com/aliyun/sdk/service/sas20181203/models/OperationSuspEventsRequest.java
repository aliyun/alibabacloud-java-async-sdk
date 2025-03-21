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
            this.sourceIp = request.sourceIp;
            this.subOperation = request.subOperation;
            this.suspiciousEventIds = request.suspiciousEventIds;
            this.warnType = request.warnType;
        } 

        /**
         * <p>The ID of the request source.</p>
         * <p>Set the value to <strong>sas</strong>, which indicates that the request is sent from Security Center.</p>
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
         * <p>The operation that you want to perform on alerts. Valid values:</p>
         * <ul>
         * <li><strong>deal</strong>: quarantines the source file of the malicious process.</li>
         * <li><strong>ignore</strong>: ignores the alerts.</li>
         * <li><strong>mark_mis_info</strong>: marks the alerts as false positives by adding the alerts to the whitelist.</li>
         * <li><strong>rm_mark_mis_info</strong>: cancels false positives by removing the alerts from the whitelist.</li>
         * <li><strong>offline_handled</strong>: marks the alerts as handled.</li>
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

        /**
         * <p>The suboperation that you want to perform when you quarantine the source file of the malicious process. Valid values:</p>
         * <ul>
         * <li><strong>killAndQuaraFileByPidAndMd5andPath</strong>: terminates the process based on its process ID (PID) and quarantines the source file of the process.</li>
         * <li><strong>quaraFileByMd5andPath</strong>: quarantines the source file of the process.</li>
         * <li><strong>killAndQuaraFileByMd5andPath</strong>: terminates the process and quarantines the source file of the process.</li>
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
         * <p>The IDs of alert events.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the IDs of alert events from the SecurityEventIds response parameter.</p>
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
         * <p>The type of the exceptions. Valid values:</p>
         * <ul>
         * <li><strong>alarm</strong>: alerts</li>
         * <li><strong>null</strong>: exceptions</li>
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
