// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupRequest</p>
 */
public class DeleteMonitorGroupRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("RawMonitorGroupId")
    private Long rawMonitorGroupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DeleteMonitorGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.rawMonitorGroupId = builder.rawMonitorGroupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupRequest create() {
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
     * @return rawMonitorGroupId
     */
    public Long getRawMonitorGroupId() {
        return this.rawMonitorGroupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorGroupRequest, Builder> {
        private String groupId; 
        private Long rawMonitorGroupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.rawMonitorGroupId = request.rawMonitorGroupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the monitoring group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder rawMonitorGroupId(Long rawMonitorGroupId) {
            this.putQueryParameter("RawMonitorGroupId", rawMonitorGroupId);
            this.rawMonitorGroupId = rawMonitorGroupId;
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
        public DeleteMonitorGroupRequest build() {
            return new DeleteMonitorGroupRequest(this);
        } 

    } 

}
