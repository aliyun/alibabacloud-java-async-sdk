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
 * {@link SizeChartExtractRequest} extends {@link RequestModel}
 *
 * <p>SizeChartExtractRequest</p>
 */
public class SizeChartExtractRequest extends Request {
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

    private SizeChartExtractRequest(Builder builder) {
        super(builder);
        this.columnNameList = builder.columnNameList;
        this.imageUrl = builder.imageUrl;
        this.languageModel = builder.languageModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SizeChartExtractRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<SizeChartExtractRequest, Builder> {
        private java.util.List<String> columnNameList; 
        private String imageUrl; 
        private String languageModel; 

        private Builder() {
            super();
        } 

        private Builder(SizeChartExtractRequest request) {
            super(request);
            this.columnNameList = request.columnNameList;
            this.imageUrl = request.imageUrl;
            this.languageModel = request.languageModel;
        } 

        /**
         * ColumnNameList.
         */
        public Builder columnNameList(java.util.List<String> columnNameList) {
            String columnNameListShrink = shrink(columnNameList, "ColumnNameList", "json");
            this.putQueryParameter("ColumnNameList", columnNameListShrink);
            this.columnNameList = columnNameList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/size_chart.jpg">https://example.com/size_chart.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * LanguageModel.
         */
        public Builder languageModel(String languageModel) {
            this.putQueryParameter("LanguageModel", languageModel);
            this.languageModel = languageModel;
            return this;
        }

        @Override
        public SizeChartExtractRequest build() {
            return new SizeChartExtractRequest(this);
        } 

    } 

}
