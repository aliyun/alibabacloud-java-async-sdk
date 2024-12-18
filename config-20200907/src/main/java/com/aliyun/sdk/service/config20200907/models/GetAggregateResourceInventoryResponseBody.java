// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateResourceInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateResourceInventoryResponseBody</p>
 */
public class GetAggregateResourceInventoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceInventory")
    private ResourceInventory resourceInventory;

    private GetAggregateResourceInventoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceInventory = builder.resourceInventory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceInventoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceInventory
     */
    public ResourceInventory getResourceInventory() {
        return this.resourceInventory;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceInventory resourceInventory; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A6D3604-EF1A-5798-A576-2A5FB855493C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource inventory.</p>
         */
        public Builder resourceInventory(ResourceInventory resourceInventory) {
            this.resourceInventory = resourceInventory;
            return this;
        }

        public GetAggregateResourceInventoryResponseBody build() {
            return new GetAggregateResourceInventoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateResourceInventoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateResourceInventoryResponseBody</p>
     */
    public static class ResourceInventory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ResourceInventoryGenerateTime")
        private Long resourceInventoryGenerateTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceInventory(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.resourceInventoryGenerateTime = builder.resourceInventoryGenerateTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInventory create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return resourceInventoryGenerateTime
         */
        public Long getResourceInventoryGenerateTime() {
            return this.resourceInventoryGenerateTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long resourceInventoryGenerateTime; 
            private String status; 

            /**
             * <p>The download URL of the resource inventory.</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The time when the resource inventory was generated. The value is a timestamp.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687674774123</p>
             */
            public Builder resourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
                this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
                return this;
            }

            /**
             * <p>The generation status of the resource inventory. Valid values:</p>
             * <ul>
             * <li>CREATING: The resource inventory is being generated.</li>
             * <li>COMPLETE: The resource inventory is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceInventory build() {
                return new ResourceInventory(this);
            } 

        } 

    }
}
