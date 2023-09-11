// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportAppAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ImportAppAlertRulesRequest</p>
 */
public class ImportAppAlertRulesRequest extends Request {
    @Query
    @NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @Query
    @NameInMap("IsAutoStart")
    private Boolean isAutoStart;

    @Query
    @NameInMap("Pids")
    @Validation(required = true)
    private String pids;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("TemplageAlertConfig")
    private String templageAlertConfig;

    @Query
    @NameInMap("TemplateAlertId")
    private String templateAlertId;

    private ImportAppAlertRulesRequest(Builder builder) {
        super(builder);
        this.contactGroupIds = builder.contactGroupIds;
        this.isAutoStart = builder.isAutoStart;
        this.pids = builder.pids;
        this.regionId = builder.regionId;
        this.tags = builder.tags;
        this.templageAlertConfig = builder.templageAlertConfig;
        this.templateAlertId = builder.templateAlertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportAppAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupIds
     */
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return isAutoStart
     */
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    /**
     * @return pids
     */
    public String getPids() {
        return this.pids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templageAlertConfig
     */
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    /**
     * @return templateAlertId
     */
    public String getTemplateAlertId() {
        return this.templateAlertId;
    }

    public static final class Builder extends Request.Builder<ImportAppAlertRulesRequest, Builder> {
        private String contactGroupIds; 
        private Boolean isAutoStart; 
        private String pids; 
        private String regionId; 
        private java.util.List < Tags> tags; 
        private String templageAlertConfig; 
        private String templateAlertId; 

        private Builder() {
            super();
        } 

        private Builder(ImportAppAlertRulesRequest request) {
            super(request);
            this.contactGroupIds = request.contactGroupIds;
            this.isAutoStart = request.isAutoStart;
            this.pids = request.pids;
            this.regionId = request.regionId;
            this.tags = request.tags;
            this.templageAlertConfig = request.templageAlertConfig;
            this.templateAlertId = request.templateAlertId;
        } 

        /**
         * The IDs of the alert contact groups. The value must be a JSON array.
         */
        public Builder contactGroupIds(String contactGroupIds) {
            this.putQueryParameter("ContactGroupIds", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * Specifies whether to enable the alert rule after it is created. Default value: `false`.
         * <p>
         * 
         * *   `true`: enables the alert rule.
         * *   `false`: disables the alert rule.
         */
        public Builder isAutoStart(Boolean isAutoStart) {
            this.putQueryParameter("IsAutoStart", isAutoStart);
            this.isAutoStart = isAutoStart;
            return this;
        }

        /**
         * The process identifiers (PIDs) of the applications associated with the alert rule. The value must be a JSON array. For more information about how to obtain the PID, see [Obtain the PID of an application](~~186100#section-bkl-3j6-ezg~~).
         */
        public Builder pids(String pids) {
            this.putQueryParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * The ID of the region where the associated applications reside.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The configurations of the alert template based on which you want to create an alert rule. The value must be a JSON string. You must set at least one of the **TemplateAlertId** and **TemplageAlertConfig** parameters. If you set both parameters, the **TemplateAlertId** parameter prevails. For more information about the TemplageAlertConfig parameter, see the following **additional information about the TemplageAlertConfig parameter**.
         */
        public Builder templageAlertConfig(String templageAlertConfig) {
            this.putQueryParameter("TemplageAlertConfig", templageAlertConfig);
            this.templageAlertConfig = templageAlertConfig;
            return this;
        }

        /**
         * The ID of the alert template. You must set at least one of the **TemplateAlertId** and **TemplageAlertConfig** parameters. If you set both parameters, the **TemplateAlertId** parameter prevails.
         */
        public Builder templateAlertId(String templateAlertId) {
            this.putQueryParameter("TemplateAlertId", templateAlertId);
            this.templateAlertId = templateAlertId;
            return this;
        }

        @Override
        public ImportAppAlertRulesRequest build() {
            return new ImportAppAlertRulesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
