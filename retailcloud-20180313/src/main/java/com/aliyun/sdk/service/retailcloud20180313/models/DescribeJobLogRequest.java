// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobLogRequest</p>
 */
public class DescribeJobLogRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true)
    private Long envId;

    @Query
    @NameInMap("PodName")
    @Validation(required = true)
    private String podName;

    private DescribeJobLogRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.podName = builder.podName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return envId
     */
    public Long getEnvId() {
        return this.envId;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    public static final class Builder extends Request.Builder<DescribeJobLogRequest, Builder> {
        private Long appId; 
        private Long envId; 
        private String podName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobLogRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
            this.podName = request.podName;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(Long envId) {
            this.putQueryParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
            return this;
        }

        @Override
        public DescribeJobLogRequest build() {
            return new DescribeJobLogRequest(this);
        } 

    } 

}
