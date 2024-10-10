// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHoneypotAttackerSourceRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotAttackerSourceRequest</p>
 */
public class ListHoneypotAttackerSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimeStamp")
    private Long endTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List < String > riskLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeStamp")
    private Long startTimeStamp;

    private ListHoneypotAttackerSourceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTimeStamp = builder.endTimeStamp;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskLevelList = builder.riskLevelList;
        this.srcIp = builder.srcIp;
        this.startTimeStamp = builder.startTimeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotAttackerSourceRequest create() {
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
     * @return endTimeStamp
     */
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
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
     * @return riskLevelList
     */
    public java.util.List < String > getRiskLevelList() {
        return this.riskLevelList;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTimeStamp
     */
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public static final class Builder extends Request.Builder<ListHoneypotAttackerSourceRequest, Builder> {
        private Integer currentPage; 
        private Long endTimeStamp; 
        private String lang; 
        private Integer pageSize; 
        private java.util.List < String > riskLevelList; 
        private String srcIp; 
        private Long startTimeStamp; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotAttackerSourceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTimeStamp = request.endTimeStamp;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskLevelList = request.riskLevelList;
            this.srcIp = request.srcIp;
            this.startTimeStamp = request.startTimeStamp;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end of the time range to query. This value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1676945366221</p>
         */
        public Builder endTimeStamp(Long endTimeStamp) {
            this.putQueryParameter("EndTimeStamp", endTimeStamp);
            this.endTimeStamp = endTimeStamp;
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
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
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
         * <p>An array that consists of risk levels.</p>
         */
        public Builder riskLevelList(java.util.List < String > riskLevelList) {
            this.putQueryParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * <p>The source IP address of the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>175.136.230.***</p>
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. This value is a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1674007632124</p>
         */
        public Builder startTimeStamp(Long startTimeStamp) {
            this.putQueryParameter("StartTimeStamp", startTimeStamp);
            this.startTimeStamp = startTimeStamp;
            return this;
        }

        @Override
        public ListHoneypotAttackerSourceRequest build() {
            return new ListHoneypotAttackerSourceRequest(this);
        } 

    } 

}
