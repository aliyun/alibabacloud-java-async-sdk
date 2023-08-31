// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchDBInstanceNetTypeResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchDBInstanceNetTypeResponseBody</p>
 */
public class SwitchDBInstanceNetTypeResponseBody extends TeaModel {
    @NameInMap("NewConnectionString")
    private String newConnectionString;

    @NameInMap("OldConnectionString")
    private String oldConnectionString;

    @NameInMap("RequestId")
    private String requestId;

    private SwitchDBInstanceNetTypeResponseBody(Builder builder) {
        this.newConnectionString = builder.newConnectionString;
        this.oldConnectionString = builder.oldConnectionString;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchDBInstanceNetTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return newConnectionString
     */
    public String getNewConnectionString() {
        return this.newConnectionString;
    }

    /**
     * @return oldConnectionString
     */
    public String getOldConnectionString() {
        return this.oldConnectionString;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String newConnectionString; 
        private String oldConnectionString; 
        private String requestId; 

        /**
         * The endpoint that is used to connect to the instance after the switch of endpoints.
         */
        public Builder newConnectionString(String newConnectionString) {
            this.newConnectionString = newConnectionString;
            return this;
        }

        /**
         * The endpoint that is used to connect to the instance before the switch of endpoints.
         */
        public Builder oldConnectionString(String oldConnectionString) {
            this.oldConnectionString = oldConnectionString;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SwitchDBInstanceNetTypeResponseBody build() {
            return new SwitchDBInstanceNetTypeResponseBody(this);
        } 

    } 

}
