// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSuppressionListLevelResponseBody} extends {@link TeaModel}
 *
 * <p>SetSuppressionListLevelResponseBody</p>
 */
public class SetSuppressionListLevelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuppressionListLevel")
    private String suppressionListLevel;

    private SetSuppressionListLevelResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suppressionListLevel = builder.suppressionListLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSuppressionListLevelResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suppressionListLevel
     */
    public String getSuppressionListLevel() {
        return this.suppressionListLevel;
    }

    public static final class Builder {
        private String requestId; 
        private String suppressionListLevel; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuppressionListLevel.
         */
        public Builder suppressionListLevel(String suppressionListLevel) {
            this.suppressionListLevel = suppressionListLevel;
            return this;
        }

        public SetSuppressionListLevelResponseBody build() {
            return new SetSuppressionListLevelResponseBody(this);
        } 

    } 

}
