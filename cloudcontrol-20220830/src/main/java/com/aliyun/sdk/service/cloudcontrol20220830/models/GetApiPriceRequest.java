// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link GetApiPriceRequest} extends {@link RequestModel}
 *
 * <p>GetApiPriceRequest</p>
 */
public class GetApiPriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    private GetApiPriceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<GetApiPriceRequest, Builder> {
        private java.util.Map<String, ?> body; 

        private Builder() {
            super();
        } 

        private Builder(GetApiPriceRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The pricing request body, including popCode, popVersion, apiName, and parameters. All calls return a unified pricing envelope. The language parameter specifies the server-side message language, such as en or zh. Target resource operations are not executed for cost-irrelevant or unsupported pricing queries.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;popCode&quot;:&quot;ecs&quot;,&quot;popVersion&quot;:&quot;2014-05-26&quot;,&quot;apiName&quot;:&quot;CreateDisk&quot;,&quot;parameters&quot;:{&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;ZoneId&quot;:&quot;cn-hangzhou-i&quot;,&quot;DiskCategory&quot;:&quot;cloud_essd&quot;,&quot;Size&quot;:40},&quot;language&quot;:&quot;zh&quot;}</p>
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetApiPriceRequest build() {
            return new GetApiPriceRequest(this);
        } 

    } 

}
