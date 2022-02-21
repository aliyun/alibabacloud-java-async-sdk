// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableLoadBalancerAccessLogRequest} extends {@link RequestModel}
 *
 * <p>EnableLoadBalancerAccessLogRequest</p>
 */
public class EnableLoadBalancerAccessLogRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("LogProject")
    @Validation(required = true)
    private String logProject;

    @Query
    @NameInMap("LogStore")
    @Validation(required = true)
    private String logStore;

    private EnableLoadBalancerAccessLogRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.logProject = builder.logProject;
        this.logStore = builder.logStore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableLoadBalancerAccessLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return logProject
     */
    public String getLogProject() {
        return this.logProject;
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    public static final class Builder extends Request.Builder<EnableLoadBalancerAccessLogRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private String logProject; 
        private String logStore; 

        private Builder() {
            super();
        } 

        private Builder(EnableLoadBalancerAccessLogRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.loadBalancerId = response.loadBalancerId;
            this.logProject = response.logProject;
            this.logStore = response.logStore;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 实例id
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * 日志Project
         */
        public Builder logProject(String logProject) {
            this.putQueryParameter("LogProject", logProject);
            this.logProject = logProject;
            return this;
        }

        /**
         * 日志Store
         */
        public Builder logStore(String logStore) {
            this.putQueryParameter("LogStore", logStore);
            this.logStore = logStore;
            return this;
        }

        @Override
        public EnableLoadBalancerAccessLogRequest build() {
            return new EnableLoadBalancerAccessLogRequest(this);
        } 

    } 

}
