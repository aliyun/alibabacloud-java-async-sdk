// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("SubOperation")
    private String subOperation;

    @Query
    @NameInMap("SuspiciousEventIds")
    @Validation(required = true)
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
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * SubOperation.
         */
        public Builder subOperation(String subOperation) {
            this.putQueryParameter("SubOperation", subOperation);
            this.subOperation = subOperation;
            return this;
        }

        /**
         * SuspiciousEventIds.
         */
        public Builder suspiciousEventIds(String suspiciousEventIds) {
            this.putQueryParameter("SuspiciousEventIds", suspiciousEventIds);
            this.suspiciousEventIds = suspiciousEventIds;
            return this;
        }

        /**
         * WarnType.
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
