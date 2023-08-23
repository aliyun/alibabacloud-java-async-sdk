// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRcuSceneRequest} extends {@link RequestModel}
 *
 * <p>DeleteRcuSceneRequest</p>
 */
public class DeleteRcuSceneRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("SceneId")
    @Validation(required = true)
    private String sceneId;

    private DeleteRcuSceneRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRcuSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<DeleteRcuSceneRequest, Builder> {
        private String hotelId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRcuSceneRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.sceneId = request.sceneId;
        } 

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public DeleteRcuSceneRequest build() {
            return new DeleteRcuSceneRequest(this);
        } 

    } 

}
