// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCorpGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteCorpGroupRequest</p>
 */
public class DeleteCorpGroupRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    private DeleteCorpGroupRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCorpGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteCorpGroupRequest, Builder> {
        private String corpId; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCorpGroupRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.groupId = response.groupId;
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
        public DeleteCorpGroupRequest build() {
            return new DeleteCorpGroupRequest(this);
        } 

    } 

}
