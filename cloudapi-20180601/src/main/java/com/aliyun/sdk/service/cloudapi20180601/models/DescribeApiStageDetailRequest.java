// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiStageDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiStageDetailRequest</p>
 */
public class DescribeApiStageDetailRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageId")
    @Validation(required = true)
    private String stageId;

    private DescribeApiStageDetailRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.securityToken = builder.securityToken;
        this.stageId = builder.stageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiStageDetailRequest create() {
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

    /**
     * @return stageId
     */
    public String getStageId() {
        return this.stageId;
    }

    public static final class Builder extends Request.Builder<DescribeApiStageDetailRequest, Builder> {
        private String groupId; 
        private String securityToken; 
        private String stageId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiStageDetailRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.securityToken = request.securityToken;
            this.stageId = request.stageId;
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

        /**
         * StageId.
         */
        public Builder stageId(String stageId) {
            this.putQueryParameter("StageId", stageId);
            this.stageId = stageId;
            return this;
        }

        @Override
        public DescribeApiStageDetailRequest build() {
            return new DescribeApiStageDetailRequest(this);
        } 

    } 

}
