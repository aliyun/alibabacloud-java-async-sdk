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
 * {@link CreateTransitRouterEcrAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterEcrAttachmentResponseBody</p>
 */
public class CreateTransitRouterEcrAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    private String transitRouterAttachmentId;

    private CreateTransitRouterEcrAttachmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterEcrAttachmentResponseBody create() {
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

        private Builder(CreateTransitRouterEcrAttachmentResponseBody model) {
            this.requestId = model.requestId;
            this.transitRouterAttachmentId = model.transitRouterAttachmentId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0245BEF-52AC-44A8-A776-EF96FD26A5CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the ECR connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-qieks13jnt1cchy***</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        public CreateTransitRouterEcrAttachmentResponseBody build() {
            return new CreateTransitRouterEcrAttachmentResponseBody(this);
        } 

    } 

}
