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
 * {@link DescribeCustomizedDictUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomizedDictUploadInfoRequest</p>
 */
public class DescribeCustomizedDictUploadInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeCustomizedDictUploadInfoRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedDictUploadInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCustomizedDictUploadInfoRequest, Builder> {
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomizedDictUploadInfoRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>106.11.43.***</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeCustomizedDictUploadInfoRequest build() {
            return new DescribeCustomizedDictUploadInfoRequest(this);
        } 

    } 

}
