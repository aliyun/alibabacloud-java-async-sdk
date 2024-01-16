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
         * The node reference information. The value is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **action**: the referencing action. This field contains the following information:
         * 
         *     *   **name**: the name of the referencing node.
         *     *   **inputParams**: the parameter settings of the referencing node.
         */
        public Builder nodeUsedInfos(String nodeUsedInfos) {
            this.nodeUsedInfos = nodeUsedInfos;
            return this;
        }

        /**
         * The request ID.
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
