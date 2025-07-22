// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateForwardEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateForwardEntryResponseBody</p>
 */
public class CreateForwardEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
    private String forwardEntryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateForwardEntryResponseBody(Builder builder) {
        this.forwardEntryId = builder.forwardEntryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateForwardEntryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardEntryId
     */
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String forwardEntryId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateForwardEntryResponseBody model) {
            this.forwardEntryId = model.forwardEntryId;
            this.requestId = model.requestId;
        } 

        /**
         * ForwardEntryId.
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateForwardEntryResponseBody build() {
            return new CreateForwardEntryResponseBody(this);
        } 

    } 

}
