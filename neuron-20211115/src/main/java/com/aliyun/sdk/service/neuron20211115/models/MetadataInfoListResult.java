// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MetadataInfoListResult} extends {@link TeaModel}
 *
 * <p>MetadataInfoListResult</p>
 */
public class MetadataInfoListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("metadataInfos")
    private java.util.List<MetadataInfo> metadataInfos;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private MetadataInfoListResult(Builder builder) {
        this.metadataInfos = builder.metadataInfos;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetadataInfoListResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metadataInfos
     */
    public java.util.List<MetadataInfo> getMetadataInfos() {
        return this.metadataInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MetadataInfo> metadataInfos; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(MetadataInfoListResult model) {
            this.metadataInfos = model.metadataInfos;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * metadataInfos.
         */
        public Builder metadataInfos(java.util.List<MetadataInfo> metadataInfos) {
            this.metadataInfos = metadataInfos;
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
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public MetadataInfoListResult build() {
            return new MetadataInfoListResult(this);
        } 

    } 

}
