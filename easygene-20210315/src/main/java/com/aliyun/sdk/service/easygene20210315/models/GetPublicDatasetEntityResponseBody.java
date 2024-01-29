// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPublicDatasetEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetPublicDatasetEntityResponseBody</p>
 */
public class GetPublicDatasetEntityResponseBody extends TeaModel {
    @NameInMap("Attributes")
    private java.util.List < String > attributes;

    @NameInMap("DatasetName")
    private String datasetName;

    @NameInMap("EntityType")
    private String entityType;

    @NameInMap("HostId")
    private String hostId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetPublicDatasetEntityResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.datasetName = builder.datasetName;
        this.entityType = builder.entityType;
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublicDatasetEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.List < String > getAttributes() {
        return this.attributes;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > attributes; 
        private String datasetName; 
        private String entityType; 
        private String hostId; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Attributes.
         */
        public Builder attributes(java.util.List < String > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetPublicDatasetEntityResponseBody build() {
            return new GetPublicDatasetEntityResponseBody(this);
        } 

    } 

}
