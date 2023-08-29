// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserConfigsRequest</p>
 */
public class DescribeDcdnUserConfigsRequest extends Request {
    @Query
    @NameInMap("FunctionName")
    @Validation(required = true)
    private String functionName;

    private DescribeDcdnUserConfigsRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnUserConfigsRequest, Builder> {
        private String functionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserConfigsRequest request) {
            super(request);
            this.functionName = request.functionName;
        } 

        /**
         * The configuration that you want to query. Valid values:
         * <p>
         * 
         * *   domain_business_control: user configurations
         * *   bot_basic: the basic edition of bot traffic management, which supports authorized crawlers and provides threat intelligence
         * *   bot_Advance: the advanced edition of bot traffic management, which supports authorized crawlers and AI intelligent protection and provides threat intelligence
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
            return this;
        }

        @Override
        public DescribeDcdnUserConfigsRequest build() {
            return new DescribeDcdnUserConfigsRequest(this);
        } 

    } 

}
