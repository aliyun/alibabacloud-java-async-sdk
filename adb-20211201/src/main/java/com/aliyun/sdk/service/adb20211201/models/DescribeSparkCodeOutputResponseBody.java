// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSparkCodeOutputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkCodeOutputResponseBody</p>
 */
public class DescribeSparkCodeOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSparkCodeOutputResponseBody(Builder builder) {
        this.message = builder.message;
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkCodeOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
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

    public static final class Builder {
        private String message; 
        private String output; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li>If the request was successful, <strong>Success</strong> is returned.</li>
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
         * <p>The execution result, which is in the format of JSON objects.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;schema&quot;:[&quot;id&quot;,&quot;name&quot;,&quot;age&quot;],&quot;data&quot;:[&quot;{\&quot;id\&quot;:10,\&quot;name\&quot;:\&quot;z\&quot;,\&quot;age\&quot;:123}&quot;,&quot;{\&quot;id\&quot;:2,\&quot;name\&quot;:\&quot;b\&quot;,\&quot;age\&quot;:17}&quot;,&quot;{\&quot;id\&quot;:1,\&quot;name\&quot;:\&quot;a\&quot;,\&quot;age\&quot;:15}&quot;,&quot;{\&quot;id\&quot;:3,\&quot;name\&quot;:\&quot;c\&quot;,\&quot;age\&quot;:222}&quot;,&quot;{\&quot;id\&quot;:10,\&quot;name\&quot;:\&quot;z\&quot;,\&quot;age\&quot;:123}&quot;],&quot;haveRows&quot;:true,&quot;rowNumber&quot;:6}&quot;</p>
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
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

        public DescribeSparkCodeOutputResponseBody build() {
            return new DescribeSparkCodeOutputResponseBody(this);
        } 

    } 

}
