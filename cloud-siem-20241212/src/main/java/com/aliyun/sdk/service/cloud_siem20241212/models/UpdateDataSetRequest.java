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
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>lmftest desc</p>
         */
        public Builder dataSetDescription(String dataSetDescription) {
            this.putBodyParameter("DataSetDescription", dataSetDescription);
            this.dataSetDescription = dataSetDescription;
            return this;
        }

        /**
         * <p>The name of the uploaded dataset file.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudsiem-dataset/1358117679873357_1743387731614.csv</p>
         */
        public Builder dataSetFileName(String dataSetFileName) {
            this.putBodyParameter("DataSetFileName", dataSetFileName);
            this.dataSetFileName = dataSetFileName;
            return this;
        }

        /**
         * <p>The ID of the dataset.</p>
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
         * <p>The name of the dataset.</p>
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
         * <li><p>0: Delete.</p>
         * </li>
         * <li><p>1: Enable.</p>
         * </li>
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
         * <p>The IP address types that the recognizer can detect.</p>
         */
        public Builder ipWhitelistRecognizers(java.util.List<IpWhitelistRecognizers> ipWhitelistRecognizers) {
            this.putBodyParameter("IpWhitelistRecognizers", ipWhitelistRecognizers);
            this.ipWhitelistRecognizers = ipWhitelistRecognizers;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
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
         * <p>The region where the Data Management center for threat analysis is located. Select a region based on the location of your assets. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Assets are in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: Assets are in a region outside China.</p>
         * </li>
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
         * <p>The user ID of a member. An administrator can use this parameter to switch to the member\&quot;s view.</p>
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
             * <p>The automatic detection status. Valid values:</p>
             * <ul>
             * <li><p>enabled: Enabled.</p>
             * </li>
             * <li><p>disabled: Disabled.</p>
             * </li>
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
             * <p>The IP address type that the recognizer can detect. Valid values:</p>
             * <ul>
             * <li><p>sas_vulnerability_scanner_ip: The IP addresses of the Security Center web vulnerability scanner.</p>
             * </li>
             * <li><p>waf_back_source_ip: The back-to-origin IP addresses of Web Application Firewall (WAF).</p>
             * </li>
             * <li><p>ddos_back_source_ip: The back-to-origin IP addresses of Anti-DDoS.</p>
             * </li>
             * <li><p>esa_back_source_ip: The back-to-origin IP addresses of Edge Security Acceleration (ESA) nodes.</p>
             * </li>
             * <li><p>ecs_public_ip: The public IP addresses of Elastic Compute Service (ECS) instances.</p>
             * </li>
             * <li><p>slb_public_ip: The public IP addresses of Server Load Balancer (SLB).</p>
             * </li>
             * <li><p>vpc_eip: The elastic IP addresses (EIPs).</p>
             * </li>
             * <li><p>cdn_back_source_ip: The back-to-origin IP addresses of Alibaba Cloud CDN.</p>
             * </li>
             * <li><p>ga_back_source_ip: The back-to-origin IP addresses of Global Accelerator (GA).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cdn_back_source_ip</p>
             */
            public Builder ipWhitelistRecognizerType(String ipWhitelistRecognizerType) {
                this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
                return this;
            }

            /**
             * <p>The detection scope. Valid values:</p>
             * <ul>
             * <li><p>current_account: The current account only.</p>
             * </li>
             * <li><p>rd_accounts: Multiple accounts are enabled.</p>
             * </li>
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
