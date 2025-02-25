// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageBundleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageBundleResponseBody</p>
 */
public class DescribeStorageBundleResponseBody extends TeaModel {
    @NameInMap("BackendBucketRegionId")
    private String backendBucketRegionId;

    @NameInMap("Code")
    private String code;

    @NameInMap("CreatedTime")
    private Long createdTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageBundleId")
    private String storageBundleId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeStorageBundleResponseBody(Builder builder) {
        this.backendBucketRegionId = builder.backendBucketRegionId;
        this.code = builder.code;
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.storageBundleId = builder.storageBundleId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageBundleResponseBody create() {
        return builder().build();
    }

    /**
     * @return backendBucketRegionId
     */
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageBundleId
     */
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String backendBucketRegionId; 
        private String code; 
        private Long createdTime; 
        private String description; 
        private String message; 
        private String name; 
        private String requestId; 
        private String storageBundleId; 
        private Boolean success; 

        /**
         * BackendBucketRegionId.
         */
        public Builder backendBucketRegionId(String backendBucketRegionId) {
            this.backendBucketRegionId = backendBucketRegionId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreatedTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageBundleId.
         */
        public Builder storageBundleId(String storageBundleId) {
            this.storageBundleId = storageBundleId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeStorageBundleResponseBody build() {
            return new DescribeStorageBundleResponseBody(this);
        } 

    } 

}
