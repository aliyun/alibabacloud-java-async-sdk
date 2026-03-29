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
 * {@link CreateDataDiagnosisJobsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataDiagnosisJobsResponseBody</p>
 */
public class CreateDataDiagnosisJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataDiagnosisJobIds")
    private java.util.List<String> dataDiagnosisJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataDiagnosisJobsResponseBody(Builder builder) {
        this.dataDiagnosisJobIds = builder.dataDiagnosisJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataDiagnosisJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDiagnosisJobIds
     */
    public java.util.List<String> getDataDiagnosisJobIds() {
        return this.dataDiagnosisJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> dataDiagnosisJobIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDataDiagnosisJobsResponseBody model) {
            this.dataDiagnosisJobIds = model.dataDiagnosisJobIds;
            this.requestId = model.requestId;
        } 

        /**
         * DataDiagnosisJobIds.
         */
        public Builder dataDiagnosisJobIds(java.util.List<String> dataDiagnosisJobIds) {
            this.dataDiagnosisJobIds = dataDiagnosisJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataDiagnosisJobsResponseBody build() {
            return new CreateDataDiagnosisJobsResponseBody(this);
        } 

    } 

}
