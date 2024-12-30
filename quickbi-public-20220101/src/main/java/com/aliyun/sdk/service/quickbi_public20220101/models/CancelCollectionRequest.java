// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link CancelCollectionRequest} extends {@link RequestModel}
 *
 * <p>CancelCollectionRequest</p>
 */
public class CancelCollectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the favorite user. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121344444790****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The ID of the work to cancel the collection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5d6ae4e7-cede-43cd-b4d3-d2fd442a9202</p>
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
