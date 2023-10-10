// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleK8sApplicationRequest} extends {@link RequestModel}
 *
 * <p>ScaleK8sApplicationRequest</p>
 */
public class ScaleK8sApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Replicas")
    @Validation(required = true)
    private Integer replicas;

    @Query
    @NameInMap("Timeout")
    private Integer timeout;

    private ScaleK8sApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.replicas = builder.replicas;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleK8sApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<ScaleK8sApplicationRequest, Builder> {
        private String appId; 
        private Integer replicas; 
        private Integer timeout; 

        private Builder() {
            super();
        } 

        private Builder(ScaleK8sApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.replicas = request.replicas;
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
         * The expected number of application instances after the scale-out or scale-in. The minimum number is 0.
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
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
        public ScaleK8sApplicationRequest build() {
            return new ScaleK8sApplicationRequest(this);
        } 

    } 

}
