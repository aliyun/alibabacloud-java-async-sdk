// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmLogsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmLogsRequest</p>
 */
public class DescribeDnsGtmLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    @com.aliyun.core.annotation.Validation(maximum = 999999999999999D, minimum = 1)
    private Long endTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 9999999, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    @com.aliyun.core.annotation.Validation(maximum = 999999999999999D, minimum = 1)
    private Long startTimestamp;

    private DescribeDnsGtmLogsRequest(Builder builder) {
        super(builder);
        this.endTimestamp = builder.endTimestamp;
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTimestamp = builder.startTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<DescribeDnsGtmLogsRequest, Builder> {
        private Long endTimestamp; 
        private String instanceId; 
        private String keyword; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmLogsRequest request) {
            super(request);
            this.endTimestamp = request.endTimestamp;
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTimestamp = request.startTimestamp;
        } 

        /**
         * The timestamp that specifies the end of the time range to query.
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.putQueryParameter("EndTimestamp", endTimestamp);
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The keyword for searches in "%KeyWord%" mode. The value is not case-sensitive.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The timestamp that specifies the beginning of the time range to query.
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.putQueryParameter("StartTimestamp", startTimestamp);
            this.startTimestamp = startTimestamp;
            return this;
        }

        @Override
        public DescribeDnsGtmLogsRequest build() {
            return new DescribeDnsGtmLogsRequest(this);
        } 

    } 

}
