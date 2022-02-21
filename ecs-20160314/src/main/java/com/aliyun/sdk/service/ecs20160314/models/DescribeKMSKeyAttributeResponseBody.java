// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKMSKeyAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKMSKeyAttributeResponseBody</p>
 */
public class DescribeKMSKeyAttributeResponseBody extends TeaModel {
    @NameInMap("Alias")
    private String alias;

    @NameInMap("Creator")
    private String creator;

    @NameInMap("EcsTagged")
    private Boolean ecsTagged;

    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeKMSKeyAttributeResponseBody(Builder builder) {
        this.alias = builder.alias;
        this.creator = builder.creator;
        this.ecsTagged = builder.ecsTagged;
        this.KMSKeyId = builder.KMSKeyId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKMSKeyAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return ecsTagged
     */
    public Boolean getEcsTagged() {
        return this.ecsTagged;
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String alias; 
        private String creator; 
        private Boolean ecsTagged; 
        private String KMSKeyId; 
        private String requestId; 
        private String status; 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * EcsTagged.
         */
        public Builder ecsTagged(Boolean ecsTagged) {
            this.ecsTagged = ecsTagged;
            return this;
        }

        /**
         * KMSKeyId.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeKMSKeyAttributeResponseBody build() {
            return new DescribeKMSKeyAttributeResponseBody(this);
        } 

    } 

}
