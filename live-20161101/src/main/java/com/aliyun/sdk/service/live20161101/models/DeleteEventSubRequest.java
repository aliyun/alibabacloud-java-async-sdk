// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteEventSubRequest} extends {@link RequestModel}
 *
 * <p>DeleteEventSubRequest</p>
 */
public class DeleteEventSubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscribeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscribeId;

    private DeleteEventSubRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.subscribeId = builder.subscribeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventSubRequest create() {
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
     * @return subscribeId
     */
    public String getSubscribeId() {
        return this.subscribeId;
    }

    public static final class Builder extends Request.Builder<DeleteEventSubRequest, Builder> {
        private String appId; 
        private String subscribeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEventSubRequest request) {
            super(request);
            this.appId = request.appId;
            this.subscribeId = request.subscribeId;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9qb1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The subscription ID. You can obtain the ID from the response to the <a href="https://help.aliyun.com/document_detail/2848209.html">CreateEventSub</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ad53276431c****</p>
         */
        public Builder subscribeId(String subscribeId) {
            this.putQueryParameter("SubscribeId", subscribeId);
            this.subscribeId = subscribeId;
            return this;
        }

        @Override
        public DeleteEventSubRequest build() {
            return new DeleteEventSubRequest(this);
        } 

    } 

}
