// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link CreateAnswerLibRequest} extends {@link RequestModel}
 *
 * <p>CreateAnswerLibRequest</p>
 */
public class CreateAnswerLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibName")
    private String libName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleBucket")
    private String sampleBucket;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SampleObject")
    private String sampleObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Samples")
    private String samples;

    private CreateAnswerLibRequest(Builder builder) {
        super(builder);
        this.libName = builder.libName;
        this.regionId = builder.regionId;
        this.sampleBucket = builder.sampleBucket;
        this.sampleObject = builder.sampleObject;
        this.samples = builder.samples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnswerLibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libName
     */
    public String getLibName() {
        return this.libName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sampleBucket
     */
    public String getSampleBucket() {
        return this.sampleBucket;
    }

    /**
     * @return sampleObject
     */
    public String getSampleObject() {
        return this.sampleObject;
    }

    /**
     * @return samples
     */
    public String getSamples() {
        return this.samples;
    }

    public static final class Builder extends Request.Builder<CreateAnswerLibRequest, Builder> {
        private String libName; 
        private String regionId; 
        private String sampleBucket; 
        private String sampleObject; 
        private String samples; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnswerLibRequest request) {
            super(request);
            this.libName = request.libName;
            this.regionId = request.regionId;
            this.sampleBucket = request.sampleBucket;
            this.sampleObject = request.sampleObject;
            this.samples = request.samples;
        } 

        /**
         * <p>The name of the proxy answer library.</p>
         * 
         * <strong>example:</strong>
         * <p>测试代答库</p>
         */
        public Builder libName(String libName) {
            this.putBodyParameter("LibName", libName);
            this.libName = libName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the storage space.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cip-shanghai</p>
         */
        public Builder sampleBucket(String sampleBucket) {
            this.putBodyParameter("SampleBucket", sampleBucket);
            this.sampleBucket = sampleBucket;
            return this;
        }

        /**
         * <p>The file name of the proxy answer sample to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>data/xxx.xlsx</p>
         */
        public Builder sampleObject(String sampleObject) {
            this.putBodyParameter("SampleObject", sampleObject);
            this.sampleObject = sampleObject;
            return this;
        }

        /**
         * <p>The samples to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>代答答案1\n代答答案2</p>
         */
        public Builder samples(String samples) {
            this.putBodyParameter("Samples", samples);
            this.samples = samples;
            return this;
        }

        @Override
        public CreateAnswerLibRequest build() {
            return new CreateAnswerLibRequest(this);
        } 

    } 

}
