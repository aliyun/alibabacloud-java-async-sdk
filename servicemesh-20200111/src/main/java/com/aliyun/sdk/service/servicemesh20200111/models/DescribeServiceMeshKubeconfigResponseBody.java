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
 * {@link DescribeServiceMeshKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshKubeconfigResponseBody</p>
 */
public class DescribeServiceMeshKubeconfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Kubeconfig")
    private String kubeconfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshKubeconfigResponseBody(Builder builder) {
        this.expireTime = builder.expireTime;
        this.kubeconfig = builder.kubeconfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshKubeconfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
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
        private String expireTime; 
        private String kubeconfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeServiceMeshKubeconfigResponseBody model) {
            this.expireTime = model.expireTime;
            this.kubeconfig = model.kubeconfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The expiration time of the kubeconfig certificate. The format is: YYYY-MM-DD hh: mm: ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-28 16:00:00</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The content of the kubeconfig file of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1 clusters: - cluster:     server: <a href="https://47.110.xx.xx:6443">https://47.110.xx.xx:6443</a>     certificate-authority-data: LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURUakNDQWphZ0F3SUJBZ0lVYzBQVy82ejR1aHlxYkRRdnNsV1htSmpJeFdNd0RRWUpLb1pJaHZjTkFRRUwKQlFBd1BqRW5NQThHQTFVRUNoTUlhR0Z1WjNwb2IzVXdGQVlEVlFRS0V3MWhiR2xpWVdKaElHTnNiM1ZrTVJNdwpFUVlEVlFRREV3cHJkV0psY201bGRHVnpNQ0FYRFRJeU1EUXdOekExTVRnd01Gb1lEekl3TlRJd016TXdNRFV4Ck9EQXdXakErTVNjd0R3WURWUVFLRXdob1lXNW5lbWh2ZFRBVUJnTlZCQW9URFdGc2FXSmhZbUVnWTJ4dmRXUXgKRXpBUkJnTlZCQU1UQ210MVltVnlibVYwWlhNd2dnRWlNQTBHQ1NxR1NJYjNEUUVCQVFVQUE0SUJE****</p>
         */
        public Builder kubeconfig(String kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshKubeconfigResponseBody build() {
            return new DescribeServiceMeshKubeconfigResponseBody(this);
        } 

    } 

}
