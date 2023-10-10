// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>StartK8sApplicationRequest</p>
 */
public class StartK8sApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Replicas")
    private Integer replicas;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private StartK8sApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.replicas = builder.replicas;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartK8sApplicationRequest create() {
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
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<StartK8sApplicationRequest, Builder> {
        private String appId; 
        private Integer replicas; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(StartK8sApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.replicas = request.replicas;
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
         * The number of instances on which you want to start the application.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * The timeout period of the change process. Valid values: 1 to 1800. Default value: 600. Unit: seconds.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public StartK8sApplicationRequest build() {
            return new StartK8sApplicationRequest(this);
        } 

    } 

}
