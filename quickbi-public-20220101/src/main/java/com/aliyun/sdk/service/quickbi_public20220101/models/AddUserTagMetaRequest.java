// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddUserTagMetaRequest} extends {@link RequestModel}
 *
 * <p>AddUserTagMetaRequest</p>
 */
public class AddUserTagMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagDescription")
    private String tagDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagName;

    private AddUserTagMetaRequest(Builder builder) {
        super(builder);
        this.tagDescription = builder.tagDescription;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserTagMetaRequest create() {
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
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<AddUserTagMetaRequest, Builder> {
        private String tagDescription; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(AddUserTagMetaRequest request) {
            super(request);
            this.tagDescription = request.tagDescription;
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
         * <p>This parameter is required.</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public AddUserTagMetaRequest build() {
            return new AddUserTagMetaRequest(this);
        } 

    } 

}
