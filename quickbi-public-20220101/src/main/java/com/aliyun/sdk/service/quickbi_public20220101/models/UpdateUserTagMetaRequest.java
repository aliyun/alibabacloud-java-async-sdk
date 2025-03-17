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
 * {@link UpdateUserTagMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserTagMetaRequest</p>
 */
public class UpdateUserTagMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagDescription")
    private String tagDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The tag description.</p>
         * <ul>
         * <li>Format check: Maximum length is 255 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Job Positions within the Department</p>
         */
        public Builder tagDescription(String tagDescription) {
            this.putQueryParameter("TagDescription", tagDescription);
            this.tagDescription = tagDescription;
            return this;
        }

        /**
         * <p>The specified TagID.</p>
         * <ul>
         * <li>Format check: Maximum length is 64 characters.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e82f6c6c0333431bad0225b2f85e****</p>
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * <p>The tag name.</p>
         * <ul>
         * <li>Format check: Maximum length is 50 characters.</li>
         * <li>Only Chinese, English, numbers, and /|<a href=""></a> symbols are allowed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Department</p>
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
