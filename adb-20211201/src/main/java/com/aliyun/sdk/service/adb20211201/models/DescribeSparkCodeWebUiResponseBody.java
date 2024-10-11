// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSparkCodeWebUiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkCodeWebUiResponseBody</p>
 */
public class DescribeSparkCodeWebUiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private DescribeSparkCodeWebUiResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkCodeWebUiResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String url; 

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li>If the request was successful, <strong>SUCCESS</strong> is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>774DDC37-1908-58F6-B9CA-99E3E45965A6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The URL of the web UI for the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://adb-subuser-cn-hangzhou-1358535755648527-100000648.oss-cn-hangzhou.aliyuncs.com/%3Facl?Expires=1681295967&OSSAccessKeyId=LTAI5tB7NAkm25oiGASu****&Signature=hKAZ1vgvhJ%2FD8hNHTuX%2FOOBWht">https://adb-subuser-cn-hangzhou-1358535755648527-100000648.oss-cn-hangzhou.aliyuncs.com/%3Facl?Expires=1681295967&amp;OSSAccessKeyId=LTAI5tB7NAkm25oiGASu****&amp;Signature=hKAZ1vgvhJ%2FD8hNHTuX%2FOOBWht</a>****</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public DescribeSparkCodeWebUiResponseBody build() {
            return new DescribeSparkCodeWebUiResponseBody(this);
        } 

    } 

}
