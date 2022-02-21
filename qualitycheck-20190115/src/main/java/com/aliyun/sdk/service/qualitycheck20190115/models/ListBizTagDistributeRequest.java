// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBizTagDistributeRequest} extends {@link RequestModel}
 *
 * <p>ListBizTagDistributeRequest</p>
 */
public class ListBizTagDistributeRequest extends Request {
    @Body
    @NameInMap("body")
    private String body;

    private ListBizTagDistributeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBizTagDistributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListBizTagDistributeRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(ListBizTagDistributeRequest response) {
            super(response);
            this.body = response.body;
        } 

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListBizTagDistributeRequest build() {
            return new ListBizTagDistributeRequest(this);
        } 

    } 

}
