// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStreamSnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStreamSnapshotResponseBody</p>
 */
public class CreateStreamSnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Format")
    private String format;

    @com.aliyun.core.annotation.NameInMap("Height")
    private Long height;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("OssBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.NameInMap("OssEndpoint")
    private String ossEndpoint;

    @com.aliyun.core.annotation.NameInMap("OssObject")
    private String ossObject;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Long width;

    private CreateStreamSnapshotResponseBody(Builder builder) {
        this.format = builder.format;
        this.height = builder.height;
        this.id = builder.id;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossObject = builder.ossObject;
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
        this.url = builder.url;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamSnapshotResponseBody create() {
        return builder().build();
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ossObject
     */
    public String getOssObject() {
        return this.ossObject;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return width
     */
    public Long getWidth() {
        return this.width;
    }

    public static final class Builder {
        private String format; 
        private Long height; 
        private String id; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String ossObject; 
        private String requestId; 
        private Long timestamp; 
        private String url; 
        private Long width; 

        /**
         * Format.
         */
        public Builder format(String format) {
            this.format = format;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Long height) {
            this.height = height;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OssObject.
         */
        public Builder ossObject(String ossObject) {
            this.ossObject = ossObject;
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
         * Timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(Long width) {
            this.width = width;
            return this;
        }

        public CreateStreamSnapshotResponseBody build() {
            return new CreateStreamSnapshotResponseBody(this);
        } 

    } 

}
