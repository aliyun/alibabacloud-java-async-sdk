// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateSecurityIPModeResponseBody} extends {@link TeaModel}
 *
 * <p>MigrateSecurityIPModeResponseBody</p>
 */
public class MigrateSecurityIPModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIPMode")
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
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The whitelist mode after the change, which is the enhanced whitelist mode.
         * <p>
         * 
         * Valid values:
         * 
         * *   safety
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     enhanced whitelist mode
         * 
         *     <!-- -->
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
