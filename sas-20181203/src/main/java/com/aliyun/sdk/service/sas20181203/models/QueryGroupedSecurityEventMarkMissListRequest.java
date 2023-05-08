// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGroupedSecurityEventMarkMissListRequest} extends {@link RequestModel}
 *
 * <p>QueryGroupedSecurityEventMarkMissListRequest</p>
 */
public class QueryGroupedSecurityEventMarkMissListRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DisposalWay")
    private String disposalWay;

    @Body
    @NameInMap("EventName")
    private String eventName;

    @Body
    @NameInMap("From")
    private String from;

    @Body
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SourceIp")
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
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The name of the alert event. The value indicates a subtype.
         */
        public Builder disposalWay(String disposalWay) {
            this.putQueryParameter("DisposalWay", disposalWay);
            this.disposalWay = disposalWay;
            return this;
        }

        /**
         * The operator. Valid values:
         * <p>
         * 
         * *   **contains**: contains
         * *   **notContains**: does not contain
         * *   **strEqual**: equals
         * *   **strNotEqual**: does not equal
         * *   **regex**: regular expression
         */
        public Builder eventName(String eventName) {
            this.putBodyParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The ID of the request source. Set the value to sas.
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The status code returned. The status code **200** indicates that the request is successful. Other status codes indicate that the request fails. You can identify the cause of the failure based on the status code.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the user.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The field that is used in the whitelist rule.
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
