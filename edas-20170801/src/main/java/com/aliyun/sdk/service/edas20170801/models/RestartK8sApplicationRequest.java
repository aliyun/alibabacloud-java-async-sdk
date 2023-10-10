// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>RestartK8sApplicationRequest</p>
 */
public class RestartK8sApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private RestartK8sApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartK8sApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<RestartK8sApplicationRequest, Builder> {
        private String appId; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(RestartK8sApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.timeout = request.timeout;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The timeout period of the change process. Unit: seconds.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public RestartK8sApplicationRequest build() {
            return new RestartK8sApplicationRequest(this);
        } 

    } 

}
