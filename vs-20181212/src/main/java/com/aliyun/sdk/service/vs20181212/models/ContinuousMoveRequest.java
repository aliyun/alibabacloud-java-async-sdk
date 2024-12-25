// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ContinuousMoveRequest} extends {@link RequestModel}
 *
 * <p>ContinuousMoveRequest</p>
 */
public class ContinuousMoveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pan")
    private String pan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tilt")
    private String tilt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zoom")
    private String zoom;

    private ContinuousMoveRequest(Builder builder) {
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

    public static ContinuousMoveRequest create() {
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
    public String getPan() {
        return this.pan;
    }

    /**
     * @return tilt
     */
    public String getTilt() {
        return this.tilt;
    }

    /**
     * @return zoom
     */
    public String getZoom() {
        return this.zoom;
    }

    public static final class Builder extends Request.Builder<ContinuousMoveRequest, Builder> {
        private String id; 
        private Long ownerId; 
        private String pan; 
        private String tilt; 
        private String zoom; 

        private Builder() {
            super();
        } 

        private Builder(ContinuousMoveRequest request) {
            super(request);
            this.id = request.id;
            this.ownerId = request.ownerId;
            this.pan = request.pan;
            this.tilt = request.tilt;
            this.zoom = request.zoom;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
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
        public Builder pan(String pan) {
            this.putQueryParameter("Pan", pan);
            this.pan = pan;
            return this;
        }

        /**
         * Tilt.
         */
        public Builder tilt(String tilt) {
            this.putQueryParameter("Tilt", tilt);
            this.tilt = tilt;
            return this;
        }

        /**
         * Zoom.
         */
        public Builder zoom(String zoom) {
            this.putQueryParameter("Zoom", zoom);
            this.zoom = zoom;
            return this;
        }

        @Override
        public ContinuousMoveRequest build() {
            return new ContinuousMoveRequest(this);
        } 

    } 

}
