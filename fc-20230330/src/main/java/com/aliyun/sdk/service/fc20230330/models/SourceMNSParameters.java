// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link SourceMNSParameters} extends {@link TeaModel}
 *
 * <p>SourceMNSParameters</p>
 */
public class SourceMNSParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsBase64Decode")
    private Boolean isBase64Decode;

    @com.aliyun.core.annotation.NameInMap("QueueName")
    private String queueName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SourceMNSParameters(Builder builder) {
        this.isBase64Decode = builder.isBase64Decode;
        this.queueName = builder.queueName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceMNSParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isBase64Decode
     */
    public Boolean getIsBase64Decode() {
        return this.isBase64Decode;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder {
        private Boolean isBase64Decode; 
        private String queueName; 
        private String regionId; 

        private Builder() {
        } 

        private Builder(SourceMNSParameters model) {
            this.isBase64Decode = model.isBase64Decode;
            this.queueName = model.queueName;
            this.regionId = model.regionId;
        } 

        /**
         * IsBase64Decode.
         */
        public Builder isBase64Decode(Boolean isBase64Decode) {
            this.isBase64Decode = isBase64Decode;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public SourceMNSParameters build() {
            return new SourceMNSParameters(this);
        } 

    } 

}
