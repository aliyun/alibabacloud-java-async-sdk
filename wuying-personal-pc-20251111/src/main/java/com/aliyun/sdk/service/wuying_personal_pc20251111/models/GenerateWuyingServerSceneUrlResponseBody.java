// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wuying_personal_pc20251111.models;

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
 * {@link GenerateWuyingServerSceneUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateWuyingServerSceneUrlResponseBody</p>
 */
public class GenerateWuyingServerSceneUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpireDurationHours")
    private Integer expireDurationHours;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private GenerateWuyingServerSceneUrlResponseBody(Builder builder) {
        this.expireDurationHours = builder.expireDurationHours;
        this.expireTime = builder.expireTime;
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateWuyingServerSceneUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireDurationHours
     */
    public Integer getExpireDurationHours() {
        return this.expireDurationHours;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private Integer expireDurationHours; 
        private String expireTime; 
        private String requestId; 
        private String url; 

        private Builder() {
        } 

        private Builder(GenerateWuyingServerSceneUrlResponseBody model) {
            this.expireDurationHours = model.expireDurationHours;
            this.expireTime = model.expireTime;
            this.requestId = model.requestId;
            this.url = model.url;
        } 

        /**
         * ExpireDurationHours.
         */
        public Builder expireDurationHours(Integer expireDurationHours) {
            this.expireDurationHours = expireDurationHours;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GenerateWuyingServerSceneUrlResponseBody build() {
            return new GenerateWuyingServerSceneUrlResponseBody(this);
        } 

    } 

}
