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
 * {@link DataSessionStatDbStatsValue} extends {@link TeaModel}
 *
 * <p>DataSessionStatDbStatsValue</p>
 */
public class DataSessionStatDbStatsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActiveCount")
    private Long activeCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DataSessionStatDbStatsValue(Builder builder) {
        this.activeCount = builder.activeCount;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSessionStatDbStatsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activeCount
     */
    public Long getActiveCount() {
        return this.activeCount;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long activeCount; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DataSessionStatDbStatsValue model) {
            this.activeCount = model.activeCount;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of active namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder activeCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }

        /**
         * <p>The total number of namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DataSessionStatDbStatsValue build() {
            return new DataSessionStatDbStatsValue(this);
        } 

    } 

}
