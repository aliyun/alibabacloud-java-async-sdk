// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeExcelExportRequest} extends {@link RequestModel}
 *
 * <p>RecognizeExcelExportRequest</p>
 */
public class RecognizeExcelExportRequest extends Request {
    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("ImageOp")
    @Validation(required = true)
    private String imageOp;

    @Query
    @NameInMap("OcrImageCount")
    @Validation(required = true)
    private Long ocrImageCount;

    @Query
    @NameInMap("OcrResult")
    @Validation(required = true)
    private String ocrResult;

    @Query
    @NameInMap("OcrType")
    @Validation(required = true)
    private String ocrType;

    private RecognizeExcelExportRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.imageOp = builder.imageOp;
        this.ocrImageCount = builder.ocrImageCount;
        this.ocrResult = builder.ocrResult;
        this.ocrType = builder.ocrType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeExcelExportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return imageOp
     */
    public String getImageOp() {
        return this.imageOp;
    }

    /**
     * @return ocrImageCount
     */
    public Long getOcrImageCount() {
        return this.ocrImageCount;
    }

    /**
     * @return ocrResult
     */
    public String getOcrResult() {
        return this.ocrResult;
    }

    /**
     * @return ocrType
     */
    public String getOcrType() {
        return this.ocrType;
    }

    public static final class Builder extends Request.Builder<RecognizeExcelExportRequest, Builder> {
        private String fileName; 
        private String imageOp; 
        private Long ocrImageCount; 
        private String ocrResult; 
        private String ocrType; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeExcelExportRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.imageOp = request.imageOp;
            this.ocrImageCount = request.ocrImageCount;
            this.ocrResult = request.ocrResult;
            this.ocrType = request.ocrType;
        } 

        /**
         * ????????????
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * ????????????op??????
         */
        public Builder imageOp(String imageOp) {
            this.putQueryParameter("ImageOp", imageOp);
            this.imageOp = imageOp;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder ocrImageCount(Long ocrImageCount) {
            this.putQueryParameter("OcrImageCount", ocrImageCount);
            this.ocrImageCount = ocrImageCount;
            return this;
        }

        /**
         * ??????????????????????????????oss??????
         */
        public Builder ocrResult(String ocrResult) {
            this.putQueryParameter("OcrResult", ocrResult);
            this.ocrResult = ocrResult;
            return this;
        }

        /**
         * ????????????
         */
        public Builder ocrType(String ocrType) {
            this.putQueryParameter("OcrType", ocrType);
            this.ocrType = ocrType;
            return this;
        }

        @Override
        public RecognizeExcelExportRequest build() {
            return new RecognizeExcelExportRequest(this);
        } 

    } 

}
