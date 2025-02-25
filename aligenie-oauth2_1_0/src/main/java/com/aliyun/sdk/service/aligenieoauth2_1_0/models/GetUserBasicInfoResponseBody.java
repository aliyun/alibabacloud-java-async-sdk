// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link GetUserBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserBasicInfoResponseBody</p>
 */
public class GetUserBasicInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvatarUrl")
    private String avatarUrl;

    @com.aliyun.core.annotation.NameInMap("Nickname")
    private String nickname;

    @com.aliyun.core.annotation.NameInMap("OpenId")
    private String openId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnionIds")
    private java.util.List<UnionIds> unionIds;

    private GetUserBasicInfoResponseBody(Builder builder) {
        this.avatarUrl = builder.avatarUrl;
        this.nickname = builder.nickname;
        this.openId = builder.openId;
        this.requestId = builder.requestId;
        this.unionIds = builder.unionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserBasicInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return openId
     */
    public String getOpenId() {
        return this.openId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unionIds
     */
    public java.util.List<UnionIds> getUnionIds() {
        return this.unionIds;
    }

    public static final class Builder {
        private String avatarUrl; 
        private String nickname; 
        private String openId; 
        private String requestId; 
        private java.util.List<UnionIds> unionIds; 

        /**
         * AvatarUrl.
         */
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * Nickname.
         */
        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        /**
         * OpenId.
         */
        public Builder openId(String openId) {
            this.openId = openId;
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
         * UnionIds.
         */
        public Builder unionIds(java.util.List<UnionIds> unionIds) {
            this.unionIds = unionIds;
            return this;
        }

        public GetUserBasicInfoResponseBody build() {
            return new GetUserBasicInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserBasicInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserBasicInfoResponseBody</p>
     */
    public static class UnionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        private UnionIds(Builder builder) {
            this.organizationId = builder.organizationId;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnionIds create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String organizationId; 
            private String unionId; 

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public UnionIds build() {
                return new UnionIds(this);
            } 

        } 

    }
}
