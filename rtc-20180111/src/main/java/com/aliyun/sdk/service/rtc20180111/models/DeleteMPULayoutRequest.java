// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMPULayoutRequest} extends {@link RequestModel}
 *
 * <p>DeleteMPULayoutRequest</p>
 */
public class DeleteMPULayoutRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("LayoutId")
    @Validation(required = true)
    private Long layoutId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteMPULayoutRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.layoutId = builder.layoutId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMPULayoutRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return layoutId
     */
    public Long getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteMPULayoutRequest, Builder> {
        private String appId; 
        private Long layoutId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMPULayoutRequest request) {
            super(request);
            this.appId = request.appId;
            this.layoutId = request.layoutId;
            this.ownerId = request.ownerId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(Long layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DeleteMPULayoutRequest build() {
            return new DeleteMPULayoutRequest(this);
        } 

    } 

}
