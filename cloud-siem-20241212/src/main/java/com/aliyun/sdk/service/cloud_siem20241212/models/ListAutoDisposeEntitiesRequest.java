// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListAutoDisposeEntitiesRequest} extends {@link RequestModel}
 *
 * <p>ListAutoDisposeEntitiesRequest</p>
 */
public class ListAutoDisposeEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoDisposeRecordIds")
    private java.util.List<String> autoDisposeRecordIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListAutoDisposeEntitiesRequest(Builder builder) {
        super(builder);
        this.autoDisposeRecordIds = builder.autoDisposeRecordIds;
        this.currentPage = builder.currentPage;
        this.dataSourceType = builder.dataSourceType;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoDisposeEntitiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDisposeRecordIds
     */
    public java.util.List<String> getAutoDisposeRecordIds() {
        return this.autoDisposeRecordIds;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListAutoDisposeEntitiesRequest, Builder> {
        private java.util.List<String> autoDisposeRecordIds; 
        private String currentPage; 
        private String dataSourceType; 
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String pageSize; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListAutoDisposeEntitiesRequest request) {
            super(request);
            this.autoDisposeRecordIds = request.autoDisposeRecordIds;
            this.currentPage = request.currentPage;
            this.dataSourceType = request.dataSourceType;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The list of decision-making disposal IDs.</p>
         */
        public Builder autoDisposeRecordIds(java.util.List<String> autoDisposeRecordIds) {
            String autoDisposeRecordIdsShrink = shrink(autoDisposeRecordIds, "AutoDisposeRecordIds", "simple");
            this.putBodyParameter("AutoDisposeRecordIds", autoDisposeRecordIdsShrink);
            this.autoDisposeRecordIds = autoDisposeRecordIds;
            return this;
        }

        /**
         * <p>The current page number. The value must be greater than or equal to 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The data source type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Note: This parameter is required. If you do not specify this parameter, the service returns a 400 error: &quot;The specified Lang can not be empty.&quot; Explicitly pass a language code.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that indicates the position from which the current call starts reading. An empty value indicates that all data has been read.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The UUID of the playbook. This is the unique identifier of the playbook.</p>
         * 
         * <strong>example:</strong>
         * <p>b2491e39-ddf2-478a-8c07-*****</p>
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListAutoDisposeEntitiesRequest build() {
            return new ListAutoDisposeEntitiesRequest(this);
        } 

    } 

}
