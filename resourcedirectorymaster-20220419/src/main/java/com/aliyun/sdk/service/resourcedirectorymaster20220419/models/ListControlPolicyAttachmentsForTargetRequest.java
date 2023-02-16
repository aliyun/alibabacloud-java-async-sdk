// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListControlPolicyAttachmentsForTargetRequest} extends {@link RequestModel}
 *
 * <p>ListControlPolicyAttachmentsForTargetRequest</p>
 */
public class ListControlPolicyAttachmentsForTargetRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("TargetId")
    @Validation(required = true)
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
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * TargetId.
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
