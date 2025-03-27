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
 * {@link DeleteGatewayIntranetLinkedVpcPeerResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGatewayIntranetLinkedVpcPeerResponseBody</p>
 */
public class DeleteGatewayIntranetLinkedVpcPeerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeleteGatewayIntranetLinkedVpcPeerResponseBody(Builder builder) {
        this.gatewayId = builder.gatewayId;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayIntranetLinkedVpcPeerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteGatewayIntranetLinkedVpcPeerResponseBody model) {
            this.gatewayId = model.gatewayId;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully delete intranet linked vpc Peer for gateway</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteGatewayIntranetLinkedVpcPeerResponseBody build() {
            return new DeleteGatewayIntranetLinkedVpcPeerResponseBody(this);
        } 

    } 

}
