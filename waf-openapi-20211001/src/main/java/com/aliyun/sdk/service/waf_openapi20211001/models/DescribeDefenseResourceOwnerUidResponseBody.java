// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseResourceOwnerUidResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseResourceOwnerUidResponseBody</p>
 */
public class DescribeDefenseResourceOwnerUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OwnerInfos")
    private java.util.List<OwnerInfos> ownerInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDefenseResourceOwnerUidResponseBody(Builder builder) {
        this.ownerInfos = builder.ownerInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseResourceOwnerUidResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerInfos
     */
    public java.util.List<OwnerInfos> getOwnerInfos() {
        return this.ownerInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OwnerInfos> ownerInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDefenseResourceOwnerUidResponseBody model) {
            this.ownerInfos = model.ownerInfos;
            this.requestId = model.requestId;
        } 

        /**
         * OwnerInfos.
         */
        public Builder ownerInfos(java.util.List<OwnerInfos> ownerInfos) {
            this.ownerInfos = ownerInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefenseResourceOwnerUidResponseBody build() {
            return new DescribeDefenseResourceOwnerUidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseResourceOwnerUidResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseResourceOwnerUidResponseBody</p>
     */
    public static class OwnerInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        private OwnerInfos(Builder builder) {
            this.ownerUserId = builder.ownerUserId;
            this.resourceName = builder.resourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerInfos create() {
            return builder().build();
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        public static final class Builder {
            private String ownerUserId; 
            private String resourceName; 

            private Builder() {
            } 

            private Builder(OwnerInfos model) {
                this.ownerUserId = model.ownerUserId;
                this.resourceName = model.resourceName;
            } 

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            public OwnerInfos build() {
                return new OwnerInfos(this);
            } 

        } 

    }
}
