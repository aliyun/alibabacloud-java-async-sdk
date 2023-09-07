// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateRegionResourceResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluateRegionResourceResponseBody</p>
 */
public class EvaluateRegionResourceResponseBody extends TeaModel {
    @NameInMap("DBInstanceAvailable")
    private String DBInstanceAvailable;

    @NameInMap("DBType")
    private String DBType;

    @NameInMap("DBVersion")
    private String DBVersion;

    @NameInMap("RequestId")
    private String requestId;

    private EvaluateRegionResourceResponseBody(Builder builder) {
        this.DBInstanceAvailable = builder.DBInstanceAvailable;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateRegionResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceAvailable
     */
    public String getDBInstanceAvailable() {
        return this.DBInstanceAvailable;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceAvailable; 
        private String DBType; 
        private String DBVersion; 
        private String requestId; 

        /**
         * Indicates whether sufficient resources are available. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder DBInstanceAvailable(String DBInstanceAvailable) {
            this.DBInstanceAvailable = DBInstanceAvailable;
            return this;
        }

        /**
         * The type of the database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PostgreSQL**
         * *   **Oracle**
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * The version of the database engine
         * <p>
         * 
         * *   Valid values for the MySQL database engine:
         * 
         *     *   **5.6**
         *     *   **5.7**
         *     *   **8.0**
         * 
         * *   Valid values for the PostgreSQL database engine:
         * 
         *     *   **11**
         *     *   **14**
         * 
         * *   Valid value for the Oracle database engine: **11**
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EvaluateRegionResourceResponseBody build() {
            return new EvaluateRegionResourceResponseBody(this);
        } 

    } 

}
