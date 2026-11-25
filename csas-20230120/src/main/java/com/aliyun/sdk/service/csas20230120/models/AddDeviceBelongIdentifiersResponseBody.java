// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link AddDeviceBelongIdentifiersResponseBody} extends {@link TeaModel}
 *
 * <p>AddDeviceBelongIdentifiersResponseBody</p>
 */
public class AddDeviceBelongIdentifiersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentifierIds")
    private java.util.List<String> identifierIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDeviceBelongIdentifiersResponseBody(Builder builder) {
        this.identifierIds = builder.identifierIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceBelongIdentifiersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifierIds
     */
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> identifierIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddDeviceBelongIdentifiersResponseBody model) {
            this.identifierIds = model.identifierIds;
            this.requestId = model.requestId;
        } 

        /**
         * IdentifierIds.
         */
        public Builder identifierIds(java.util.List<String> identifierIds) {
            this.identifierIds = identifierIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDeviceBelongIdentifiersResponseBody build() {
            return new AddDeviceBelongIdentifiersResponseBody(this);
        } 

    } 

}
