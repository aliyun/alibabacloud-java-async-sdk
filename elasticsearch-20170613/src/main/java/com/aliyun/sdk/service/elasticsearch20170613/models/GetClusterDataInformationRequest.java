// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetClusterDataInformationRequest} extends {@link RequestModel}
 *
 * <p>GetClusterDataInformationRequest</p>
 */
public class GetClusterDataInformationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private GetClusterDataInformationRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterDataInformationRequest create() {
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

    public static final class Builder extends Request.Builder<GetClusterDataInformationRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterDataInformationRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The cluster type, access endpoint, and index to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dataSourceType&quot;:&quot;elasticsearch&quot;,&quot;endpoint&quot;:&quot;<a href="http://es-cn-npk1shyiq000d****.public.elasticsearch.aliyuncs.com:9200%22,%22username%22:%22elastic%22,%22password%22:%22xxxxxx%22,%22index%22:%22default%22,%22type%22:%22default%22%7D">http://es-cn-npk1shyiq000d****.public.elasticsearch.aliyuncs.com:9200&quot;,&quot;username&quot;:&quot;elastic&quot;,&quot;password&quot;:&quot;xxxxxx&quot;,&quot;index&quot;:&quot;default&quot;,&quot;type&quot;:&quot;default&quot;}</a></p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public GetClusterDataInformationRequest build() {
            return new GetClusterDataInformationRequest(this);
        } 

    } 

}
