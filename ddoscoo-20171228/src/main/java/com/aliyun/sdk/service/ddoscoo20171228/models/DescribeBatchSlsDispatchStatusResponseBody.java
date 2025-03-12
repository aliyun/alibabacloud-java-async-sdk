// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeBatchSlsDispatchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBatchSlsDispatchStatusResponseBody</p>
 */
public class DescribeBatchSlsDispatchStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlsConfigStatusList")
    private java.util.List<SlsConfigStatusList> slsConfigStatusList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBatchSlsDispatchStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsConfigStatusList = builder.slsConfigStatusList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchSlsDispatchStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsConfigStatusList
     */
    public java.util.List<SlsConfigStatusList> getSlsConfigStatusList() {
        return this.slsConfigStatusList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SlsConfigStatusList> slsConfigStatusList; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsConfigStatusList.
         */
        public Builder slsConfigStatusList(java.util.List<SlsConfigStatusList> slsConfigStatusList) {
            this.slsConfigStatusList = slsConfigStatusList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBatchSlsDispatchStatusResponseBody build() {
            return new DescribeBatchSlsDispatchStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBatchSlsDispatchStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchSlsDispatchStatusResponseBody</p>
     */
    public static class SlsConfigStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private SlsConfigStatusList(Builder builder) {
            this.domain = builder.domain;
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlsConfigStatusList create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String domain; 
            private Boolean enable; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public SlsConfigStatusList build() {
                return new SlsConfigStatusList(this);
            } 

        } 

    }
}
