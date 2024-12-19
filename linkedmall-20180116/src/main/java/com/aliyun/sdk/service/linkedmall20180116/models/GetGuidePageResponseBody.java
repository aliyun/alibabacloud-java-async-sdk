// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetGuidePageResponseBody} extends {@link TeaModel}
 *
 * <p>GetGuidePageResponseBody</p>
 */
public class GetGuidePageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MiniShopInfo")
    private java.util.List<MiniShopInfo> miniShopInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<MiniShopInfo> getMiniShopInfo() {
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
        private java.util.List<MiniShopInfo> miniShopInfo; 
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
        public Builder miniShopInfo(java.util.List<MiniShopInfo> miniShopInfo) {
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

    /**
     * 
     * {@link GetGuidePageResponseBody} extends {@link TeaModel}
     *
     * <p>GetGuidePageResponseBody</p>
     */
    public static class MiniShopInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("LiteShopId")
        private String liteShopId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Src")
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
