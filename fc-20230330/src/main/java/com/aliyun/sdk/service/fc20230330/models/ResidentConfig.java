// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ResidentConfig} extends {@link TeaModel}
 *
 * <p>ResidentConfig</p>
 */
public class ResidentConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("poolId")
    private String poolId;

    private ResidentConfig(Builder builder) {
        this.count = builder.count;
        this.poolId = builder.poolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResidentConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return poolId
     */
    public String getPoolId() {
        return this.poolId;
    }

    public static final class Builder {
        private Long count; 
        private String poolId; 

        private Builder() {
        } 

        private Builder(ResidentConfig model) {
            this.count = model.count;
            this.poolId = model.poolId;
        } 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * poolId.
         */
        public Builder poolId(String poolId) {
            this.poolId = poolId;
            return this;
        }

        public ResidentConfig build() {
            return new ResidentConfig(this);
        } 

    } 

}
