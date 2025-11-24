// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link ReadPageScrapeRequest} extends {@link RequestModel}
 *
 * <p>ReadPageScrapeRequest</p>
 */
public class ReadPageScrapeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ReadPageScrapeBody body;

    private ReadPageScrapeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadPageScrapeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ReadPageScrapeBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ReadPageScrapeRequest, Builder> {
        private ReadPageScrapeBody body; 

        private Builder() {
            super();
        } 

        private Builder(ReadPageScrapeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>post body</p>
         */
        public Builder body(ReadPageScrapeBody body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ReadPageScrapeRequest build() {
            return new ReadPageScrapeRequest(this);
        } 

    } 

}
