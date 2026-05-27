// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeWuyingServerRequest} extends {@link RequestModel}
 *
 * <p>DescribeWuyingServerRequest</p>
 */
public class DescribeWuyingServerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String wuyingServerId;

    private DescribeWuyingServerRequest(Builder builder) {
        super(builder);
        this.wuyingServerId = builder.wuyingServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWuyingServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    public static final class Builder extends Request.Builder<DescribeWuyingServerRequest, Builder> {
        private String wuyingServerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWuyingServerRequest request) {
            super(request);
            this.wuyingServerId = request.wuyingServerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-bp1234567890abcde</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        @Override
        public DescribeWuyingServerRequest build() {
            return new DescribeWuyingServerRequest(this);
        } 

    } 

}
