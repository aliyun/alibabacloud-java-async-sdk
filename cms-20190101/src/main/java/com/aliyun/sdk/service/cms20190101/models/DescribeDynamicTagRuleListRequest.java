// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDynamicTagRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDynamicTagRuleListRequest</p>
 */
public class DescribeDynamicTagRuleListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicTagRuleId")
    private String dynamicTagRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private String tagKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRegionId")
    private String tagRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagValue")
    private String tagValue;

    private DescribeDynamicTagRuleListRequest(Builder builder) {
        super(builder);
        this.dynamicTagRuleId = builder.dynamicTagRuleId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tagKey = builder.tagKey;
        this.tagRegionId = builder.tagRegionId;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDynamicTagRuleListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicTagRuleId
     */
    public String getDynamicTagRuleId() {
        return this.dynamicTagRuleId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * @return tagRegionId
     */
    public String getTagRegionId() {
        return this.tagRegionId;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder extends Request.Builder<DescribeDynamicTagRuleListRequest, Builder> {
        private String dynamicTagRuleId; 
        private String pageNumber; 
        private String pageSize; 
        private String tagKey; 
        private String tagRegionId; 
        private String tagValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDynamicTagRuleListRequest request) {
            super(request);
            this.dynamicTagRuleId = request.dynamicTagRuleId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tagKey = request.tagKey;
            this.tagRegionId = request.tagRegionId;
            this.tagValue = request.tagValue;
        } 

        /**
         * The ID of the tag rule.
         */
        public Builder dynamicTagRuleId(String dynamicTagRuleId) {
            this.putQueryParameter("DynamicTagRuleId", dynamicTagRuleId);
            this.dynamicTagRuleId = dynamicTagRuleId;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Minimum value: 1. Default value: 30.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The tag key.
         * <p>
         * 
         * For more information about how to obtain a tag key, see [DescribeTagKeyList](~~145558~~).
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * The ID of the region to which the tags belong.
         */
        public Builder tagRegionId(String tagRegionId) {
            this.putQueryParameter("TagRegionId", tagRegionId);
            this.tagRegionId = tagRegionId;
            return this;
        }

        /**
         * The tag value.
         * <p>
         * 
         * For more information about how to obtain a tag value, see [DescribeTagKeyList](~~145557~~).
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("TagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        @Override
        public DescribeDynamicTagRuleListRequest build() {
            return new DescribeDynamicTagRuleListRequest(this);
        } 

    } 

}
