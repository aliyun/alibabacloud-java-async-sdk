// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushApplicationDataRequest} extends {@link RequestModel}
 *
 * <p>PushApplicationDataRequest</p>
 */
public class PushApplicationDataRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("PushStrategy")
    private String pushStrategy;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private PushApplicationDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.data = builder.data;
        this.pushStrategy = builder.pushStrategy;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushApplicationDataRequest create() {
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
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return pushStrategy
     */
    public String getPushStrategy() {
        return this.pushStrategy;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<PushApplicationDataRequest, Builder> {
        private String appId; 
        private String data; 
        private String pushStrategy; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(PushApplicationDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.data = request.data;
            this.pushStrategy = request.pushStrategy;
            this.timeout = request.timeout;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The data files that you want to push. The value must be a JSON string.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The push policy in the canary release environment. The value must be a JSON string. You can specify multiple push policies. By default, all data files are pushed.
         */
        public Builder pushStrategy(String pushStrategy) {
            this.putQueryParameter("PushStrategy", pushStrategy);
            this.pushStrategy = pushStrategy;
            return this;
        }

        /**
         * This parameter does not take effect.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public PushApplicationDataRequest build() {
            return new PushApplicationDataRequest(this);
        } 

    } 

}
