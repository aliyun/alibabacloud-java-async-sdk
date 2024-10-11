// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSparkCodeLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSparkCodeLogResponseBody</p>
 */
public class DescribeSparkCodeLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Log")
    private String log;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSparkCodeLogResponseBody(Builder builder) {
        this.log = builder.log;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkCodeLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return log
     */
    public String getLog() {
        return this.log;
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

    public static final class Builder {
        private String log; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The content of the log.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <blockquote>
         * <p>stdout:n++++++++++++++++++executing sql: MSCK REPAIR TABLE  <code>footprint_ethereum</code>.<code>dwd_eth_eth_txr_v2_di</code> n++n</p>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         * </blockquote>
         */
        public Builder log(String log) {
            this.log = log;
            return this;
        }

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CD65640-9963-5D60-929C-118F2C84070E</p>
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

        public DescribeSparkCodeLogResponseBody build() {
            return new DescribeSparkCodeLogResponseBody(this);
        } 

    } 

}
