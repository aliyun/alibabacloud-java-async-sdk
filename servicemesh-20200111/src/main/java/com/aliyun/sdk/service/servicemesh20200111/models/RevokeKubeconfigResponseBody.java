// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link RevokeKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>RevokeKubeconfigResponseBody</p>
 */
public class RevokeKubeconfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Kubeconfig")
    private String kubeconfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RevokeKubeconfigResponseBody(Builder builder) {
        this.kubeconfig = builder.kubeconfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeKubeconfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kubeconfig
     */
    public String getKubeconfig() {
        return this.kubeconfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String kubeconfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RevokeKubeconfigResponseBody model) {
            this.kubeconfig = model.kubeconfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The new kubeconfig file generated.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1 clusters: - cluster:     server: <a href="https://121.**.**.**:6443">https://121.**.**.**:6443</a>     certificate-authority-data: *****   name: kubernetes contexts: - context:     cluster: kubernetes     user: &quot;<em><strong><strong>&quot;   name: ***** current-context: ***** kind: Config preferences: {} users: - name: &quot;</strong></strong></em>&quot;   user:     client-certificate-data: *****     client-key-data: *****</p>
         */
        public Builder kubeconfig(String kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7CF71C8B-79DD-150F-929E-267C51C5E311</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RevokeKubeconfigResponseBody build() {
            return new RevokeKubeconfigResponseBody(this);
        } 

    } 

}
