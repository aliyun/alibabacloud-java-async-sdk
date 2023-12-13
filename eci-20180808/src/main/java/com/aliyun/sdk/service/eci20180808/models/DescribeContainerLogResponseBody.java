// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerLogResponseBody</p>
 */
public class DescribeContainerLogResponseBody extends TeaModel {
    @NameInMap("ContainerName")
    private String containerName;

    @NameInMap("Content")
    private String content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeContainerLogResponseBody(Builder builder) {
        this.containerName = builder.containerName;
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerName
     */
    public String getContainerName() {
        return this.containerName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String containerName; 
        private String content; 
        private String requestId; 

        /**
         * The container name.
         */
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * The content of the log.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerLogResponseBody build() {
            return new DescribeContainerLogResponseBody(this);
        } 

    } 

}
