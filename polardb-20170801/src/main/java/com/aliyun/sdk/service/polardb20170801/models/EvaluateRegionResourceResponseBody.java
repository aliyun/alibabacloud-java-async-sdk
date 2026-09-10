// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link EvaluateRegionResourceResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluateRegionResourceResponseBody</p>
 */
public class EvaluateRegionResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceAvailable")
    private String DBInstanceAvailable;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(EvaluateRegionResourceResponseBody model) {
            this.DBInstanceAvailable = model.DBInstanceAvailable;
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the resources are sufficient.</p>
         * <ul>
         * <li><p><strong>true</strong>: The resources are sufficient.</p>
         * </li>
         * <li><p><strong>false</strong>: The resources are insufficient.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder DBInstanceAvailable(String DBInstanceAvailable) {
            this.DBInstanceAvailable = DBInstanceAvailable;
            return this;
        }

        /**
         * <p>The database engine type. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version of the database engine.</p>
         * <ul>
         * <li><p>Valid values for MySQL:</p>
         * <ul>
         * <li><p><strong>5.6</strong></p>
         * </li>
         * <li><p><strong>5.7</strong></p>
         * </li>
         * <li><p><strong>8.0</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Valid values for PostgreSQL:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Valid value for Oracle: <strong>11</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69A85BAF-1089-4CDF-A82F-0A140F******</p>
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
