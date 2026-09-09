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
 * {@link DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody</p>
 */
public class DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody create() {
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

        private Builder(DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody model) {
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

        public DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody build() {
            return new DeleteDigitalEmployeeUmodelCommonSchemaRefResponseBody(this);
        } 

    } 

}
