// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CommonQueryBySceneRequest} extends {@link RequestModel}
 *
 * <p>CommonQueryBySceneRequest</p>
 */
public class CommonQueryBySceneRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CommonAgentQuery body;

    private CommonQueryBySceneRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonQueryBySceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CommonAgentQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CommonQueryBySceneRequest, Builder> {
        private CommonAgentQuery body; 

        private Builder() {
            super();
        } 

        private Builder(CommonQueryBySceneRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(CommonAgentQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CommonQueryBySceneRequest build() {
            return new CommonQueryBySceneRequest(this);
        } 

    } 

}
