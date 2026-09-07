// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetSemanticViewResponseBody} extends {@link TeaModel}
 *
 * <p>GetSemanticViewResponseBody</p>
 */
public class GetSemanticViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private SemanticViewModel data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSemanticViewResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSemanticViewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public SemanticViewModel getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private SemanticViewModel data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSemanticViewResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the semantic view.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        public Builder data(SemanticViewModel data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSemanticViewResponseBody build() {
            return new GetSemanticViewResponseBody(this);
        } 

    } 

}
