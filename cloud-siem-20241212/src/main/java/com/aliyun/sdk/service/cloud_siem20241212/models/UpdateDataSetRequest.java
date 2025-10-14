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
 * {@link UpdateDataSetRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSetRequest</p>
 */
public class UpdateDataSetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 1000)
    private String dataSetDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetFileName")
    private String dataSetFileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetName")
    private String dataSetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSetStatus")
    private Integer dataSetStatus;

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

    private UpdateDataSetRequest(Builder builder) {
        super(builder);
        this.dataSetDescription = builder.dataSetDescription;
        this.dataSetFileName = builder.dataSetFileName;
        this.dataSetId = builder.dataSetId;
        this.dataSetName = builder.dataSetName;
        this.dataSetStatus = builder.dataSetStatus;
        this.ipWhitelistRecognizers = builder.ipWhitelistRecognizers;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSetRequest create() {
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
     * @return dataSetFileName
     */
    public String getDataSetFileName() {
        return this.dataSetFileName;
    }

    /**
     * @return dataSetId
     */
    public String getDataSetId() {
        return this.dataSetId;
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

    public static final class Builder extends Request.Builder<UpdateDataSetRequest, Builder> {
        private String dataSetDescription; 
        private String dataSetFileName; 
        private String dataSetId; 
        private String dataSetName; 
        private Integer dataSetStatus; 
        private java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSetRequest request) {
            super(request);
            this.dataSetDescription = request.dataSetDescription;
            this.dataSetFileName = request.dataSetFileName;
            this.dataSetId = request.dataSetId;
            this.dataSetName = request.dataSetName;
            this.dataSetStatus = request.dataSetStatus;
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
         * DataSetFileName.
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
         * <p>dataset-10iy8mbifnb4gniv****</p>
         */
        public Builder dataSetId(String dataSetId) {
            this.putBodyParameter("DataSetId", dataSetId);
            this.dataSetId = dataSetId;
            return this;
        }

        /**
         * DataSetName.
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
        public UpdateDataSetRequest build() {
            return new UpdateDataSetRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataSetRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataSetRequest</p>
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
