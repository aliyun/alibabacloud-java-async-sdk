// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGuidePageResponseBody} extends {@link TeaModel}
 *
 * <p>GetGuidePageResponseBody</p>
 */
public class GetGuidePageResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MiniShopInfo")
    private java.util.List < MiniShopInfo> miniShopInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetGuidePageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.miniShopInfo = builder.miniShopInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGuidePageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return miniShopInfo
     */
    public java.util.List < MiniShopInfo> getMiniShopInfo() {
        return this.miniShopInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private java.util.List < MiniShopInfo> miniShopInfo; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MiniShopInfo.
         */
        public Builder miniShopInfo(java.util.List < MiniShopInfo> miniShopInfo) {
            this.miniShopInfo = miniShopInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGuidePageResponseBody build() {
            return new GetGuidePageResponseBody(this);
        } 

    } 

    public static class MiniShopInfo extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("LiteShopId")
        private String liteShopId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Src")
        private String src;

        private MiniShopInfo(Builder builder) {
            this.bizId = builder.bizId;
            this.liteShopId = builder.liteShopId;
            this.name = builder.name;
            this.src = builder.src;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiniShopInfo create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return liteShopId
         */
        public String getLiteShopId() {
            return this.liteShopId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return src
         */
        public String getSrc() {
            return this.src;
        }

        public static final class Builder {
            private String bizId; 
            private String liteShopId; 
            private String name; 
            private String src; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * LiteShopId.
             */
            public Builder liteShopId(String liteShopId) {
                this.liteShopId = liteShopId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Src.
             */
            public Builder src(String src) {
                this.src = src;
                return this;
            }

            public MiniShopInfo build() {
                return new MiniShopInfo(this);
            } 

        } 

    }
}
