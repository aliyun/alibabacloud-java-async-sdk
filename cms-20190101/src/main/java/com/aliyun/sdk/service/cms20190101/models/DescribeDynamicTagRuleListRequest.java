// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDynamicTagRuleListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDynamicTagRuleListRequest</p>
 */
public class DescribeDynamicTagRuleListRequest extends Request {
    @Query
    @NameInMap("DynamicTagRuleId")
    private String dynamicTagRuleId;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("TagKey")
    private String tagKey;

    @Query
    @NameInMap("TagRegionId")
    private String tagRegionId;

    @Query
    @NameInMap("TagValue")
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
         * The total number of returned entries.
         */
        public Builder dynamicTagRuleId(String dynamicTagRuleId) {
            this.putQueryParameter("DynamicTagRuleId", dynamicTagRuleId);
            this.dynamicTagRuleId = dynamicTagRuleId;
            return this;
        }

        /**
         * The ID of the region to which the tags belong.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The conditional expressions used to create an application group based on the tag.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The error message.
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Minimum value: 1. Default value: 30.
         */
        public Builder tagRegionId(String tagRegionId) {
            this.putQueryParameter("TagRegionId", tagRegionId);
            this.tagRegionId = tagRegionId;
            return this;
        }

        /**
         * The ID of the tag rule.
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
