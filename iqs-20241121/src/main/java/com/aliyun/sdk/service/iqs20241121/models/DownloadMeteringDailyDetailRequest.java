// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link DownloadMeteringDailyDetailRequest} extends {@link RequestModel}
 *
 * <p>DownloadMeteringDailyDetailRequest</p>
 */
public class DownloadMeteringDailyDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private DownloadMeteringDailyDetailCmd body;

    private DownloadMeteringDailyDetailRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadMeteringDailyDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DownloadMeteringDailyDetailCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DownloadMeteringDailyDetailRequest, Builder> {
        private DownloadMeteringDailyDetailCmd body; 

        private Builder() {
            super();
        } 

        private Builder(DownloadMeteringDailyDetailRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(DownloadMeteringDailyDetailCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DownloadMeteringDailyDetailRequest build() {
            return new DownloadMeteringDailyDetailRequest(this);
        } 

    } 

}
