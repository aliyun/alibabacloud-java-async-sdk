// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link GetCrowdDatasetRequest} extends {@link RequestModel}
 *
 * <p>GetCrowdDatasetRequest</p>
 */
public class GetCrowdDatasetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private GetCrowdDatasetRequestBody body;

    private GetCrowdDatasetRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdDatasetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public GetCrowdDatasetRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetCrowdDatasetRequest, Builder> {
        private GetCrowdDatasetRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetCrowdDatasetRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(GetCrowdDatasetRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public GetCrowdDatasetRequest build() {
            return new GetCrowdDatasetRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetCrowdDatasetRequest} extends {@link TeaModel}
     *
     * <p>GetCrowdDatasetRequest</p>
     */
    public static class GetCrowdDatasetRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        private GetCrowdDatasetRequestBody(Builder builder) {
            this.appId = builder.appId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetCrowdDatasetRequestBody create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        public static final class Builder {
            private String appId; 

            private Builder() {
            } 

            private Builder(GetCrowdDatasetRequestBody model) {
                this.appId = model.appId;
            } 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            public GetCrowdDatasetRequestBody build() {
                return new GetCrowdDatasetRequestBody(this);
            } 

        } 

    }
}
