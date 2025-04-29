// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link StartPairDrillResponseBody} extends {@link TeaModel}
 *
 * <p>StartPairDrillResponseBody</p>
 */
public class StartPairDrillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DrillId")
    private String drillId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartPairDrillResponseBody model) {
            this.drillId = model.drillId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The drill ID.</p>
         * 
         * <strong>example:</strong>
         * <p>drill-xxx</p>
         */
        public Builder drillId(String drillId) {
            this.drillId = drillId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
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
