// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeSampleDownloadUrlRequest</p>
 */
public class DescribeSampleDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sampleId;

    private DescribeSampleDownloadUrlRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sampleId = builder.sampleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleDownloadUrlRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleId
     */
    public Long getSampleId() {
        return this.sampleId;
    }

    public static final class Builder extends Request.Builder<DescribeSampleDownloadUrlRequest, Builder> {
        private String lang; 
        private String regId; 
        private Long sampleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSampleDownloadUrlRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.sampleId = request.sampleId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * sampleId.
         */
        public Builder sampleId(Long sampleId) {
            this.putQueryParameter("sampleId", sampleId);
            this.sampleId = sampleId;
            return this;
        }

        @Override
        public DescribeSampleDownloadUrlRequest build() {
            return new DescribeSampleDownloadUrlRequest(this);
        } 

    } 

}
