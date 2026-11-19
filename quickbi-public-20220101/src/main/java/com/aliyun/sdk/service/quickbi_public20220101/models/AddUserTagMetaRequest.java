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
         * <p>The tag description. Format requirements: The maximum length is 255 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Positions within the department</p>
         */
        public Builder tagDescription(String tagDescription) {
            this.putQueryParameter("TagDescription", tagDescription);
            this.tagDescription = tagDescription;
            return this;
        }

        /**
         * <p>The tag name. Format requirements:</p>
         * <ul>
         * <li>The maximum length is 50 characters.</li>
         * <li>Only Chinese characters, English letters, digits, and the /\|<a href=""></a> symbols are allowed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Position</p>
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
