// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link SizeChartExtractAsyncRequest} extends {@link RequestModel}
 *
 * <p>SizeChartExtractAsyncRequest</p>
 */
public class SizeChartExtractAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnNameList")
    private java.util.List<String> columnNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LanguageModel")
    private String languageModel;

    private SizeChartExtractAsyncRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.columnNameList = builder.columnNameList;
        this.imageUrl = builder.imageUrl;
        this.languageModel = builder.languageModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SizeChartExtractAsyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return columnNameList
     */
    public java.util.List<String> getColumnNameList() {
        return this.columnNameList;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return languageModel
     */
    public String getLanguageModel() {
        return this.languageModel;
    }

    public static final class Builder extends Request.Builder<SizeChartExtractAsyncRequest, Builder> {
        private String bizId; 
        private java.util.List<String> columnNameList; 
        private String imageUrl; 
        private String languageModel; 

        private Builder() {
            super();
        } 

        private Builder(SizeChartExtractAsyncRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.columnNameList = request.columnNameList;
            this.imageUrl = request.imageUrl;
            this.languageModel = request.languageModel;
        } 

        /**
         * <p>The business order number of the caller. It is recorded when the request is accepted and returned as is when you query the asynchronous task result.</p>
         * 
         * <strong>example:</strong>
         * <p>order-20260928-001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The list of column names to extract, such as Size, Bust, and Length.</p>
         */
        public Builder columnNameList(java.util.List<String> columnNameList) {
            String columnNameListShrink = shrink(columnNameList, "ColumnNameList", "json");
            this.putQueryParameter("ColumnNameList", columnNameListShrink);
            this.columnNameList = columnNameList;
            return this;
        }

        /**
         * <p>The image URL. The image must be in the JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 pixels and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The output language format. If you do not specify this parameter, the original language is used. If the original image language is Chinese or English, specifying en outputs English, and specifying cn outputs Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder languageModel(String languageModel) {
            this.putQueryParameter("LanguageModel", languageModel);
            this.languageModel = languageModel;
            return this;
        }

        @Override
        public SizeChartExtractAsyncRequest build() {
            return new SizeChartExtractAsyncRequest(this);
        } 

    } 

}
