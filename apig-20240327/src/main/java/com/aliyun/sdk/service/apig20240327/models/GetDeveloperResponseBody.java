// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetDeveloperResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeveloperResponseBody</p>
 */
public class GetDeveloperResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetDeveloperResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeveloperResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDeveloperResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeveloperResponseBody build() {
            return new GetDeveloperResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeveloperResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeveloperResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("developerId")
        private String developerId;

        @com.aliyun.core.annotation.NameInMap("portalId")
        private String portalId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Data(Builder builder) {
            this.developerId = builder.developerId;
            this.portalId = builder.portalId;
            this.status = builder.status;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return developerId
         */
        public String getDeveloperId() {
            return this.developerId;
        }

        /**
         * @return portalId
         */
        public String getPortalId() {
            return this.portalId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String developerId; 
            private String portalId; 
            private String status; 
            private String username; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.developerId = model.developerId;
                this.portalId = model.portalId;
                this.status = model.status;
                this.username = model.username;
            } 

            /**
             * <p>The developer ID. This ID can be used to identify the developer in API operations such as SetHiMarketDeveloperStatus and DeleteHiMarketDeveloper.</p>
             * 
             * <strong>example:</strong>
             * <p>dev-xxxxxxxx</p>
             */
            public Builder developerId(String developerId) {
                this.developerId = developerId;
                return this;
            }

            /**
             * <p>The ID of the portal to which the developer belongs. This ID can be used to identify the portal in API operations such as GetPortal, UpdatePortal, and DeletePortal.</p>
             * 
             * <strong>example:</strong>
             * <p>portal-xxxxxxxx</p>
             */
            public Builder portalId(String portalId) {
                this.portalId = portalId;
                return this;
            }

            /**
             * <p>The developer status. Valid values: PENDING, APPROVED, and REJECTED.</p>
             * 
             * <strong>example:</strong>
             * <p>APPROVED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The logon username of the developer.</p>
             * 
             * <strong>example:</strong>
             * <p>developer-demo</p>
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
