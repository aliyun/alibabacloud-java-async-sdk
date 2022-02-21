// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOfficePreviewURLRequest} extends {@link RequestModel}
 *
 * <p>GetOfficePreviewURLRequest</p>
 */
public class GetOfficePreviewURLRequest extends Request {
    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SrcType")
    private String srcType;

    @Query
    @NameInMap("SrcUri")
    @Validation(required = true)
    private String srcUri;

    @Query
    @NameInMap("WatermarkFillStyle")
    private String watermarkFillStyle;

    @Query
    @NameInMap("WatermarkFont")
    private String watermarkFont;

    @Query
    @NameInMap("WatermarkHorizontal")
    private Integer watermarkHorizontal;

    @Query
    @NameInMap("WatermarkRotate")
    private Float watermarkRotate;

    @Query
    @NameInMap("WatermarkType")
    private Integer watermarkType;

    @Query
    @NameInMap("WatermarkValue")
    private String watermarkValue;

    @Query
    @NameInMap("WatermarkVertical")
    private Integer watermarkVertical;

    private GetOfficePreviewURLRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.srcType = builder.srcType;
        this.srcUri = builder.srcUri;
        this.watermarkFillStyle = builder.watermarkFillStyle;
        this.watermarkFont = builder.watermarkFont;
        this.watermarkHorizontal = builder.watermarkHorizontal;
        this.watermarkRotate = builder.watermarkRotate;
        this.watermarkType = builder.watermarkType;
        this.watermarkValue = builder.watermarkValue;
        this.watermarkVertical = builder.watermarkVertical;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfficePreviewURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return srcType
     */
    public String getSrcType() {
        return this.srcType;
    }

    /**
     * @return srcUri
     */
    public String getSrcUri() {
        return this.srcUri;
    }

    /**
     * @return watermarkFillStyle
     */
    public String getWatermarkFillStyle() {
        return this.watermarkFillStyle;
    }

    /**
     * @return watermarkFont
     */
    public String getWatermarkFont() {
        return this.watermarkFont;
    }

    /**
     * @return watermarkHorizontal
     */
    public Integer getWatermarkHorizontal() {
        return this.watermarkHorizontal;
    }

    /**
     * @return watermarkRotate
     */
    public Float getWatermarkRotate() {
        return this.watermarkRotate;
    }

    /**
     * @return watermarkType
     */
    public Integer getWatermarkType() {
        return this.watermarkType;
    }

    /**
     * @return watermarkValue
     */
    public String getWatermarkValue() {
        return this.watermarkValue;
    }

    /**
     * @return watermarkVertical
     */
    public Integer getWatermarkVertical() {
        return this.watermarkVertical;
    }

    public static final class Builder extends Request.Builder<GetOfficePreviewURLRequest, Builder> {
        private String project; 
        private String regionId; 
        private String srcType; 
        private String srcUri; 
        private String watermarkFillStyle; 
        private String watermarkFont; 
        private Integer watermarkHorizontal; 
        private Float watermarkRotate; 
        private Integer watermarkType; 
        private String watermarkValue; 
        private Integer watermarkVertical; 

        private Builder() {
            super();
        } 

        private Builder(GetOfficePreviewURLRequest response) {
            super(response);
            this.project = response.project;
            this.regionId = response.regionId;
            this.srcType = response.srcType;
            this.srcUri = response.srcUri;
            this.watermarkFillStyle = response.watermarkFillStyle;
            this.watermarkFont = response.watermarkFont;
            this.watermarkHorizontal = response.watermarkHorizontal;
            this.watermarkRotate = response.watermarkRotate;
            this.watermarkType = response.watermarkType;
            this.watermarkValue = response.watermarkValue;
            this.watermarkVertical = response.watermarkVertical;
        } 

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SrcType.
         */
        public Builder srcType(String srcType) {
            this.putQueryParameter("SrcType", srcType);
            this.srcType = srcType;
            return this;
        }

        /**
         * SrcUri.
         */
        public Builder srcUri(String srcUri) {
            this.putQueryParameter("SrcUri", srcUri);
            this.srcUri = srcUri;
            return this;
        }

        /**
         * WatermarkFillStyle.
         */
        public Builder watermarkFillStyle(String watermarkFillStyle) {
            this.putQueryParameter("WatermarkFillStyle", watermarkFillStyle);
            this.watermarkFillStyle = watermarkFillStyle;
            return this;
        }

        /**
         * WatermarkFont.
         */
        public Builder watermarkFont(String watermarkFont) {
            this.putQueryParameter("WatermarkFont", watermarkFont);
            this.watermarkFont = watermarkFont;
            return this;
        }

        /**
         * WatermarkHorizontal.
         */
        public Builder watermarkHorizontal(Integer watermarkHorizontal) {
            this.putQueryParameter("WatermarkHorizontal", watermarkHorizontal);
            this.watermarkHorizontal = watermarkHorizontal;
            return this;
        }

        /**
         * WatermarkRotate.
         */
        public Builder watermarkRotate(Float watermarkRotate) {
            this.putQueryParameter("WatermarkRotate", watermarkRotate);
            this.watermarkRotate = watermarkRotate;
            return this;
        }

        /**
         * WatermarkType.
         */
        public Builder watermarkType(Integer watermarkType) {
            this.putQueryParameter("WatermarkType", watermarkType);
            this.watermarkType = watermarkType;
            return this;
        }

        /**
         * WatermarkValue.
         */
        public Builder watermarkValue(String watermarkValue) {
            this.putQueryParameter("WatermarkValue", watermarkValue);
            this.watermarkValue = watermarkValue;
            return this;
        }

        /**
         * WatermarkVertical.
         */
        public Builder watermarkVertical(Integer watermarkVertical) {
            this.putQueryParameter("WatermarkVertical", watermarkVertical);
            this.watermarkVertical = watermarkVertical;
            return this;
        }

        @Override
        public GetOfficePreviewURLRequest build() {
            return new GetOfficePreviewURLRequest(this);
        } 

    } 

}
