// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ChatRefDocPageInfo} extends {@link TeaModel}
 *
 * <p>ChatRefDocPageInfo</p>
 */
public class ChatRefDocPageInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("angle")
    private Double angle;

    @com.aliyun.core.annotation.NameInMap("excelParseResult")
    private String excelParseResult;

    @com.aliyun.core.annotation.NameInMap("imageHeight")
    private Integer imageHeight;

    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.NameInMap("imageWidth")
    private Integer imageWidth;

    @com.aliyun.core.annotation.NameInMap("pageIdCurDoc")
    private Integer pageIdCurDoc;

    @com.aliyun.core.annotation.NameInMap("pdfParseResult")
    private String pdfParseResult;

    @com.aliyun.core.annotation.NameInMap("wordParseResult")
    private String wordParseResult;

    private ChatRefDocPageInfo(Builder builder) {
        this.angle = builder.angle;
        this.excelParseResult = builder.excelParseResult;
        this.imageHeight = builder.imageHeight;
        this.imageUrl = builder.imageUrl;
        this.imageWidth = builder.imageWidth;
        this.pageIdCurDoc = builder.pageIdCurDoc;
        this.pdfParseResult = builder.pdfParseResult;
        this.wordParseResult = builder.wordParseResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatRefDocPageInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return angle
     */
    public Double getAngle() {
        return this.angle;
    }

    /**
     * @return excelParseResult
     */
    public String getExcelParseResult() {
        return this.excelParseResult;
    }

    /**
     * @return imageHeight
     */
    public Integer getImageHeight() {
        return this.imageHeight;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return imageWidth
     */
    public Integer getImageWidth() {
        return this.imageWidth;
    }

    /**
     * @return pageIdCurDoc
     */
    public Integer getPageIdCurDoc() {
        return this.pageIdCurDoc;
    }

    /**
     * @return pdfParseResult
     */
    public String getPdfParseResult() {
        return this.pdfParseResult;
    }

    /**
     * @return wordParseResult
     */
    public String getWordParseResult() {
        return this.wordParseResult;
    }

    public static final class Builder {
        private Double angle; 
        private String excelParseResult; 
        private Integer imageHeight; 
        private String imageUrl; 
        private Integer imageWidth; 
        private Integer pageIdCurDoc; 
        private String pdfParseResult; 
        private String wordParseResult; 

        private Builder() {
        } 

        private Builder(ChatRefDocPageInfo model) {
            this.angle = model.angle;
            this.excelParseResult = model.excelParseResult;
            this.imageHeight = model.imageHeight;
            this.imageUrl = model.imageUrl;
            this.imageWidth = model.imageWidth;
            this.pageIdCurDoc = model.pageIdCurDoc;
            this.pdfParseResult = model.pdfParseResult;
            this.wordParseResult = model.wordParseResult;
        } 

        /**
         * angle.
         */
        public Builder angle(Double angle) {
            this.angle = angle;
            return this;
        }

        /**
         * excelParseResult.
         */
        public Builder excelParseResult(String excelParseResult) {
            this.excelParseResult = excelParseResult;
            return this;
        }

        /**
         * imageHeight.
         */
        public Builder imageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
            return this;
        }

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * imageWidth.
         */
        public Builder imageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
            return this;
        }

        /**
         * pageIdCurDoc.
         */
        public Builder pageIdCurDoc(Integer pageIdCurDoc) {
            this.pageIdCurDoc = pageIdCurDoc;
            return this;
        }

        /**
         * pdfParseResult.
         */
        public Builder pdfParseResult(String pdfParseResult) {
            this.pdfParseResult = pdfParseResult;
            return this;
        }

        /**
         * wordParseResult.
         */
        public Builder wordParseResult(String wordParseResult) {
            this.wordParseResult = wordParseResult;
            return this;
        }

        public ChatRefDocPageInfo build() {
            return new ChatRefDocPageInfo(this);
        } 

    } 

}
