// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCollectionRequest} extends {@link RequestModel}
 *
 * <p>CancelCollectionRequest</p>
 */
public class CancelCollectionRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("WorksId")
    @Validation(required = true)
    private String worksId;

    private CancelCollectionRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCollectionRequest create() {
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

    public static final class Builder extends Request.Builder<CancelCollectionRequest, Builder> {
        private String userId; 
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(CancelCollectionRequest request) {
            super(request);
            this.userId = request.userId;
            this.worksId = request.worksId;
        } 

        /**
         * The ID of the favorite user. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The ID of the work to cancel the collection.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public CancelCollectionRequest build() {
            return new CancelCollectionRequest(this);
        } 

    } 

}
