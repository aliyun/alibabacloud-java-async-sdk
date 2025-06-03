// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link ListSurveyJobsRequest} extends {@link RequestModel}
 *
 * <p>ListSurveyJobsRequest</p>
 */
public class ListSurveyJobsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("channelList")
    private java.util.List<String> channelList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cloudTypeList")
    private java.util.List<String> cloudTypeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private java.util.List<String> region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("surveyRange")
    private String surveyRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListSurveyJobsRequest(Builder builder) {
        super(builder);
        this.channelList = builder.channelList;
        this.cloudTypeList = builder.cloudTypeList;
        this.name = builder.name;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.surveyRange = builder.surveyRange;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSurveyJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelList
     */
    public java.util.List<String> getChannelList() {
        return this.channelList;
    }

    /**
     * @return cloudTypeList
     */
    public java.util.List<String> getCloudTypeList() {
        return this.cloudTypeList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public java.util.List<String> getRegion() {
        return this.region;
    }

    /**
     * @return surveyRange
     */
    public String getSurveyRange() {
        return this.surveyRange;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListSurveyJobsRequest, Builder> {
        private java.util.List<String> channelList; 
        private java.util.List<String> cloudTypeList; 
        private String name; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<String> region; 
        private String surveyRange; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSurveyJobsRequest request) {
            super(request);
            this.channelList = request.channelList;
            this.cloudTypeList = request.cloudTypeList;
            this.name = request.name;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.surveyRange = request.surveyRange;
            this.regionId = request.regionId;
        } 

        /**
         * channelList.
         */
        public Builder channelList(java.util.List<String> channelList) {
            this.putBodyParameter("channelList", channelList);
            this.channelList = channelList;
            return this;
        }

        /**
         * cloudTypeList.
         */
        public Builder cloudTypeList(java.util.List<String> cloudTypeList) {
            this.putBodyParameter("cloudTypeList", cloudTypeList);
            this.cloudTypeList = cloudTypeList;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * region.
         */
        public Builder region(java.util.List<String> region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * surveyRange.
         */
        public Builder surveyRange(String surveyRange) {
            this.putBodyParameter("surveyRange", surveyRange);
            this.surveyRange = surveyRange;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListSurveyJobsRequest build() {
            return new ListSurveyJobsRequest(this);
        } 

    } 

}
