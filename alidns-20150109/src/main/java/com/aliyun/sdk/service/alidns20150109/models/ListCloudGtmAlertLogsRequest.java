// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link ListCloudGtmAlertLogsRequest} extends {@link RequestModel}
 *
 * <p>ListCloudGtmAlertLogsRequest</p>
 */
public class ListCloudGtmAlertLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTimestamp;

    private ListCloudGtmAlertLogsRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.endTimestamp = builder.endTimestamp;
        this.entityType = builder.entityType;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmAlertLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public static final class Builder extends Request.Builder<ListCloudGtmAlertLogsRequest, Builder> {
        private String actionType; 
        private Long endTimestamp; 
        private String entityType; 
        private String keyword; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(ListCloudGtmAlertLogsRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.endTimestamp = request.endTimestamp;
            this.entityType = request.entityType;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * <p>Alert type:</p>
         * <ul>
         * <li>ALERT</li>
         * <li>RESUME</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALERT</p>
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>The end time of the query (timestamp).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1711328826977</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>Alarm object types:</p>
         * <ul>
         * <li>GTM_ADDRESS: Address</li>
         * <li>GTM_ADDRESS_POOL: Address Pool</li>
         * <li>GTM_INSTANCE: Instance</li>
         * <li>GTM_MONITOR_TEMPLATE: Health Check Template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GTM_ADDRESS</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>Search keyword, usually an address ID, address pool ID, domain information, etc.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-895280232254422016</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>Language type of the returned information:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Current page number, starting from <strong>1</strong>, default is <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page when paginating queries, with a maximum value of 100 and a default of 20.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The start time of the query (timestamp).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1611328826977</p>
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public ListCloudGtmAlertLogsRequest build() {
            return new ListCloudGtmAlertLogsRequest(this);
        } 

    } 

}
