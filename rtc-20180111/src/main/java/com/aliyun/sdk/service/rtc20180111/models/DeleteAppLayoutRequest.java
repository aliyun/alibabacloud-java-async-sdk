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
 * {@link DeleteAppLayoutRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppLayoutRequest</p>
 */
public class DeleteAppLayoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Layout")
    private Layout layout;

    private DeleteAppLayoutRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.layout = builder.layout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppLayoutRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return layout
     */
    public Layout getLayout() {
        return this.layout;
    }

    public static final class Builder extends Request.Builder<DeleteAppLayoutRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private Layout layout; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppLayoutRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.layout = request.layout;
        } 

        /**
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The layout information.</p>
         */
        public Builder layout(Layout layout) {
            String layoutShrink = shrink(layout, "Layout", "json");
            this.putQueryParameter("Layout", layoutShrink);
            this.layout = layout;
            return this;
        }

        @Override
        public DeleteAppLayoutRequest build() {
            return new DeleteAppLayoutRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAppLayoutRequest} extends {@link TeaModel}
     *
     * <p>DeleteAppLayoutRequest</p>
     */
    public static class Layout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LayoutId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String layoutId;

        private Layout(Builder builder) {
            this.layoutId = builder.layoutId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layout create() {
            return builder().build();
        }

        /**
         * @return layoutId
         */
        public String getLayoutId() {
            return this.layoutId;
        }

        public static final class Builder {
            private String layoutId; 

            private Builder() {
            } 

            private Builder(Layout model) {
                this.layoutId = model.layoutId;
            } 

            /**
             * <p>The layout ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>167466539798442****</p>
             */
            public Builder layoutId(String layoutId) {
                this.layoutId = layoutId;
                return this;
            }

            public Layout build() {
                return new Layout(this);
            } 

        } 

    }
}
