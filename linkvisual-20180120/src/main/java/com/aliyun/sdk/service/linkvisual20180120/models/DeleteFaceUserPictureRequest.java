// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceUserPictureRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceUserPictureRequest</p>
 */
public class DeleteFaceUserPictureRequest extends Request {
    @Query
    @NameInMap("FacePicMd5")
    @Validation(required = true)
    private String facePicMd5;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private DeleteFaceUserPictureRequest(Builder builder) {
        super(builder);
        this.facePicMd5 = builder.facePicMd5;
        this.isolationId = builder.isolationId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceUserPictureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return facePicMd5
     */
    public String getFacePicMd5() {
        return this.facePicMd5;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteFaceUserPictureRequest, Builder> {
        private String facePicMd5; 
        private String isolationId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceUserPictureRequest request) {
            super(request);
            this.facePicMd5 = request.facePicMd5;
            this.isolationId = request.isolationId;
            this.userId = request.userId;
        } 

        /**
         * FacePicMd5.
         */
        public Builder facePicMd5(String facePicMd5) {
            this.putQueryParameter("FacePicMd5", facePicMd5);
            this.facePicMd5 = facePicMd5;
            return this;
        }

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteFaceUserPictureRequest build() {
            return new DeleteFaceUserPictureRequest(this);
        } 

    } 

}
