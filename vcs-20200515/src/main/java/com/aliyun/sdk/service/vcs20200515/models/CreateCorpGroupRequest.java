// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCorpGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateCorpGroupRequest</p>
 */
public class CreateCorpGroupRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    private CreateCorpGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.corpId = builder.corpId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCorpGroupRequest create() {
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
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<CreateCorpGroupRequest, Builder> {
        private String clientToken; 
        private String corpId; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCorpGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.corpId = response.corpId;
            this.groupId = response.groupId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public CreateCorpGroupRequest build() {
            return new CreateCorpGroupRequest(this);
        } 

    } 

}
