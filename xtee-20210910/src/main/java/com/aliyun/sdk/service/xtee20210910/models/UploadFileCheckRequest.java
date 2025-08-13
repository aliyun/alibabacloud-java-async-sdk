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
 * {@link UploadFileCheckRequest} extends {@link RequestModel}
 *
 * <p>UploadFileCheckRequest</p>
 */
public class UploadFileCheckRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ossFileName")
    private String ossFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleTagType")
    private String sampleTagType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceList")
    private String serviceList;

    private UploadFileCheckRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.batchName = builder.batchName;
        this.dataType = builder.dataType;
        this.ossFileName = builder.ossFileName;
        this.regId = builder.regId;
        this.sampleTagType = builder.sampleTagType;
        this.serviceList = builder.serviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadFileCheckRequest create() {
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
     * @return sampleTagType
     */
    public String getSampleTagType() {
        return this.sampleTagType;
    }

    /**
     * @return serviceList
     */
    public String getServiceList() {
        return this.serviceList;
    }

    public static final class Builder extends Request.Builder<UploadFileCheckRequest, Builder> {
        private String lang; 
        private String batchName; 
        private String dataType; 
        private String ossFileName; 
        private String regId; 
        private String sampleTagType; 
        private String serviceList; 

        private Builder() {
            super();
        } 

        private Builder(UploadFileCheckRequest request) {
            super(request);
            this.lang = request.lang;
            this.batchName = request.batchName;
            this.dataType = request.dataType;
            this.ossFileName = request.ossFileName;
            this.regId = request.regId;
            this.sampleTagType = request.sampleTagType;
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
         * <p>Sample type</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        public Builder sampleTagType(String sampleTagType) {
            this.putQueryParameter("sampleTagType", sampleTagType);
            this.sampleTagType = sampleTagType;
            return this;
        }

        /**
         * <p>Service list</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse</p>
         */
        public Builder serviceList(String serviceList) {
            this.putQueryParameter("serviceList", serviceList);
            this.serviceList = serviceList;
            return this;
        }

        @Override
        public UploadFileCheckRequest build() {
            return new UploadFileCheckRequest(this);
        } 

    } 

}
