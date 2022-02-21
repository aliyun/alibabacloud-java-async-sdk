// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserCertificateListRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserCertificateListRequest</p>
 */
public class DescribeUserCertificateListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ShowSize")
    @Validation(required = true)
    private Integer showSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeUserCertificateListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.showSize = builder.showSize;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserCertificateListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeUserCertificateListRequest, Builder> {
        private Integer currentPage; 
        private String lang; 
        private Integer showSize; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserCertificateListRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.lang = response.lang;
            this.showSize = response.showSize;
            this.sourceIp = response.sourceIp;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
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
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeUserCertificateListRequest build() {
            return new DescribeUserCertificateListRequest(this);
        } 

    } 

}
