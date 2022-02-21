// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTargetRequest} extends {@link RequestModel}
 *
 * <p>SearchTargetRequest</p>
 */
public class SearchTargetRequest extends Request {
    @Body
    @NameInMap("BeginTime")
    private String beginTime;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceList")
    private String deviceList;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("ModelId")
    private String modelId;

    @Body
    @NameInMap("OrderBy")
    private String orderBy;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Long pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("SimilarityThreshold")
    private Double similarityThreshold;

    @Body
    @NameInMap("TargetAttributes")
    private String targetAttributes;

    @Body
    @NameInMap("TargetImageData")
    private String targetImageData;

    @Body
    @NameInMap("TargetImageUrl")
    private String targetImageUrl;

    @Body
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    private SearchTargetRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.corpId = builder.corpId;
        this.deviceList = builder.deviceList;
        this.endTime = builder.endTime;
        this.modelId = builder.modelId;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.similarityThreshold = builder.similarityThreshold;
        this.targetAttributes = builder.targetAttributes;
        this.targetImageData = builder.targetImageData;
        this.targetImageUrl = builder.targetImageUrl;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deviceList
     */
    public String getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return similarityThreshold
     */
    public Double getSimilarityThreshold() {
        return this.similarityThreshold;
    }

    /**
     * @return targetAttributes
     */
    public String getTargetAttributes() {
        return this.targetAttributes;
    }

    /**
     * @return targetImageData
     */
    public String getTargetImageData() {
        return this.targetImageData;
    }

    /**
     * @return targetImageUrl
     */
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<SearchTargetRequest, Builder> {
        private String beginTime; 
        private String corpId; 
        private String deviceList; 
        private String endTime; 
        private String modelId; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private Double similarityThreshold; 
        private String targetAttributes; 
        private String targetImageData; 
        private String targetImageUrl; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(SearchTargetRequest response) {
            super(response);
            this.beginTime = response.beginTime;
            this.corpId = response.corpId;
            this.deviceList = response.deviceList;
            this.endTime = response.endTime;
            this.modelId = response.modelId;
            this.orderBy = response.orderBy;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.similarityThreshold = response.similarityThreshold;
            this.targetAttributes = response.targetAttributes;
            this.targetImageData = response.targetImageData;
            this.targetImageUrl = response.targetImageUrl;
            this.targetType = response.targetType;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DeviceList.
         */
        public Builder deviceList(String deviceList) {
            this.putBodyParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SimilarityThreshold.
         */
        public Builder similarityThreshold(Double similarityThreshold) {
            this.putBodyParameter("SimilarityThreshold", similarityThreshold);
            this.similarityThreshold = similarityThreshold;
            return this;
        }

        /**
         * TargetAttributes.
         */
        public Builder targetAttributes(String targetAttributes) {
            this.putBodyParameter("TargetAttributes", targetAttributes);
            this.targetAttributes = targetAttributes;
            return this;
        }

        /**
         * TargetImageData.
         */
        public Builder targetImageData(String targetImageData) {
            this.putBodyParameter("TargetImageData", targetImageData);
            this.targetImageData = targetImageData;
            return this;
        }

        /**
         * TargetImageUrl.
         */
        public Builder targetImageUrl(String targetImageUrl) {
            this.putBodyParameter("TargetImageUrl", targetImageUrl);
            this.targetImageUrl = targetImageUrl;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putBodyParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public SearchTargetRequest build() {
            return new SearchTargetRequest(this);
        } 

    } 

}
