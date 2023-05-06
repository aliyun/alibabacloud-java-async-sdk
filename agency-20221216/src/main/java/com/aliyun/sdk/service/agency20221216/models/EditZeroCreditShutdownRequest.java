// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditZeroCreditShutdownRequest} extends {@link RequestModel}
 *
 * <p>EditZeroCreditShutdownRequest</p>
 */
public class EditZeroCreditShutdownRequest extends Request {
    @Query
    @NameInMap("ShutdownPolicy")
    private String shutdownPolicy;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private EditZeroCreditShutdownRequest(Builder builder) {
        super(builder);
        this.shutdownPolicy = builder.shutdownPolicy;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditZeroCreditShutdownRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return shutdownPolicy
     */
    public String getShutdownPolicy() {
        return this.shutdownPolicy;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<EditZeroCreditShutdownRequest, Builder> {
        private String shutdownPolicy; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(EditZeroCreditShutdownRequest request) {
            super(request);
            this.shutdownPolicy = request.shutdownPolicy;
            this.uid = request.uid;
        } 

        /**
         * shutdownPolicy
         */
        public Builder shutdownPolicy(String shutdownPolicy) {
            this.putQueryParameter("ShutdownPolicy", shutdownPolicy);
            this.shutdownPolicy = shutdownPolicy;
            return this;
        }

        /**
         * uid
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public EditZeroCreditShutdownRequest build() {
            return new EditZeroCreditShutdownRequest(this);
        } 

    } 

}
