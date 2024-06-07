// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeDocumentStructureRequest} extends {@link RequestModel}
 *
 * <p>RecognizeDocumentStructureRequest</p>
 */
public class RecognizeDocumentStructureRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OutputTable")
    private Boolean outputTable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Boolean page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paragraph")
    private Boolean paragraph;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Row")
    private Boolean row;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNewStyleOutput")
    private Boolean useNewStyleOutput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeDocumentStructureRequest(Builder builder) {
        super(builder);
        this.needRotate = builder.needRotate;
        this.needSortPage = builder.needSortPage;
        this.noStamp = builder.noStamp;
        this.outputCharInfo = builder.outputCharInfo;
        this.outputTable = builder.outputTable;
        this.page = builder.page;
        this.paragraph = builder.paragraph;
        this.row = builder.row;
        this.url = builder.url;
        this.useNewStyleOutput = builder.useNewStyleOutput;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeDocumentStructureRequest create() {
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
     * @return outputTable
     */
    public Boolean getOutputTable() {
        return this.outputTable;
    }

    /**
     * @return page
     */
    public Boolean getPage() {
        return this.page;
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
     * @return useNewStyleOutput
     */
    public Boolean getUseNewStyleOutput() {
        return this.useNewStyleOutput;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RecognizeDocumentStructureRequest, Builder> {
        private Boolean needRotate; 
        private Boolean needSortPage; 
        private Boolean noStamp; 
        private Boolean outputCharInfo; 
        private Boolean outputTable; 
        private Boolean page; 
        private Boolean paragraph; 
        private Boolean row; 
        private String url; 
        private Boolean useNewStyleOutput; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeDocumentStructureRequest request) {
            super(request);
            this.needRotate = request.needRotate;
            this.needSortPage = request.needSortPage;
            this.noStamp = request.noStamp;
            this.outputCharInfo = request.outputCharInfo;
            this.outputTable = request.outputTable;
            this.page = request.page;
            this.paragraph = request.paragraph;
            this.row = request.row;
            this.url = request.url;
            this.useNewStyleOutput = request.useNewStyleOutput;
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
         * OutputTable.
         */
        public Builder outputTable(Boolean outputTable) {
            this.putQueryParameter("OutputTable", outputTable);
            this.outputTable = outputTable;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Boolean page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * UseNewStyleOutput.
         */
        public Builder useNewStyleOutput(Boolean useNewStyleOutput) {
            this.putQueryParameter("UseNewStyleOutput", useNewStyleOutput);
            this.useNewStyleOutput = useNewStyleOutput;
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
        public RecognizeDocumentStructureRequest build() {
            return new RecognizeDocumentStructureRequest(this);
        } 

    } 

}
