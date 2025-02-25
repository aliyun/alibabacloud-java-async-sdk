// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>SetTaskStatusRequest</p>
 */
public class SetTaskStatusRequest extends Request {
    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("Wskey")
    @Validation(required = true)
    private String wskey;

    private SetTaskStatusRequest(Builder builder) {
        super(builder);
        this.status = builder.status;
        this.wskey = builder.wskey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return wskey
     */
    public String getWskey() {
        return this.wskey;
    }

    public static final class Builder extends Request.Builder<SetTaskStatusRequest, Builder> {
        private String status; 
        private String wskey; 

        private Builder() {
            super();
        } 

        private Builder(SetTaskStatusRequest request) {
            super(request);
            this.status = request.status;
            this.wskey = request.wskey;
        } 

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Wskey.
         */
        public Builder wskey(String wskey) {
            this.putQueryParameter("Wskey", wskey);
            this.wskey = wskey;
            return this;
        }

        @Override
        public SetTaskStatusRequest build() {
            return new SetTaskStatusRequest(this);
        } 

    } 

}
