// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ConvertBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>ConvertBandwidthPackageResponseBody</p>
 */
public class ConvertBandwidthPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConvertInstanceId")
    private String convertInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ConvertBandwidthPackageResponseBody model) {
            this.convertInstanceId = model.convertInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bwp-s6lmotmkkf567b****</p>
         */
        public Builder convertInstanceId(String convertInstanceId) {
            this.convertInstanceId = convertInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>455AC20C-7061-446A-BDBD-B3BEE0856304</p>
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
