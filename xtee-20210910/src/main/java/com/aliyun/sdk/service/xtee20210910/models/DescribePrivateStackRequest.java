// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrivateStackRequest} extends {@link RequestModel}
 *
 * <p>DescribePrivateStackRequest</p>
 */
public class DescribePrivateStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribePrivateStackRequest(Builder builder) {
        super(builder);
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateStackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribePrivateStackRequest, Builder> {
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrivateStackRequest request) {
            super(request);
            this.regId = request.regId;
        } 

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribePrivateStackRequest build() {
            return new DescribePrivateStackRequest(this);
        } 

    } 

}
