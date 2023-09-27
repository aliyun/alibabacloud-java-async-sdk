// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRaceWorkForInnerRequest} extends {@link RequestModel}
 *
 * <p>DescribeRaceWorkForInnerRequest</p>
 */
public class DescribeRaceWorkForInnerRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeRaceWorkForInnerRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRaceWorkForInnerRequest create() {
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeRaceWorkForInnerRequest, Builder> {
        private String groupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRaceWorkForInnerRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeRaceWorkForInnerRequest build() {
            return new DescribeRaceWorkForInnerRequest(this);
        } 

    } 

}
