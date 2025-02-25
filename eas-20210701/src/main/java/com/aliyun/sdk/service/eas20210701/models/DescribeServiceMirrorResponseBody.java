// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeServiceMirrorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMirrorResponseBody</p>
 */
public class DescribeServiceMirrorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ratio")
    private String ratio;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("Target")
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
         * <p>The percentage of traffic that you want to mirror. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder ratio(String ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The destination services to which you want to mirror traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>foo2,foo3</p>
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
