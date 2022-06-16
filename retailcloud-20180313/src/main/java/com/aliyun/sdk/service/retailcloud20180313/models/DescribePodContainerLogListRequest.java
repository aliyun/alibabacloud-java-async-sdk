// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePodContainerLogListRequest} extends {@link RequestModel}
 *
 * <p>DescribePodContainerLogListRequest</p>
 */
public class DescribePodContainerLogListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true, minimum = 1)
    private Long appId;

    @Query
    @NameInMap("EnvId")
    @Validation(required = true, minimum = 1)
    private Long envId;

    @Query
    @NameInMap("Line")
    private Integer line;

    @Query
    @NameInMap("PodName")
    @Validation(required = true)
    private String podName;

    private DescribePodContainerLogListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.envId = builder.envId;
        this.line = builder.line;
        this.podName = builder.podName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePodContainerLogListRequest create() {
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
     * @return line
     */
    public Integer getLine() {
        return this.line;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    public static final class Builder extends Request.Builder<DescribePodContainerLogListRequest, Builder> {
        private Long appId; 
        private Long envId; 
        private Integer line; 
        private String podName; 

        private Builder() {
            super();
        } 

        private Builder(DescribePodContainerLogListRequest request) {
            super(request);
            this.appId = request.appId;
            this.envId = request.envId;
            this.line = request.line;
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
         * Line.
         */
        public Builder line(Integer line) {
            this.putQueryParameter("Line", line);
            this.line = line;
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
        public DescribePodContainerLogListRequest build() {
            return new DescribePodContainerLogListRequest(this);
        } 

    } 

}
