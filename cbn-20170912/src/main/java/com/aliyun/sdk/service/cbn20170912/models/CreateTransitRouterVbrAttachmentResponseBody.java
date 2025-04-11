// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateTransitRouterVbrAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterVbrAttachmentResponseBody</p>
 */
public class CreateTransitRouterVbrAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    private CreateTransitRouterVbrAttachmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterVbrAttachmentResponseBody create() {
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

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterAttachmentId; 

        private Builder() {
        } 

        private Builder(CreateTransitRouterVbrAttachmentResponseBody model) {
            this.requestId = model.requestId;
            this.transitRouterAttachmentId = model.transitRouterAttachmentId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C087A369-82B9-43EF-91F4-4B63A9C6E6B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VBR connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-ia340z7xis7t5s****</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        public CreateTransitRouterVbrAttachmentResponseBody build() {
            return new CreateTransitRouterVbrAttachmentResponseBody(this);
        } 

    } 

}
