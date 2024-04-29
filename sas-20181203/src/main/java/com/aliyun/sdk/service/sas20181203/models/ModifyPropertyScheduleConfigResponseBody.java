// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPropertyScheduleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPropertyScheduleConfigResponseBody</p>
 */
public class ModifyPropertyScheduleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModifyResult")
    private Boolean modifyResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyPropertyScheduleConfigResponseBody(Builder builder) {
        this.modifyResult = builder.modifyResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPropertyScheduleConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return modifyResult
     */
    public Boolean getModifyResult() {
        return this.modifyResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean modifyResult; 
        private String requestId; 

        /**
         * ModifyResult.
         */
        public Builder modifyResult(Boolean modifyResult) {
            this.modifyResult = modifyResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyPropertyScheduleConfigResponseBody build() {
            return new ModifyPropertyScheduleConfigResponseBody(this);
        } 

    } 

}
