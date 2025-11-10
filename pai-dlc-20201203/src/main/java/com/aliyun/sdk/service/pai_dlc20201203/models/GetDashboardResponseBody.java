// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>GetDashboardResponseBody</p>
 */
public class GetDashboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private GetDashboardResponseBody(Builder builder) {
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDashboardResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String url; 

        private Builder() {
        } 

        private Builder(GetDashboardResponseBody model) {
            this.url = model.url;
        } 

        /**
         * <p>The Dashboard URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dlcj1jzm1p01saqw-spark.pre-dsw-gateway-cn-hangzhou.data.aliyun.com">https://dlcj1jzm1p01saqw-spark.pre-dsw-gateway-cn-hangzhou.data.aliyun.com</a></p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetDashboardResponseBody build() {
            return new GetDashboardResponseBody(this);
        } 

    } 

}
