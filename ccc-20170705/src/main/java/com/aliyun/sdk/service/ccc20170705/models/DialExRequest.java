// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link DialExRequest} extends {@link RequestModel}
 *
 * <p>DialExRequest</p>
 */
public class DialExRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnswerMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer answerMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoutPoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routPoint;

    private DialExRequest(Builder builder) {
        super(builder);
        this.answerMode = builder.answerMode;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.instanceId = builder.instanceId;
        this.provider = builder.provider;
        this.routPoint = builder.routPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DialExRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answerMode
     */
    public Integer getAnswerMode() {
        return this.answerMode;
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return routPoint
     */
    public String getRoutPoint() {
        return this.routPoint;
    }

    public static final class Builder extends Request.Builder<DialExRequest, Builder> {
        private Integer answerMode; 
        private String callee; 
        private String caller; 
        private String instanceId; 
        private String provider; 
        private String routPoint; 

        private Builder() {
            super();
        } 

        private Builder(DialExRequest request) {
            super(request);
            this.answerMode = request.answerMode;
            this.callee = request.callee;
            this.caller = request.caller;
            this.instanceId = request.instanceId;
            this.provider = request.provider;
            this.routPoint = request.routPoint;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder answerMode(Integer answerMode) {
            this.putQueryParameter("AnswerMode", answerMode);
            this.answerMode = answerMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder routPoint(String routPoint) {
            this.putQueryParameter("RoutPoint", routPoint);
            this.routPoint = routPoint;
            return this;
        }

        @Override
        public DialExRequest build() {
            return new DialExRequest(this);
        } 

    } 

}
