// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link DescribePcaAndExternalCACertificateListRequest} extends {@link RequestModel}
 *
 * <p>DescribePcaAndExternalCACertificateListRequest</p>
 */
public class DescribePcaAndExternalCACertificateListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifiers")
    private String identifiers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    private DescribePcaAndExternalCACertificateListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.identifiers = builder.identifiers;
        this.keyWord = builder.keyWord;
        this.showSize = builder.showSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePcaAndExternalCACertificateListRequest create() {
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
     * @return identifiers
     */
    public String getIdentifiers() {
        return this.identifiers;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    public static final class Builder extends Request.Builder<DescribePcaAndExternalCACertificateListRequest, Builder> {
        private Integer currentPage; 
        private String identifiers; 
        private String keyWord; 
        private Integer showSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribePcaAndExternalCACertificateListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.identifiers = request.identifiers;
            this.keyWord = request.keyWord;
            this.showSize = request.showSize;
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
         * Identifiers.
         */
        public Builder identifiers(String identifiers) {
            this.putQueryParameter("Identifiers", identifiers);
            this.identifiers = identifiers;
            return this;
        }

        /**
         * KeyWord.
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
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

        @Override
        public DescribePcaAndExternalCACertificateListRequest build() {
            return new DescribePcaAndExternalCACertificateListRequest(this);
        } 

    } 

}
