// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMultiLanguageRequest} extends {@link RequestModel}
 *
 * <p>RecognizeMultiLanguageRequest</p>
 */
public class RecognizeMultiLanguageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Languages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > languages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedRotate")
    private Boolean needRotate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedSortPage")
    private Boolean needSortPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputCharInfo")
    private Boolean outputCharInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputTable")
    private Boolean outputTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeMultiLanguageRequest(Builder builder) {
        super(builder);
        this.languages = builder.languages;
        this.needRotate = builder.needRotate;
        this.needSortPage = builder.needSortPage;
        this.outputCharInfo = builder.outputCharInfo;
        this.outputTable = builder.outputTable;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeMultiLanguageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return languages
     */
    public java.util.List < String > getLanguages() {
        return this.languages;
    }

    /**
     * @return needRotate
     */
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    /**
     * @return needSortPage
     */
    public Boolean getNeedSortPage() {
        return this.needSortPage;
    }

    /**
     * @return outputCharInfo
     */
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    /**
     * @return outputTable
     */
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RecognizeMultiLanguageRequest, Builder> {
        private java.util.List < String > languages; 
        private Boolean needRotate; 
        private Boolean needSortPage; 
        private Boolean outputCharInfo; 
        private Boolean outputTable; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeMultiLanguageRequest request) {
            super(request);
            this.languages = request.languages;
            this.needRotate = request.needRotate;
            this.needSortPage = request.needSortPage;
            this.outputCharInfo = request.outputCharInfo;
            this.outputTable = request.outputTable;
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * Languages.
         */
        public Builder languages(java.util.List < String > languages) {
            String languagesShrink = shrink(languages, "Languages", "simple");
            this.putQueryParameter("Languages", languagesShrink);
            this.languages = languages;
            return this;
        }

        /**
         * NeedRotate.
         */
        public Builder needRotate(Boolean needRotate) {
            this.putQueryParameter("NeedRotate", needRotate);
            this.needRotate = needRotate;
            return this;
        }

        /**
         * NeedSortPage.
         */
        public Builder needSortPage(Boolean needSortPage) {
            this.putQueryParameter("NeedSortPage", needSortPage);
            this.needSortPage = needSortPage;
            return this;
        }

        /**
         * OutputCharInfo.
         */
        public Builder outputCharInfo(Boolean outputCharInfo) {
            this.putQueryParameter("OutputCharInfo", outputCharInfo);
            this.outputCharInfo = outputCharInfo;
            return this;
        }

        /**
         * OutputTable.
         */
        public Builder outputTable(Boolean outputTable) {
            this.putQueryParameter("OutputTable", outputTable);
            this.outputTable = outputTable;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RecognizeMultiLanguageRequest build() {
            return new RecognizeMultiLanguageRequest(this);
        } 

    } 

}
