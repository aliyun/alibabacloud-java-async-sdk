// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link PutDataEventSelectorResponseBody} extends {@link TeaModel}
 *
 * <p>PutDataEventSelectorResponseBody</p>
 */
public class PutDataEventSelectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataEventSelectors")
    private String dataEventSelectors;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrailArn")
    private String trailArn;

    private PutDataEventSelectorResponseBody(Builder builder) {
        this.dataEventSelectors = builder.dataEventSelectors;
        this.requestId = builder.requestId;
        this.trailArn = builder.trailArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDataEventSelectorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataEventSelectors
     */
    public String getDataEventSelectors() {
        return this.dataEventSelectors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trailArn
     */
    public String getTrailArn() {
        return this.trailArn;
    }

    public static final class Builder {
        private String dataEventSelectors; 
        private String requestId; 
        private String trailArn; 

        private Builder() {
        } 

        private Builder(PutDataEventSelectorResponseBody model) {
            this.dataEventSelectors = model.dataEventSelectors;
            this.requestId = model.requestId;
            this.trailArn = model.trailArn;
        } 

        /**
         * DataEventSelectors.
         */
        public Builder dataEventSelectors(String dataEventSelectors) {
            this.dataEventSelectors = dataEventSelectors;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrailArn.
         */
        public Builder trailArn(String trailArn) {
            this.trailArn = trailArn;
            return this;
        }

        public PutDataEventSelectorResponseBody build() {
            return new PutDataEventSelectorResponseBody(this);
        } 

    } 

}
