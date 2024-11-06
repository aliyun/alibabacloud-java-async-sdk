// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCallbackMetaRequest} extends {@link RequestModel}
 *
 * <p>ModifyCallbackMetaRequest</p>
 */
public class ModifyCallbackMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    @com.aliyun.core.annotation.Validation(required = true)
    private Callback callback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private ModifyCallbackMetaRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callback = builder.callback;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCallbackMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return callback
     */
    public Callback getCallback() {
        return this.callback;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ModifyCallbackMetaRequest, Builder> {
        private String appId; 
        private Callback callback; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCallbackMetaRequest request) {
            super(request);
            this.appId = request.appId;
            this.callback = request.callback;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>223***JQb</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callback(Callback callback) {
            String callbackShrink = shrink(callback, "Callback", "json");
            this.putQueryParameter("Callback", callbackShrink);
            this.callback = callback;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public ModifyCallbackMetaRequest build() {
            return new ModifyCallbackMetaRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCallbackMetaRequest} extends {@link TeaModel}
     *
     * <p>ModifyCallbackMetaRequest</p>
     */
    public static class Callback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("Conf")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conf;

        @com.aliyun.core.annotation.NameInMap("SubEvent")
        private java.util.List < Integer > subEvent;

        private Callback(Builder builder) {
            this.category = builder.category;
            this.conf = builder.conf;
            this.subEvent = builder.subEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Callback create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return conf
         */
        public String getConf() {
            return this.conf;
        }

        /**
         * @return subEvent
         */
        public java.util.List < Integer > getSubEvent() {
            return this.subEvent;
        }

        public static final class Builder {
            private String category; 
            private String conf; 
            private java.util.List < Integer > subEvent; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RecordEvent</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder conf(String conf) {
                this.conf = conf;
                return this;
            }

            /**
             * SubEvent.
             */
            public Builder subEvent(java.util.List < Integer > subEvent) {
                this.subEvent = subEvent;
                return this;
            }

            public Callback build() {
                return new Callback(this);
            } 

        } 

    }
}
