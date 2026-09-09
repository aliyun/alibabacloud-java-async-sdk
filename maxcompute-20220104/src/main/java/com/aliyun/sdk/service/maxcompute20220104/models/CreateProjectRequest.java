// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
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

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>The request body parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;name&quot;:&quot;project_name&quot;,
         *     &quot;comment&quot;:&quot;&quot;,
         *     &quot;productType&quot;:&quot;payasyougo/subscription/dev&quot;,
         *     &quot;defaultQuota&quot;:&quot;quota_nick_name&quot;,
         *     &quot;properties&quot;:{
         *         &quot;sqlMeteringMax&quot;:&quot;&quot;,
         *         &quot;typeSystem&quot;:&quot;&quot;,
         *         &quot;encryption&quot;:{
         *             &quot;enable&quot;:true,
         *             &quot;algorithm&quot;:&quot;&quot;,
         *             &quot;key&quot;:&quot;&quot;
         *         }
         *     }
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
