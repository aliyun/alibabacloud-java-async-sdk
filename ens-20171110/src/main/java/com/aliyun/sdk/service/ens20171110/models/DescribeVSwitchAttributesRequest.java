// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeVSwitchAttributesRequest} extends {@link RequestModel}
 *
 * <p>DescribeVSwitchAttributesRequest</p>
 */
public class DescribeVSwitchAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    private DescribeVSwitchAttributesRequest(Builder builder) {
        super(builder);
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribeVSwitchAttributesRequest, Builder> {
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVSwitchAttributesRequest request) {
            super(request);
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public DescribeVSwitchAttributesRequest build() {
            return new DescribeVSwitchAttributesRequest(this);
        } 

    } 

}
