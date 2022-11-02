// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleSecurityEventsRequest} extends {@link RequestModel}
 *
 * <p>HandleSecurityEventsRequest</p>
 */
public class HandleSecurityEventsRequest extends Request {
    @Query
    @NameInMap("MarkBatch")
    private String markBatch;

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
    @NameInMap("SecurityEventIds")
    @Validation(required = true)
    private java.util.List < String > securityEventIds;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private HandleSecurityEventsRequest(Builder builder) {
        super(builder);
        this.markBatch = builder.markBatch;
        this.markMissParam = builder.markMissParam;
        this.operationCode = builder.operationCode;
        this.operationParams = builder.operationParams;
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
            this.securityEventIds = request.securityEventIds;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * MarkBatch.
         */
        public Builder markBatch(String markBatch) {
            this.putQueryParameter("MarkBatch", markBatch);
            this.markBatch = markBatch;
            return this;
        }

        /**
         * MarkMissParam.
         */
        public Builder markMissParam(String markMissParam) {
            this.putQueryParameter("MarkMissParam", markMissParam);
            this.markMissParam = markMissParam;
            return this;
        }

        /**
         * OperationCode.
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * OperationParams.
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * SecurityEventIds.
         */
        public Builder securityEventIds(java.util.List < String > securityEventIds) {
            this.putQueryParameter("SecurityEventIds", securityEventIds);
            this.securityEventIds = securityEventIds;
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

        @Override
        public HandleSecurityEventsRequest build() {
            return new HandleSecurityEventsRequest(this);
        } 

    } 

}
