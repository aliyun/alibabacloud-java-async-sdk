// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpaceClientConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpaceClientConfigResponseBody</p>
 */
public class DescribeSpaceClientConfigResponseBody extends TeaModel {
    @NameInMap("ApiKey")
    private String apiKey;

    @NameInMap("Endpoint")
    private String endpoint;

    @NameInMap("FileUploadEndpoint")
    private String fileUploadEndpoint;

    @NameInMap("Name")
    private String name;

    @NameInMap("PrivateKey")
    private String privateKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceId")
    private String spaceId;

    private DescribeSpaceClientConfigResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.endpoint = builder.endpoint;
        this.fileUploadEndpoint = builder.fileUploadEndpoint;
        this.name = builder.name;
        this.privateKey = builder.privateKey;
        this.requestId = builder.requestId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpaceClientConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return fileUploadEndpoint
     */
    public String getFileUploadEndpoint() {
        return this.fileUploadEndpoint;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
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

    public static final class Builder {
        private String apiKey; 
        private String endpoint; 
        private String fileUploadEndpoint; 
        private String name; 
        private String privateKey; 
        private String requestId; 
        private String spaceId; 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * FileUploadEndpoint.
         */
        public Builder fileUploadEndpoint(String fileUploadEndpoint) {
            this.fileUploadEndpoint = fileUploadEndpoint;
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
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
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
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        public DescribeSpaceClientConfigResponseBody build() {
            return new DescribeSpaceClientConfigResponseBody(this);
        } 

    } 

}
