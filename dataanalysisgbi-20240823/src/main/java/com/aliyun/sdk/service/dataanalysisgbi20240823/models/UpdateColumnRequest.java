// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link UpdateColumnRequest} extends {@link RequestModel}
 *
 * <p>UpdateColumnRequest</p>
 */
public class UpdateColumnRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chineseName")
    private String chineseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("columnIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String columnIdKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enumType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer enumType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enumValues")
    private java.util.List<String> enumValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rangeMax")
    private Long rangeMax;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rangeMin")
    private Long rangeMin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("samples")
    private java.util.List<String> samples;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableIdKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateColumnRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chineseName = builder.chineseName;
        this.columnIdKey = builder.columnIdKey;
        this.description = builder.description;
        this.enumType = builder.enumType;
        this.enumValues = builder.enumValues;
        this.rangeMax = builder.rangeMax;
        this.rangeMin = builder.rangeMin;
        this.samples = builder.samples;
        this.tableIdKey = builder.tableIdKey;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateColumnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return chineseName
     */
    public String getChineseName() {
        return this.chineseName;
    }

    /**
     * @return columnIdKey
     */
    public String getColumnIdKey() {
        return this.columnIdKey;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enumType
     */
    public Integer getEnumType() {
        return this.enumType;
    }

    /**
     * @return enumValues
     */
    public java.util.List<String> getEnumValues() {
        return this.enumValues;
    }

    /**
     * @return rangeMax
     */
    public Long getRangeMax() {
        return this.rangeMax;
    }

    /**
     * @return rangeMin
     */
    public Long getRangeMin() {
        return this.rangeMin;
    }

    /**
     * @return samples
     */
    public java.util.List<String> getSamples() {
        return this.samples;
    }

    /**
     * @return tableIdKey
     */
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateColumnRequest, Builder> {
        private String regionId; 
        private String chineseName; 
        private String columnIdKey; 
        private String description; 
        private Integer enumType; 
        private java.util.List<String> enumValues; 
        private Long rangeMax; 
        private Long rangeMin; 
        private java.util.List<String> samples; 
        private String tableIdKey; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateColumnRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chineseName = request.chineseName;
            this.columnIdKey = request.columnIdKey;
            this.description = request.description;
            this.enumType = request.enumType;
            this.enumValues = request.enumValues;
            this.rangeMax = request.rangeMax;
            this.rangeMin = request.rangeMin;
            this.samples = request.samples;
            this.tableIdKey = request.tableIdKey;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * chineseName.
         */
        public Builder chineseName(String chineseName) {
            this.putBodyParameter("chineseName", chineseName);
            this.chineseName = chineseName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>column-AAAAAAAAh6cWOUPagYstkg</p>
         */
        public Builder columnIdKey(String columnIdKey) {
            this.putBodyParameter("columnIdKey", columnIdKey);
            this.columnIdKey = columnIdKey;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enumType(Integer enumType) {
            this.putBodyParameter("enumType", enumType);
            this.enumType = enumType;
            return this;
        }

        /**
         * enumValues.
         */
        public Builder enumValues(java.util.List<String> enumValues) {
            this.putBodyParameter("enumValues", enumValues);
            this.enumValues = enumValues;
            return this;
        }

        /**
         * rangeMax.
         */
        public Builder rangeMax(Long rangeMax) {
            this.putBodyParameter("rangeMax", rangeMax);
            this.rangeMax = rangeMax;
            return this;
        }

        /**
         * rangeMin.
         */
        public Builder rangeMin(Long rangeMin) {
            this.putBodyParameter("rangeMin", rangeMin);
            this.rangeMin = rangeMin;
            return this;
        }

        /**
         * samples.
         */
        public Builder samples(java.util.List<String> samples) {
            this.putBodyParameter("samples", samples);
            this.samples = samples;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table-AAAAAAAAFQBwSLJkUj4CYg</p>
         */
        public Builder tableIdKey(String tableIdKey) {
            this.putBodyParameter("tableIdKey", tableIdKey);
            this.tableIdKey = tableIdKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateColumnRequest build() {
            return new UpdateColumnRequest(this);
        } 

    } 

}
