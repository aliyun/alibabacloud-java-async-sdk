// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeSQLWebSocketDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLWebSocketDomainResponseBody</p>
 */
public class DescribeSQLWebSocketDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSQLWebSocketDomainResponseBody(Builder builder) {
        this.code = builder.code;
        this.domain = builder.domain;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLWebSocketDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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
        private Long code; 
        private String domain; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeSQLWebSocketDomainResponseBody model) {
            this.code = model.code;
            this.domain = model.domain;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>adb-ws-beijing.console.aliyun.com/query</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The response message.</p>
         * <ul>
         * <li><p>Returns <strong>Success</strong> if the request succeeds.</p>
         * </li>
         * <li><p>Returns a specific error code if the request fails.</p>
         * </li>
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
         * <p>The unique identifier for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E03F0806-A67B-5B24-8562-9589F20DEEB5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The call succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The call failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSQLWebSocketDomainResponseBody build() {
            return new DescribeSQLWebSocketDomainResponseBody(this);
        } 

    } 

}
