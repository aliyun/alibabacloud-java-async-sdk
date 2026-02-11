// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link ListAlertTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListAlertTemplatesRequest</p>
 */
public class ListAlertTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertProvider")
    private String alertProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private String labels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateProvider")
    private String templateProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListAlertTemplatesRequest(Builder builder) {
        super(builder);
        this.alertProvider = builder.alertProvider;
        this.labels = builder.labels;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.templateProvider = builder.templateProvider;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertProvider
     */
    public String getAlertProvider() {
        return this.alertProvider;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return templateProvider
     */
    public String getTemplateProvider() {
        return this.templateProvider;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListAlertTemplatesRequest, Builder> {
        private String alertProvider; 
        private String labels; 
        private String name; 
        private String regionId; 
        private Boolean status; 
        private String templateProvider; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListAlertTemplatesRequest request) {
            super(request);
            this.alertProvider = request.alertProvider;
            this.labels = request.labels;
            this.name = request.name;
            this.regionId = request.regionId;
            this.status = request.status;
            this.templateProvider = request.templateProvider;
            this.type = request.type;
        } 

        /**
         * AlertProvider.
         */
        public Builder alertProvider(String alertProvider) {
            this.putQueryParameter("AlertProvider", alertProvider);
            this.alertProvider = alertProvider;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TemplateProvider.
         */
        public Builder templateProvider(String templateProvider) {
            this.putQueryParameter("TemplateProvider", templateProvider);
            this.templateProvider = templateProvider;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListAlertTemplatesRequest build() {
            return new ListAlertTemplatesRequest(this);
        } 

    } 

}
