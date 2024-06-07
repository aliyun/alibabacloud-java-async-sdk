// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeAdvancedRequest} extends {@link RequestModel}
 *
 * <p>RecognizeAdvancedRequest</p>
 */
public class RecognizeAdvancedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedRotate")
    private Boolean needRotate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedSortPage")
    private Boolean needSortPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoStamp")
    private Boolean noStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputCharInfo")
    private Boolean outputCharInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputFigure")
    private Boolean outputFigure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputTable")
    private Boolean outputTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paragraph")
    private Boolean paragraph;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Row")
    private Boolean row;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(maxLength = 2048)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
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

        private Builder(RecognizeAdvancedRequest request) {
            super(request);
            this.needRotate = request.needRotate;
            this.needSortPage = request.needSortPage;
            this.noStamp = request.noStamp;
            this.outputCharInfo = request.outputCharInfo;
            this.outputFigure = request.outputFigure;
            this.outputTable = request.outputTable;
            this.paragraph = request.paragraph;
            this.row = request.row;
            this.url = request.url;
            this.body = request.body;
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
         * NoStamp.
         */
        public Builder noStamp(Boolean noStamp) {
            this.putQueryParameter("NoStamp", noStamp);
            this.noStamp = noStamp;
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
         * OutputFigure.
         */
        public Builder outputFigure(Boolean outputFigure) {
            this.putQueryParameter("OutputFigure", outputFigure);
            this.outputFigure = outputFigure;
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
         * Paragraph.
         */
        public Builder paragraph(Boolean paragraph) {
            this.putQueryParameter("Paragraph", paragraph);
            this.paragraph = paragraph;
            return this;
        }

        /**
         * Row.
         */
        public Builder row(Boolean row) {
            this.putQueryParameter("Row", row);
            this.row = row;
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
        public RecognizeAdvancedRequest build() {
            return new RecognizeAdvancedRequest(this);
        } 

    } 

}
