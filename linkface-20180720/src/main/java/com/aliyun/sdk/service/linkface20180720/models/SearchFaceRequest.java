// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link SearchFaceRequest} extends {@link RequestModel}
 *
 * <p>SearchFaceRequest</p>
 */
public class SearchFaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Image")
    @com.aliyun.core.annotation.Validation(required = true)
    private String image;

    private SearchFaceRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    public static final class Builder extends Request.Builder<SearchFaceRequest, Builder> {
        private String groupId; 
        private String image; 

        private Builder() {
            super();
        } 

        private Builder(SearchFaceRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.image = request.image;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>base64imagedata</p>
         */
        public Builder image(String image) {
            this.putBodyParameter("Image", image);
            this.image = image;
            return this;
        }

        @Override
        public SearchFaceRequest build() {
            return new SearchFaceRequest(this);
        } 

    } 

}
