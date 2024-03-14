// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpireCachesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpireCachesResponseBody</p>
 */
public class DescribeExpireCachesResponseBody extends TeaModel {
    @NameInMap("CacheFilePaths")
    private String cacheFilePaths;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeExpireCachesResponseBody(Builder builder) {
        this.cacheFilePaths = builder.cacheFilePaths;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpireCachesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cacheFilePaths
     */
    public String getCacheFilePaths() {
        return this.cacheFilePaths;
    }

    /**
     * @return code
     */
    public String getCode() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String cacheFilePaths; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * CacheFilePaths.
         */
        public Builder cacheFilePaths(String cacheFilePaths) {
            this.cacheFilePaths = cacheFilePaths;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeExpireCachesResponseBody build() {
            return new DescribeExpireCachesResponseBody(this);
        } 

    } 

}
