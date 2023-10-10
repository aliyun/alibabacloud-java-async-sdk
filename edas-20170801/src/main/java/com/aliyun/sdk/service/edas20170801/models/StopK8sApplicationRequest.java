// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>StopK8sApplicationRequest</p>
 */
public class StopK8sApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private StopK8sApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopK8sApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<StopK8sApplicationRequest, Builder> {
        private String appId; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(StopK8sApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.timeout = request.timeout;
        } 

        /**
         * The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see [ListApplication](~~149390~~).
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
        public StopK8sApplicationRequest build() {
            return new StopK8sApplicationRequest(this);
        } 

    } 

}
