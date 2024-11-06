// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMPULayoutResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMPULayoutResponseBody</p>
 */
public class CreateMPULayoutResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LayoutId")
    private Long layoutId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMPULayoutResponseBody(Builder builder) {
        this.layoutId = builder.layoutId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMPULayoutResponseBody create() {
        return builder().build();
    }

    /**
     * @return layoutId
     */
    public Long getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long layoutId; 
        private String requestId; 

        /**
         * LayoutId.
         */
        public Builder layoutId(Long layoutId) {
            this.layoutId = layoutId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMPULayoutResponseBody build() {
            return new CreateMPULayoutResponseBody(this);
        } 

    } 

}
