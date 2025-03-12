// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link ModifyCustomDomainSampleRateRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomDomainSampleRateRequest</p>
 */
public class ModifyCustomDomainSampleRateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaseConfigID")
    private String baseConfigID;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float sampleRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SinkID")
    private Long sinkID;

    private ModifyCustomDomainSampleRateRequest(Builder builder) {
        super(builder);
        this.baseConfigID = builder.baseConfigID;
        this.domainName = builder.domainName;
        this.sampleRate = builder.sampleRate;
        this.sinkID = builder.sinkID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomDomainSampleRateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseConfigID
     */
    public String getBaseConfigID() {
        return this.baseConfigID;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return sampleRate
     */
    public Float getSampleRate() {
        return this.sampleRate;
    }

    /**
     * @return sinkID
     */
    public Long getSinkID() {
        return this.sinkID;
    }

    public static final class Builder extends Request.Builder<ModifyCustomDomainSampleRateRequest, Builder> {
        private String baseConfigID; 
        private String domainName; 
        private Float sampleRate; 
        private Long sinkID; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomDomainSampleRateRequest request) {
            super(request);
            this.baseConfigID = request.baseConfigID;
            this.domainName = request.domainName;
            this.sampleRate = request.sampleRate;
            this.sinkID = request.sinkID;
        } 

        /**
         * BaseConfigID.
         */
        public Builder baseConfigID(String baseConfigID) {
            this.putBodyParameter("BaseConfigID", baseConfigID);
            this.baseConfigID = baseConfigID;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sampleRate(Float sampleRate) {
            this.putBodyParameter("SampleRate", sampleRate);
            this.sampleRate = sampleRate;
            return this;
        }

        /**
         * SinkID.
         */
        public Builder sinkID(Long sinkID) {
            this.putBodyParameter("SinkID", sinkID);
            this.sinkID = sinkID;
            return this;
        }

        @Override
        public ModifyCustomDomainSampleRateRequest build() {
            return new ModifyCustomDomainSampleRateRequest(this);
        } 

    } 

}
