// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link StopCategoryCallbackRequest} extends {@link RequestModel}
 *
 * <p>StopCategoryCallbackRequest</p>
 */
public class StopCategoryCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callback")
    @com.aliyun.core.annotation.Validation(required = true)
    private Callback callback;

    private StopCategoryCallbackRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callback = builder.callback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopCategoryCallbackRequest create() {
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

    public static final class Builder extends Request.Builder<StopCategoryCallbackRequest, Builder> {
        private String appId; 
        private Callback callback; 

        private Builder() {
            super();
        } 

        private Builder(StopCategoryCallbackRequest request) {
            super(request);
            this.appId = request.appId;
            this.callback = request.callback;
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

        @Override
        public StopCategoryCallbackRequest build() {
            return new StopCategoryCallbackRequest(this);
        } 

    } 

    /**
     * 
     * {@link StopCategoryCallbackRequest} extends {@link TeaModel}
     *
     * <p>StopCategoryCallbackRequest</p>
     */
    public static class Callback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        private Callback(Builder builder) {
            this.category = builder.category;
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

        public static final class Builder {
            private String category; 

            private Builder() {
            } 

            private Builder(Callback model) {
                this.category = model.category;
            } 

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

            public Callback build() {
                return new Callback(this);
            } 

        } 

    }
}
