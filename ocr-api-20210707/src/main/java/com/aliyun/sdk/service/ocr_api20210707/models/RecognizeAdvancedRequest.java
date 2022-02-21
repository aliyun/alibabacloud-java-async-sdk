// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeAdvancedRequest} extends {@link RequestModel}
 *
 * <p>RecognizeAdvancedRequest</p>
 */
public class RecognizeAdvancedRequest extends Request {
    @Query
    @NameInMap("NeedRotate")
    private Boolean needRotate;

    @Query
    @NameInMap("NeedSortPage")
    private Boolean needSortPage;

    @Query
    @NameInMap("NoStamp")
    private Boolean noStamp;

    @Query
    @NameInMap("OutputCharInfo")
    private Boolean outputCharInfo;

    @Query
    @NameInMap("OutputFigure")
    private Boolean outputFigure;

    @Query
    @NameInMap("OutputTable")
    private Boolean outputTable;

    @Query
    @NameInMap("Paragraph")
    private Boolean paragraph;

    @Query
    @NameInMap("Row")
    private Boolean row;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeAdvancedRequest(Builder builder) {
        super(builder);
        this.needRotate = builder.needRotate;
        this.needSortPage = builder.needSortPage;
        this.noStamp = builder.noStamp;
        this.outputCharInfo = builder.outputCharInfo;
        this.outputFigure = builder.outputFigure;
        this.outputTable = builder.outputTable;
        this.paragraph = builder.paragraph;
        this.row = builder.row;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeAdvancedRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return noStamp
     */
    public Boolean getNoStamp() {
        return this.noStamp;
    }

    /**
     * @return outputCharInfo
     */
    public Boolean getOutputCharInfo() {
        return this.outputCharInfo;
    }

    /**
     * @return outputFigure
     */
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    /**
     * @return outputTable
     */
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    /**
     * @return paragraph
     */
    public Boolean getParagraph() {
        return this.paragraph;
    }

    /**
     * @return row
     */
    public Boolean getRow() {
        return this.row;
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

    public static final class Builder extends Request.Builder<RecognizeAdvancedRequest, Builder> {
        private Boolean needRotate; 
        private Boolean needSortPage; 
        private Boolean noStamp; 
        private Boolean outputCharInfo; 
        private Boolean outputFigure; 
        private Boolean outputTable; 
        private Boolean paragraph; 
        private Boolean row; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeAdvancedRequest response) {
            super(response);
            this.needRotate = response.needRotate;
            this.needSortPage = response.needSortPage;
            this.noStamp = response.noStamp;
            this.outputCharInfo = response.outputCharInfo;
            this.outputFigure = response.outputFigure;
            this.outputTable = response.outputTable;
            this.paragraph = response.paragraph;
            this.row = response.row;
            this.url = response.url;
            this.body = response.body;
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
         * 是否需要去除印章功能，默认不需要。true：需要 false：不需要
         */
        public Builder noStamp(Boolean noStamp) {
            this.putQueryParameter("NoStamp", noStamp);
            this.noStamp = noStamp;
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
         * 是否需要图案检测功能，默认不需要。true：需要 false：不需要
         */
        public Builder outputFigure(Boolean outputFigure) {
            this.putQueryParameter("OutputFigure", outputFigure);
            this.outputFigure = outputFigure;
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
         * 是否需要分段功能，默认不需要。true：需要 false：不需要
         */
        public Builder paragraph(Boolean paragraph) {
            this.putQueryParameter("Paragraph", paragraph);
            this.paragraph = paragraph;
            return this;
        }

        /**
         * 是否需要成行返回功能，默认不需要
         */
        public Builder row(Boolean row) {
            this.putQueryParameter("Row", row);
            this.row = row;
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
        public RecognizeAdvancedRequest build() {
            return new RecognizeAdvancedRequest(this);
        } 

    } 

}
