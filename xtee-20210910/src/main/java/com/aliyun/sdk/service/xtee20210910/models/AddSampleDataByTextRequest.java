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
 * {@link AddSampleDataByTextRequest} extends {@link RequestModel}
 *
 * <p>AddSampleDataByTextRequest</p>
 */
public class AddSampleDataByTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataValue")
    private String dataValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleBatchUuid")
    private String sampleBatchUuid;

    private AddSampleDataByTextRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.dataValue = builder.dataValue;
        this.regId = builder.regId;
        this.sampleBatchUuid = builder.sampleBatchUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSampleDataByTextRequest create() {
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
     * @return dataValue
     */
    public String getDataValue() {
        return this.dataValue;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleBatchUuid
     */
    public String getSampleBatchUuid() {
        return this.sampleBatchUuid;
    }

    public static final class Builder extends Request.Builder<AddSampleDataByTextRequest, Builder> {
        private String lang; 
        private String dataValue; 
        private String regId; 
        private String sampleBatchUuid; 

        private Builder() {
            super();
        } 

        private Builder(AddSampleDataByTextRequest request) {
            super(request);
            this.lang = request.lang;
            this.dataValue = request.dataValue;
            this.regId = request.regId;
            this.sampleBatchUuid = request.sampleBatchUuid;
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
         * <p>List data.</p>
         * 
         * <strong>example:</strong>
         * <p>testA \n testB</p>
         */
        public Builder dataValue(String dataValue) {
            this.putQueryParameter("dataValue", dataValue);
            this.dataValue = dataValue;
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
         * <p>Sample UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>1806507582222226
         * _saf_sample_split_coupon_abuse_saf_sample_split_mobile_saf_sample_split_pass</p>
         */
        public Builder sampleBatchUuid(String sampleBatchUuid) {
            this.putQueryParameter("sampleBatchUuid", sampleBatchUuid);
            this.sampleBatchUuid = sampleBatchUuid;
            return this;
        }

        @Override
        public AddSampleDataByTextRequest build() {
            return new AddSampleDataByTextRequest(this);
        } 

    } 

}
