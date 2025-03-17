// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The type of the MPS queue.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Boost: MPS queue with transcoding speed boosted.</li>
         * <li>Standard: standard MPS queue.</li>
         * <li>NarrowBandHDV2: MPS queue that supports Narrowband HD 2.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
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
