// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFailureMsgRequest} extends {@link RequestModel}
 *
 * <p>DeleteFailureMsgRequest</p>
 */
public class DeleteFailureMsgRequest extends Request {
    @Query
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("RequestFingerprint")
    @Validation(required = true)
    private String requestFingerprint;

    private DeleteFailureMsgRequest(Builder builder) {
        super(builder);
        this.operation = builder.operation;
        this.requestFingerprint = builder.requestFingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFailureMsgRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return requestFingerprint
     */
    public String getRequestFingerprint() {
        return this.requestFingerprint;
    }

    public static final class Builder extends Request.Builder<DeleteFailureMsgRequest, Builder> {
        private String operation; 
        private String requestFingerprint; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFailureMsgRequest request) {
            super(request);
            this.operation = request.operation;
            this.requestFingerprint = request.requestFingerprint;
        } 

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * RequestFingerprint.
         */
        public Builder requestFingerprint(String requestFingerprint) {
            this.putQueryParameter("RequestFingerprint", requestFingerprint);
            this.requestFingerprint = requestFingerprint;
            return this;
        }

        @Override
        public DeleteFailureMsgRequest build() {
            return new DeleteFailureMsgRequest(this);
        } 

    } 

}
