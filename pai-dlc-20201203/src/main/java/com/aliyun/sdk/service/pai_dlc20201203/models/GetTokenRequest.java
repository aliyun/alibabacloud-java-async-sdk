// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetTokenRequest} extends {@link RequestModel}
 *
 * <p>GetTokenRequest</p>
 */
public class GetTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    private GetTokenRequest(Builder builder) {
        super(builder);
        this.expireTime = builder.expireTime;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<GetTokenRequest, Builder> {
        private Long expireTime; 
        private String targetId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(GetTokenRequest request) {
            super(request);
            this.expireTime = request.expireTime;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The time when the share link expires. Default value: 604800 seconds. Minimum value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The ID of the job that is waiting to be shared.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc*******</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>The type of the job that you want to share. Valid values: job and tensorboard.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public GetTokenRequest build() {
            return new GetTokenRequest(this);
        } 

    } 

}
