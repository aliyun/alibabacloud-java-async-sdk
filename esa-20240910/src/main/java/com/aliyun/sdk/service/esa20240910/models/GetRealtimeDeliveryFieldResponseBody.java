// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRealtimeDeliveryFieldResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeDeliveryFieldResponseBody</p>
 */
public class GetRealtimeDeliveryFieldResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FieldContent")
    private java.util.Map<String, FieldContentValue> fieldContent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRealtimeDeliveryFieldResponseBody(Builder builder) {
        this.fieldContent = builder.fieldContent;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeDeliveryFieldResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldContent
     */
    public java.util.Map<String, FieldContentValue> getFieldContent() {
        return this.fieldContent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, FieldContentValue> fieldContent; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRealtimeDeliveryFieldResponseBody model) {
            this.fieldContent = model.fieldContent;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The fields returned.</p>
         */
        public Builder fieldContent(java.util.Map<String, FieldContentValue> fieldContent) {
            this.fieldContent = fieldContent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRealtimeDeliveryFieldResponseBody build() {
            return new GetRealtimeDeliveryFieldResponseBody(this);
        } 

    } 

}
