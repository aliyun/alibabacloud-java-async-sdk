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
 * {@link StartAifgAnalysisRequest} extends {@link RequestModel}
 *
 * <p>StartAifgAnalysisRequest</p>
 */
public class StartAifgAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("params")
    @com.aliyun.core.annotation.Validation(required = true)
    private String params;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private StartAifgAnalysisRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.params = builder.params;
        this.region = builder.region;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAifgAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getParams() {
        return this.params;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<StartAifgAnalysisRequest, Builder> {
        private String channel; 
        private String params; 
        private String region; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(StartAifgAnalysisRequest request) {
            super(request);
            this.channel = request.channel;
            this.params = request.params;
            this.region = request.region;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>The channel type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder channel(String channel) {
            this.putBodyParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;train_taskid&quot;: &quot;train-92abd24&quot;, &quot;duration&quot;: &quot;10&quot;}</p>
         */
        public Builder params(String params) {
            this.putBodyParameter("params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The region information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The service name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>slowNode</p>
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public StartAifgAnalysisRequest build() {
            return new StartAifgAnalysisRequest(this);
        } 

    } 

}
