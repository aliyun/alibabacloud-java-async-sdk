// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateVirusEventsRequest} extends {@link RequestModel}
 *
 * <p>OperateVirusEventsRequest</p>
 */
public class OperateVirusEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationAll")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer operationAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationRange")
    private String operationRange;

    private OperateVirusEventsRequest(Builder builder) {
        super(builder);
        this.operationAll = builder.operationAll;
        this.operationCode = builder.operationCode;
        this.operationRange = builder.operationRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateVirusEventsRequest create() {
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

    public static final class Builder extends Request.Builder<OperateVirusEventsRequest, Builder> {
        private Integer operationAll; 
        private String operationCode; 
        private String operationRange; 

        private Builder() {
            super();
        } 

        private Builder(OperateVirusEventsRequest request) {
            super(request);
            this.operationAll = request.operationAll;
            this.operationCode = request.operationCode;
            this.operationRange = request.operationRange;
        } 

        /**
         * Specifies whether to handle all alert events. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder operationAll(Integer operationAll) {
            this.putQueryParameter("OperationAll", operationAll);
            this.operationAll = operationAll;
            return this;
        }

        /**
         * The operation that you want to perform on the alert events. Valid values:
         * <p>
         * 
         * *   **default**: performs in-depth detection and removal
         * *   **ignore**: ignores the alert event
         * *   **advance_mark_mis_info**: adds the alert events to the whitelist
         * *   **manual_handled**: marks the alert events as manually handled
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * The handling scope.
         */
        public Builder operationRange(String operationRange) {
            this.putQueryParameter("OperationRange", operationRange);
            this.operationRange = operationRange;
            return this;
        }

        @Override
        public OperateVirusEventsRequest build() {
            return new OperateVirusEventsRequest(this);
        } 

    } 

}
