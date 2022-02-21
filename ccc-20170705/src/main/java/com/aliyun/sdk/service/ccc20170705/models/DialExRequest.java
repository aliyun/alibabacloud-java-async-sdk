// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DialExRequest} extends {@link RequestModel}
 *
 * <p>DialExRequest</p>
 */
public class DialExRequest extends Request {
    @Query
    @NameInMap("AnswerMode")
    @Validation(required = true)
    private Integer answerMode;

    @Query
    @NameInMap("Callee")
    @Validation(required = true)
    private String callee;

    @Query
    @NameInMap("Caller")
    @Validation(required = true)
    private String caller;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Provider")
    private String provider;

    @Query
    @NameInMap("RoutPoint")
    @Validation(required = true)
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

        private Builder(DialExRequest response) {
            super(response);
            this.answerMode = response.answerMode;
            this.callee = response.callee;
            this.caller = response.caller;
            this.instanceId = response.instanceId;
            this.provider = response.provider;
            this.routPoint = response.routPoint;
        } 

        /**
         * AnswerMode.
         */
        public Builder answerMode(Integer answerMode) {
            this.putQueryParameter("AnswerMode", answerMode);
            this.answerMode = answerMode;
            return this;
        }

        /**
         * Callee.
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * InstanceId.
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
         * RoutPoint.
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
