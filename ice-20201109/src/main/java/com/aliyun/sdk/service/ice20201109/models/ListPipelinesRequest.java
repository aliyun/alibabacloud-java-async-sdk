// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPipelinesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelinesRequest</p>
 */
public class ListPipelinesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    private String speed;

    private ListPipelinesRequest(Builder builder) {
        super(builder);
        this.speed = builder.speed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return speed
     */
    public String getSpeed() {
        return this.speed;
    }

    public static final class Builder extends Request.Builder<ListPipelinesRequest, Builder> {
        private String speed; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelinesRequest request) {
            super(request);
            this.speed = request.speed;
        } 

        /**
         * Speed.
         */
        public Builder speed(String speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        @Override
        public ListPipelinesRequest build() {
            return new ListPipelinesRequest(this);
        } 

    } 

}
