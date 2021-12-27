// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OperationSuspEventsRequest} extends {@link RequestModel}
 *
 * <p>OperationSuspEventsRequest</p>
 */
public class OperationSuspEventsRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("Operation")
    private String operation;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("SubOperation")
    private String subOperation;

    @Query
    @NameInMap("SuspiciousEventIds")
    private String suspiciousEventIds;

    @Query
    @NameInMap("WarnType")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String from; 
        private String operation; 
        private String sourceIp; 
        private String subOperation; 
        private String suspiciousEventIds; 
        private String warnType; 

        /**
         * <p>From.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>Operation.</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>SubOperation.</p>
         */
        public Builder subOperation(String subOperation) {
            this.putQueryParameter("SubOperation", subOperation);
            this.subOperation = subOperation;
            return this;
        }

        /**
         * <p>SuspiciousEventIds.</p>
         */
        public Builder suspiciousEventIds(String suspiciousEventIds) {
            this.putQueryParameter("SuspiciousEventIds", suspiciousEventIds);
            this.suspiciousEventIds = suspiciousEventIds;
            return this;
        }

        /**
         * <p>WarnType.</p>
         */
        public Builder warnType(String warnType) {
            this.putQueryParameter("WarnType", warnType);
            this.warnType = warnType;
            return this;
        }

        public OperationSuspEventsRequest build() {
            return new OperationSuspEventsRequest(this);
        } 

    } 

}
