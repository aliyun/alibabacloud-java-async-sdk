// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHttpApiRequest} extends {@link RequestModel}
 *
 * <p>GetHttpApiRequest</p>
 */
public class GetHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    private GetHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHttpApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    public static final class Builder extends Request.Builder<GetHttpApiRequest, Builder> {
        private String httpApiId; 

        private Builder() {
            super();
        } 

        private Builder(GetHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
        } 

        /**
         * httpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        @Override
        public GetHttpApiRequest build() {
            return new GetHttpApiRequest(this);
        } 

    } 

}
