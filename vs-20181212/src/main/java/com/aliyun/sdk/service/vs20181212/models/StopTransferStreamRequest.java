// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTransferStreamRequest} extends {@link RequestModel}
 *
 * <p>StopTransferStreamRequest</p>
 */
public class StopTransferStreamRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Transcode")
    private String transcode;

    private StopTransferStreamRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.transcode = builder.transcode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTransferStreamRequest create() {
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
     * @return transcode
     */
    public String getTranscode() {
        return this.transcode;
    }

    public static final class Builder extends Request.Builder<StopTransferStreamRequest, Builder> {
        private String id; 
        private Long ownerId; 
        private String transcode; 

        private Builder() {
            super();
        } 

        private Builder(StopTransferStreamRequest response) {
            super(response);
            this.id = response.id;
            this.ownerId = response.ownerId;
            this.transcode = response.transcode;
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
         * Transcode.
         */
        public Builder transcode(String transcode) {
            this.putQueryParameter("Transcode", transcode);
            this.transcode = transcode;
            return this;
        }

        @Override
        public StopTransferStreamRequest build() {
            return new StopTransferStreamRequest(this);
        } 

    } 

}
