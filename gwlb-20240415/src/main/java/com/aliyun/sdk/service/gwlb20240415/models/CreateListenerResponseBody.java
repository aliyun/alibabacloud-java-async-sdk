// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
 * {@link CreateListenerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateListenerResponseBody</p>
 */
public class CreateListenerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateListenerResponseBody(Builder builder) {
        this.listenerId = builder.listenerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateListenerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String listenerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateListenerResponseBody model) {
            this.listenerId = model.listenerId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-wi3c0v30ivysrg****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A045E652-D298-5E70-A978-7247135336FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateListenerResponseBody build() {
            return new CreateListenerResponseBody(this);
        } 

    } 

}
