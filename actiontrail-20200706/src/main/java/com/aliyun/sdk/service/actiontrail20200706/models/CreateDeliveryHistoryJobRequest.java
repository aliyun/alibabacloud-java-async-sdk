// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link CreateDeliveryHistoryJobRequest} extends {@link RequestModel}
 *
 * <p>CreateDeliveryHistoryJobRequest</p>
 */
public class CreateDeliveryHistoryJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrailName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trailName;

    private CreateDeliveryHistoryJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.trailName = builder.trailName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeliveryHistoryJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return trailName
     */
    public String getTrailName() {
        return this.trailName;
    }

    public static final class Builder extends Request.Builder<CreateDeliveryHistoryJobRequest, Builder> {
        private String clientToken; 
        private String trailName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeliveryHistoryJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.trailName = request.trailName;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and can be up to 64 characters in length.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of the trail for which you want to create a historical event delivery task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-name</p>
         */
        public Builder trailName(String trailName) {
            this.putQueryParameter("TrailName", trailName);
            this.trailName = trailName;
            return this;
        }

        @Override
        public CreateDeliveryHistoryJobRequest build() {
            return new CreateDeliveryHistoryJobRequest(this);
        } 

    } 

}
