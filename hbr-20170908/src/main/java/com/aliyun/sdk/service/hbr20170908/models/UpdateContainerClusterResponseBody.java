// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link UpdateContainerClusterResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateContainerClusterResponseBody</p>
 */
public class UpdateContainerClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("TokenUpdated")
    private Boolean tokenUpdated;

    private UpdateContainerClusterResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.token = builder.token;
        this.tokenUpdated = builder.tokenUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContainerClusterResponseBody create() {
        return builder().build();
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

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return tokenUpdated
     */
    public Boolean getTokenUpdated() {
        return this.tokenUpdated;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String token; 
        private Boolean tokenUpdated; 

        /**
         * <p>Return code, 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return information.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates if the request was successful.</p>
         * <ul>
         * <li>true: Success</li>
         * <li>false: Failure</li>
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
         * <p>Cluster token, used for registering HBR clients within the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhY2NvdW*****VnZpgXQC5A==</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>Indicates whether the cluster token has been updated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder tokenUpdated(Boolean tokenUpdated) {
            this.tokenUpdated = tokenUpdated;
            return this;
        }

        public UpdateContainerClusterResponseBody build() {
            return new UpdateContainerClusterResponseBody(this);
        } 

    } 

}
