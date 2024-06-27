// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventPageListRequest</p>
 */
public class DescribeEventPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventStatus")
    private String eventStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeEventPageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.createType = builder.createType;
        this.currentPage = builder.currentPage;
        this.eventCode = builder.eventCode;
        this.eventName = builder.eventName;
        this.eventStatus = builder.eventStatus;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventPageListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return eventStatus
     */
    public String getEventStatus() {
        return this.eventStatus;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeEventPageListRequest, Builder> {
        private String lang; 
        private String createType; 
        private Integer currentPage; 
        private String eventCode; 
        private String eventName; 
        private String eventStatus; 
        private Integer pageSize; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventPageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.createType = request.createType;
            this.currentPage = request.currentPage;
            this.eventCode = request.eventCode;
            this.eventName = request.eventName;
            this.eventStatus = request.eventStatus;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * eventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("eventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * eventStatus.
         */
        public Builder eventStatus(String eventStatus) {
            this.putQueryParameter("eventStatus", eventStatus);
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeEventPageListRequest build() {
            return new DescribeEventPageListRequest(this);
        } 

    } 

}
