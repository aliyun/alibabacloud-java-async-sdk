// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchSimilarityListRequest} extends {@link RequestModel}
 *
 * <p>SearchSimilarityListRequest</p>
 */
public class SearchSimilarityListRequest extends Request {
    @Query
    @NameInMap("Classifications")
    @Validation(required = true)
    private java.util.Map < String, ? > classifications;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SimilarGroups")
    private java.util.Map < String, ? > similarGroups;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("SuccessSearchType")
    @Validation(required = true)
    private String successSearchType;

    @Query
    @NameInMap("Umid")
    private String umid;

    @Query
    @NameInMap("Uri")
    private String uri;

    private SearchSimilarityListRequest(Builder builder) {
        super(builder);
        this.classifications = builder.classifications;
        this.name = builder.name;
        this.orderId = builder.orderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.similarGroups = builder.similarGroups;
        this.status = builder.status;
        this.successSearchType = builder.successSearchType;
        this.umid = builder.umid;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSimilarityListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classifications
     */
    public java.util.Map < String, ? > getClassifications() {
        return this.classifications;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
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
     * @return similarGroups
     */
    public java.util.Map < String, ? > getSimilarGroups() {
        return this.similarGroups;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return successSearchType
     */
    public String getSuccessSearchType() {
        return this.successSearchType;
    }

    /**
     * @return umid
     */
    public String getUmid() {
        return this.umid;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<SearchSimilarityListRequest, Builder> {
        private java.util.Map < String, ? > classifications; 
        private String name; 
        private String orderId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.Map < String, ? > similarGroups; 
        private Integer status; 
        private String successSearchType; 
        private String umid; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(SearchSimilarityListRequest request) {
            super(request);
            this.classifications = request.classifications;
            this.name = request.name;
            this.orderId = request.orderId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.similarGroups = request.similarGroups;
            this.status = request.status;
            this.successSearchType = request.successSearchType;
            this.umid = request.umid;
            this.uri = request.uri;
        } 

        /**
         * Classifications.
         */
        public Builder classifications(java.util.Map < String, ? > classifications) {
            String classificationsShrink = shrink(classifications, "Classifications", "json");
            this.putQueryParameter("Classifications", classificationsShrink);
            this.classifications = classifications;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
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
         * SimilarGroups.
         */
        public Builder similarGroups(java.util.Map < String, ? > similarGroups) {
            String similarGroupsShrink = shrink(similarGroups, "SimilarGroups", "json");
            this.putQueryParameter("SimilarGroups", similarGroupsShrink);
            this.similarGroups = similarGroups;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SuccessSearchType.
         */
        public Builder successSearchType(String successSearchType) {
            this.putQueryParameter("SuccessSearchType", successSearchType);
            this.successSearchType = successSearchType;
            return this;
        }

        /**
         * Umid.
         */
        public Builder umid(String umid) {
            this.putQueryParameter("Umid", umid);
            this.umid = umid;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putQueryParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public SearchSimilarityListRequest build() {
            return new SearchSimilarityListRequest(this);
        } 

    } 

}
