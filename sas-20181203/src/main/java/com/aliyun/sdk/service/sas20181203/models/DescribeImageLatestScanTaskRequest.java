// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageLatestScanTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageLatestScanTaskRequest</p>
 */
public class DescribeImageLatestScanTaskRequest extends Request {
    @Query
    @NameInMap("Digest")
    @Validation(required = true)
    private String digest;

    private DescribeImageLatestScanTaskRequest(Builder builder) {
        super(builder);
        this.digest = builder.digest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageLatestScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    public static final class Builder extends Request.Builder<DescribeImageLatestScanTaskRequest, Builder> {
        private String digest; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageLatestScanTaskRequest request) {
            super(request);
            this.digest = request.digest;
        } 

        /**
         * The digest value of the image.
         */
        public Builder digest(String digest) {
            this.putQueryParameter("Digest", digest);
            this.digest = digest;
            return this;
        }

        @Override
        public DescribeImageLatestScanTaskRequest build() {
            return new DescribeImageLatestScanTaskRequest(this);
        } 

    } 

}
