// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dashdeviceconsole20250408.models;

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
 * {@link PushPromptRequest} extends {@link RequestModel}
 *
 * <p>PushPromptRequest</p>
 */
public class PushPromptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("promptContent")
    private String promptContent;

    private PushPromptRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.promptContent = builder.promptContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushPromptRequest create() {
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
     * @return promptContent
     */
    public String getPromptContent() {
        return this.promptContent;
    }

    public static final class Builder extends Request.Builder<PushPromptRequest, Builder> {
        private String groupId; 
        private String promptContent; 

        private Builder() {
            super();
        } 

        private Builder(PushPromptRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.promptContent = request.promptContent;
        } 

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * promptContent.
         */
        public Builder promptContent(String promptContent) {
            this.putBodyParameter("promptContent", promptContent);
            this.promptContent = promptContent;
            return this;
        }

        @Override
        public PushPromptRequest build() {
            return new PushPromptRequest(this);
        } 

    } 

}
