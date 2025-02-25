// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDictInformationRequest} extends {@link RequestModel}
 *
 * <p>ListDictInformationRequest</p>
 */
public class ListDictInformationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("analyzerType")
    private String analyzerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("key")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>search-cloud-test-cn-****</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("bucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss/dic_0.dic</p>
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
