// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDDoSOverseasAttackCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSOverseasAttackCountResponseBody</p>
 */
public class DescribeDDoSOverseasAttackCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UsedCount")
    private Integer usedCount;

    private DescribeDDoSOverseasAttackCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.usedCount = builder.usedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSOverseasAttackCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return usedCount
     */
    public Integer getUsedCount() {
        return this.usedCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private Integer usedCount; 

        private Builder() {
        } 

        private Builder(DescribeDDoSOverseasAttackCountResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.usedCount = model.usedCount;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EBCECE18-DA96-5307-8506-01E5A0E21530</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UsedCount.
         */
        public Builder usedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }

        public DescribeDDoSOverseasAttackCountResponseBody build() {
            return new DescribeDDoSOverseasAttackCountResponseBody(this);
        } 

    } 

}
