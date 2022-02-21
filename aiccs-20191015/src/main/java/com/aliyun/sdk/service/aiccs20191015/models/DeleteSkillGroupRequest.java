// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteSkillGroupRequest</p>
 */
public class DeleteSkillGroupRequest extends Request {
    @Query
    @NameInMap("OuterGroupId")
    private String outerGroupId;

    @Query
    @NameInMap("OuterGroupType")
    private String outerGroupType;

    private DeleteSkillGroupRequest(Builder builder) {
        super(builder);
        this.outerGroupId = builder.outerGroupId;
        this.outerGroupType = builder.outerGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSkillGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outerGroupId
     */
    public String getOuterGroupId() {
        return this.outerGroupId;
    }

    /**
     * @return outerGroupType
     */
    public String getOuterGroupType() {
        return this.outerGroupType;
    }

    public static final class Builder extends Request.Builder<DeleteSkillGroupRequest, Builder> {
        private String outerGroupId; 
        private String outerGroupType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSkillGroupRequest response) {
            super(response);
            this.outerGroupId = response.outerGroupId;
            this.outerGroupType = response.outerGroupType;
        } 

        /**
         * OuterGroupId.
         */
        public Builder outerGroupId(String outerGroupId) {
            this.putQueryParameter("OuterGroupId", outerGroupId);
            this.outerGroupId = outerGroupId;
            return this;
        }

        /**
         * OuterGroupType.
         */
        public Builder outerGroupType(String outerGroupType) {
            this.putQueryParameter("OuterGroupType", outerGroupType);
            this.outerGroupType = outerGroupType;
            return this;
        }

        @Override
        public DeleteSkillGroupRequest build() {
            return new DeleteSkillGroupRequest(this);
        } 

    } 

}
