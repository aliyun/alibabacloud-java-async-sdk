// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMoveRequest} extends {@link RequestModel}
 *
 * <p>StopMoveRequest</p>
 */
public class StopMoveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pan")
    private Boolean pan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tilt")
    private Boolean tilt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zoom")
    private Boolean zoom;

    private StopMoveRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.pan = builder.pan;
        this.tilt = builder.tilt;
        this.zoom = builder.zoom;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopMoveRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pan
     */
    public Boolean getPan() {
        return this.pan;
    }

    /**
     * @return tilt
     */
    public Boolean getTilt() {
        return this.tilt;
    }

    /**
     * @return zoom
     */
    public Boolean getZoom() {
        return this.zoom;
    }

    public static final class Builder extends Request.Builder<StopMoveRequest, Builder> {
        private String id; 
        private Long ownerId; 
        private Boolean pan; 
        private Boolean tilt; 
        private Boolean zoom; 

        private Builder() {
            super();
        } 

        private Builder(StopMoveRequest request) {
            super(request);
            this.id = request.id;
            this.ownerId = request.ownerId;
            this.pan = request.pan;
            this.tilt = request.tilt;
            this.zoom = request.zoom;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        /**
         * Pan.
         */
        public Builder pan(Boolean pan) {
            this.putQueryParameter("Pan", pan);
            this.pan = pan;
            return this;
        }

        /**
         * Tilt.
         */
        public Builder tilt(Boolean tilt) {
            this.putQueryParameter("Tilt", tilt);
            this.tilt = tilt;
            return this;
        }

        /**
         * Zoom.
         */
        public Builder zoom(Boolean zoom) {
            this.putQueryParameter("Zoom", zoom);
            this.zoom = zoom;
            return this;
        }

        @Override
        public StopMoveRequest build() {
            return new StopMoveRequest(this);
        } 

    } 

}
