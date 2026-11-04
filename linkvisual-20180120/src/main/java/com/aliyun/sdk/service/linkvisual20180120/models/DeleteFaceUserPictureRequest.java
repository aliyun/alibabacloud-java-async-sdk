// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link DeleteFaceUserPictureRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceUserPictureRequest</p>
 */
public class DeleteFaceUserPictureRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FacePicMd5")
    @com.aliyun.core.annotation.Validation(required = true)
    private String facePicMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The unique identifier of the user\&quot;s face image. Set this parameter to the <strong>Data</strong> value that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/312040.html">AddFaceUserPicutre</a> operation to add the face image for the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1bb580ef7****</p>
         */
        public Builder facePicMd5(String facePicMd5) {
            this.putQueryParameter("FacePicMd5", facePicMd5);
            this.facePicMd5 = facePicMd5;
            return this;
        }

        /**
         * <p>The business isolation ID. It is used to isolate data between different business applications under the same Alibaba Cloud account. Set this parameter to the same value as the <strong>IsolationId</strong> that you specified when you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZheJiangHZ</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * <p>The user ID. Set this parameter to the <strong>UserId</strong> value that you obtained and saved locally after you called the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add the user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3mtjaqebeq4d****</p>
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
