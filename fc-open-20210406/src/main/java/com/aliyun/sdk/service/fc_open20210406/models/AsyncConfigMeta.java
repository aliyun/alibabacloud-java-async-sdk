// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsyncConfigMeta} extends {@link TeaModel}
 *
 * <p>AsyncConfigMeta</p>
 */
public class AsyncConfigMeta extends TeaModel {
    @NameInMap("functionName")
    private String functionName;

    @NameInMap("qualifier")
    private String qualifier;

    @NameInMap("serviceName")
    private String serviceName;

    private AsyncConfigMeta(Builder builder) {
        this.functionName = builder.functionName;
        this.qualifier = builder.qualifier;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncConfigMeta create() {
        return builder().build();
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private String functionName; 
        private String qualifier; 
        private String serviceName; 

        /**
         * 异步配置所属函数名称。
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * 异步配置所属服务版本/别名。
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * 异步配置所属服务名称。
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public AsyncConfigMeta build() {
            return new AsyncConfigMeta(this);
        } 

    } 

}
