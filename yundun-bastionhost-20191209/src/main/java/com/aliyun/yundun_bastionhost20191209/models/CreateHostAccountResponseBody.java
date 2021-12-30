// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostAccountResponseBody</p>
 */
public class CreateHostAccountResponseBody extends TeaModel {
    @NameInMap("HostAccountId")
    private String hostAccountId;

    @NameInMap("RequestId")
    private String requestId;


    private CreateHostAccountResponseBody(Builder builder) {
        this.hostAccountId = builder.hostAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostAccountId
     */
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hostAccountId; 
        private String requestId; 

        /**
         * <p>HostAccountId.</p>
         */
        public Builder hostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHostAccountResponseBody build() {
            return new CreateHostAccountResponseBody(this);
        } 

    } 

}
