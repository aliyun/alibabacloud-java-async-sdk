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
 * {@link ReinstallCollectorRequest} extends {@link RequestModel}
 *
 * <p>ReinstallCollectorRequest</p>
 */
public class ReinstallCollectorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private ReinstallCollectorRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.clientToken = builder.clientToken;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReinstallCollectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ReinstallCollectorRequest, Builder> {
        private String resId; 
        private String clientToken; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(ReinstallCollectorRequest request) {
            super(request);
            this.resId = request.resId;
            this.clientToken = request.clientToken;
            this.body = request.body;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-l871nd0u73c45****</p>
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * <p>The request body parameters. For more information, see the Request body section in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Indicates whether the shipper is installed. Valid values:</p>
         * <ul>
         * <li>true: The shipper is installed.</li>
         * <li>false: The shipper fails to be installed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;restartType&quot;: &quot;nodeEcsId&quot;,
         *   &quot;nodes&quot;:[&quot;i-bp1gyhphjaj73jsr****&quot;,&quot;i-bp10piq1mkfnyw9t****&quot;]
         * }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ReinstallCollectorRequest build() {
            return new ReinstallCollectorRequest(this);
        } 

    } 

}
