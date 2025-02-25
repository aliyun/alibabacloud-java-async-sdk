// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageUploadInfoRequest</p>
 */
public class DescribeImageUploadInfoRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeImageUploadInfoRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageUploadInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeImageUploadInfoRequest, Builder> {
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageUploadInfoRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeImageUploadInfoRequest build() {
            return new DescribeImageUploadInfoRequest(this);
        } 

    } 

}
