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
 * {@link AddSampleDataByCsvRequest} extends {@link RequestModel}
 *
 * <p>AddSampleDataByCsvRequest</p>
 */
public class AddSampleDataByCsvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ossFileName")
    private String ossFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleBatchUuid")
    private String sampleBatchUuid;

    private AddSampleDataByCsvRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ossFileName = builder.ossFileName;
        this.regId = builder.regId;
        this.sampleBatchUuid = builder.sampleBatchUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSampleDataByCsvRequest create() {
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
     * @return sampleBatchUuid
     */
    public String getSampleBatchUuid() {
        return this.sampleBatchUuid;
    }

    public static final class Builder extends Request.Builder<AddSampleDataByCsvRequest, Builder> {
        private String lang; 
        private String ossFileName; 
        private String regId; 
        private String sampleBatchUuid; 

        private Builder() {
            super();
        } 

        private Builder(AddSampleDataByCsvRequest request) {
            super(request);
            this.lang = request.lang;
            this.ossFileName = request.ossFileName;
            this.regId = request.regId;
            this.sampleBatchUuid = request.sampleBatchUuid;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Uploaded OSS address.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/path/test.csv</p>
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
         * <p>Sample UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>1806507582222226_saf_sample_split_coupon_abuse_saf_sample_split_mobile_saf_sample_split_pass</p>
         */
        public Builder sampleBatchUuid(String sampleBatchUuid) {
            this.putQueryParameter("sampleBatchUuid", sampleBatchUuid);
            this.sampleBatchUuid = sampleBatchUuid;
            return this;
        }

        @Override
        public AddSampleDataByCsvRequest build() {
            return new AddSampleDataByCsvRequest(this);
        } 

    } 

}
