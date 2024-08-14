// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSensitiveDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetSensitiveDataResponseBody</p>
 */
public class GetSensitiveDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitiveData")
    private java.util.Map < String, ? > sensitiveData;

    private GetSensitiveDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sensitiveData = builder.sensitiveData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveData
     */
    public java.util.Map < String, ? > getSensitiveData() {
        return this.sensitiveData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > sensitiveData; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the sensitive data returned. The information includes totalCount and sensDatas. sensDatas includes the following parameters:
         * <p>
         * 
         * *   guid: the ID of the metadata of the tenant. For example, the ID of the metadata in the MaxCompute compute engine is in the Project name.Table name.Column name format.
         * *   sensType: the type of the sensitive data.
         * *   sensLevel: the sensitivity level of the sensitive data
         */
        public Builder sensitiveData(java.util.Map < String, ? > sensitiveData) {
            this.sensitiveData = sensitiveData;
            return this;
        }

        public GetSensitiveDataResponseBody build() {
            return new GetSensitiveDataResponseBody(this);
        } 

    } 

}
