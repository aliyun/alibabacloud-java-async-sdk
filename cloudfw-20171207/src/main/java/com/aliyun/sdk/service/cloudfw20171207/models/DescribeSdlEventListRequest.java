// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeSdlEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSdlEventListRequest</p>
 */
public class DescribeSdlEventListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIp")
    private String dstIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyAiEvt")
    private Integer onlyAiEvt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
    private String sensitiveLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    private String srcIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private DescribeSdlEventListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dstIp = builder.dstIp;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.location = builder.location;
        this.onlyAiEvt = builder.onlyAiEvt;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.sensitiveLevel = builder.sensitiveLevel;
        this.sort = builder.sort;
        this.srcIp = builder.srcIp;
        this.startTime = builder.startTime;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSdlEventListRequest create() {
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
     * @return dstIp
     */
    public String getDstIp() {
        return this.dstIp;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return onlyAiEvt
     */
    public Integer getOnlyAiEvt() {
        return this.onlyAiEvt;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sensitiveLevel
     */
    public String getSensitiveLevel() {
        return this.sensitiveLevel;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeSdlEventListRequest, Builder> {
        private Integer currentPage; 
        private String dstIp; 
        private Long endTime; 
        private String lang; 
        private String location; 
        private Integer onlyAiEvt; 
        private String order; 
        private Integer pageSize; 
        private String sensitiveLevel; 
        private String sort; 
        private String srcIp; 
        private Long startTime; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSdlEventListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dstIp = request.dstIp;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.location = request.location;
            this.onlyAiEvt = request.onlyAiEvt;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.sensitiveLevel = request.sensitiveLevel;
            this.sort = request.sort;
            this.srcIp = request.srcIp;
            this.startTime = request.startTime;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>The destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.102.XXX</p>
         */
        public Builder dstIp(String dstIp) {
            this.putQueryParameter("DstIp", dstIp);
            this.dstIp = dstIp;
            return this;
        }

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp representing seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1756433077</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The language of the response.</p>
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
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhangjiakou</p>
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * <p>Specifies whether to return only events detected by AI.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder onlyAiEvt(Integer onlyAiEvt) {
            this.putQueryParameter("OnlyAiEvt", onlyAiEvt);
            this.onlyAiEvt = onlyAiEvt;
            return this;
        }

        /**
         * <p>The sort order. Valid values: <code>asc</code> (ascending) and <code>desc</code> (descending).</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The sensitivity level of the data in the event.</p>
         * 
         * <strong>example:</strong>
         * <p>S3</p>
         */
        public Builder sensitiveLevel(String sensitiveLevel) {
            this.putQueryParameter("SensitiveLevel", sensitiveLevel);
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }

        /**
         * <p>The field to sort by.</p>
         * 
         * <strong>example:</strong>
         * <p>TotalBytes</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.XXX</p>
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        /**
         * <p>The start of the time range to query. This value is a UNIX timestamp representing seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1759198702</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The unique ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>aa58cdf6-6cf8-493c-912d-97619a24****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeSdlEventListRequest build() {
            return new DescribeSdlEventListRequest(this);
        } 

    } 

}
