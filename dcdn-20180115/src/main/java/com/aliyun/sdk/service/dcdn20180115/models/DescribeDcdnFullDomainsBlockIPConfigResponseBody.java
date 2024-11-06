// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnFullDomainsBlockIPConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnFullDomainsBlockIPConfigResponseBody</p>
 */
public class DescribeDcdnFullDomainsBlockIPConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnFullDomainsBlockIPConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnFullDomainsBlockIPConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code.</p>
         * <p>The value of Code is not 0 in the following scenarios:</p>
         * <ul>
         * <li>The format of the IP address is invalid.</li>
         * <li>The number of IP addresses exceeds the limit.</li>
         * <li>Other abnormal scenarios</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned results. If the operation is successful, URLs of OSS objects are returned. If the operation fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxx-api.oss-cn-hangzhou.aliyuncs.com/blocklist%2Fxxxxxxxxxxxx.txt?Expires=1682663947&OSSAccessKeyId=xxxxxxxxxx&Signature=xxxxxx">http://xxxx-api.oss-cn-hangzhou.aliyuncs.com/blocklist%2Fxxxxxxxxxxxx.txt?Expires=1682663947&amp;OSSAccessKeyId=xxxxxxxxxx&amp;Signature=xxxxxx</a></p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0C58632F-BA12-1A1E-986D-09285752B42C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnFullDomainsBlockIPConfigResponseBody build() {
            return new DescribeDcdnFullDomainsBlockIPConfigResponseBody(this);
        } 

    } 

}
