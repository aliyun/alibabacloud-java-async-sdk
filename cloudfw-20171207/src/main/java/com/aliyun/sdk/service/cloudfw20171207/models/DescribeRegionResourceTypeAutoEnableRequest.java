// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeRegionResourceTypeAutoEnableRequest} extends {@link RequestModel}
 *
 * <p>DescribeRegionResourceTypeAutoEnableRequest</p>
 */
public class DescribeRegionResourceTypeAutoEnableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeRegionResourceTypeAutoEnableRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionResourceTypeAutoEnableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeRegionResourceTypeAutoEnableRequest, Builder> {
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRegionResourceTypeAutoEnableRequest request) {
            super(request);
            this.lang = request.lang;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeRegionResourceTypeAutoEnableRequest build() {
            return new DescribeRegionResourceTypeAutoEnableRequest(this);
        } 

    } 

}
