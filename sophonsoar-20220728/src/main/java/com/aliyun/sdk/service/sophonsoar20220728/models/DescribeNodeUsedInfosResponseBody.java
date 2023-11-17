// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeUsedInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeUsedInfosResponseBody</p>
 */
public class DescribeNodeUsedInfosResponseBody extends TeaModel {
    @NameInMap("NodeUsedInfos")
    private String nodeUsedInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNodeUsedInfosResponseBody(Builder builder) {
        this.nodeUsedInfos = builder.nodeUsedInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeUsedInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeUsedInfos
     */
    public String getNodeUsedInfos() {
        return this.nodeUsedInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nodeUsedInfos; 
        private String requestId; 

        /**
         * NodeUsedInfos.
         */
        public Builder nodeUsedInfos(String nodeUsedInfos) {
            this.nodeUsedInfos = nodeUsedInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodeUsedInfosResponseBody build() {
            return new DescribeNodeUsedInfosResponseBody(this);
        } 

    } 

}
