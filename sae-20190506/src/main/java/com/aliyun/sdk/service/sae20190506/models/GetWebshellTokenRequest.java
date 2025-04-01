// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWebshellTokenRequest} extends {@link RequestModel}
 *
 * <p>GetWebshellTokenRequest</p>
 */
public class GetWebshellTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String podName;

    private GetWebshellTokenRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.containerName = builder.containerName;
        this.podName = builder.podName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebshellTokenRequest create() {
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
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    public static final class Builder extends Request.Builder<GetWebshellTokenRequest, Builder> {
        private String appId; 
        private String containerName; 
        private String podName; 

        private Builder() {
            super();
        } 

        private Builder(GetWebshellTokenRequest request) {
            super(request);
            this.appId = request.appId;
            this.containerName = request.containerName;
            this.podName = request.podName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the container.</p>
         * <p>Note:</p>
         * <ul>
         * <li><p>If this parameter is specified, Cloud Assistant runs the command in the specified container of the instance.</p>
         * </li>
         * <li><p>If this parameter is specified, the command can run only on Linux instances on which Cloud Assistant Agent 2.2.3.344 or later is installed.</p>
         * <ul>
         * <li>For information about how to query the version of Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
         * <li>For information about how to upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
         * </ul>
         * </li>
         * <li><p>If this parameter is specified, the <code>Username</code> parameter that is specified in a request to call this operation and the <code>WorkingDir</code> parameter that is specified in a request to call the <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> operation do not take effect. You can run the command only in the default working directory of the container by using the default user of the container. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * <li><p>If this parameter is specified, only shell scripts can be run in Linux containers. You cannot add a command in the format similar to <code>#!/usr/bin/python</code> at the beginning of a script to specify a script interpreter. For more information, see <a href="https://help.aliyun.com/document_detail/456641.html">Use Cloud Assistant to run commands in containers</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ad-helper</p>
         */
        public Builder containerName(String containerName) {
            this.putQueryParameter("ContainerName", containerName);
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello-podsdfsdfsdfsdf</p>
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
            return this;
        }

        @Override
        public GetWebshellTokenRequest build() {
            return new GetWebshellTokenRequest(this);
        } 

    } 

}
