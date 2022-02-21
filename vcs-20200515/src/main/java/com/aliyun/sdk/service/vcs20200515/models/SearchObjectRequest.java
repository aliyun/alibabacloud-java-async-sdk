// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchObjectRequest} extends {@link RequestModel}
 *
 * <p>SearchObjectRequest</p>
 */
public class SearchObjectRequest extends Request {
    @Body
    @NameInMap("AlgorithmType")
    private String algorithmType;

    @Body
    @NameInMap("Conditions")
    private java.util.Map < String, ? > conditions;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceList")
    private java.util.Map < String, ? > deviceList;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Body
    @NameInMap("ImagePath")
    private java.util.Map < String, ? > imagePath;

    @Body
    @NameInMap("ObjectType")
    @Validation(required = true)
    private String objectType;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, maximum = 100000)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 10000)
    private Integer pageSize;

    @Body
    @NameInMap("PicUrl")
    private String picUrl;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private SearchObjectRequest(Builder builder) {
        super(builder);
        this.algorithmType = builder.algorithmType;
        this.conditions = builder.conditions;
        this.corpId = builder.corpId;
        this.deviceList = builder.deviceList;
        this.endTime = builder.endTime;
        this.imagePath = builder.imagePath;
        this.objectType = builder.objectType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.picUrl = builder.picUrl;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchObjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return conditions
     */
    public java.util.Map < String, ? > getConditions() {
        return this.conditions;
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
    public java.util.Map < String, ? > getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return imagePath
     */
    public java.util.Map < String, ? > getImagePath() {
        return this.imagePath;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
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
     * @return picUrl
     */
    public String getPicUrl() {
        return this.picUrl;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<SearchObjectRequest, Builder> {
        private String algorithmType; 
        private java.util.Map < String, ? > conditions; 
        private String corpId; 
        private java.util.Map < String, ? > deviceList; 
        private Long endTime; 
        private java.util.Map < String, ? > imagePath; 
        private String objectType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String picUrl; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(SearchObjectRequest response) {
            super(response);
            this.algorithmType = response.algorithmType;
            this.conditions = response.conditions;
            this.corpId = response.corpId;
            this.deviceList = response.deviceList;
            this.endTime = response.endTime;
            this.imagePath = response.imagePath;
            this.objectType = response.objectType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.picUrl = response.picUrl;
            this.startTime = response.startTime;
        } 

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putBodyParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
        }

        /**
         * Conditions.
         */
        public Builder conditions(java.util.Map < String, ? > conditions) {
            this.putBodyParameter("Conditions", conditions);
            this.conditions = conditions;
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
        public Builder deviceList(java.util.Map < String, ? > deviceList) {
            this.putBodyParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ImagePath.
         */
        public Builder imagePath(java.util.Map < String, ? > imagePath) {
            this.putBodyParameter("ImagePath", imagePath);
            this.imagePath = imagePath;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PicUrl.
         */
        public Builder picUrl(String picUrl) {
            this.putBodyParameter("PicUrl", picUrl);
            this.picUrl = picUrl;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public SearchObjectRequest build() {
            return new SearchObjectRequest(this);
        } 

    } 

}
