// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserTagValueRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserTagValueRequest</p>
 */
public class UpdateUserTagValueRequest extends Request {
    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private String tagId;

    @Query
    @NameInMap("TagValue")
    @Validation(required = true)
    private String tagValue;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private UpdateUserTagValueRequest(Builder builder) {
        super(builder);
        this.tagId = builder.tagId;
        this.tagValue = builder.tagValue;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserTagValueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateUserTagValueRequest, Builder> {
        private String tagId; 
        private String tagValue; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserTagValueRequest request) {
            super(request);
            this.tagId = request.tagId;
            this.tagValue = request.tagValue;
            this.userId = request.userId;
        } 

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * TagValue.
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("TagValue", tagValue);
            this.tagValue = tagValue;
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
        public UpdateUserTagValueRequest build() {
            return new UpdateUserTagValueRequest(this);
        } 

    } 

}
