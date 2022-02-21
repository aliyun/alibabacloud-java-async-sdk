// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeResolverRulesRequest</p>
 */
public class DescribeResolverRulesRequest extends Request {
    @Query
    @NameInMap("EndpointId")
    private String endpointId;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NeedDetailAttributes")
    private Boolean needDetailAttributes;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 9999999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private DescribeResolverRulesRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.needDetailAttributes = builder.needDetailAttributes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return needDetailAttributes
     */
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
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

    public static final class Builder extends Request.Builder<DescribeResolverRulesRequest, Builder> {
        private String endpointId; 
        private String keyword; 
        private String lang; 
        private Boolean needDetailAttributes; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResolverRulesRequest response) {
            super(response);
            this.endpointId = response.endpointId;
            this.keyword = response.keyword;
            this.lang = response.lang;
            this.needDetailAttributes = response.needDetailAttributes;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NeedDetailAttributes.
         */
        public Builder needDetailAttributes(Boolean needDetailAttributes) {
            this.putQueryParameter("NeedDetailAttributes", needDetailAttributes);
            this.needDetailAttributes = needDetailAttributes;
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

        @Override
        public DescribeResolverRulesRequest build() {
            return new DescribeResolverRulesRequest(this);
        } 

    } 

}
