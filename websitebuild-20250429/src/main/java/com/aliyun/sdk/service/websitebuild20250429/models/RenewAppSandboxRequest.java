// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link RenewAppSandboxRequest} extends {@link RequestModel}
 *
 * <p>RenewAppSandboxRequest</p>
 */
public class RenewAppSandboxRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    private RenewAppSandboxRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.conversationId = builder.conversationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewAppSandboxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    public static final class Builder extends Request.Builder<RenewAppSandboxRequest, Builder> {
        private String regionId; 
        private String conversationId; 

        private Builder() {
            super();
        } 

        private Builder(RenewAppSandboxRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.conversationId = request.conversationId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        @Override
        public RenewAppSandboxRequest build() {
            return new RenewAppSandboxRequest(this);
        } 

    } 

}
