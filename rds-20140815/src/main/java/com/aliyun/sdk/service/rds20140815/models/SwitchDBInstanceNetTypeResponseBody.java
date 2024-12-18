// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link SwitchDBInstanceNetTypeResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchDBInstanceNetTypeResponseBody</p>
 */
public class SwitchDBInstanceNetTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewConnectionString")
    private String newConnectionString;

    @com.aliyun.core.annotation.NameInMap("OldConnectionString")
    private String oldConnectionString;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The endpoint that is used to connect to the instance after the switch of endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>new**********.mysql.rds.aliyuncs.com</p>
         */
        public Builder newConnectionString(String newConnectionString) {
            this.newConnectionString = newConnectionString;
            return this;
        }

        /**
         * <p>The endpoint that is used to connect to the instance before the switch of endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1**************.mysql.rds.aliyuncs.com</p>
         */
        public Builder oldConnectionString(String oldConnectionString) {
            this.oldConnectionString = oldConnectionString;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>65BDA532-28AF-4122-AA39-B382721EEE64</p>
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
