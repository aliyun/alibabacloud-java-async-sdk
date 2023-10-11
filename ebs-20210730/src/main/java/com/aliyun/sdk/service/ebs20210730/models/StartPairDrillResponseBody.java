// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPairDrillResponseBody} extends {@link TeaModel}
 *
 * <p>StartPairDrillResponseBody</p>
 */
public class StartPairDrillResponseBody extends TeaModel {
    @NameInMap("DrillId")
    private String drillId;

    @NameInMap("RequestId")
    private String requestId;

    private StartPairDrillResponseBody(Builder builder) {
        this.drillId = builder.drillId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPairDrillResponseBody create() {
        return builder().build();
    }

    /**
     * @return drillId
     */
    public String getDrillId() {
        return this.drillId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String drillId; 
        private String requestId; 

        /**
         * DrillId.
         */
        public Builder drillId(String drillId) {
            this.drillId = drillId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartPairDrillResponseBody build() {
            return new StartPairDrillResponseBody(this);
        } 

    } 

}
