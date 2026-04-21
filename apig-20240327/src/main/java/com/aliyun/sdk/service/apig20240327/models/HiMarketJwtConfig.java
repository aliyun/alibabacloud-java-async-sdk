// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HiMarketJwtConfig} extends {@link TeaModel}
 *
 * <p>HiMarketJwtConfig</p>
 */
public class HiMarketJwtConfig extends TeaModel {
    private HiMarketJwtConfig(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketJwtConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(HiMarketJwtConfig model) {
        } 

        public HiMarketJwtConfig build() {
            return new HiMarketJwtConfig(this);
        } 

    } 

}
