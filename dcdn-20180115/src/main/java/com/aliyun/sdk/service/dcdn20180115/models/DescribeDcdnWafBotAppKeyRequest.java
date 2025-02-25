// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafBotAppKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafBotAppKeyRequest</p>
 */
public class DescribeDcdnWafBotAppKeyRequest extends Request {
    private DescribeDcdnWafBotAppKeyRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafBotAppKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<DescribeDcdnWafBotAppKeyRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafBotAppKeyRequest request) {
            super(request);
        } 

        @Override
        public DescribeDcdnWafBotAppKeyRequest build() {
            return new DescribeDcdnWafBotAppKeyRequest(this);
        } 

    } 

}
