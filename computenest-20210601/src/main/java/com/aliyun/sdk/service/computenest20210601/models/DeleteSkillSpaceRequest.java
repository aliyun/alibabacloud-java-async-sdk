// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link DeleteSkillSpaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteSkillSpaceRequest</p>
 */
public class DeleteSkillSpaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillSpaceId;

    private DeleteSkillSpaceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.skillSpaceId = builder.skillSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSkillSpaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return skillSpaceId
     */
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    public static final class Builder extends Request.Builder<DeleteSkillSpaceRequest, Builder> {
        private String clientToken; 
        private String skillSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSkillSpaceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.skillSpaceId = request.skillSpaceId;
        } 

        /**
         * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>SkillSpace  ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-xxxxx</p>
         */
        public Builder skillSpaceId(String skillSpaceId) {
            this.putQueryParameter("SkillSpaceId", skillSpaceId);
            this.skillSpaceId = skillSpaceId;
            return this;
        }

        @Override
        public DeleteSkillSpaceRequest build() {
            return new DeleteSkillSpaceRequest(this);
        } 

    } 

}
