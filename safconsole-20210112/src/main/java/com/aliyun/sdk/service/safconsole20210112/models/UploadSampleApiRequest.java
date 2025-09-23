// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20210112.models;

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
 * {@link UploadSampleApiRequest} extends {@link RequestModel}
 *
 * <p>UploadSampleApiRequest</p>
 */
public class UploadSampleApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sampleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The data type of the sample</p>
         * <ul>
         * <li>Phone number: mobile</li>
         * <li>MD5 of phone number: mobileMd5</li>
         * <li>IP: ip</li>
         * <li>Unique device ID: umid</li>
         * <li>Account ID: accountId</li>
         * <li>IMEI: imei</li>
         * <li>MD5 of IMEI: imeiMd5</li>
         * <li>OAID: oaid</li>
         * <li>MD5 of OAID: oaidMd5</li>
         * <li>Android ID: androidId</li>
         * <li>MD5 of Android ID: androidIdMd5</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Specific value of the sample, to be passed in JSON format. Do not exceed 1000 entries at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;123.124.125.126&quot;,&quot;123.124.125.127&quot;]</p>
         */
        public Builder dataValue(String dataValue) {
            this.putQueryParameter("DataValue", dataValue);
            this.dataValue = dataValue;
            return this;
        }

        /**
         * <p>The type of the sample</p>
         * <ul>
         * <li><p>Blacklist: block</p>
         * </li>
         * <li><p>Whitelist: pass</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        public Builder sampleType(String sampleType) {
            this.putQueryParameter("SampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * <p>List of effective services, separate multiple services with commas</p>
         * <ul>
         * <li>Basic/Enhanced Registration Risk Identification: account_abuse</li>
         * <li>Basic/Enhanced Marketing Risk Identification: coupon_abuse</li>
         * <li>Basic/Enhanced Login Risk Identification: account_takeover</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account_abuse,coupon_abuse,account_takeover</p>
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
