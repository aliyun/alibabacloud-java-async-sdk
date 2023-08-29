// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnFullDomainsBlockIPConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnFullDomainsBlockIPConfigResponseBody</p>
 */
public class DescribeDcdnFullDomainsBlockIPConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * The response code.
         * <p>
         * 
         * The value of Code is not 0 in the following scenarios:
         * 
         * *   The format of the IP address is invalid.
         * *   The number of IP addresses exceeds the limit.
         * *   Other abnormal scenarios
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned results. If the operation is successful, URLs of OSS objects are returned. If the operation fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
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
