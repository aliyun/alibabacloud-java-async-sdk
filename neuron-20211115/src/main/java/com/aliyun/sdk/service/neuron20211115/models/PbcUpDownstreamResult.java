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
 * {@link PbcUpDownstreamResult} extends {@link TeaModel}
 *
 * <p>PbcUpDownstreamResult</p>
 */
public class PbcUpDownstreamResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pbcItems")
    private java.util.List<PbcRelationItem> pbcItems;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PbcUpDownstreamResult(Builder builder) {
        this.pbcItems = builder.pbcItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PbcUpDownstreamResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pbcItems
     */
    public java.util.List<PbcRelationItem> getPbcItems() {
        return this.pbcItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PbcRelationItem> pbcItems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PbcUpDownstreamResult model) {
            this.pbcItems = model.pbcItems;
            this.requestId = model.requestId;
        } 

        /**
         * pbcItems.
         */
        public Builder pbcItems(java.util.List<PbcRelationItem> pbcItems) {
            this.pbcItems = pbcItems;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PbcUpDownstreamResult build() {
            return new PbcUpDownstreamResult(this);
        } 

    } 

}
