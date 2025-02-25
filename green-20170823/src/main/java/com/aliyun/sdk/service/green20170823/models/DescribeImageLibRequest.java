// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageLibRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageLibRequest</p>
 */
public class DescribeImageLibRequest extends Request {
    @Query
    @NameInMap("ServiceModule")
    @Validation(required = true)
    private String serviceModule;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeImageLibRequest(Builder builder) {
        super(builder);
        this.serviceModule = builder.serviceModule;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceModule
     */
    public String getServiceModule() {
        return this.serviceModule;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeImageLibRequest, Builder> {
        private String serviceModule; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageLibRequest request) {
            super(request);
            this.serviceModule = request.serviceModule;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * ServiceModule.
         */
        public Builder serviceModule(String serviceModule) {
            this.putQueryParameter("ServiceModule", serviceModule);
            this.serviceModule = serviceModule;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeImageLibRequest build() {
            return new DescribeImageLibRequest(this);
        } 

    } 

}
