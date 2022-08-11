// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtGatedLaunchPolicy4ResponseBody} extends {@link TeaModel}
 *
 * <p>FtGatedLaunchPolicy4ResponseBody</p>
 */
public class FtGatedLaunchPolicy4ResponseBody extends TeaModel {
    @NameInMap("IsGatedLaunch")
    private String isGatedLaunch;

    @NameInMap("RequestId")
    private String requestId;

    private FtGatedLaunchPolicy4ResponseBody(Builder builder) {
        this.isGatedLaunch = builder.isGatedLaunch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtGatedLaunchPolicy4ResponseBody create() {
        return builder().build();
    }

    /**
     * @return isGatedLaunch
     */
    public String getIsGatedLaunch() {
        return this.isGatedLaunch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String isGatedLaunch; 
        private String requestId; 

        /**
         * IsGatedLaunch.
         */
        public Builder isGatedLaunch(String isGatedLaunch) {
            this.isGatedLaunch = isGatedLaunch;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public FtGatedLaunchPolicy4ResponseBody build() {
            return new FtGatedLaunchPolicy4ResponseBody(this);
        } 

    } 

}
