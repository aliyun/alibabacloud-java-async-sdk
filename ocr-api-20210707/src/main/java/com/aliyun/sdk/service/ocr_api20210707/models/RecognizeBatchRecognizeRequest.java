// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeBatchRecognizeRequest} extends {@link RequestModel}
 *
 * <p>RecognizeBatchRecognizeRequest</p>
 */
public class RecognizeBatchRecognizeRequest extends Request {
    @Query
    @NameInMap("ImageName")
    @Validation(required = true)
    private String imageName;

    @Query
    @NameInMap("ImageOp")
    @Validation(required = true)
    private String imageOp;

    @Query
    @NameInMap("ImageOssKey")
    @Validation(required = true)
    private String imageOssKey;

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

    private RecognizeBatchRecognizeRequest(Builder builder) {
        super(builder);
        this.imageName = builder.imageName;
        this.imageOp = builder.imageOp;
        this.imageOssKey = builder.imageOssKey;
        this.needRotate = builder.needRotate;
        this.needSortPage = builder.needSortPage;
        this.outputCharInfo = builder.outputCharInfo;
        this.outputTable = builder.outputTable;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeBatchRecognizeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return imageOp
     */
    public String getImageOp() {
        return this.imageOp;
    }

    /**
     * @return imageOssKey
     */
    public String getImageOssKey() {
        return this.imageOssKey;
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

    public static final class Builder extends Request.Builder<RecognizeBatchRecognizeRequest, Builder> {
        private String imageName; 
        private String imageOp; 
        private String imageOssKey; 
        private Boolean needRotate; 
        private Boolean needSortPage; 
        private Boolean outputCharInfo; 
        private Boolean outputTable; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeBatchRecognizeRequest request) {
            super(request);
            this.imageName = request.imageName;
            this.imageOp = request.imageOp;
            this.imageOssKey = request.imageOssKey;
            this.needRotate = request.needRotate;
            this.needSortPage = request.needSortPage;
            this.outputCharInfo = request.outputCharInfo;
            this.outputTable = request.outputTable;
            this.url = request.url;
        } 

        /**
         * 图片名称
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * 图片识别op类型
         */
        public Builder imageOp(String imageOp) {
            this.putQueryParameter("ImageOp", imageOp);
            this.imageOp = imageOp;
            return this;
        }

        /**
         * 图片存入oss中的key
         */
        public Builder imageOssKey(String imageOssKey) {
            this.putQueryParameter("ImageOssKey", imageOssKey);
            this.imageOssKey = imageOssKey;
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

        @Override
        public RecognizeBatchRecognizeRequest build() {
            return new RecognizeBatchRecognizeRequest(this);
        } 

    } 

}
