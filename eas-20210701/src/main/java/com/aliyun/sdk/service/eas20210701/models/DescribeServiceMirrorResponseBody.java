// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMirrorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMirrorResponseBody</p>
 */
public class DescribeServiceMirrorResponseBody extends TeaModel {
    @NameInMap("Ratio")
    private String ratio;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("Target")
    private String target;

    private DescribeServiceMirrorResponseBody(Builder builder) {
        this.ratio = builder.ratio;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMirrorResponseBody create() {
        return builder().build();
    }

    /**
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder {
        private String ratio; 
        private String requestId; 
        private String serviceName; 
        private String target; 

        /**
         * Ratio.
         */
        public Builder ratio(String ratio) {
            this.ratio = ratio;
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
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        public DescribeServiceMirrorResponseBody build() {
            return new DescribeServiceMirrorResponseBody(this);
        } 

    } 

}
