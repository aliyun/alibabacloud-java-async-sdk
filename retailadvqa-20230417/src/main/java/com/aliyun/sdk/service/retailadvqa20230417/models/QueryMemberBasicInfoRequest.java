// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMemberBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryMemberBasicInfoRequest</p>
 */
public class QueryMemberBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private QueryMemberBasicInfoRequestBody body;

    private QueryMemberBasicInfoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMemberBasicInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public QueryMemberBasicInfoRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<QueryMemberBasicInfoRequest, Builder> {
        private QueryMemberBasicInfoRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(QueryMemberBasicInfoRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(QueryMemberBasicInfoRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public QueryMemberBasicInfoRequest build() {
            return new QueryMemberBasicInfoRequest(this);
        } 

    } 

    public static class QueryMemberBasicInfoRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelCode")
        private String channelCode;

        @com.aliyun.core.annotation.NameInMap("ChannelOpenId")
        private String channelOpenId;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OuterMemberId")
        private String outerMemberId;

        @com.aliyun.core.annotation.NameInMap("PlatFormType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platFormType;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private QueryMemberBasicInfoRequestBody(Builder builder) {
            this.channelCode = builder.channelCode;
            this.channelOpenId = builder.channelOpenId;
            this.mobile = builder.mobile;
            this.openMerchantId = builder.openMerchantId;
            this.outerMemberId = builder.outerMemberId;
            this.platFormType = builder.platFormType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryMemberBasicInfoRequestBody create() {
            return builder().build();
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
        }

        /**
         * @return channelOpenId
         */
        public String getChannelOpenId() {
            return this.channelOpenId;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return outerMemberId
         */
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        /**
         * @return platFormType
         */
        public String getPlatFormType() {
            return this.platFormType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String channelCode; 
            private String channelOpenId; 
            private String mobile; 
            private String openMerchantId; 
            private String outerMemberId; 
            private String platFormType; 
            private String type; 

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
                return this;
            }

            /**
             * ChannelOpenId.
             */
            public Builder channelOpenId(String channelOpenId) {
                this.channelOpenId = channelOpenId;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * OuterMemberId.
             */
            public Builder outerMemberId(String outerMemberId) {
                this.outerMemberId = outerMemberId;
                return this;
            }

            /**
             * PlatFormType.
             */
            public Builder platFormType(String platFormType) {
                this.platFormType = platFormType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public QueryMemberBasicInfoRequestBody build() {
                return new QueryMemberBasicInfoRequestBody(this);
            } 

        } 

    }
}
