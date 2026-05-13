// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CreateClusterVpcEndpointConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterVpcEndpointConnectionResponseBody</p>
 */
public class CreateClusterVpcEndpointConnectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateClusterVpcEndpointConnectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterVpcEndpointConnectionResponseBody create() {
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

        private Builder(CreateClusterVpcEndpointConnectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClusterVpcEndpointConnectionResponseBody build() {
            return new CreateClusterVpcEndpointConnectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterVpcEndpointConnectionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterVpcEndpointConnectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpointConnectionId")
        private String endpointConnectionId;

        private Data(Builder builder) {
            this.endpointConnectionId = builder.endpointConnectionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endpointConnectionId
         */
        public String getEndpointConnectionId() {
            return this.endpointConnectionId;
        }

        public static final class Builder {
            private String endpointConnectionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endpointConnectionId = model.endpointConnectionId;
            } 

            /**
             * endpointConnectionId.
             */
            public Builder endpointConnectionId(String endpointConnectionId) {
                this.endpointConnectionId = endpointConnectionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
