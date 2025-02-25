// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link ListControlPolicyAttachmentsForTargetRequest} extends {@link RequestModel}
 *
 * <p>ListControlPolicyAttachmentsForTargetRequest</p>
 */
public class ListControlPolicyAttachmentsForTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    private ListControlPolicyAttachmentsForTargetRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListControlPolicyAttachmentsForTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<ListControlPolicyAttachmentsForTargetRequest, Builder> {
        private String language; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(ListControlPolicyAttachmentsForTargetRequest request) {
            super(request);
            this.language = request.language;
            this.targetId = request.targetId;
        } 

        /**
         * <p>The language in which you want to return the descriptions of the access control policies. Valid values:</p>
         * <ul>
         * <li>zh-CN (default value): Chinese</li>
         * <li>en: English</li>
         * <li>ja: Japanese</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only for system access control policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The ID of the object whose access control policies you want to query. Access control policies can be attached to the following objects:</p>
         * <ul>
         * <li>Root folder</li>
         * <li>Subfolders of the Root folder</li>
         * <li>Members</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-ZDNPiT****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public ListControlPolicyAttachmentsForTargetRequest build() {
            return new ListControlPolicyAttachmentsForTargetRequest(this);
        } 

    } 

}
