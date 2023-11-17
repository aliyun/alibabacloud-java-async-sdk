// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSessionStatDbStatsValue} extends {@link TeaModel}
 *
 * <p>DataSessionStatDbStatsValue</p>
 */
public class DataSessionStatDbStatsValue extends TeaModel {
    @NameInMap("ActiveCount")
    private Long activeCount;

    @NameInMap("TotalCount")
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

        /**
         * The number of active namespaces.
         */
        public Builder activeCount(Long activeCount) {
            this.activeCount = activeCount;
            return this;
        }

        /**
         * The total number of namespaces.
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
