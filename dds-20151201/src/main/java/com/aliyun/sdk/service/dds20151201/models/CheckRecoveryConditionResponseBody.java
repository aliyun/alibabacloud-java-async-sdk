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
 * {@link CheckRecoveryConditionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckRecoveryConditionResponseBody</p>
 */
public class CheckRecoveryConditionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("IsValid")
    private Boolean isValid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckRecoveryConditionResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.isValid = builder.isValid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRecoveryConditionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return isValid
     */
    public Boolean getIsValid() {
        return this.isValid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private Boolean isValid; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckRecoveryConditionResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.isValid = model.isValid;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1378****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>Indicates whether the data of the instance can be restored. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The data of the instance can be restored.</li>
         * <li><strong>false</strong>: The data of the instance cannot be restored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D563A3E7-6010-45FE-A0CD-9283414C9657</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckRecoveryConditionResponseBody build() {
            return new CheckRecoveryConditionResponseBody(this);
        } 

    } 

}
