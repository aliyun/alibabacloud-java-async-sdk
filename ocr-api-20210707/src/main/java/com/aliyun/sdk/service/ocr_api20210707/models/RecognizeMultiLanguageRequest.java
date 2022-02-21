// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMultiLanguageRequest} extends {@link RequestModel}
 *
 * <p>RecognizeMultiLanguageRequest</p>
 */
public class RecognizeMultiLanguageRequest extends Request {
    @Query
    @NameInMap("Languages")
    @Validation(required = true)
    private java.util.List < String > languages;

    @Query
    @NameInMap("NeedRotate")
    private Boolean needRotate;

    @Query
    @NameInMap("NeedSortPage")
    private Boolean needSortPage;

    @Query
    @NameInMap("OutputCharInfo")
    private Boolean outputCharInfo;

    @Query
    @NameInMap("OutputTable")
    private Boolean outputTable;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
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

        private Builder(RecognizeMultiLanguageRequest response) {
            super(response);
            this.languages = response.languages;
            this.needRotate = response.needRotate;
            this.needSortPage = response.needSortPage;
            this.outputCharInfo = response.outputCharInfo;
            this.outputTable = response.outputTable;
            this.url = response.url;
            this.body = response.body;
        } 

        /**
         * 识别语种
         */
        public Builder languages(java.util.List < String > languages) {
            this.putQueryParameter("Languages", languages);
            this.languages = languages;
            return this;
        }

        /**
         * 是否需要自动旋转功能(结构化检测、混贴场景、教育相关场景会自动做旋转，无需设置)，返回角度信息
         */
        public Builder needRotate(Boolean needRotate) {
            this.putQueryParameter("NeedRotate", needRotate);
            this.needRotate = needRotate;
            return this;
        }

        /**
         * 是否按顺序输出文字块。false表示从左往右，从上到下的顺序；true表示从上到下，从左往右的顺序
         */
        public Builder needSortPage(Boolean needSortPage) {
            this.putQueryParameter("NeedSortPage", needSortPage);
            this.needSortPage = needSortPage;
            return this;
        }

        /**
         * 是否输出单字识别结果
         */
        public Builder outputCharInfo(Boolean outputCharInfo) {
            this.putQueryParameter("OutputCharInfo", outputCharInfo);
            this.outputCharInfo = outputCharInfo;
            return this;
        }

        /**
         * 是否输出表格识别结果，包含单元格信息
         */
        public Builder outputTable(Boolean outputTable) {
            this.putQueryParameter("OutputTable", outputTable);
            this.outputTable = outputTable;
            return this;
        }

        /**
         * 图片链接（长度不超 2048，不支持 base64）
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * 图片二进制字节流，最大10MB
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
