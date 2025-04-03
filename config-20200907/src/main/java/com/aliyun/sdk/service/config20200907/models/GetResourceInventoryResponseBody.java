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
 * {@link GetResourceInventoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceInventoryResponseBody</p>
 */
public class GetResourceInventoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceInventory")
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
     * @return resourceInventory
     */
    public ResourceInventory getResourceInventory() {
        return this.resourceInventory;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceInventory resourceInventory; 

        private Builder() {
        } 

        private Builder(GetResourceInventoryResponseBody model) {
            this.requestId = model.requestId;
            this.resourceInventory = model.resourceInventory;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89E2F38F-4EE4-545A-BD56-92E007ECFEE9</p>
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

        public GetResourceInventoryResponseBody build() {
            return new GetResourceInventoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceInventoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceInventoryResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ResourceInventory model) {
                this.downloadUrl = model.downloadUrl;
                this.resourceInventoryGenerateTime = model.resourceInventoryGenerateTime;
                this.status = model.status;
            } 

            /**
             * <p>The download URL of the resource inventory.</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The time when the resource inventory was generated. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1687674634220</p>
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
