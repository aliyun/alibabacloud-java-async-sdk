// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDictInformationRequest} extends {@link RequestModel}
 *
 * <p>ListDictInformationRequest</p>
 */
public class ListDictInformationRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("analyzerType")
    private String analyzerType;

    @Query
    @NameInMap("bucketName")
    @Validation(required = true)
    private String bucketName;

    @Query
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    private ListDictInformationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.analyzerType = builder.analyzerType;
        this.bucketName = builder.bucketName;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDictInformationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return analyzerType
     */
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<ListDictInformationRequest, Builder> {
        private String instanceId; 
        private String analyzerType; 
        private String bucketName; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(ListDictInformationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.analyzerType = request.analyzerType;
            this.bucketName = request.bucketName;
            this.key = request.key;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * analyzerType.
         */
        public Builder analyzerType(String analyzerType) {
            this.putQueryParameter("analyzerType", analyzerType);
            this.analyzerType = analyzerType;
            return this;
        }

        /**
         * bucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("bucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * key.
         */
        public Builder key(String key) {
            this.putQueryParameter("key", key);
            this.key = key;
            return this;
        }

        @Override
        public ListDictInformationRequest build() {
            return new ListDictInformationRequest(this);
        } 

    } 

}
