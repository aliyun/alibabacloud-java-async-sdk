// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CreateSampleApiRequest} extends {@link RequestModel}
 *
 * <p>CreateSampleApiRequest</p>
 */
public class CreateSampleApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataValue")
    private String dataValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleBatchType")
    private String sampleBatchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceList")
    private String serviceList;

    private CreateSampleApiRequest(Builder builder) {
        super(builder);
        this.dataType = builder.dataType;
        this.dataValue = builder.dataValue;
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sampleBatchType = builder.sampleBatchType;
        this.serviceList = builder.serviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleApiRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleBatchType
     */
    public String getSampleBatchType() {
        return this.sampleBatchType;
    }

    /**
     * @return serviceList
     */
    public String getServiceList() {
        return this.serviceList;
    }

    public static final class Builder extends Request.Builder<CreateSampleApiRequest, Builder> {
        private String dataType; 
        private String dataValue; 
        private String lang; 
        private String regId; 
        private String sampleBatchType; 
        private String serviceList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSampleApiRequest request) {
            super(request);
            this.dataType = request.dataType;
            this.dataValue = request.dataValue;
            this.lang = request.lang;
            this.regId = request.regId;
            this.sampleBatchType = request.sampleBatchType;
            this.serviceList = request.serviceList;
        } 

        /**
         * <p>Same as input parameter</p>
         * 
         * <strong>example:</strong>
         * <p>ip/accountID</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Specific data value</p>
         * 
         * <strong>example:</strong>
         * <p>同参数</p>
         */
        public Builder dataValue(String dataValue) {
            this.putQueryParameter("DataValue", dataValue);
            this.dataValue = dataValue;
            return this;
        }

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>regionId</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Sample batch type</p>
         * 
         * <strong>example:</strong>
         * <p>白名单/黑名单/混合</p>
         */
        public Builder sampleBatchType(String sampleBatchType) {
            this.putQueryParameter("SampleBatchType", sampleBatchType);
            this.sampleBatchType = sampleBatchType;
            return this;
        }

        /**
         * <p>Service list.</p>
         * 
         * <strong>example:</strong>
         * <p>同参数</p>
         */
        public Builder serviceList(String serviceList) {
            this.putQueryParameter("ServiceList", serviceList);
            this.serviceList = serviceList;
            return this;
        }

        @Override
        public CreateSampleApiRequest build() {
            return new CreateSampleApiRequest(this);
        } 

    } 

}
