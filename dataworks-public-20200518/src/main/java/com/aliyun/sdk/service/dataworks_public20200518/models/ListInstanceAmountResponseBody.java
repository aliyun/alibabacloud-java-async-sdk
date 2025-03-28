// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListInstanceAmountResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceAmountResponseBody</p>
 */
public class ListInstanceAmountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceCounts")
    private java.util.List<InstanceCounts> instanceCounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListInstanceAmountResponseBody(Builder builder) {
        this.instanceCounts = builder.instanceCounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceAmountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceCounts
     */
    public java.util.List<InstanceCounts> getInstanceCounts() {
        return this.instanceCounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceCounts> instanceCounts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstanceAmountResponseBody model) {
            this.instanceCounts = model.instanceCounts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The trend of the number of auto triggered node instances within the specified period of time.</p>
         */
        public Builder instanceCounts(java.util.List<InstanceCounts> instanceCounts) {
            this.instanceCounts = instanceCounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95279527adhfj****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstanceAmountResponseBody build() {
            return new ListInstanceAmountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceAmountResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceAmountResponseBody</p>
     */
    public static class InstanceCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        private InstanceCounts(Builder builder) {
            this.count = builder.count;
            this.date = builder.date;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceCounts create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        public static final class Builder {
            private Integer count; 
            private Long date; 

            private Builder() {
            } 

            private Builder(InstanceCounts model) {
                this.count = model.count;
                this.date = model.date;
            } 

            /**
             * <p>The number of auto triggered node instances.</p>
             * 
             * <strong>example:</strong>
             * <p>9527</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The data timestamp at which the number of auto triggered node instances was obtained. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1623772800000</p>
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            public InstanceCounts build() {
                return new InstanceCounts(this);
            } 

        } 

    }
}
