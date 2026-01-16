// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeClusterUserKubeconfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterUserKubeconfigResponseBody</p>
 */
public class DescribeClusterUserKubeconfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private Object config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterUserKubeconfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterUserKubeconfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public Object getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object config; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeClusterUserKubeconfigResponseBody model) {
            this.config = model.config;
            this.requestId = model.requestId;
        } 

        /**
         * Config.
         */
        public Builder config(Object config) {
            this.config = config;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterUserKubeconfigResponseBody build() {
            return new DescribeClusterUserKubeconfigResponseBody(this);
        } 

    } 

}
