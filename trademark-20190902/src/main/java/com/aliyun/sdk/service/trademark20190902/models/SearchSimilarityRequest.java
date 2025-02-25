// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchSimilarityRequest} extends {@link RequestModel}
 *
 * <p>SearchSimilarityRequest</p>
 */
public class SearchSimilarityRequest extends Request {
    @Query
    @NameInMap("Classifications")
    @Validation(required = true)
    private java.util.Map < String, ? > classifications;

    @Query
    @NameInMap("Limit")
    @Validation(maximum = 50, minimum = 1)
    private Integer limit;

    @Query
    @NameInMap("NameUriList")
    @Validation(maximum = 10, minimum = 1)
    private java.util.List < NameUriList> nameUriList;

    @Query
    @NameInMap("SearchType")
    private String searchType;

    @Query
    @NameInMap("ShowDetail")
    private Boolean showDetail;

    @Query
    @NameInMap("SimilarGroups")
    private java.util.Map < String, ? > similarGroups;

    @Query
    @NameInMap("Sorter")
    @Validation(maxLength = 10, minLength = 1)
    private String sorter;

    @Query
    @NameInMap("Umid")
    private String umid;

    private SearchSimilarityRequest(Builder builder) {
        super(builder);
        this.classifications = builder.classifications;
        this.limit = builder.limit;
        this.nameUriList = builder.nameUriList;
        this.searchType = builder.searchType;
        this.showDetail = builder.showDetail;
        this.similarGroups = builder.similarGroups;
        this.sorter = builder.sorter;
        this.umid = builder.umid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSimilarityRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nameUriList
     */
    public java.util.List < NameUriList> getNameUriList() {
        return this.nameUriList;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return showDetail
     */
    public Boolean getShowDetail() {
        return this.showDetail;
    }

    /**
     * @return similarGroups
     */
    public java.util.Map < String, ? > getSimilarGroups() {
        return this.similarGroups;
    }

    /**
     * @return sorter
     */
    public String getSorter() {
        return this.sorter;
    }

    /**
     * @return umid
     */
    public String getUmid() {
        return this.umid;
    }

    public static final class Builder extends Request.Builder<SearchSimilarityRequest, Builder> {
        private java.util.Map < String, ? > classifications; 
        private Integer limit; 
        private java.util.List < NameUriList> nameUriList; 
        private String searchType; 
        private Boolean showDetail; 
        private java.util.Map < String, ? > similarGroups; 
        private String sorter; 
        private String umid; 

        private Builder() {
            super();
        } 

        private Builder(SearchSimilarityRequest request) {
            super(request);
            this.classifications = request.classifications;
            this.limit = request.limit;
            this.nameUriList = request.nameUriList;
            this.searchType = request.searchType;
            this.showDetail = request.showDetail;
            this.similarGroups = request.similarGroups;
            this.sorter = request.sorter;
            this.umid = request.umid;
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
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NameUriList.
         */
        public Builder nameUriList(java.util.List < NameUriList> nameUriList) {
            this.putQueryParameter("NameUriList", nameUriList);
            this.nameUriList = nameUriList;
            return this;
        }

        /**
         * SearchType.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * ShowDetail.
         */
        public Builder showDetail(Boolean showDetail) {
            this.putQueryParameter("ShowDetail", showDetail);
            this.showDetail = showDetail;
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
         * Sorter.
         */
        public Builder sorter(String sorter) {
            this.putQueryParameter("Sorter", sorter);
            this.sorter = sorter;
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

        @Override
        public SearchSimilarityRequest build() {
            return new SearchSimilarityRequest(this);
        } 

    } 

    public static class NameUriList extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Uri")
        private String uri;

        private NameUriList(Builder builder) {
            this.name = builder.name;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameUriList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String name; 
            private String uri; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public NameUriList build() {
                return new NameUriList(this);
            } 

        } 

    }
}
