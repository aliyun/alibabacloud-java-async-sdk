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
 * {@link DownloadApiCallDailyDetailRequest} extends {@link RequestModel}
 *
 * <p>DownloadApiCallDailyDetailRequest</p>
 */
public class DownloadApiCallDailyDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private DownloadApiCallDailyDetailCmd body;

    private DownloadApiCallDailyDetailRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadApiCallDailyDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DownloadApiCallDailyDetailCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DownloadApiCallDailyDetailRequest, Builder> {
        private DownloadApiCallDailyDetailCmd body; 

        private Builder() {
            super();
        } 

        private Builder(DownloadApiCallDailyDetailRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(DownloadApiCallDailyDetailCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DownloadApiCallDailyDetailRequest build() {
            return new DownloadApiCallDailyDetailRequest(this);
        } 

    } 

}
