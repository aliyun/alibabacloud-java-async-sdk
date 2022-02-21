// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventQuaraFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventQuaraFilesRequest</p>
 */
public class DescribeSuspEventQuaraFilesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("GroupingId")
    private Long groupingId;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("QuaraTag")
    private String quaraTag;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeSuspEventQuaraFilesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.groupingId = builder.groupingId;
        this.pageSize = builder.pageSize;
        this.quaraTag = builder.quaraTag;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventQuaraFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupingId
     */
    public Long getGroupingId() {
        return this.groupingId;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return quaraTag
     */
    public String getQuaraTag() {
        return this.quaraTag;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeSuspEventQuaraFilesRequest, Builder> {
        private String currentPage; 
        private String from; 
        private String groupId; 
        private Long groupingId; 
        private String pageSize; 
        private String quaraTag; 
        private String sourceIp; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventQuaraFilesRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.from = response.from;
            this.groupId = response.groupId;
            this.groupingId = response.groupingId;
            this.pageSize = response.pageSize;
            this.quaraTag = response.quaraTag;
            this.sourceIp = response.sourceIp;
            this.status = response.status;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * From.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupingId.
         */
        public Builder groupingId(Long groupingId) {
            this.putQueryParameter("GroupingId", groupingId);
            this.groupingId = groupingId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QuaraTag.
         */
        public Builder quaraTag(String quaraTag) {
            this.putQueryParameter("QuaraTag", quaraTag);
            this.quaraTag = quaraTag;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSuspEventQuaraFilesRequest build() {
            return new DescribeSuspEventQuaraFilesRequest(this);
        } 

    } 

}
