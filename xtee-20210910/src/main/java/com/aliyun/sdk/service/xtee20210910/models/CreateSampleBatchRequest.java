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
 * {@link CreateSampleBatchRequest} extends {@link RequestModel}
 *
 * <p>CreateSampleBatchRequest</p>
 */
public class CreateSampleBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchName")
    private String batchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataValue")
    private String dataValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ossFileName")
    private String ossFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleBatchType")
    private String sampleBatchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceList")
    private String serviceList;

    private CreateSampleBatchRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.batchName = builder.batchName;
        this.dataType = builder.dataType;
        this.dataValue = builder.dataValue;
        this.description = builder.description;
        this.ossFileName = builder.ossFileName;
        this.regId = builder.regId;
        this.sampleBatchType = builder.sampleBatchType;
        this.serviceList = builder.serviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSampleBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return batchName
     */
    public String getBatchName() {
        return this.batchName;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ossFileName
     */
    public String getOssFileName() {
        return this.ossFileName;
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

    public static final class Builder extends Request.Builder<CreateSampleBatchRequest, Builder> {
        private String lang; 
        private String batchName; 
        private String dataType; 
        private String dataValue; 
        private String description; 
        private String ossFileName; 
        private String regId; 
        private String sampleBatchType; 
        private String serviceList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSampleBatchRequest request) {
            super(request);
            this.lang = request.lang;
            this.batchName = request.batchName;
            this.dataType = request.dataType;
            this.dataValue = request.dataValue;
            this.description = request.description;
            this.ossFileName = request.ossFileName;
            this.regId = request.regId;
            this.sampleBatchType = request.sampleBatchType;
            this.serviceList = request.serviceList;
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
         * <p>Sample batch name</p>
         * 
         * <strong>example:</strong>
         * <p>白样本</p>
         */
        public Builder batchName(String batchName) {
            this.putQueryParameter("batchName", batchName);
            this.batchName = batchName;
            return this;
        }

        /**
         * <p>Data type</p>
         * 
         * <strong>example:</strong>
         * <p>mobile</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Content of the list entered in the text box</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000,1770000001</p>
         */
        public Builder dataValue(String dataValue) {
            this.putQueryParameter("dataValue", dataValue);
            this.dataValue = dataValue;
            return this;
        }

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Uploaded OSS address.</p>
         * 
         * <strong>example:</strong>
         * <p>sample/94b4193d321c44b44ee92b19984000a0/样本测试01/0d8dbc6809834d51b1d88a42295c803e/1753865835166.csv</p>
         */
        public Builder ossFileName(String ossFileName) {
            this.putQueryParameter("ossFileName", ossFileName);
            this.ossFileName = ossFileName;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Specific type of sample list</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        public Builder sampleBatchType(String sampleBatchType) {
            this.putQueryParameter("sampleBatchType", sampleBatchType);
            this.sampleBatchType = sampleBatchType;
            return this;
        }

        /**
         * <p>Service list</p>
         * 
         * <strong>example:</strong>
         * <p>account_takeover</p>
         */
        public Builder serviceList(String serviceList) {
            this.putQueryParameter("serviceList", serviceList);
            this.serviceList = serviceList;
            return this;
        }

        @Override
        public CreateSampleBatchRequest build() {
            return new CreateSampleBatchRequest(this);
        } 

    } 

}
