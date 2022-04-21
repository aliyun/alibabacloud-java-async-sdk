// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSpaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateSpaceRequest</p>
 */
public class UpdateSpaceRequest extends Request {
    @Body
    @NameInMap("Desc")
    private String desc;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("Status")
    private String status;

    private UpdateSpaceRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.spaceId = builder.spaceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSpaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateSpaceRequest, Builder> {
        private String desc; 
        private String spaceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSpaceRequest request) {
            super(request);
            this.desc = request.desc;
            this.spaceId = request.spaceId;
            this.status = request.status;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateSpaceRequest build() {
            return new UpdateSpaceRequest(this);
        } 

    } 

}
