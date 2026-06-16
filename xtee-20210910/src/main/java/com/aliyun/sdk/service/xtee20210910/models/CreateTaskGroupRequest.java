// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CreateTaskGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskGroupRequest</p>
 */
public class CreateTaskGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleIds")
    private String sampleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scenes")
    private String scenes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCodes")
    private String serviceCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceList")
    private String serviceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceNames")
    private String serviceNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskGroupName")
    private String taskGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateTaskGroupRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sampleIds = builder.sampleIds;
        this.scenes = builder.scenes;
        this.serviceCodes = builder.serviceCodes;
        this.serviceList = builder.serviceList;
        this.serviceNames = builder.serviceNames;
        this.tab = builder.tab;
        this.taskGroupName = builder.taskGroupName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sampleIds
     */
    public String getSampleIds() {
        return this.sampleIds;
    }

    /**
     * @return scenes
     */
    public String getScenes() {
        return this.scenes;
    }

    /**
     * @return serviceCodes
     */
    public String getServiceCodes() {
        return this.serviceCodes;
    }

    /**
     * @return serviceList
     */
    public String getServiceList() {
        return this.serviceList;
    }

    /**
     * @return serviceNames
     */
    public String getServiceNames() {
        return this.serviceNames;
    }

    /**
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    /**
     * @return taskGroupName
     */
    public String getTaskGroupName() {
        return this.taskGroupName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateTaskGroupRequest, Builder> {
        private String lang; 
        private String regId; 
        private String sampleIds; 
        private String scenes; 
        private String serviceCodes; 
        private String serviceList; 
        private String serviceNames; 
        private String tab; 
        private String taskGroupName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskGroupRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.sampleIds = request.sampleIds;
            this.scenes = request.scenes;
            this.serviceCodes = request.serviceCodes;
            this.serviceList = request.serviceList;
            this.serviceNames = request.serviceNames;
            this.tab = request.tab;
            this.taskGroupName = request.taskGroupName;
            this.type = request.type;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * SampleIds.
         */
        public Builder sampleIds(String sampleIds) {
            this.putQueryParameter("SampleIds", sampleIds);
            this.sampleIds = sampleIds;
            return this;
        }

        /**
         * Scenes.
         */
        public Builder scenes(String scenes) {
            this.putQueryParameter("Scenes", scenes);
            this.scenes = scenes;
            return this;
        }

        /**
         * ServiceCodes.
         */
        public Builder serviceCodes(String serviceCodes) {
            this.putQueryParameter("ServiceCodes", serviceCodes);
            this.serviceCodes = serviceCodes;
            return this;
        }

        /**
         * ServiceList.
         */
        public Builder serviceList(String serviceList) {
            this.putQueryParameter("ServiceList", serviceList);
            this.serviceList = serviceList;
            return this;
        }

        /**
         * ServiceNames.
         */
        public Builder serviceNames(String serviceNames) {
            this.putQueryParameter("ServiceNames", serviceNames);
            this.serviceNames = serviceNames;
            return this;
        }

        /**
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        /**
         * TaskGroupName.
         */
        public Builder taskGroupName(String taskGroupName) {
            this.putQueryParameter("TaskGroupName", taskGroupName);
            this.taskGroupName = taskGroupName;
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
        public CreateTaskGroupRequest build() {
            return new CreateTaskGroupRequest(this);
        } 

    } 

}
