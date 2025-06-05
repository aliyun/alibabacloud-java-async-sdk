// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
 * {@link DescribeContainerLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerLogResponseBody</p>
 */
public class DescribeContainerLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerName")
    private String containerName;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeContainerLogResponseBody model) {
            this.containerName = model.containerName;
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * <p>The content of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA850ADA-<strong><strong>-4AC8-</strong></strong>-5B5990EAB7D0</p>
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
