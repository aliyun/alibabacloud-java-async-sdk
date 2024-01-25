// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewPlayVideoPlaySessioninfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeNewPlayVideoPlaySessioninfoRequest</p>
 */
public class DescribeNewPlayVideoPlaySessioninfoRequest extends Request {
    @Query
    @NameInMap("VPS")
    private String VPS;

    private DescribeNewPlayVideoPlaySessioninfoRequest(Builder builder) {
        super(builder);
        this.VPS = builder.VPS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNewPlayVideoPlaySessioninfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return VPS
     */
    public String getVPS() {
        return this.VPS;
    }

    public static final class Builder extends Request.Builder<DescribeNewPlayVideoPlaySessioninfoRequest, Builder> {
        private String VPS; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNewPlayVideoPlaySessioninfoRequest request) {
            super(request);
            this.VPS = request.VPS;
        } 

        /**
         * VPS.
         */
        public Builder VPS(String VPS) {
            this.putQueryParameter("VPS", VPS);
            this.VPS = VPS;
            return this;
        }

        @Override
        public DescribeNewPlayVideoPlaySessioninfoRequest build() {
            return new DescribeNewPlayVideoPlaySessioninfoRequest(this);
        } 

    } 

}
