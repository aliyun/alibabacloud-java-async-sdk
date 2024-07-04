// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRabbitmqPublisherRequest} extends {@link RequestModel}
 *
 * <p>DeleteRabbitmqPublisherRequest</p>
 */
public class DeleteRabbitmqPublisherRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("publisherId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publisherId;

    private DeleteRabbitmqPublisherRequest(Builder builder) {
        super(builder);
        this.publisherId = builder.publisherId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRabbitmqPublisherRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRabbitmqPublisherRequest, Builder> {
        private String publisherId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRabbitmqPublisherRequest request) {
            super(request);
            this.publisherId = request.publisherId;
        } 

        /**
         * publisherId.
         */
        public Builder publisherId(String publisherId) {
            this.putPathParameter("publisherId", publisherId);
            this.publisherId = publisherId;
            return this;
        }

        @Override
        public DeleteRabbitmqPublisherRequest build() {
            return new DeleteRabbitmqPublisherRequest(this);
        } 

    } 

}
