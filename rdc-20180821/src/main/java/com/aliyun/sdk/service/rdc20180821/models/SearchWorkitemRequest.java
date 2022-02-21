// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchWorkitemRequest} extends {@link RequestModel}
 *
 * <p>SearchWorkitemRequest</p>
 */
public class SearchWorkitemRequest extends Request {
    @Body
    @NameInMap("AKProjectId")
    @Validation(required = true)
    private Integer AKProjectId;

    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Body
    @NameInMap("CreatedAtEnd")
    private String createdAtEnd;

    @Body
    @NameInMap("CreatedAtStart")
    private String createdAtStart;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SprintId")
    private Integer sprintId;

    @Body
    @NameInMap("Stamp")
    private String stamp;

    @Body
    @NameInMap("ToPage")
    private Integer toPage;

    private SearchWorkitemRequest(Builder builder) {
        super(builder);
        this.AKProjectId = builder.AKProjectId;
        this.corpIdentifier = builder.corpIdentifier;
        this.createdAtEnd = builder.createdAtEnd;
        this.createdAtStart = builder.createdAtStart;
        this.pageSize = builder.pageSize;
        this.sprintId = builder.sprintId;
        this.stamp = builder.stamp;
        this.toPage = builder.toPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchWorkitemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AKProjectId
     */
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return createdAtEnd
     */
    public String getCreatedAtEnd() {
        return this.createdAtEnd;
    }

    /**
     * @return createdAtStart
     */
    public String getCreatedAtStart() {
        return this.createdAtStart;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sprintId
     */
    public Integer getSprintId() {
        return this.sprintId;
    }

    /**
     * @return stamp
     */
    public String getStamp() {
        return this.stamp;
    }

    /**
     * @return toPage
     */
    public Integer getToPage() {
        return this.toPage;
    }

    public static final class Builder extends Request.Builder<SearchWorkitemRequest, Builder> {
        private Integer AKProjectId; 
        private String corpIdentifier; 
        private String createdAtEnd; 
        private String createdAtStart; 
        private Integer pageSize; 
        private Integer sprintId; 
        private String stamp; 
        private Integer toPage; 

        private Builder() {
            super();
        } 

        private Builder(SearchWorkitemRequest response) {
            super(response);
            this.AKProjectId = response.AKProjectId;
            this.corpIdentifier = response.corpIdentifier;
            this.createdAtEnd = response.createdAtEnd;
            this.createdAtStart = response.createdAtStart;
            this.pageSize = response.pageSize;
            this.sprintId = response.sprintId;
            this.stamp = response.stamp;
            this.toPage = response.toPage;
        } 

        /**
         * AKProjectId.
         */
        public Builder AKProjectId(Integer AKProjectId) {
            this.putBodyParameter("AKProjectId", AKProjectId);
            this.AKProjectId = AKProjectId;
            return this;
        }

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * CreatedAtEnd.
         */
        public Builder createdAtEnd(String createdAtEnd) {
            this.putBodyParameter("CreatedAtEnd", createdAtEnd);
            this.createdAtEnd = createdAtEnd;
            return this;
        }

        /**
         * CreatedAtStart.
         */
        public Builder createdAtStart(String createdAtStart) {
            this.putBodyParameter("CreatedAtStart", createdAtStart);
            this.createdAtStart = createdAtStart;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SprintId.
         */
        public Builder sprintId(Integer sprintId) {
            this.putBodyParameter("SprintId", sprintId);
            this.sprintId = sprintId;
            return this;
        }

        /**
         * Stamp.
         */
        public Builder stamp(String stamp) {
            this.putBodyParameter("Stamp", stamp);
            this.stamp = stamp;
            return this;
        }

        /**
         * ToPage.
         */
        public Builder toPage(Integer toPage) {
            this.putBodyParameter("ToPage", toPage);
            this.toPage = toPage;
            return this;
        }

        @Override
        public SearchWorkitemRequest build() {
            return new SearchWorkitemRequest(this);
        } 

    } 

}
