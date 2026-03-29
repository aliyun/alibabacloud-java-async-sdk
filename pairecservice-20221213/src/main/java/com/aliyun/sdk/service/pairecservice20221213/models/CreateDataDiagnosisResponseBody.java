// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateDataDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataDiagnosisResponseBody</p>
 */
public class CreateDataDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisId")
    private String dataDiagnosisId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataDiagnosisResponseBody(Builder builder) {
        this.dataDiagnosisId = builder.dataDiagnosisId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataDiagnosisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiagnosisId
     */
    public String getDataDiagnosisId() {
        return this.dataDiagnosisId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataDiagnosisId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDataDiagnosisResponseBody model) {
            this.dataDiagnosisId = model.dataDiagnosisId;
            this.requestId = model.requestId;
        } 

        /**
         * DataDiagnosisId.
         */
        public Builder dataDiagnosisId(String dataDiagnosisId) {
            this.dataDiagnosisId = dataDiagnosisId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataDiagnosisResponseBody build() {
            return new CreateDataDiagnosisResponseBody(this);
        } 

    } 

}
