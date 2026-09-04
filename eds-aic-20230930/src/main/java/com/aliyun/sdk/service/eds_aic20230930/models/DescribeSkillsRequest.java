// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeSkillsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSkillsRequest</p>
 */
public class DescribeSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusFilter")
    private String statusFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeSkillsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillId = builder.skillId;
        this.statusFilter = builder.statusFilter;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return statusFilter
     */
    public String getStatusFilter() {
        return this.statusFilter;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeSkillsRequest, Builder> {
        private String keyword; 
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillId; 
        private String statusFilter; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSkillsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillId = request.skillId;
            this.statusFilter = request.statusFilter;
            this.type = request.type;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SkillId.
         */
        public Builder skillId(String skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * StatusFilter.
         */
        public Builder statusFilter(String statusFilter) {
            this.putQueryParameter("StatusFilter", statusFilter);
            this.statusFilter = statusFilter;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeSkillsRequest build() {
            return new DescribeSkillsRequest(this);
        } 

    } 

}
