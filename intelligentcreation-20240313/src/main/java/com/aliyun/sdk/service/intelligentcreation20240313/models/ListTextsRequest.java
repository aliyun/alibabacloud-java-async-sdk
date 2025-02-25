// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListTextsRequest} extends {@link RequestModel}
 *
 * <p>ListTextsRequest</p>
 */
public class ListTextsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("generationSource")
    private String generationSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("publishStatus")
    private String publishStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("textStyleType")
    private String textStyleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("textTheme")
    private String textTheme;

    private ListTextsRequest(Builder builder) {
        super(builder);
        this.generationSource = builder.generationSource;
        this.industry = builder.industry;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publishStatus = builder.publishStatus;
        this.textStyleType = builder.textStyleType;
        this.textTheme = builder.textTheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTextsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return generationSource
     */
    public String getGenerationSource() {
        return this.generationSource;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publishStatus
     */
    public String getPublishStatus() {
        return this.publishStatus;
    }

    /**
     * @return textStyleType
     */
    public String getTextStyleType() {
        return this.textStyleType;
    }

    /**
     * @return textTheme
     */
    public String getTextTheme() {
        return this.textTheme;
    }

    public static final class Builder extends Request.Builder<ListTextsRequest, Builder> {
        private String generationSource; 
        private String industry; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String publishStatus; 
        private String textStyleType; 
        private String textTheme; 

        private Builder() {
            super();
        } 

        private Builder(ListTextsRequest request) {
            super(request);
            this.generationSource = request.generationSource;
            this.industry = request.industry;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.publishStatus = request.publishStatus;
            this.textStyleType = request.textStyleType;
            this.textTheme = request.textTheme;
        } 

        /**
         * generationSource.
         */
        public Builder generationSource(String generationSource) {
            this.putQueryParameter("generationSource", generationSource);
            this.generationSource = generationSource;
            return this;
        }

        /**
         * industry.
         */
        public Builder industry(String industry) {
            this.putQueryParameter("industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * publishStatus.
         */
        public Builder publishStatus(String publishStatus) {
            this.putQueryParameter("publishStatus", publishStatus);
            this.publishStatus = publishStatus;
            return this;
        }

        /**
         * textStyleType.
         */
        public Builder textStyleType(String textStyleType) {
            this.putQueryParameter("textStyleType", textStyleType);
            this.textStyleType = textStyleType;
            return this;
        }

        /**
         * textTheme.
         */
        public Builder textTheme(String textTheme) {
            this.putQueryParameter("textTheme", textTheme);
            this.textTheme = textTheme;
            return this;
        }

        @Override
        public ListTextsRequest build() {
            return new ListTextsRequest(this);
        } 

    } 

}
