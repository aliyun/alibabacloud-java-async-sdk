// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveFavoritesRequest} extends {@link RequestModel}
 *
 * <p>SaveFavoritesRequest</p>
 */
public class SaveFavoritesRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("WorksId")
    @Validation(required = true)
    private String worksId;

    private SaveFavoritesRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveFavoritesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<SaveFavoritesRequest, Builder> {
        private String userId; 
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(SaveFavoritesRequest request) {
            super(request);
            this.userId = request.userId;
            this.worksId = request.worksId;
        } 

        /**
         * The user ID of the collection. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The ID of the collection.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public SaveFavoritesRequest build() {
            return new SaveFavoritesRequest(this);
        } 

    } 

}
