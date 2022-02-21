// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApplicationRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationRequest</p>
 */
public class DeleteApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private DeleteApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationRequest create() {
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
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<DeleteApplicationRequest, Builder> {
        private String appId; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationRequest response) {
            super(response);
            this.appId = response.appId;
            this.timeout = response.timeout;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public DeleteApplicationRequest build() {
            return new DeleteApplicationRequest(this);
        } 

    } 

}
