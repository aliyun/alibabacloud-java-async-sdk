// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserTagMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserTagMetaRequest</p>
 */
public class UpdateUserTagMetaRequest extends Request {
    @Query
    @NameInMap("TagDescription")
    private String tagDescription;

    @Query
    @NameInMap("TagId")
    @Validation(required = true)
    private String tagId;

    @Query
    @NameInMap("TagName")
    @Validation(required = true)
    private String tagName;

    private UpdateUserTagMetaRequest(Builder builder) {
        super(builder);
        this.tagDescription = builder.tagDescription;
        this.tagId = builder.tagId;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserTagMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagDescription
     */
    public String getTagDescription() {
        return this.tagDescription;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<UpdateUserTagMetaRequest, Builder> {
        private String tagDescription; 
        private String tagId; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserTagMetaRequest request) {
            super(request);
            this.tagDescription = request.tagDescription;
            this.tagId = request.tagId;
            this.tagName = request.tagName;
        } 

        /**
         * TagDescription.
         */
        public Builder tagDescription(String tagDescription) {
            this.putQueryParameter("TagDescription", tagDescription);
            this.tagDescription = tagDescription;
            return this;
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
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public UpdateUserTagMetaRequest build() {
            return new UpdateUserTagMetaRequest(this);
        } 

    } 

}
