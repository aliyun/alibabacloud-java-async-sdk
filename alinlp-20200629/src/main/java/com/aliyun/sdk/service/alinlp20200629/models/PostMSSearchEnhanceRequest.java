// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostMSSearchEnhanceRequest} extends {@link RequestModel}
 *
 * <p>PostMSSearchEnhanceRequest</p>
 */
public class PostMSSearchEnhanceRequest extends Request {
    @Body
    @NameInMap("Body")
    private String body;

    @Body
    @NameInMap("CustomConfigInfo")
    private java.util.Map < String, ? > customConfigInfo;

    @Body
    @NameInMap("Debug")
    private Boolean debug;

    @Body
    @NameInMap("Fields")
    private java.util.List < String > fields;

    @Body
    @NameInMap("Filters")
    private String filters;

    @Body
    @NameInMap("Page")
    private Integer page;

    @Body
    @NameInMap("Queries")
    private String queries;

    @Body
    @NameInMap("RankModelInfo")
    private java.util.Map < String, ? > rankModelInfo;

    @Body
    @NameInMap("Rows")
    private Integer rows;

    @Body
    @NameInMap("ServiceId")
    private Long serviceId;

    @Body
    @NameInMap("Sort")
    private java.util.List < String > sort;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("Uq")
    private String uq;

    private PostMSSearchEnhanceRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.customConfigInfo = builder.customConfigInfo;
        this.debug = builder.debug;
        this.fields = builder.fields;
        this.filters = builder.filters;
        this.page = builder.page;
        this.queries = builder.queries;
        this.rankModelInfo = builder.rankModelInfo;
        this.rows = builder.rows;
        this.serviceId = builder.serviceId;
        this.sort = builder.sort;
        this.type = builder.type;
        this.uq = builder.uq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostMSSearchEnhanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return customConfigInfo
     */
    public java.util.Map < String, ? > getCustomConfigInfo() {
        return this.customConfigInfo;
    }

    /**
     * @return debug
     */
    public Boolean getDebug() {
        return this.debug;
    }

    /**
     * @return fields
     */
    public java.util.List < String > getFields() {
        return this.fields;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return queries
     */
    public String getQueries() {
        return this.queries;
    }

    /**
     * @return rankModelInfo
     */
    public java.util.Map < String, ? > getRankModelInfo() {
        return this.rankModelInfo;
    }

    /**
     * @return rows
     */
    public Integer getRows() {
        return this.rows;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return sort
     */
    public java.util.List < String > getSort() {
        return this.sort;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uq
     */
    public String getUq() {
        return this.uq;
    }

    public static final class Builder extends Request.Builder<PostMSSearchEnhanceRequest, Builder> {
        private String body; 
        private java.util.Map < String, ? > customConfigInfo; 
        private Boolean debug; 
        private java.util.List < String > fields; 
        private String filters; 
        private Integer page; 
        private String queries; 
        private java.util.Map < String, ? > rankModelInfo; 
        private Integer rows; 
        private Long serviceId; 
        private java.util.List < String > sort; 
        private String type; 
        private String uq; 

        private Builder() {
            super();
        } 

        private Builder(PostMSSearchEnhanceRequest request) {
            super(request);
            this.body = request.body;
            this.customConfigInfo = request.customConfigInfo;
            this.debug = request.debug;
            this.fields = request.fields;
            this.filters = request.filters;
            this.page = request.page;
            this.queries = request.queries;
            this.rankModelInfo = request.rankModelInfo;
            this.rows = request.rows;
            this.serviceId = request.serviceId;
            this.sort = request.sort;
            this.type = request.type;
            this.uq = request.uq;
        } 

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * CustomConfigInfo.
         */
        public Builder customConfigInfo(java.util.Map < String, ? > customConfigInfo) {
            String customConfigInfoShrink = shrink(customConfigInfo, "CustomConfigInfo", "json");
            this.putBodyParameter("CustomConfigInfo", customConfigInfoShrink);
            this.customConfigInfo = customConfigInfo;
            return this;
        }

        /**
         * Debug.
         */
        public Builder debug(Boolean debug) {
            this.putBodyParameter("Debug", debug);
            this.debug = debug;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List < String > fields) {
            String fieldsShrink = shrink(fields, "Fields", "json");
            this.putBodyParameter("Fields", fieldsShrink);
            this.fields = fields;
            return this;
        }

        /**
         * Filters.
         */
        public Builder filters(String filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * Queries.
         */
        public Builder queries(String queries) {
            this.putBodyParameter("Queries", queries);
            this.queries = queries;
            return this;
        }

        /**
         * RankModelInfo.
         */
        public Builder rankModelInfo(java.util.Map < String, ? > rankModelInfo) {
            String rankModelInfoShrink = shrink(rankModelInfo, "RankModelInfo", "json");
            this.putBodyParameter("RankModelInfo", rankModelInfoShrink);
            this.rankModelInfo = rankModelInfo;
            return this;
        }

        /**
         * Rows.
         */
        public Builder rows(Integer rows) {
            this.putBodyParameter("Rows", rows);
            this.rows = rows;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(java.util.List < String > sort) {
            String sortShrink = shrink(sort, "Sort", "json");
            this.putBodyParameter("Sort", sortShrink);
            this.sort = sort;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Uq.
         */
        public Builder uq(String uq) {
            this.putBodyParameter("Uq", uq);
            this.uq = uq;
            return this;
        }

        @Override
        public PostMSSearchEnhanceRequest build() {
            return new PostMSSearchEnhanceRequest(this);
        } 

    } 

}
