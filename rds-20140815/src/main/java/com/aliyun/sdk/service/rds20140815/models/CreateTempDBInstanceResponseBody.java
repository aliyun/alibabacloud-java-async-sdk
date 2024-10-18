// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTempDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTempDBInstanceResponseBody</p>
 */
public class CreateTempDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TempDBInstanceId")
    private String tempDBInstanceId;

    private CreateTempDBInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tempDBInstanceId = builder.tempDBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTempDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tempDBInstanceId
     */
    public String getTempDBInstanceId() {
        return this.tempDBInstanceId;
    }

    public static final class Builder {
        private String requestId; 
        private String tempDBInstanceId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>248DE93F-8647-4B9D-8287-4A4A0FE56AD5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The temporary instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sub138****_rm-******</p>
         */
        public Builder tempDBInstanceId(String tempDBInstanceId) {
            this.tempDBInstanceId = tempDBInstanceId;
            return this;
        }

        public CreateTempDBInstanceResponseBody build() {
            return new CreateTempDBInstanceResponseBody(this);
        } 

    } 

}
