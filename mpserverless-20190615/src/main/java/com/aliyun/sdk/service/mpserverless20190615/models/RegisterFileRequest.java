// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterFileRequest} extends {@link RequestModel}
 *
 * <p>RegisterFileRequest</p>
 */
public class RegisterFileRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private RegisterFileRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<RegisterFileRequest, Builder> {
        private String id; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(RegisterFileRequest request) {
            super(request);
            this.id = request.id;
            this.spaceId = request.spaceId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public RegisterFileRequest build() {
            return new RegisterFileRequest(this);
        } 

    } 

}
