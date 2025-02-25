// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link EvaluateResourceResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluateResourceResponseBody</p>
 */
public class EvaluateResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceAvailable")
    private String DBInstanceAvailable;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EvaluateResourceResponseBody(Builder builder) {
        this.DBInstanceAvailable = builder.DBInstanceAvailable;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceAvailable
     */
    public String getDBInstanceAvailable() {
        return this.DBInstanceAvailable;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceAvailable; 
        private String engine; 
        private String engineVersion; 
        private String requestId; 

        /**
         * <p>Indicates whether the resources are sufficient in the region. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The resources are sufficient.</li>
         * <li><strong>0</strong>: The resources are insufficient.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DBInstanceAvailable(String DBInstanceAvailable) {
            this.DBInstanceAvailable = DBInstanceAvailable;
            return this;
        }

        /**
         * <p>The database engine of the instance. Only MongoDB is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AE2DE465-E45F-481F-ABD8-37D64173****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EvaluateResourceResponseBody build() {
            return new EvaluateResourceResponseBody(this);
        } 

    } 

}
