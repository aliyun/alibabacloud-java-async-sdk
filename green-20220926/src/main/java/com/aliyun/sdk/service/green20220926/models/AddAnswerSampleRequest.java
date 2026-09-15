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
 * {@link AddAnswerSampleRequest} extends {@link RequestModel}
 *
 * <p>AddAnswerSampleRequest</p>
 */
public class AddAnswerSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleObject")
    private String sampleObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Samples")
    private String samples;

    private AddAnswerSampleRequest(Builder builder) {
        super(builder);
        this.libId = builder.libId;
        this.regionId = builder.regionId;
        this.sampleObject = builder.sampleObject;
        this.samples = builder.samples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAnswerSampleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<AddAnswerSampleRequest, Builder> {
        private String libId; 
        private String regionId; 
        private String sampleObject; 
        private String samples; 

        private Builder() {
            super();
        } 

        private Builder(AddAnswerSampleRequest request) {
            super(request);
            this.libId = request.libId;
            this.regionId = request.regionId;
            this.sampleObject = request.sampleObject;
            this.samples = request.samples;
        } 

        /**
         * <p>The ID of the proxy answer library.</p>
         * 
         * <strong>example:</strong>
         * <p>alxxxx</p>
         */
        public Builder libId(String libId) {
            this.putQueryParameter("LibId", libId);
            this.libId = libId;
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
         * <p>The file name of the proxy answer sample to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>data/xxx.xlsx</p>
         */
        public Builder sampleObject(String sampleObject) {
            this.putQueryParameter("SampleObject", sampleObject);
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
            this.putQueryParameter("Samples", samples);
            this.samples = samples;
            return this;
        }

        @Override
        public AddAnswerSampleRequest build() {
            return new AddAnswerSampleRequest(this);
        } 

    } 

}
