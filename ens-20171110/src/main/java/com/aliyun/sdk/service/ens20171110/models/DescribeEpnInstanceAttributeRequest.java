// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEpnInstanceAttributeRequest</p>
 */
public class DescribeEpnInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceId;

    private DescribeEpnInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public static final class Builder extends Request.Builder<DescribeEpnInstanceAttributeRequest, Builder> {
        private String EPNInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEpnInstanceAttributeRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
        } 

        /**
         * The ID of the EPN instance.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        @Override
        public DescribeEpnInstanceAttributeRequest build() {
            return new DescribeEpnInstanceAttributeRequest(this);
        } 

    } 

}
