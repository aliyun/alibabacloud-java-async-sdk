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
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest contains ip list</p>
         */
        public Builder dataSetDescription(String dataSetDescription) {
            this.putBodyParameter("DataSetDescription", dataSetDescription);
            this.dataSetDescription = dataSetDescription;
            return this;
        }

        /**
         * <p>The unique key name of the dataset.</p>
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
         * <p>The name of the uploaded dataset file.</p>
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
         * <p>The name of the dataset.</p>
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
         * <p>The status of the dataset. Valid values:</p>
         * <ul>
         * <li>0: Deleted.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSetStatus(Integer dataSetStatus) {
            this.putBodyParameter("DataSetStatus", dataSetStatus);
            this.dataSetStatus = dataSetStatus;
            return this;
        }

        /**
         * <p>The type of the dataset. Valid values:</p>
         * <ul>
         * <li>custom: custom.</li>
         * <li>preset: predefined.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder dataSetType(String dataSetType) {
            this.putBodyParameter("DataSetType", dataSetType);
            this.dataSetType = dataSetType;
            return this;
        }

        /**
         * <p>The list of recognizers.</p>
         */
        public Builder ipWhitelistRecognizers(java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers) {
            this.putBodyParameter("IpWhitelistRecognizers", ipWhitelistRecognizers);
            this.ipWhitelistRecognizers = ipWhitelistRecognizers;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.
         * Note: This parameter is required. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
         * <li>ap-southeast-1: Your assets reside outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the member to which the administrator switches the view.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
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
             * <p>The automatic recognition status. Valid values:</p>
             * <ul>
             * <li>enabled: Enabled.</li>
             * <li>disabled: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder autoRecognizeStatus(String autoRecognizeStatus) {
                this.autoRecognizeStatus = autoRecognizeStatus;
                return this;
            }

            /**
             * <p>The IP address type identified by the recognizer. Valid values:</p>
             * <ul>
             * <li>sas_vulnerability_scanner_ip: IP addresses of the Security Center vulnerability web scanner.</li>
             * <li>waf_back_source_ip: back-to-origin IP addresses of Web Application Firewall (WAF).</li>
             * <li>ddos_back_source_ip: back-to-origin IP addresses of Anti-DDoS.</li>
             * <li>esa_back_source_ip: back-to-origin node IP addresses of Edge secure acceleration (ESA).</li>
             * <li>ecs_public_ip: public IP addresses of Elastic Compute Service (ECS) instances.</li>
             * <li>slb_public_ip: public IP addresses of Server Load Balancer (SLB) instances.</li>
             * <li>vpc_eip: elastic IP addresses (EIPs).</li>
             * <li>cdn_back_source_ip: back-to-origin IP addresses of content delivery network (CDN).</li>
             * <li>ga_back_source_ip: back-to-origin IP addresses of Global Accelerator (GA).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>waf_back_source_ip</p>
             */
            public Builder ipWhitelistRecognizerType(String ipWhitelistRecognizerType) {
                this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
                return this;
            }

            /**
             * <p>The recognition scope. Valid values:</p>
             * <ul>
             * <li>current_account: the current account only.</li>
             * <li>rd_accounts: multi-account mode enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>current_account</p>
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
