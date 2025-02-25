// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStatisticalDataByProductRequest} extends {@link RequestModel}
 *
 * <p>DescribeStatisticalDataByProductRequest</p>
 */
public class DescribeStatisticalDataByProductRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private DescribeStatisticalDataByProductRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStatisticalDataByProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DescribeStatisticalDataByProductRequest, Builder> {
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStatisticalDataByProductRequest request) {
            super(request);
            this.operaUid = request.operaUid;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public DescribeStatisticalDataByProductRequest build() {
            return new DescribeStatisticalDataByProductRequest(this);
        } 

    } 

}
