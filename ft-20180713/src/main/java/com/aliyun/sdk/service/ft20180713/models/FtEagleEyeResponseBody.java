// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtEagleEyeResponseBody} extends {@link TeaModel}
 *
 * <p>FtEagleEyeResponseBody</p>
 */
public class FtEagleEyeResponseBody extends TeaModel {
    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("eagleEyeTraceId")
    private String eagleEyeTraceId;

    private FtEagleEyeResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.eagleEyeTraceId = builder.eagleEyeTraceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FtEagleEyeResponseBody create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return eagleEyeTraceId
     */
    public String getEagleEyeTraceId() {
        return this.eagleEyeTraceId;
    }

    public static final class Builder {
        private String name; 
        private String requestId; 
        private String eagleEyeTraceId; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * eagleEyeTraceId.
         */
        public Builder eagleEyeTraceId(String eagleEyeTraceId) {
            this.eagleEyeTraceId = eagleEyeTraceId;
            return this;
        }

        public FtEagleEyeResponseBody build() {
            return new FtEagleEyeResponseBody(this);
        } 

    } 

}
