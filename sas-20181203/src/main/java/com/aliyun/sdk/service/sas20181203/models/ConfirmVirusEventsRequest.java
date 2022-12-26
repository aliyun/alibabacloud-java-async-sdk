// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfirmVirusEventsRequest} extends {@link RequestModel}
 *
 * <p>ConfirmVirusEventsRequest</p>
 */
public class ConfirmVirusEventsRequest extends Request {
    @Query
    @NameInMap("OperationAll")
    @Validation(required = true)
    private Integer operationAll;

    @Query
    @NameInMap("OperationCode")
    @Validation(required = true)
    private String operationCode;

    @Query
    @NameInMap("OperationRange")
    private String operationRange;

    private ConfirmVirusEventsRequest(Builder builder) {
        super(builder);
        this.operationAll = builder.operationAll;
        this.operationCode = builder.operationCode;
        this.operationRange = builder.operationRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfirmVirusEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationAll
     */
    public Integer getOperationAll() {
        return this.operationAll;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return operationRange
     */
    public String getOperationRange() {
        return this.operationRange;
    }

    public static final class Builder extends Request.Builder<ConfirmVirusEventsRequest, Builder> {
        private Integer operationAll; 
        private String operationCode; 
        private String operationRange; 

        private Builder() {
            super();
        } 

        private Builder(ConfirmVirusEventsRequest request) {
            super(request);
            this.operationAll = request.operationAll;
            this.operationCode = request.operationCode;
            this.operationRange = request.operationRange;
        } 

        /**
         * OperationAll.
         */
        public Builder operationAll(Integer operationAll) {
            this.putQueryParameter("OperationAll", operationAll);
            this.operationAll = operationAll;
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
         * OperationRange.
         */
        public Builder operationRange(String operationRange) {
            this.putQueryParameter("OperationRange", operationRange);
            this.operationRange = operationRange;
            return this;
        }

        @Override
        public ConfirmVirusEventsRequest build() {
            return new ConfirmVirusEventsRequest(this);
        } 

    } 

}
