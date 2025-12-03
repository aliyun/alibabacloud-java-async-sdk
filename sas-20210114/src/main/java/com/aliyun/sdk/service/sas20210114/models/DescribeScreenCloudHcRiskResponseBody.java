// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20210114.models;

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
 * {@link DescribeScreenCloudHcRiskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenCloudHcRiskResponseBody</p>
 */
public class DescribeScreenCloudHcRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudHcRiskItems")
    private java.util.List<CloudHcRiskItems> cloudHcRiskItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeScreenCloudHcRiskResponseBody(Builder builder) {
        this.cloudHcRiskItems = builder.cloudHcRiskItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenCloudHcRiskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudHcRiskItems
     */
    public java.util.List<CloudHcRiskItems> getCloudHcRiskItems() {
        return this.cloudHcRiskItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CloudHcRiskItems> cloudHcRiskItems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeScreenCloudHcRiskResponseBody model) {
            this.cloudHcRiskItems = model.cloudHcRiskItems;
            this.requestId = model.requestId;
        } 

        /**
         * CloudHcRiskItems.
         */
        public Builder cloudHcRiskItems(java.util.List<CloudHcRiskItems> cloudHcRiskItems) {
            this.cloudHcRiskItems = cloudHcRiskItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScreenCloudHcRiskResponseBody build() {
            return new DescribeScreenCloudHcRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScreenCloudHcRiskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenCloudHcRiskResponseBody</p>
     */
    public static class CloudHcRiskItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectCount")
        private Integer affectCount;

        @com.aliyun.core.annotation.NameInMap("CheckItem")
        private String checkItem;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Pass")
        private Boolean pass;

        private CloudHcRiskItems(Builder builder) {
            this.affectCount = builder.affectCount;
            this.checkItem = builder.checkItem;
            this.level = builder.level;
            this.pass = builder.pass;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudHcRiskItems create() {
            return builder().build();
        }

        /**
         * @return affectCount
         */
        public Integer getAffectCount() {
            return this.affectCount;
        }

        /**
         * @return checkItem
         */
        public String getCheckItem() {
            return this.checkItem;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return pass
         */
        public Boolean getPass() {
            return this.pass;
        }

        public static final class Builder {
            private Integer affectCount; 
            private String checkItem; 
            private String level; 
            private Boolean pass; 

            private Builder() {
            } 

            private Builder(CloudHcRiskItems model) {
                this.affectCount = model.affectCount;
                this.checkItem = model.checkItem;
                this.level = model.level;
                this.pass = model.pass;
            } 

            /**
             * AffectCount.
             */
            public Builder affectCount(Integer affectCount) {
                this.affectCount = affectCount;
                return this;
            }

            /**
             * CheckItem.
             */
            public Builder checkItem(String checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * Pass.
             */
            public Builder pass(Boolean pass) {
                this.pass = pass;
                return this;
            }

            public CloudHcRiskItems build() {
                return new CloudHcRiskItems(this);
            } 

        } 

    }
}
