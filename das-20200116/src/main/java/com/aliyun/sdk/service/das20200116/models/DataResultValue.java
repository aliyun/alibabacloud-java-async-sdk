// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DataResultValue} extends {@link TeaModel}
 *
 * <p>DataResultValue</p>
 */
public class DataResultValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("sqlId")
    private String sqlId;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    private DataResultValue(Builder builder) {
        this.sqlId = builder.sqlId;
        this.instanceId = builder.instanceId;
        this.count = builder.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataResultValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    public static final class Builder {
        private String sqlId; 
        private String instanceId; 
        private Integer count; 

        private Builder() {
        } 

        private Builder(DataResultValue model) {
            this.sqlId = model.sqlId;
            this.instanceId = model.instanceId;
            this.count = model.count;
        } 

        /**
         * sqlId.
         */
        public Builder sqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        public DataResultValue build() {
            return new DataResultValue(this);
        } 

    } 

}
