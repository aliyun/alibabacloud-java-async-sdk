// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssBucketInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssBucketInfoResponseBody</p>
 */
public class DescribeOssBucketInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsArchive")
    private Boolean isArchive;

    @NameInMap("IsBackToResource")
    private Boolean isBackToResource;

    @NameInMap("IsColdArchive")
    private Boolean isColdArchive;

    @NameInMap("IsFresh")
    private Boolean isFresh;

    @NameInMap("IsSupportServerSideEncryption")
    private Boolean isSupportServerSideEncryption;

    @NameInMap("IsVersioning")
    private Boolean isVersioning;

    @NameInMap("Message")
    private String message;

    @NameInMap("PollingInterval")
    private Integer pollingInterval;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageSize")
    private Long storageSize;

    @NameInMap("Success")
    private Boolean success;

    private DescribeOssBucketInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.isArchive = builder.isArchive;
        this.isBackToResource = builder.isBackToResource;
        this.isColdArchive = builder.isColdArchive;
        this.isFresh = builder.isFresh;
        this.isSupportServerSideEncryption = builder.isSupportServerSideEncryption;
        this.isVersioning = builder.isVersioning;
        this.message = builder.message;
        this.pollingInterval = builder.pollingInterval;
        this.requestId = builder.requestId;
        this.storageSize = builder.storageSize;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssBucketInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isArchive
     */
    public Boolean getIsArchive() {
        return this.isArchive;
    }

    /**
     * @return isBackToResource
     */
    public Boolean getIsBackToResource() {
        return this.isBackToResource;
    }

    /**
     * @return isColdArchive
     */
    public Boolean getIsColdArchive() {
        return this.isColdArchive;
    }

    /**
     * @return isFresh
     */
    public Boolean getIsFresh() {
        return this.isFresh;
    }

    /**
     * @return isSupportServerSideEncryption
     */
    public Boolean getIsSupportServerSideEncryption() {
        return this.isSupportServerSideEncryption;
    }

    /**
     * @return isVersioning
     */
    public Boolean getIsVersioning() {
        return this.isVersioning;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pollingInterval
     */
    public Integer getPollingInterval() {
        return this.pollingInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Boolean isArchive; 
        private Boolean isBackToResource; 
        private Boolean isColdArchive; 
        private Boolean isFresh; 
        private Boolean isSupportServerSideEncryption; 
        private Boolean isVersioning; 
        private String message; 
        private Integer pollingInterval; 
        private String requestId; 
        private Long storageSize; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsArchive.
         */
        public Builder isArchive(Boolean isArchive) {
            this.isArchive = isArchive;
            return this;
        }

        /**
         * IsBackToResource.
         */
        public Builder isBackToResource(Boolean isBackToResource) {
            this.isBackToResource = isBackToResource;
            return this;
        }

        /**
         * IsColdArchive.
         */
        public Builder isColdArchive(Boolean isColdArchive) {
            this.isColdArchive = isColdArchive;
            return this;
        }

        /**
         * IsFresh.
         */
        public Builder isFresh(Boolean isFresh) {
            this.isFresh = isFresh;
            return this;
        }

        /**
         * IsSupportServerSideEncryption.
         */
        public Builder isSupportServerSideEncryption(Boolean isSupportServerSideEncryption) {
            this.isSupportServerSideEncryption = isSupportServerSideEncryption;
            return this;
        }

        /**
         * IsVersioning.
         */
        public Builder isVersioning(Boolean isVersioning) {
            this.isVersioning = isVersioning;
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
         * PollingInterval.
         */
        public Builder pollingInterval(Integer pollingInterval) {
            this.pollingInterval = pollingInterval;
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
         * StorageSize.
         */
        public Builder storageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeOssBucketInfoResponseBody build() {
            return new DescribeOssBucketInfoResponseBody(this);
        } 

    } 

}
