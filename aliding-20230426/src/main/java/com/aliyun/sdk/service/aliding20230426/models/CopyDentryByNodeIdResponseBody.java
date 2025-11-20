// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CopyDentryByNodeIdResponseBody} extends {@link TeaModel}
 *
 * <p>CopyDentryByNodeIdResponseBody</p>
 */
public class CopyDentryByNodeIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("dentryUuid")
    private String dentryUuid;

    @com.aliyun.core.annotation.NameInMap("extension")
    private String extension;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("spaceId")
    private String spaceId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private CopyDentryByNodeIdResponseBody(Builder builder) {
        this.contentType = builder.contentType;
        this.createdTime = builder.createdTime;
        this.dentryUuid = builder.dentryUuid;
        this.extension = builder.extension;
        this.requestId = builder.requestId;
        this.spaceId = builder.spaceId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDentryByNodeIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return dentryUuid
     */
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String contentType; 
        private Long createdTime; 
        private String dentryUuid; 
        private String extension; 
        private String requestId; 
        private String spaceId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(CopyDentryByNodeIdResponseBody model) {
            this.contentType = model.contentType;
            this.createdTime = model.createdTime;
            this.dentryUuid = model.dentryUuid;
            this.extension = model.extension;
            this.requestId = model.requestId;
            this.spaceId = model.spaceId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * contentType.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * createdTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * dentryUuid.
         */
        public Builder dentryUuid(String dentryUuid) {
            this.dentryUuid = dentryUuid;
            return this;
        }

        /**
         * extension.
         */
        public Builder extension(String extension) {
            this.extension = extension;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * spaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public CopyDentryByNodeIdResponseBody build() {
            return new CopyDentryByNodeIdResponseBody(this);
        } 

    } 

}
