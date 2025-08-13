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
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, with a default value of 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
         * <p>PHONE</p>
         */
        public Builder sampleType(String sampleType) {
            this.putQueryParameter("sampleType", sampleType);
            this.sampleType = sampleType;
            return this;
        }

        /**
         * <p>Sample data value.</p>
         * 
         * <strong>example:</strong>
         * <p>1770000000</p>
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
