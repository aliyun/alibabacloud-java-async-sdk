// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateAppModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppModeRequest</p>
 */
public class UpdateAppModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIdle")
    private Boolean enableIdle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleHour")
    private String idleHour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private UpdateAppModeRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appIds = builder.appIds;
        this.enableIdle = builder.enableIdle;
        this.idleHour = builder.idleHour;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppModeRequest create() {
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
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return enableIdle
     */
    public Boolean getEnableIdle() {
        return this.enableIdle;
    }

    /**
     * @return idleHour
     */
    public String getIdleHour() {
        return this.idleHour;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<UpdateAppModeRequest, Builder> {
        private String appId; 
        private String appIds; 
        private Boolean enableIdle; 
        private String idleHour; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppModeRequest request) {
            super(request);
            this.appId = request.appId;
            this.appIds = request.appIds;
            this.enableIdle = request.enableIdle;
            this.idleHour = request.idleHour;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****,7802c49a-67bc-4167-8369-9a9c003c****</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable the idle mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableIdle(Boolean enableIdle) {
            this.putQueryParameter("EnableIdle", enableIdle);
            this.enableIdle = enableIdle;
            return this;
        }

        /**
         * IdleHour.
         */
        public Builder idleHour(String idleHour) {
            this.putQueryParameter("IdleHour", idleHour);
            this.idleHour = idleHour;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public UpdateAppModeRequest build() {
            return new UpdateAppModeRequest(this);
        } 

    } 

}
