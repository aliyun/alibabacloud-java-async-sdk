// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseEventRequest} extends {@link RequestModel}
 *
 * <p>CloseEventRequest</p>
 */
public class CloseEventRequest extends Request {
    @Query
    @NameInMap("CloseDesc")
    private String closeDesc;

    @Query
    @NameInMap("Id")
    private String id;

    private CloseEventRequest(Builder builder) {
        super(builder);
        this.closeDesc = builder.closeDesc;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return closeDesc
     */
    public String getCloseDesc() {
        return this.closeDesc;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<CloseEventRequest, Builder> {
        private String closeDesc; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(CloseEventRequest request) {
            super(request);
            this.closeDesc = request.closeDesc;
            this.id = request.id;
        } 

        /**
         * CloseDesc.
         */
        public Builder closeDesc(String closeDesc) {
            this.putQueryParameter("CloseDesc", closeDesc);
            this.closeDesc = closeDesc;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public CloseEventRequest build() {
            return new CloseEventRequest(this);
        } 

    } 

}
