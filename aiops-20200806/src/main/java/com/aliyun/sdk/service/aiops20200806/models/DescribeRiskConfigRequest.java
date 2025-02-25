// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskConfigRequest</p>
 */
public class DescribeRiskConfigRequest extends Request {
    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private DescribeRiskConfigRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRiskConfigRequest, Builder> {
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskConfigRequest request) {
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
        public DescribeRiskConfigRequest build() {
            return new DescribeRiskConfigRequest(this);
        } 

    } 

}
