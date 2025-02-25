// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeDefaultKeyInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefaultKeyInfoRequest</p>
 */
public class DescribeDefaultKeyInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeDefaultKeyInfoRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultKeyInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeDefaultKeyInfoRequest, Builder> {
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefaultKeyInfoRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>58.246.73.***</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeDefaultKeyInfoRequest build() {
            return new DescribeDefaultKeyInfoRequest(this);
        } 

    } 

}
