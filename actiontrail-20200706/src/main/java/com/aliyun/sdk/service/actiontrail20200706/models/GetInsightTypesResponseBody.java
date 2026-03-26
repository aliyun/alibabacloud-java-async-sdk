// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetInsightTypesResponseBody} extends {@link TeaModel}
 *
 * <p>GetInsightTypesResponseBody</p>
 */
public class GetInsightTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InsightTypes")
    private java.util.Map<String, ?> insightTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetInsightTypesResponseBody(Builder builder) {
        this.insightTypes = builder.insightTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInsightTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insightTypes
     */
    public java.util.Map<String, ?> getInsightTypes() {
        return this.insightTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, ?> insightTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetInsightTypesResponseBody model) {
            this.insightTypes = model.insightTypes;
            this.requestId = model.requestId;
        } 

        /**
         * InsightTypes.
         */
        public Builder insightTypes(java.util.Map<String, ?> insightTypes) {
            this.insightTypes = insightTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInsightTypesResponseBody build() {
            return new GetInsightTypesResponseBody(this);
        } 

    } 

}
