// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdvicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAdvicesRequest</p>
 */
public class DescribeAdvicesRequest extends Request {
    @Query
    @NameInMap("AdviceId")
    private Long adviceId;

    @Query
    @NameInMap("CheckId")
    private String checkId;

    @Query
    @NameInMap("ExcludeAdviceId")
    private Long excludeAdviceId;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    private DescribeAdvicesRequest(Builder builder) {
        super(builder);
        this.adviceId = builder.adviceId;
        this.checkId = builder.checkId;
        this.excludeAdviceId = builder.excludeAdviceId;
        this.language = builder.language;
        this.product = builder.product;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adviceId
     */
    public Long getAdviceId() {
        return this.adviceId;
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return excludeAdviceId
     */
    public Long getExcludeAdviceId() {
        return this.excludeAdviceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<DescribeAdvicesRequest, Builder> {
        private Long adviceId; 
        private String checkId; 
        private Long excludeAdviceId; 
        private String language; 
        private String product; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAdvicesRequest request) {
            super(request);
            this.adviceId = request.adviceId;
            this.checkId = request.checkId;
            this.excludeAdviceId = request.excludeAdviceId;
            this.language = request.language;
            this.product = request.product;
            this.resourceId = request.resourceId;
        } 

        /**
         * AdviceId.
         */
        public Builder adviceId(Long adviceId) {
            this.putQueryParameter("AdviceId", adviceId);
            this.adviceId = adviceId;
            return this;
        }

        /**
         * CheckId.
         */
        public Builder checkId(String checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * ExcludeAdviceId.
         */
        public Builder excludeAdviceId(Long excludeAdviceId) {
            this.putQueryParameter("ExcludeAdviceId", excludeAdviceId);
            this.excludeAdviceId = excludeAdviceId;
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
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public DescribeAdvicesRequest build() {
            return new DescribeAdvicesRequest(this);
        } 

    } 

}
