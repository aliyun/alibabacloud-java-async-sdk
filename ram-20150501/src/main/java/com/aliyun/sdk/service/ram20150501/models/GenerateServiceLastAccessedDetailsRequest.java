// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GenerateServiceLastAccessedDetailsRequest} extends {@link RequestModel}
 *
 * <p>GenerateServiceLastAccessedDetailsRequest</p>
 */
public class GenerateServiceLastAccessedDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Arn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Granularity")
    private String granularity;

    private GenerateServiceLastAccessedDetailsRequest(Builder builder) {
        super(builder);
        this.arn = builder.arn;
        this.granularity = builder.granularity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateServiceLastAccessedDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    public static final class Builder extends Request.Builder<GenerateServiceLastAccessedDetailsRequest, Builder> {
        private String arn; 
        private String granularity; 

        private Builder() {
            super();
        } 

        private Builder(GenerateServiceLastAccessedDetailsRequest request) {
            super(request);
            this.arn = request.arn;
            this.granularity = request.granularity;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890:user/test_user</p>
         */
        public Builder arn(String arn) {
            this.putQueryParameter("Arn", arn);
            this.arn = arn;
            return this;
        }

        /**
         * Granularity.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        @Override
        public GenerateServiceLastAccessedDetailsRequest build() {
            return new GenerateServiceLastAccessedDetailsRequest(this);
        } 

    } 

}
