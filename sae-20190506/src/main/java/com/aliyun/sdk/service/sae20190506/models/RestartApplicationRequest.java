// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartApplicationRequest} extends {@link RequestModel}
 *
 * <p>RestartApplicationRequest</p>
 */
public class RestartApplicationRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("MinReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @Query
    @NameInMap("MinReadyInstances")
    private Integer minReadyInstances;

    private RestartApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartApplicationRequest create() {
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
     * @return minReadyInstanceRatio
     */
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    /**
     * @return minReadyInstances
     */
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public static final class Builder extends Request.Builder<RestartApplicationRequest, Builder> {
        private String appId; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 

        private Builder() {
            super();
        } 

        private Builder(RestartApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
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
         * MinReadyInstanceRatio.
         */
        public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio);
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }

        /**
         * MinReadyInstances.
         */
        public Builder minReadyInstances(Integer minReadyInstances) {
            this.putQueryParameter("MinReadyInstances", minReadyInstances);
            this.minReadyInstances = minReadyInstances;
            return this;
        }

        @Override
        public RestartApplicationRequest build() {
            return new RestartApplicationRequest(this);
        } 

    } 

}
