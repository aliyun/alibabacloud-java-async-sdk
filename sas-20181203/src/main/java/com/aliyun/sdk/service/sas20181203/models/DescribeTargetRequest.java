// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTargetRequest} extends {@link RequestModel}
 *
 * <p>DescribeTargetRequest</p>
 */
public class DescribeTargetRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeTargetRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeTargetRequest, Builder> {
        private String config; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTargetRequest request) {
            super(request);
            this.config = request.config;
            this.type = request.type;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeTargetRequest build() {
            return new DescribeTargetRequest(this);
        } 

    } 

}
