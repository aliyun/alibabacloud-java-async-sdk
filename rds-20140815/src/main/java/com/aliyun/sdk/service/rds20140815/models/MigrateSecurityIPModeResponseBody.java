// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateSecurityIPModeResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateSecurityIPModeResponseBody</p>
 */
public class MigrateSecurityIPModeResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIPMode")
    private String securityIPMode;

    private MigrateSecurityIPModeResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
        this.securityIPMode = builder.securityIPMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateSecurityIPModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIPMode
     */
    public String getSecurityIPMode() {
        return this.securityIPMode;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String requestId; 
        private String securityIPMode; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
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
         * SecurityIPMode.
         */
        public Builder securityIPMode(String securityIPMode) {
            this.securityIPMode = securityIPMode;
            return this;
        }

        public MigrateSecurityIPModeResponseBody build() {
            return new MigrateSecurityIPModeResponseBody(this);
        } 

    } 

}
