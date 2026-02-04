// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateCustomFieldResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomFieldResponseBody</p>
 */
public class CreateCustomFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FieldId")
    private String fieldId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomFieldResponseBody(Builder builder) {
        this.fieldId = builder.fieldId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomFieldResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldId
     */
    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fieldId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomFieldResponseBody model) {
            this.fieldId = model.fieldId;
            this.requestId = model.requestId;
        } 

        /**
         * FieldId.
         */
        public Builder fieldId(String fieldId) {
            this.fieldId = fieldId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomFieldResponseBody build() {
            return new CreateCustomFieldResponseBody(this);
        } 

    } 

}
