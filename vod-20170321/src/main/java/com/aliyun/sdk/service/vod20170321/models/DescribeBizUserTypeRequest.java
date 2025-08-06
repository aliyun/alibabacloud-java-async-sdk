// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeBizUserTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeBizUserTypeRequest</p>
 */
public class DescribeBizUserTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private DescribeBizUserTypeRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBizUserTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<DescribeBizUserTypeRequest, Builder> {
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBizUserTypeRequest request) {
            super(request);
            this.region = request.region;
        } 

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public DescribeBizUserTypeRequest build() {
            return new DescribeBizUserTypeRequest(this);
        } 

    } 

}
