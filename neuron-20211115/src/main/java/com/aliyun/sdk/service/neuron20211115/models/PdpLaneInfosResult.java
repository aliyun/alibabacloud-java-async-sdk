// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PdpLaneInfosResult} extends {@link TeaModel}
 *
 * <p>PdpLaneInfosResult</p>
 */
public class PdpLaneInfosResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pdpLanes")
    private java.util.List<PdpLaneInfo> pdpLanes;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PdpLaneInfosResult(Builder builder) {
        this.pdpLanes = builder.pdpLanes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpLaneInfosResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pdpLanes
     */
    public java.util.List<PdpLaneInfo> getPdpLanes() {
        return this.pdpLanes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PdpLaneInfo> pdpLanes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PdpLaneInfosResult model) {
            this.pdpLanes = model.pdpLanes;
            this.requestId = model.requestId;
        } 

        /**
         * pdpLanes.
         */
        public Builder pdpLanes(java.util.List<PdpLaneInfo> pdpLanes) {
            this.pdpLanes = pdpLanes;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PdpLaneInfosResult build() {
            return new PdpLaneInfosResult(this);
        } 

    } 

}
