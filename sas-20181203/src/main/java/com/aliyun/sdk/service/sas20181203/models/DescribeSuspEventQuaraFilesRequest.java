// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspEventQuaraFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventQuaraFilesRequest</p>
 */
public class DescribeSuspEventQuaraFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @Deprecated
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupingId")
    private Long groupingId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuaraTag")
    private String quaraTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
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

        private Builder(DescribeSuspEventQuaraFilesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.from = request.from;
            this.groupId = request.groupId;
            this.groupingId = request.groupingId;
            this.pageSize = request.pageSize;
            this.quaraTag = request.quaraTag;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
        } 

        /**
         * <p>The page number of the file list to view.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The identifier of the request source. Set the value to <strong>sas</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>10541428</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the server group where the quarantined file is located.</p>
         * 
         * <strong>example:</strong>
         * <p>11472451</p>
         */
        public Builder groupingId(Long groupingId) {
            this.putQueryParameter("GroupingId", groupingId);
            this.groupingId = groupingId;
            return this;
        }

        /**
         * <p>The maximum number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the quarantined file.</p>
         * 
         * <strong>example:</strong>
         * <p>a31337789f64d39b2219733ec99f9af7</p>
         */
        public Builder quaraTag(String quaraTag) {
            this.putQueryParameter("QuaraTag", quaraTag);
            this.quaraTag = quaraTag;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>59.82.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The status of the quarantined files to query. Valid values:  </p>
         * <ul>
         * <li><strong>quaraFailed</strong>: Quarantine failed.</li>
         * <li><strong>quaraDone</strong>: Quarantine succeeded.</li>
         * <li><strong>quaraing</strong>: Quarantine in progress.</li>
         * <li><strong>rollbackFailed</strong>: Quarantine rollback failed.</li>
         * <li><strong>rollbackDone</strong>: Quarantine rollback succeeded.</li>
         * <li><strong>rollbacking</strong>: Quarantine rollback in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quaraDone</p>
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
