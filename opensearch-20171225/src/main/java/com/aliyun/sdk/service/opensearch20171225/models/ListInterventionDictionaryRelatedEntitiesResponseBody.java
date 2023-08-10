// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryRelatedEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryRelatedEntitiesResponseBody</p>
 */
public class ListInterventionDictionaryRelatedEntitiesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < java.util.Map<String, ?>> result;

    private ListInterventionDictionaryRelatedEntitiesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionaryRelatedEntitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < java.util.Map<String, ?>> result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about each application and each query analysis rule. If no query analysis rule references the intervention dictionary, the value of the result parameter is an empty list.
         */
        public Builder result(java.util.List < java.util.Map<String, ?>> result) {
            this.result = result;
            return this;
        }

        public ListInterventionDictionaryRelatedEntitiesResponseBody build() {
            return new ListInterventionDictionaryRelatedEntitiesResponseBody(this);
        } 

    } 

}
