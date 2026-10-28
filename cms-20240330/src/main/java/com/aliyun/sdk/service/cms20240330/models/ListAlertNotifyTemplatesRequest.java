// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListAlertNotifyTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListAlertNotifyTemplatesRequest</p>
 */
public class ListAlertNotifyTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateIds")
    private java.util.List<String> alertNotifyTemplateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateName")
    private String alertNotifyTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("programLang")
    private String programLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ListAlertNotifyTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertNotifyTemplateIds = builder.alertNotifyTemplateIds;
        this.alertNotifyTemplateName = builder.alertNotifyTemplateName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.programLang = builder.programLang;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertNotifyTemplatesRequest create() {
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
     * @return alertNotifyTemplateIds
     */
    public java.util.List<String> getAlertNotifyTemplateIds() {
        return this.alertNotifyTemplateIds;
    }

    /**
     * @return alertNotifyTemplateName
     */
    public String getAlertNotifyTemplateName() {
        return this.alertNotifyTemplateName;
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
     * @return programLang
     */
    public String getProgramLang() {
        return this.programLang;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAlertNotifyTemplatesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> alertNotifyTemplateIds; 
        private String alertNotifyTemplateName; 
        private Long pageNumber; 
        private Long pageSize; 
        private String programLang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertNotifyTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertNotifyTemplateIds = request.alertNotifyTemplateIds;
            this.alertNotifyTemplateName = request.alertNotifyTemplateName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.programLang = request.programLang;
            this.type = request.type;
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
         * <p>The list of notification template IDs.</p>
         */
        public Builder alertNotifyTemplateIds(java.util.List<String> alertNotifyTemplateIds) {
            String alertNotifyTemplateIdsShrink = shrink(alertNotifyTemplateIds, "alertNotifyTemplateIds", "json");
            this.putQueryParameter("alertNotifyTemplateIds", alertNotifyTemplateIdsShrink);
            this.alertNotifyTemplateIds = alertNotifyTemplateIds;
            return this;
        }

        /**
         * <p>The notification template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert notification template</p>
         */
        public Builder alertNotifyTemplateName(String alertNotifyTemplateName) {
            this.putQueryParameter("alertNotifyTemplateName", alertNotifyTemplateName);
            this.alertNotifyTemplateName = alertNotifyTemplateName;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The template locale.</p>
         * 
         * <strong>example:</strong>
         * <p>GO</p>
         */
        public Builder programLang(String programLang) {
            this.putQueryParameter("programLang", programLang);
            this.programLang = programLang;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>DING</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAlertNotifyTemplatesRequest build() {
            return new ListAlertNotifyTemplatesRequest(this);
        } 

    } 

}
