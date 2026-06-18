// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link DescribeQuotaRequest} extends {@link RequestModel}
 *
 * <p>DescribeQuotaRequest</p>
 */
public class DescribeQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tagValue")
    private String tagValue;

    private DescribeQuotaRequest(Builder builder) {
        super(builder);
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder extends Request.Builder<DescribeQuotaRequest, Builder> {
        private String tagValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQuotaRequest request) {
            super(request);
            this.tagValue = request.tagValue;
        } 

        /**
         * <p>Team ID</p>
         * 
         * <strong>example:</strong>
         * <p>f79d6a95-abcd-47a8-9167-eccf0622a998</p>
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("tagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        @Override
        public DescribeQuotaRequest build() {
            return new DescribeQuotaRequest(this);
        } 

    } 

}
