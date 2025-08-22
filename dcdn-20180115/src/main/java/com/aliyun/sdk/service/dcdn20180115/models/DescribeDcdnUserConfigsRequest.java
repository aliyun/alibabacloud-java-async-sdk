// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnUserConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserConfigsRequest</p>
 */
public class DescribeDcdnUserConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The configuration that you want to query. Valid values:</p>
         * <ul>
         * <li>domain_business_control: user configurations</li>
         * <li>bot_basic: the basic edition of bot traffic management, which supports authorized crawlers and provides threat intelligence</li>
         * <li>bot_Advance: the advanced edition of bot traffic management, which supports authorized crawlers and AI intelligent protection and provides threat intelligence</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>domain_business_control</p>
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
