// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link CreateDataSetRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSetRequest</p>
 */
public class CreateDataSetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String dataSetDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetFieldKeyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSetFieldKeyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetFileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSetFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String dataSetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetStatus")
    private Integer dataSetStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetType")
    private String dataSetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpWhitelistRecognizers")
    private java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private CreateDataSetRequest(Builder builder) {
        super(builder);
        this.dataSetDescription = builder.dataSetDescription;
        this.dataSetFieldKeyName = builder.dataSetFieldKeyName;
        this.dataSetFileName = builder.dataSetFileName;
        this.dataSetName = builder.dataSetName;
        this.dataSetStatus = builder.dataSetStatus;
        this.dataSetType = builder.dataSetType;
        this.ipWhitelistRecognizers = builder.ipWhitelistRecognizers;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetDescription
     */
    public String getDataSetDescription() {
        return this.dataSetDescription;
    }

    /**
     * @return dataSetFieldKeyName
     */
    public String getDataSetFieldKeyName() {
        return this.dataSetFieldKeyName;
    }

    /**
     * @return dataSetFileName
     */
    public String getDataSetFileName() {
        return this.dataSetFileName;
    }

    /**
     * @return dataSetName
     */
    public String getDataSetName() {
        return this.dataSetName;
    }

    /**
     * @return dataSetStatus
     */
    public Integer getDataSetStatus() {
        return this.dataSetStatus;
    }

    /**
     * @return dataSetType
     */
    public String getDataSetType() {
        return this.dataSetType;
    }

    /**
     * @return ipWhitelistRecognizers
     */
    public java.util.List<IpWhitelistRecognizers> getIpWhitelistRecognizers() {
        return this.ipWhitelistRecognizers;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<CreateDataSetRequest, Builder> {
        private String dataSetDescription; 
        private String dataSetFieldKeyName; 
        private String dataSetFileName; 
        private String dataSetName; 
        private Integer dataSetStatus; 
        private String dataSetType; 
        private java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSetRequest request) {
            super(request);
            this.dataSetDescription = request.dataSetDescription;
            this.dataSetFieldKeyName = request.dataSetFieldKeyName;
            this.dataSetFileName = request.dataSetFileName;
            this.dataSetName = request.dataSetName;
            this.dataSetStatus = request.dataSetStatus;
            this.dataSetType = request.dataSetType;
            this.ipWhitelistRecognizers = request.ipWhitelistRecognizers;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * DataSetDescription.
         */
        public Builder dataSetDescription(String dataSetDescription) {
            this.putBodyParameter("DataSetDescription", dataSetDescription);
            this.dataSetDescription = dataSetDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder dataSetFieldKeyName(String dataSetFieldKeyName) {
            this.putBodyParameter("DataSetFieldKeyName", dataSetFieldKeyName);
            this.dataSetFieldKeyName = dataSetFieldKeyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudsiem-dataset/1358117679873357_17433*****.csv</p>
         */
        public Builder dataSetFileName(String dataSetFileName) {
            this.putBodyParameter("DataSetFileName", dataSetFileName);
            this.dataSetFileName = dataSetFileName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest</p>
         */
        public Builder dataSetName(String dataSetName) {
            this.putBodyParameter("DataSetName", dataSetName);
            this.dataSetName = dataSetName;
            return this;
        }

        /**
         * DataSetStatus.
         */
        public Builder dataSetStatus(Integer dataSetStatus) {
            this.putBodyParameter("DataSetStatus", dataSetStatus);
            this.dataSetStatus = dataSetStatus;
            return this;
        }

        /**
         * DataSetType.
         */
        public Builder dataSetType(String dataSetType) {
            this.putBodyParameter("DataSetType", dataSetType);
            this.dataSetType = dataSetType;
            return this;
        }

        /**
         * IpWhitelistRecognizers.
         */
        public Builder ipWhitelistRecognizers(java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers) {
            this.putBodyParameter("IpWhitelistRecognizers", ipWhitelistRecognizers);
            this.ipWhitelistRecognizers = ipWhitelistRecognizers;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public CreateDataSetRequest build() {
            return new CreateDataSetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataSetRequest} extends {@link TeaModel}
     *
     * <p>CreateDataSetRequest</p>
     */
    public static class IpWhitelistRecognizers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRecognizeStatus")
        private String autoRecognizeStatus;

        @com.aliyun.core.annotation.NameInMap("IpWhitelistRecognizerType")
        private String ipWhitelistRecognizerType;

        @com.aliyun.core.annotation.NameInMap("RecognizeScope")
        private String recognizeScope;

        private IpWhitelistRecognizers(Builder builder) {
            this.autoRecognizeStatus = builder.autoRecognizeStatus;
            this.ipWhitelistRecognizerType = builder.ipWhitelistRecognizerType;
            this.recognizeScope = builder.recognizeScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpWhitelistRecognizers create() {
            return builder().build();
        }

        /**
         * @return autoRecognizeStatus
         */
        public String getAutoRecognizeStatus() {
            return this.autoRecognizeStatus;
        }

        /**
         * @return ipWhitelistRecognizerType
         */
        public String getIpWhitelistRecognizerType() {
            return this.ipWhitelistRecognizerType;
        }

        /**
         * @return recognizeScope
         */
        public String getRecognizeScope() {
            return this.recognizeScope;
        }

        public static final class Builder {
            private String autoRecognizeStatus; 
            private String ipWhitelistRecognizerType; 
            private String recognizeScope; 

            private Builder() {
            } 

            private Builder(IpWhitelistRecognizers model) {
                this.autoRecognizeStatus = model.autoRecognizeStatus;
                this.ipWhitelistRecognizerType = model.ipWhitelistRecognizerType;
                this.recognizeScope = model.recognizeScope;
            } 

            /**
             * AutoRecognizeStatus.
             */
            public Builder autoRecognizeStatus(String autoRecognizeStatus) {
                this.autoRecognizeStatus = autoRecognizeStatus;
                return this;
            }

            /**
             * IpWhitelistRecognizerType.
             */
            public Builder ipWhitelistRecognizerType(String ipWhitelistRecognizerType) {
                this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
                return this;
            }

            /**
             * RecognizeScope.
             */
            public Builder recognizeScope(String recognizeScope) {
                this.recognizeScope = recognizeScope;
                return this;
            }

            public IpWhitelistRecognizers build() {
                return new IpWhitelistRecognizers(this);
            } 

        } 

    }
}
