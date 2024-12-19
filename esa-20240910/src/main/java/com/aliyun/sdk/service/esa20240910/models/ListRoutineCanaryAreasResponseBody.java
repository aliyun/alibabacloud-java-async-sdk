// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListRoutineCanaryAreasResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoutineCanaryAreasResponseBody</p>
 */
public class ListRoutineCanaryAreasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanaryAreas")
    private java.util.List<String> canaryAreas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRoutineCanaryAreasResponseBody(Builder builder) {
        this.canaryAreas = builder.canaryAreas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutineCanaryAreasResponseBody create() {
        return builder().build();
    }

    /**
     * @return canaryAreas
     */
    public java.util.List<String> getCanaryAreas() {
        return this.canaryAreas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> canaryAreas; 
        private String requestId; 

        /**
         * <p>The regions for canary release.</p>
         */
        public Builder canaryAreas(java.util.List<String> canaryAreas) {
            this.canaryAreas = canaryAreas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRoutineCanaryAreasResponseBody build() {
            return new ListRoutineCanaryAreasResponseBody(this);
        } 

    } 

}
