// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetServiceFuncStatusRequest} extends {@link RequestModel}
 *
 * <p>GetServiceFuncStatusRequest</p>
 */
public class GetServiceFuncStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("params")
    @com.aliyun.core.annotation.Validation(required = true)
    private Params params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("service_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private GetServiceFuncStatusRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.channel = builder.channel;
        this.params = builder.params;
        this.serviceName = builder.serviceName;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceFuncStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<GetServiceFuncStatusRequest, Builder> {
        private String xDebugId; 
        private String channel; 
        private Params params; 
        private String serviceName; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceFuncStatusRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.channel = request.channel;
            this.params = request.params;
            this.serviceName = request.serviceName;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "params", "json");
            this.putQueryParameter("params", paramsShrink);
            this.params = params;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>livetrace</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("service_name", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public GetServiceFuncStatusRequest build() {
            return new GetServiceFuncStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceFuncStatusRequest} extends {@link TeaModel}
     *
     * <p>GetServiceFuncStatusRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private Params(Builder builder) {
            this.functionName = builder.functionName;
            this.instance = builder.instance;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String functionName; 
            private String instance; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.functionName = model.functionName;
                this.instance = model.instance;
                this.uid = model.uid;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mullprof</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
