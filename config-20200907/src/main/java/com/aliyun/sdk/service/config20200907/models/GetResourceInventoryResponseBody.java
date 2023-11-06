// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceInventoryResponseBody</p>
 */
public class GetResourceInventoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceInventory")
    private ResourceInventory resourceInventory;

    private GetResourceInventoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceInventory = builder.resourceInventory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceInventoryResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the resource inventory.
         */
        public Builder resourceInventory(ResourceInventory resourceInventory) {
            this.resourceInventory = resourceInventory;
            return this;
        }

        public GetResourceInventoryResponseBody build() {
            return new GetResourceInventoryResponseBody(this);
        } 

    } 

    public static class ResourceInventory extends TeaModel {
        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ResourceInventoryGenerateTime")
        private Long resourceInventoryGenerateTime;

        @NameInMap("Status")
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
             * The download URL of the resource inventory.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The time when the resource inventory was generated. The value is a timestamp.
             */
            public Builder resourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
                this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
                return this;
            }

            /**
             * The generation status of the resource inventory. Valid values:
             * <p>
             * 
             * *   CREATING: The resource inventory is being generated.
             * *   COMPLETE: The resource inventory is generated.
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
