// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Indicates whether the resources are sufficient in the region. Valid values:
         * <p>
         * 
         * *   **1**: The resources are sufficient.
         * *   **0**: The resources are insufficient.
         */
        public Builder DBInstanceAvailable(String DBInstanceAvailable) {
            this.DBInstanceAvailable = DBInstanceAvailable;
            return this;
        }

        /**
         * The database engine of the instance. Only MongoDB is returned.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * The version of the database engine.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The ID of the request.
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
