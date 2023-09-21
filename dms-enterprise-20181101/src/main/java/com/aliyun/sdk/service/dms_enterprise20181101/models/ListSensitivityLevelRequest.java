// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitivityLevelRequest} extends {@link RequestModel}
 *
 * <p>ListSensitivityLevelRequest</p>
 */
public class ListSensitivityLevelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ListSensitivityLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitivityLevelRequest create() {
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListSensitivityLevelRequest, Builder> {
        private String regionId; 
        private Long templateId; 
        private String templateType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListSensitivityLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templateId = request.templateId;
            this.templateType = request.templateType;
            this.tid = request.tid;
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
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListSensitivityLevelRequest build() {
            return new ListSensitivityLevelRequest(this);
        } 

    } 

}
