// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link QueryLabelRequest} extends {@link RequestModel}
 *
 * <p>QueryLabelRequest</p>
 */
public class QueryLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 1)
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 1)
    private String labelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 1)
    private String title;

    private QueryLabelRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.country = builder.country;
        this.label = builder.label;
        this.labelId = builder.labelId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<QueryLabelRequest, Builder> {
        private String category; 
        private String country; 
        private String label; 
        private String labelId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(QueryLabelRequest request) {
            super(request);
            this.category = request.category;
            this.country = request.country;
            this.label = request.label;
            this.labelId = request.labelId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.title = request.title;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>menu</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * LabelId.
         */
        public Builder labelId(String labelId) {
            this.putBodyParameter("LabelId", labelId);
            this.labelId = labelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public QueryLabelRequest build() {
            return new QueryLabelRequest(this);
        } 

    } 

}
