// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountGroupRequest</p>
 */
public class CreateAccountGroupRequest extends Request {
    @Query
    @NameInMap("OuterAccountId")
    private String outerAccountId;

    @Query
    @NameInMap("OuterAccountType")
    private String outerAccountType;

    @Query
    @NameInMap("OuterGroupId")
    private String outerGroupId;

    @Query
    @NameInMap("OuterGroupType")
    private String outerGroupType;

    private CreateAccountGroupRequest(Builder builder) {
        super(builder);
        this.outerAccountId = builder.outerAccountId;
        this.outerAccountType = builder.outerAccountType;
        this.outerGroupId = builder.outerGroupId;
        this.outerGroupType = builder.outerGroupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outerAccountId
     */
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    /**
     * @return outerAccountType
     */
    public String getOuterAccountType() {
        return this.outerAccountType;
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

    public static final class Builder extends Request.Builder<CreateAccountGroupRequest, Builder> {
        private String outerAccountId; 
        private String outerAccountType; 
        private String outerGroupId; 
        private String outerGroupType; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountGroupRequest response) {
            super(response);
            this.outerAccountId = response.outerAccountId;
            this.outerAccountType = response.outerAccountType;
            this.outerGroupId = response.outerGroupId;
            this.outerGroupType = response.outerGroupType;
        } 

        /**
         * OuterAccountId.
         */
        public Builder outerAccountId(String outerAccountId) {
            this.putQueryParameter("OuterAccountId", outerAccountId);
            this.outerAccountId = outerAccountId;
            return this;
        }

        /**
         * OuterAccountType.
         */
        public Builder outerAccountType(String outerAccountType) {
            this.putQueryParameter("OuterAccountType", outerAccountType);
            this.outerAccountType = outerAccountType;
            return this;
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
        public CreateAccountGroupRequest build() {
            return new CreateAccountGroupRequest(this);
        } 

    } 

}
