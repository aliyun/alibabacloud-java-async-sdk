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
 * {@link QueryGroupedSecurityEventMarkMissListRequest} extends {@link RequestModel}
 *
 * <p>QueryGroupedSecurityEventMarkMissListRequest</p>
 */
public class QueryGroupedSecurityEventMarkMissListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisposalWay")
    private String disposalWay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private QueryGroupedSecurityEventMarkMissListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.disposalWay = builder.disposalWay;
        this.eventName = builder.eventName;
        this.from = builder.from;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupedSecurityEventMarkMissListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return disposalWay
     */
    public String getDisposalWay() {
        return this.disposalWay;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<QueryGroupedSecurityEventMarkMissListRequest, Builder> {
        private Integer currentPage; 
        private String disposalWay; 
        private String eventName; 
        private String from; 
        private String lang; 
        private Integer pageSize; 
        private String remark; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(QueryGroupedSecurityEventMarkMissListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.disposalWay = request.disposalWay;
            this.eventName = request.eventName;
            this.from = request.from;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The handling method. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Automatically Added to Whitelist</li>
         * <li><strong>2</strong>: Defense Without Notification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder disposalWay(String disposalWay) {
            this.putQueryParameter("DisposalWay", disposalWay);
            this.disposalWay = disposalWay;
            return this;
        }

        /**
         * <p>The name of the alert event. The value indicates a subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The ID of the request source. Set the value to sas.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The condition that is used to query alert events by asset. You can specify a value of the following types:</p>
         * <ul>
         * <li>The IP address of the asset.</li>
         * <li>The public IP address of the asset.</li>
         * <li>The private IP address of the asset.</li>
         * <li>The name of the asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>222.185.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>113.66.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public QueryGroupedSecurityEventMarkMissListRequest build() {
            return new QueryGroupedSecurityEventMarkMissListRequest(this);
        } 

    } 

}
