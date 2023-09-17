// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link MLDataSetParam} extends {@link TeaModel}
 *
 * <p>MLDataSetParam</p>
 */
public class MLDataSetParam extends TeaModel {
    @NameInMap("createBy")
    private String createBy;

    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("dataType")
    private String dataType;

    @NameInMap("datasetId")
    private String datasetId;

    @NameInMap("description")
    private String description;

    @NameInMap("labelId")
    private String labelId;

    @NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @NameInMap("name")
    private String name;

    @NameInMap("settingType")
    private String settingType;

    private MLDataSetParam(Builder builder) {
        this.createBy = builder.createBy;
        this.createTime = builder.createTime;
        this.dataType = builder.dataType;
        this.datasetId = builder.datasetId;
        this.description = builder.description;
        this.labelId = builder.labelId;
        this.lastModifyTime = builder.lastModifyTime;
        this.name = builder.name;
        this.settingType = builder.settingType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MLDataSetParam create() {
        return builder().build();
    }

    /**
     * @return createBy
     */
    public String getCreateBy() {
        return this.createBy;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return settingType
     */
    public String getSettingType() {
        return this.settingType;
    }

    public static final class Builder {
        private String createBy; 
        private Long createTime; 
        private String dataType; 
        private String datasetId; 
        private String description; 
        private String labelId; 
        private Long lastModifyTime; 
        private String name; 
        private String settingType; 

        /**
         * createBy.
         */
        public Builder createBy(String createBy) {
            this.createBy = createBy;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * labelId.
         */
        public Builder labelId(String labelId) {
            this.labelId = labelId;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * settingType.
         */
        public Builder settingType(String settingType) {
            this.settingType = settingType;
            return this;
        }

        public MLDataSetParam build() {
            return new MLDataSetParam(this);
        } 

    } 

}
