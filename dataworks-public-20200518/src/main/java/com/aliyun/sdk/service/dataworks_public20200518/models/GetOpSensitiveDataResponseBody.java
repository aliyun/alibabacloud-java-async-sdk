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
         * The information of the access records returned for the sensitive data. The information includes totalCount and opRiskDatas.
         * <p>
         * 
         * opRiskDatas includes the following parameters:
         * 
         * *   sensType: indicates the type of the sensitive data.
         * *   sensLevel: indicates the sensitivity level of the sensitive data. A larger value of sensLevel indicates a higher sensitivity level.
         * *   opType: indicates the type of the operation.
         * *   sql: indicates the SQL statement that is executed.
         * *   opAccount: indicates the account that is used to perform the operation.
         * *   opTime: indicates the time when the operation was performed.
         */
        public Builder opSensitiveData(String opSensitiveData) {
            this.opSensitiveData = opSensitiveData;
            return this;
        }

        /**
         * The ID of the request.
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
