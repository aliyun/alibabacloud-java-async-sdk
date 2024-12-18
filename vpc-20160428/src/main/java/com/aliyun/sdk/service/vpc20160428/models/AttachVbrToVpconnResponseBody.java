// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AttachVbrToVpconnResponseBody} extends {@link TeaModel}
 *
 * <p>AttachVbrToVpconnResponseBody</p>
 */
public class AttachVbrToVpconnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnection")
    private String virtualPhysicalConnection;

    private AttachVbrToVpconnResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.virtualPhysicalConnection = builder.virtualPhysicalConnection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachVbrToVpconnResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return virtualPhysicalConnection
     */
    public String getVirtualPhysicalConnection() {
        return this.virtualPhysicalConnection;
    }

    public static final class Builder {
        private String requestId; 
        private String virtualPhysicalConnection; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5356F028-0F5C-56FC-8574-897D24379041</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the hosted connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1mrgfbtmc9brre7****</p>
         */
        public Builder virtualPhysicalConnection(String virtualPhysicalConnection) {
            this.virtualPhysicalConnection = virtualPhysicalConnection;
            return this;
        }

        public AttachVbrToVpconnResponseBody build() {
            return new AttachVbrToVpconnResponseBody(this);
        } 

    } 

}
