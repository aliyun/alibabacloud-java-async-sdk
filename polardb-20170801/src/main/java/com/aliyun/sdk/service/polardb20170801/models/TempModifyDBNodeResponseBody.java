// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempModifyDBNodeResponseBody} extends {@link TeaModel}
 *
 * <p>TempModifyDBNodeResponseBody</p>
 */
public class TempModifyDBNodeResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("DBNodeIds")
    private java.util.List < String > DBNodeIds;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private TempModifyDBNodeResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeIds = builder.DBNodeIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TempModifyDBNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeIds
     */
    public java.util.List < String > getDBNodeIds() {
        return this.DBNodeIds;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List < String > DBNodeIds; 
        private String orderId; 
        private String requestId; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBNodeIds.
         */
        public Builder DBNodeIds(java.util.List < String > DBNodeIds) {
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TempModifyDBNodeResponseBody build() {
            return new TempModifyDBNodeResponseBody(this);
        } 

    } 

}
