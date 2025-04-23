// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetRabbitmqPublisherRequest} extends {@link RequestModel}
 *
 * <p>GetRabbitmqPublisherRequest</p>
 */
public class GetRabbitmqPublisherRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("publisherId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publisherId;

    private GetRabbitmqPublisherRequest(Builder builder) {
        super(builder);
        this.publisherId = builder.publisherId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRabbitmqPublisherRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return publisherId
     */
    public String getPublisherId() {
        return this.publisherId;
    }

    public static final class Builder extends Request.Builder<GetRabbitmqPublisherRequest, Builder> {
        private String publisherId; 

        private Builder() {
            super();
        } 

        private Builder(GetRabbitmqPublisherRequest request) {
            super(request);
            this.publisherId = request.publisherId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mqp-3b6cb9fa4751afff780436bcefbf1</p>
         */
        public Builder publisherId(String publisherId) {
            this.putPathParameter("publisherId", publisherId);
            this.publisherId = publisherId;
            return this;
        }

        @Override
        public GetRabbitmqPublisherRequest build() {
            return new GetRabbitmqPublisherRequest(this);
        } 

    } 

}
