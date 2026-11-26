// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ScgSearchRequest} extends {@link RequestModel}
 *
 * <p>ScgSearchRequest</p>
 */
public class ScgSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScgFilter")
    @com.aliyun.core.annotation.Validation(required = true)
    private ScgFilter scgFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicId;

    private ScgSearchRequest(Builder builder) {
        super(builder);
        this.scgFilter = builder.scgFilter;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScgSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scgFilter
     */
    public ScgFilter getScgFilter() {
        return this.scgFilter;
    }

    /**
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    public static final class Builder extends Request.Builder<ScgSearchRequest, Builder> {
        private ScgFilter scgFilter; 
        private String topicId; 

        private Builder() {
            super();
        } 

        private Builder(ScgSearchRequest request) {
            super(request);
            this.scgFilter = request.scgFilter;
            this.topicId = request.topicId;
        } 

        /**
         * <p>Query filter</p>
         * <p>This parameter is required.</p>
         */
        public Builder scgFilter(ScgFilter scgFilter) {
            String scgFilterShrink = shrink(scgFilter, "ScgFilter", "json");
            this.putQueryParameter("ScgFilter", scgFilterShrink);
            this.scgFilter = scgFilter;
            return this;
        }

        /**
         * <p>Selection pool ID. Optional values: MC201132 (Ethnic Chinese Style), MC201136 (Pop Music), MC201139 (Sweet Love), MC201133 (Folk), MC201137 (Relaxing Reading), MC201138 (Happiness), PA202029 (Stories), PA202030 (Children&quot;s Songs), PA202028 (Chinese Classics and History), PA202032 (Encyclopedia), PA202031 (English Children&quot;s Songs)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MC201132</p>
         */
        public Builder topicId(String topicId) {
            this.putQueryParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        @Override
        public ScgSearchRequest build() {
            return new ScgSearchRequest(this);
        } 

    } 

    /**
     * 
     * {@link ScgSearchRequest} extends {@link TeaModel}
     *
     * <p>ScgSearchRequest</p>
     */
    public static class OffSetParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private Integer limit;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        private OffSetParam(Builder builder) {
            this.limit = builder.limit;
            this.offset = builder.offset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OffSetParam create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Integer getLimit() {
            return this.limit;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        public static final class Builder {
            private Integer limit; 
            private Integer offset; 

            private Builder() {
            } 

            private Builder(OffSetParam model) {
                this.limit = model.limit;
                this.offset = model.offset;
            } 

            /**
             * <p>Number of returned items</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder limit(Integer limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>Number of skipped items</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            public OffSetParam build() {
                return new OffSetParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScgSearchRequest} extends {@link TeaModel}
     *
     * <p>ScgSearchRequest</p>
     */
    public static class PageParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        private PageParam(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageParam create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private Integer pageNum; 
            private Integer pageSize; 

            private Builder() {
            } 

            private Builder(PageParam model) {
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
            } 

            /**
             * <p>Page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Number of records per page</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public PageParam build() {
                return new PageParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScgSearchRequest} extends {@link TeaModel}
     *
     * <p>ScgSearchRequest</p>
     */
    public static class SortParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SortKey")
        private String sortKey;

        @com.aliyun.core.annotation.NameInMap("SortOrder")
        private String sortOrder;

        @com.aliyun.core.annotation.NameInMap("SortText")
        private String sortText;

        private SortParam(Builder builder) {
            this.sortKey = builder.sortKey;
            this.sortOrder = builder.sortOrder;
            this.sortText = builder.sortText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SortParam create() {
            return builder().build();
        }

        /**
         * @return sortKey
         */
        public String getSortKey() {
            return this.sortKey;
        }

        /**
         * @return sortOrder
         */
        public String getSortOrder() {
            return this.sortOrder;
        }

        /**
         * @return sortText
         */
        public String getSortText() {
            return this.sortText;
        }

        public static final class Builder {
            private String sortKey; 
            private String sortOrder; 
            private String sortText; 

            private Builder() {
            } 

            private Builder(SortParam model) {
                this.sortKey = model.sortKey;
                this.sortOrder = model.sortOrder;
                this.sortText = model.sortText;
            } 

            /**
             * <p>Sorting field</p>
             * 
             * <strong>example:</strong>
             * <p>internal_id</p>
             */
            public Builder sortKey(String sortKey) {
                this.sortKey = sortKey;
                return this;
            }

            /**
             * <p>Sorting order</p>
             * 
             * <strong>example:</strong>
             * <p>ASC</p>
             */
            public Builder sortOrder(String sortOrder) {
                this.sortOrder = sortOrder;
                return this;
            }

            /**
             * <p>Sorting field (default: empty string)</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder sortText(String sortText) {
                this.sortText = sortText;
                return this;
            }

            public SortParam build() {
                return new SortParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScgSearchRequest} extends {@link TeaModel}
     *
     * <p>ScgSearchRequest</p>
     */
    public static class ScgFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OffSetParam")
        private OffSetParam offSetParam;

        @com.aliyun.core.annotation.NameInMap("PageParam")
        private PageParam pageParam;

        @com.aliyun.core.annotation.NameInMap("SortParam")
        @com.aliyun.core.annotation.Validation(required = true)
        private SortParam sortParam;

        @com.aliyun.core.annotation.NameInMap("UseOffSet")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean useOffSet;

        private ScgFilter(Builder builder) {
            this.offSetParam = builder.offSetParam;
            this.pageParam = builder.pageParam;
            this.sortParam = builder.sortParam;
            this.useOffSet = builder.useOffSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScgFilter create() {
            return builder().build();
        }

        /**
         * @return offSetParam
         */
        public OffSetParam getOffSetParam() {
            return this.offSetParam;
        }

        /**
         * @return pageParam
         */
        public PageParam getPageParam() {
            return this.pageParam;
        }

        /**
         * @return sortParam
         */
        public SortParam getSortParam() {
            return this.sortParam;
        }

        /**
         * @return useOffSet
         */
        public Boolean getUseOffSet() {
            return this.useOffSet;
        }

        public static final class Builder {
            private OffSetParam offSetParam; 
            private PageParam pageParam; 
            private SortParam sortParam; 
            private Boolean useOffSet; 

            private Builder() {
            } 

            private Builder(ScgFilter model) {
                this.offSetParam = model.offSetParam;
                this.pageParam = model.pageParam;
                this.sortParam = model.sortParam;
                this.useOffSet = model.useOffSet;
            } 

            /**
             * <p>Paging type</p>
             */
            public Builder offSetParam(OffSetParam offSetParam) {
                this.offSetParam = offSetParam;
                return this;
            }

            /**
             * <p>Paging type</p>
             */
            public Builder pageParam(PageParam pageParam) {
                this.pageParam = pageParam;
                return this;
            }

            /**
             * <p>Sorting parameters</p>
             * <p>This parameter is required.</p>
             */
            public Builder sortParam(SortParam sortParam) {
                this.sortParam = sortParam;
                return this;
            }

            /**
             * <p>Whether to use the pageParam object for paging. Choose either offSetParam or pageParam. The default paging mode is pageParam.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useOffSet(Boolean useOffSet) {
                this.useOffSet = useOffSet;
                return this;
            }

            public ScgFilter build() {
                return new ScgFilter(this);
            } 

        } 

    }
}
