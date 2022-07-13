// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wfts20220212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLjxAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLjxAccountInfoResponseBody</p>
 */
public class GetLjxAccountInfoResponseBody extends TeaModel {
    @NameInMap("Apple")
    private String apple;

    @NameInMap("LjxAccountInfoId")
    private String ljxAccountInfoId;

    @NameInMap("requestId")
    private String requestId;

    private GetLjxAccountInfoResponseBody(Builder builder) {
        this.apple = builder.apple;
        this.ljxAccountInfoId = builder.ljxAccountInfoId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLjxAccountInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return apple
     */
    public String getApple() {
        return this.apple;
    }

    /**
     * @return ljxAccountInfoId
     */
    public String getLjxAccountInfoId() {
        return this.ljxAccountInfoId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apple; 
        private String ljxAccountInfoId; 
        private String requestId; 

        /**
         * Apple.
         */
        public Builder apple(String apple) {
            this.apple = apple;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder ljxAccountInfoId(String ljxAccountInfoId) {
            this.ljxAccountInfoId = ljxAccountInfoId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLjxAccountInfoResponseBody build() {
            return new GetLjxAccountInfoResponseBody(this);
        } 

    } 

}
