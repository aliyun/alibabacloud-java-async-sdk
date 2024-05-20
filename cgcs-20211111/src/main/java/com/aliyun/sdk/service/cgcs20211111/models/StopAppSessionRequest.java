// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAppSessionRequest} extends {@link RequestModel}
 *
 * <p>StopAppSessionRequest</p>
 */
public class StopAppSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSessionId")
    private String customSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
    private String platformSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopParam")
    private java.util.List < StopParam> stopParam;

    private StopAppSessionRequest(Builder builder) {
        super(builder);
        this.customSessionId = builder.customSessionId;
        this.platformSessionId = builder.platformSessionId;
        this.stopParam = builder.stopParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAppSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customSessionId
     */
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    /**
     * @return platformSessionId
     */
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    /**
     * @return stopParam
     */
    public java.util.List < StopParam> getStopParam() {
        return this.stopParam;
    }

    public static final class Builder extends Request.Builder<StopAppSessionRequest, Builder> {
        private String customSessionId; 
        private String platformSessionId; 
        private java.util.List < StopParam> stopParam; 

        private Builder() {
            super();
        } 

        private Builder(StopAppSessionRequest request) {
            super(request);
            this.customSessionId = request.customSessionId;
            this.platformSessionId = request.platformSessionId;
            this.stopParam = request.stopParam;
        } 

        /**
         * CustomSessionId.
         */
        public Builder customSessionId(String customSessionId) {
            this.putQueryParameter("CustomSessionId", customSessionId);
            this.customSessionId = customSessionId;
            return this;
        }

        /**
         * PlatformSessionId.
         */
        public Builder platformSessionId(String platformSessionId) {
            this.putQueryParameter("PlatformSessionId", platformSessionId);
            this.platformSessionId = platformSessionId;
            return this;
        }

        /**
         * 停止容器参数。此参数将透传到Agent。
         */
        public Builder stopParam(java.util.List < StopParam> stopParam) {
            String stopParamShrink = shrink(stopParam, "StopParam", "json");
            this.putQueryParameter("StopParam", stopParamShrink);
            this.stopParam = stopParam;
            return this;
        }

        @Override
        public StopAppSessionRequest build() {
            return new StopAppSessionRequest(this);
        } 

    } 

    public static class StopParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private StopParam(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StopParam create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private Object value; 

            /**
             * 目前支持的枚举值包括：
             * <p>
             * - reason：停止原因。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * key对应的取值。
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public StopParam build() {
                return new StopParam(this);
            } 

        } 

    }
}
