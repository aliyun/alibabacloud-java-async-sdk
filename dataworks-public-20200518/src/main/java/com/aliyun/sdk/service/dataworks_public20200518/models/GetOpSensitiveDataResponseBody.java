// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpSensitiveDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpSensitiveDataResponseBody</p>
 */
public class GetOpSensitiveDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpSensitiveData")
    private String opSensitiveData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOpSensitiveDataResponseBody(Builder builder) {
        this.opSensitiveData = builder.opSensitiveData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpSensitiveDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return opSensitiveData
     */
    public String getOpSensitiveData() {
        return this.opSensitiveData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String opSensitiveData; 
        private String requestId; 

        /**
         * The information about the access records of the sensitive data. The information includes totalCount and opRiskDatas. opRiskDatas includes the following parameters:
         * <p>
         * 
         * *   sensType: the type of the sensitive data.
         * *   sensLevel: the sensitivity level of the sensitive data. A larger value indicates a higher sensitivity level.
         * *   opType: the type of the operation.
         * *   sql: the SQL statement that is executed.
         * *   opAccount: the account that is used to perform the operation.
         * *   opTime: the time when the operation was performed.
         */
        public Builder opSensitiveData(String opSensitiveData) {
            this.opSensitiveData = opSensitiveData;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOpSensitiveDataResponseBody build() {
            return new GetOpSensitiveDataResponseBody(this);
        } 

    } 

}
