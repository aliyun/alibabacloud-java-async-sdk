// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link AliyunConsoleServiceInfoDTO} extends {@link TeaModel}
 *
 * <p>AliyunConsoleServiceInfoDTO</p>
 */
public class AliyunConsoleServiceInfoDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buyUrl")
    private String buyUrl;

    @com.aliyun.core.annotation.NameInMap("documentUrl")
    private String documentUrl;

    @com.aliyun.core.annotation.NameInMap("freeConcurrencyCount")
    private Integer freeConcurrencyCount;

    @com.aliyun.core.annotation.NameInMap("freeCount")
    private Integer freeCount;

    @com.aliyun.core.annotation.NameInMap("serviceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    private AliyunConsoleServiceInfoDTO(Builder builder) {
        this.buyUrl = builder.buyUrl;
        this.documentUrl = builder.documentUrl;
        this.freeConcurrencyCount = builder.freeConcurrencyCount;
        this.freeCount = builder.freeCount;
        this.serviceCode = builder.serviceCode;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AliyunConsoleServiceInfoDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buyUrl
     */
    public String getBuyUrl() {
        return this.buyUrl;
    }

    /**
     * @return documentUrl
     */
    public String getDocumentUrl() {
        return this.documentUrl;
    }

    /**
     * @return freeConcurrencyCount
     */
    public Integer getFreeConcurrencyCount() {
        return this.freeConcurrencyCount;
    }

    /**
     * @return freeCount
     */
    public Integer getFreeCount() {
        return this.freeCount;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder {
        private String buyUrl; 
        private String documentUrl; 
        private Integer freeConcurrencyCount; 
        private Integer freeCount; 
        private String serviceCode; 
        private String serviceName; 

        private Builder() {
        } 

        private Builder(AliyunConsoleServiceInfoDTO model) {
            this.buyUrl = model.buyUrl;
            this.documentUrl = model.documentUrl;
            this.freeConcurrencyCount = model.freeConcurrencyCount;
            this.freeCount = model.freeCount;
            this.serviceCode = model.serviceCode;
            this.serviceName = model.serviceName;
        } 

        /**
         * buyUrl.
         */
        public Builder buyUrl(String buyUrl) {
            this.buyUrl = buyUrl;
            return this;
        }

        /**
         * documentUrl.
         */
        public Builder documentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }

        /**
         * freeConcurrencyCount.
         */
        public Builder freeConcurrencyCount(Integer freeConcurrencyCount) {
            this.freeConcurrencyCount = freeConcurrencyCount;
            return this;
        }

        /**
         * freeCount.
         */
        public Builder freeCount(Integer freeCount) {
            this.freeCount = freeCount;
            return this;
        }

        /**
         * serviceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public AliyunConsoleServiceInfoDTO build() {
            return new AliyunConsoleServiceInfoDTO(this);
        } 

    } 

}
