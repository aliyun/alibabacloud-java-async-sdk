// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CreateOperationTicketResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOperationTicketResponseBody</p>
 */
public class CreateOperationTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationTicketId")
    private String operationTicketId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateOperationTicketResponseBody(Builder builder) {
        this.operationTicketId = builder.operationTicketId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOperationTicketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationTicketId
     */
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String operationTicketId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateOperationTicketResponseBody model) {
            this.operationTicketId = model.operationTicketId;
            this.requestId = model.requestId;
        } 

        /**
         * OperationTicketId.
         */
        public Builder operationTicketId(String operationTicketId) {
            this.operationTicketId = operationTicketId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOperationTicketResponseBody build() {
            return new CreateOperationTicketResponseBody(this);
        } 

    } 

}
