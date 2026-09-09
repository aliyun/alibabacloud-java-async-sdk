// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody} extends {@link TeaModel}
 *
 * <p>UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody</p>
 */
public class UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0A1B2C3D-4E5F-6789-ABCD-1234567890AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody build() {
            return new UpsertDigitalEmployeeUmodelCommonSchemaRefResponseBody(this);
        } 

    } 

}
