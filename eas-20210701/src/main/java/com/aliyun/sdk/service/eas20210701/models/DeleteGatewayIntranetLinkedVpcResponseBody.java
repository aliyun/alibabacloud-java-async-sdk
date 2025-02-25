// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DeleteGatewayIntranetLinkedVpcResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGatewayIntranetLinkedVpcResponseBody</p>
 */
public class DeleteGatewayIntranetLinkedVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteGatewayIntranetLinkedVpcResponseBody(Builder builder) {
        this.gatewayId = builder.gatewayId;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayIntranetLinkedVpcResponseBody create() {
        return builder().build();
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
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
        private String gatewayId; 
        private String message; 
        private String requestId; 

        /**
         * <p>The private gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully delete intranet linked vpc for gateway</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteGatewayIntranetLinkedVpcResponseBody build() {
            return new DeleteGatewayIntranetLinkedVpcResponseBody(this);
        } 

    } 

}
