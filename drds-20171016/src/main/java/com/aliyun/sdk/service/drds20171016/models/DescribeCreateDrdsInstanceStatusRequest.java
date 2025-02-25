// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCreateDrdsInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeCreateDrdsInstanceStatusRequest</p>
 */
public class DescribeCreateDrdsInstanceStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    private DescribeCreateDrdsInstanceStatusRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreateDrdsInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeCreateDrdsInstanceStatusRequest, Builder> {
        private String drdsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCreateDrdsInstanceStatusRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
        } 

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        @Override
        public DescribeCreateDrdsInstanceStatusRequest build() {
            return new DescribeCreateDrdsInstanceStatusRequest(this);
        } 

    } 

}
