// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtGatedLaunchPolicy4Request} extends {@link RequestModel}
 *
 * <p>FtGatedLaunchPolicy4Request</p>
 */
public class FtGatedLaunchPolicy4Request extends Request {
    @Query
    @NameInMap("IsGatedLaunch")
    private String isGatedLaunch;

    private FtGatedLaunchPolicy4Request(Builder builder) {
        super(builder);
        this.isGatedLaunch = builder.isGatedLaunch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtGatedLaunchPolicy4Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isGatedLaunch
     */
    public String getIsGatedLaunch() {
        return this.isGatedLaunch;
    }

    public static final class Builder extends Request.Builder<FtGatedLaunchPolicy4Request, Builder> {
        private String isGatedLaunch; 

        private Builder() {
            super();
        } 

        private Builder(FtGatedLaunchPolicy4Request request) {
            super(request);
            this.isGatedLaunch = request.isGatedLaunch;
        } 

        /**
         * IsGatedLaunch.
         */
        public Builder isGatedLaunch(String isGatedLaunch) {
            this.putQueryParameter("IsGatedLaunch", isGatedLaunch);
            this.isGatedLaunch = isGatedLaunch;
            return this;
        }

        @Override
        public FtGatedLaunchPolicy4Request build() {
            return new FtGatedLaunchPolicy4Request(this);
        } 

    } 

}
