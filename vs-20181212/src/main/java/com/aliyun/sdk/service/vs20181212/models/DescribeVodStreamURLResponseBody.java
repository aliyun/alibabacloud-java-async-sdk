// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVodStreamURLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodStreamURLResponseBody</p>
 */
public class DescribeVodStreamURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OutProtocol")
    private String outProtocol;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Long port;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DescribeVodStreamURLResponseBody(Builder builder) {
        this.outProtocol = builder.outProtocol;
        this.port = builder.port;
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodStreamURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return outProtocol
     */
    public String getOutProtocol() {
        return this.outProtocol;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String outProtocol; 
        private Long port; 
        private String requestId; 
        private String url; 

        /**
         * OutProtocol.
         */
        public Builder outProtocol(String outProtocol) {
            this.outProtocol = outProtocol;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Long port) {
            this.port = port;
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
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DescribeVodStreamURLResponseBody build() {
            return new DescribeVodStreamURLResponseBody(this);
        } 

    } 

}
