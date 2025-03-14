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
 * {@link DescribeLogShipperStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeLogShipperStatusRequest</p>
 */
public class DescribeLogShipperStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    private DescribeLogShipperStatusRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogShipperStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<DescribeLogShipperStatusRequest, Builder> {
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLogShipperStatusRequest request) {
            super(request);
            this.from = request.from;
        } 

        /**
         * <p>The ID of the request source. Set the value to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public DescribeLogShipperStatusRequest build() {
            return new DescribeLogShipperStatusRequest(this);
        } 

    } 

}
