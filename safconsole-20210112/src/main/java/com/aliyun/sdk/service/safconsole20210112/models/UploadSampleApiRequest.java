// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20210112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadSampleApiRequest} extends {@link RequestModel}
 *
 * <p>UploadSampleApiRequest</p>
 */
public class UploadSampleApiRequest extends Request {
    @Query
    @NameInMap("DataType")
    @Validation(required = true)
    private String dataType;

    @Query
    @NameInMap("DataValue")
    @Validation(required = true)
    private String dataValue;

    @Query
    @NameInMap("SampleType")
    @Validation(required = true)
    private String sampleType;

    @Query
    @NameInMap("Service")
    @Validation(required = true)
    private String service;

    private UploadSampleApiRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.dataValue = builder.dataValue;
        this.sampleType = builder.sampleType;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadSampleApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return dataValue
     */
    public String getDataValue() {
        return this.dataValue;
    }

    /**
     * @return sampleType
     */
    public String getSampleType() {
        return this.sampleType;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<UploadSampleApiRequest, Builder> {
        private String dataType; 
        private String dataValue; 
        private String sampleType; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(UploadSampleApiRequest request) {
            super(request);
            this.dataType = request.dataType;
            this.dataValue = request.dataValue;
            this.sampleType = request.sampleType;
            this.service = request.service;
        } 

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * DataValue.
         */
        public Builder dataValue(String dataValue) {
            this.putQueryParameter("DataValue", dataValue);
            this.dataValue = dataValue;
            return this;
        }

        /**
         * SampleType.
         */
        public Builder sampleType(String sampleType) {
            this.putQueryParameter("SampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        @Override
        public UploadSampleApiRequest build() {
            return new UploadSampleApiRequest(this);
        } 

    } 

}
