// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCollectorRequest} extends {@link RequestModel}
 *
 * <p>DescribeCollectorRequest</p>
 */
public class DescribeCollectorRequest extends Request {
    @Path
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    private DescribeCollectorRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCollectorRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCollectorRequest, Builder> {
        private String resId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCollectorRequest response) {
            super(response);
            this.resId = response.resId;
        } 

        /**
         * ResId.
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        @Override
        public DescribeCollectorRequest build() {
            return new DescribeCollectorRequest(this);
        } 

    } 

}
