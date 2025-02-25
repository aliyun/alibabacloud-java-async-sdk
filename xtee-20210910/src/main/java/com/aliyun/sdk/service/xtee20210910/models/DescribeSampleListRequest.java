// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSampleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSampleListRequest</p>
 */
public class DescribeSampleListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleType")
    private String sampleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sampleValue")
    private String sampleValue;

    private DescribeSampleListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.sampleType = builder.sampleType;
        this.sampleValue = builder.sampleValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleListRequest create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleType
     */
    public String getSampleType() {
        return this.sampleType;
    }

    /**
     * @return sampleValue
     */
    public String getSampleValue() {
        return this.sampleValue;
    }

    public static final class Builder extends Request.Builder<DescribeSampleListRequest, Builder> {
        private String lang; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String regId; 
        private String sampleType; 
        private String sampleValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSampleListRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.sampleType = request.sampleType;
            this.sampleValue = request.sampleValue;
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
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
         * sampleType.
         */
        public Builder sampleType(String sampleType) {
            this.putQueryParameter("sampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * sampleValue.
         */
        public Builder sampleValue(String sampleValue) {
            this.putQueryParameter("sampleValue", sampleValue);
            this.sampleValue = sampleValue;
            return this;
        }

        @Override
        public DescribeSampleListRequest build() {
            return new DescribeSampleListRequest(this);
        } 

    } 

}
