// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchWorkitemWithTotalCountRequest} extends {@link RequestModel}
 *
 * <p>SearchWorkitemWithTotalCountRequest</p>
 */
public class SearchWorkitemWithTotalCountRequest extends Request {
    @Body
    @NameInMap("AKProjectId")
    @Validation(required = true)
    private Integer AKProjectId;

    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

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

    private SearchWorkitemWithTotalCountRequest(Builder builder) {
        super(builder);
        this.AKProjectId = builder.AKProjectId;
        this.corpIdentifier = builder.corpIdentifier;
        this.pageSize = builder.pageSize;
        this.sprintId = builder.sprintId;
        this.stamp = builder.stamp;
        this.toPage = builder.toPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchWorkitemWithTotalCountRequest create() {
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

    public static final class Builder extends Request.Builder<SearchWorkitemWithTotalCountRequest, Builder> {
        private Integer AKProjectId; 
        private String corpIdentifier; 
        private Integer pageSize; 
        private Integer sprintId; 
        private String stamp; 
        private Integer toPage; 

        private Builder() {
            super();
        } 

        private Builder(SearchWorkitemWithTotalCountRequest response) {
            super(response);
            this.AKProjectId = response.AKProjectId;
            this.corpIdentifier = response.corpIdentifier;
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
        public SearchWorkitemWithTotalCountRequest build() {
            return new SearchWorkitemWithTotalCountRequest(this);
        } 

    } 

}
