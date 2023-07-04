// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConvertBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>ConvertBandwidthPackageResponseBody</p>
 */
public class ConvertBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("ConvertInstanceId")
    private String convertInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    private ConvertBandwidthPackageResponseBody(Builder builder) {
        this.convertInstanceId = builder.convertInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertBandwidthPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return convertInstanceId
     */
    public String getConvertInstanceId() {
        return this.convertInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String convertInstanceId; 
        private String requestId; 

        /**
         * The ID of the Internet Shared Bandwidth instance after the conversion.
         */
        public Builder convertInstanceId(String convertInstanceId) {
            this.convertInstanceId = convertInstanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ConvertBandwidthPackageResponseBody build() {
            return new ConvertBandwidthPackageResponseBody(this);
        } 

    } 

}
