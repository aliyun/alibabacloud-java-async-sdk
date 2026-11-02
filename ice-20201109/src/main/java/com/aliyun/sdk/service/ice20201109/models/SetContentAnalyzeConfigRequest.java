// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SetContentAnalyzeConfigRequest} extends {@link RequestModel}
 *
 * <p>SetContentAnalyzeConfigRequest</p>
 */
public class SetContentAnalyzeConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auto")
    private Boolean auto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveType")
    private String saveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private SetContentAnalyzeConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.auto = builder.auto;
        this.saveType = builder.saveType;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetContentAnalyzeConfigRequest create() {
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
     * @return auto
     */
    public Boolean getAuto() {
        return this.auto;
    }

    /**
     * @return saveType
     */
    public String getSaveType() {
        return this.saveType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<SetContentAnalyzeConfigRequest, Builder> {
        private String regionId; 
        private Boolean auto; 
        private String saveType; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SetContentAnalyzeConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.auto = request.auto;
            this.saveType = request.saveType;
            this.templateId = request.templateId;
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
         * <p>Specifies whether to automatically initiate intelligent content analysis after media asset registration is complete.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled. Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder auto(Boolean auto) {
            this.putQueryParameter("Auto", auto);
            this.auto = auto;
            return this;
        }

        /**
         * <p>The type of library to which analysis results are saved. This parameter can be configured only when Auto is set to true. Default value: empty.</p>
         * <ul>
         * <li>TEXT: label</li>
         * <li>FACE: face</li>
         * <li>DNA: similar image</li>
         * </ul>
         * <p>Multiple values are supported. Separate multiple values with commas (,). If this field is empty, the results of intelligent content analysis are not saved to any search library by default, and no content search of any form can be performed subsequently.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT,FACE</p>
         */
        public Builder saveType(String saveType) {
            this.putQueryParameter("SaveType", saveType);
            this.saveType = saveType;
            return this;
        }

        /**
         * <p>The ID of the intelligent content analysis template. Each template includes the following AI analysis features:</p>
         * <ul>
         * <li>S00000101-100040: optical character recognition (OCR)</li>
         * <li>S00000101-100060: video classification + face recognition</li>
         * <li>S00000101-100070: OCR + video classification + face recognition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S00000101-100070</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SetContentAnalyzeConfigRequest build() {
            return new SetContentAnalyzeConfigRequest(this);
        } 

    } 

}
