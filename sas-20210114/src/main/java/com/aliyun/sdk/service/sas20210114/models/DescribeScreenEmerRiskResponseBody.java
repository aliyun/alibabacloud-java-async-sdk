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
 * {@link DescribeScreenEmerRiskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScreenEmerRiskResponseBody</p>
 */
public class DescribeScreenEmerRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudHcRiskItems")
    private java.util.List<CloudHcRiskItems> cloudHcRiskItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeScreenEmerRiskResponseBody(Builder builder) {
        this.cloudHcRiskItems = builder.cloudHcRiskItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScreenEmerRiskResponseBody create() {
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

        private Builder(DescribeScreenEmerRiskResponseBody model) {
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

        public DescribeScreenEmerRiskResponseBody build() {
            return new DescribeScreenEmerRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScreenEmerRiskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScreenEmerRiskResponseBody</p>
     */
    public static class CloudHcRiskItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectCount")
        private Integer affectCount;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("VulName")
        private String vulName;

        private CloudHcRiskItems(Builder builder) {
            this.affectCount = builder.affectCount;
            this.level = builder.level;
            this.vulName = builder.vulName;
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
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return vulName
         */
        public String getVulName() {
            return this.vulName;
        }

        public static final class Builder {
            private Integer affectCount; 
            private String level; 
            private String vulName; 

            private Builder() {
            } 

            private Builder(CloudHcRiskItems model) {
                this.affectCount = model.affectCount;
                this.level = model.level;
                this.vulName = model.vulName;
            } 

            /**
             * AffectCount.
             */
            public Builder affectCount(Integer affectCount) {
                this.affectCount = affectCount;
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
             * VulName.
             */
            public Builder vulName(String vulName) {
                this.vulName = vulName;
                return this;
            }

            public CloudHcRiskItems build() {
                return new CloudHcRiskItems(this);
            } 

        } 

    }
}
