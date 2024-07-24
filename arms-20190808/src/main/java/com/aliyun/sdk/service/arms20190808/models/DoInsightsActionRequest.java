// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoInsightsActionRequest} extends {@link RequestModel}
 *
 * <p>DoInsightsActionRequest</p>
 */
public class DoInsightsActionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Module")
    @com.aliyun.core.annotation.Validation(required = true)
    private String module;

    private DoInsightsActionRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.module = builder.module;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoInsightsActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    public static final class Builder extends Request.Builder<DoInsightsActionRequest, Builder> {
        private String data; 
        private String module; 

        private Builder() {
            super();
        } 

        private Builder(DoInsightsActionRequest request) {
            super(request);
            this.data = request.data;
            this.module = request.module;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(String module) {
            this.putBodyParameter("Module", module);
            this.module = module;
            return this;
        }

        @Override
        public DoInsightsActionRequest build() {
            return new DoInsightsActionRequest(this);
        } 

    } 

}
