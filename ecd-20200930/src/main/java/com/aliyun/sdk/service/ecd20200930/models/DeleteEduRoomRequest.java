// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEduRoomRequest} extends {@link RequestModel}
 *
 * <p>DeleteEduRoomRequest</p>
 */
public class DeleteEduRoomRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EduRoomId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eduRoomId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteEduRoomRequest(Builder builder) {
        super(builder);
        this.eduRoomId = builder.eduRoomId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEduRoomRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eduRoomId
     */
    public String getEduRoomId() {
        return this.eduRoomId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteEduRoomRequest, Builder> {
        private String eduRoomId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEduRoomRequest request) {
            super(request);
            this.eduRoomId = request.eduRoomId;
            this.regionId = request.regionId;
        } 

        /**
         * EduRoomId.
         */
        public Builder eduRoomId(String eduRoomId) {
            this.putQueryParameter("EduRoomId", eduRoomId);
            this.eduRoomId = eduRoomId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteEduRoomRequest build() {
            return new DeleteEduRoomRequest(this);
        } 

    } 

}
