// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateNacosGrayConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacosGrayConfigRequest</p>
 */
public class UpdateNacosGrayConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrayRule")
    private String grayRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrayRuleName")
    private String grayRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrayRulePriority")
    private Integer grayRulePriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpType")
    private String opType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopGray")
    private Boolean stopGray;

    private UpdateNacosGrayConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.content = builder.content;
        this.dataId = builder.dataId;
        this.grayRule = builder.grayRule;
        this.grayRuleName = builder.grayRuleName;
        this.grayRulePriority = builder.grayRulePriority;
        this.grayType = builder.grayType;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.opType = builder.opType;
        this.regionId = builder.regionId;
        this.requestPars = builder.requestPars;
        this.stopGray = builder.stopGray;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNacosGrayConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return grayRule
     */
    public String getGrayRule() {
        return this.grayRule;
    }

    /**
     * @return grayRuleName
     */
    public String getGrayRuleName() {
        return this.grayRuleName;
    }

    /**
     * @return grayRulePriority
     */
    public Integer getGrayRulePriority() {
        return this.grayRulePriority;
    }

    /**
     * @return grayType
     */
    public String getGrayType() {
        return this.grayType;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return opType
     */
    public String getOpType() {
        return this.opType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return stopGray
     */
    public Boolean getStopGray() {
        return this.stopGray;
    }

    public static final class Builder extends Request.Builder<UpdateNacosGrayConfigRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String content; 
        private String dataId; 
        private String grayRule; 
        private String grayRuleName; 
        private Integer grayRulePriority; 
        private String grayType; 
        private String group; 
        private String instanceId; 
        private String namespaceId; 
        private String opType; 
        private String regionId; 
        private String requestPars; 
        private Boolean stopGray; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNacosGrayConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.content = request.content;
            this.dataId = request.dataId;
            this.grayRule = request.grayRule;
            this.grayRuleName = request.grayRuleName;
            this.grayRulePriority = request.grayRulePriority;
            this.grayType = request.grayType;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.opType = request.opType;
            this.regionId = request.regionId;
            this.requestPars = request.requestPars;
            this.stopGray = request.stopGray;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * GrayRule.
         */
        public Builder grayRule(String grayRule) {
            this.putQueryParameter("GrayRule", grayRule);
            this.grayRule = grayRule;
            return this;
        }

        /**
         * GrayRuleName.
         */
        public Builder grayRuleName(String grayRuleName) {
            this.putQueryParameter("GrayRuleName", grayRuleName);
            this.grayRuleName = grayRuleName;
            return this;
        }

        /**
         * GrayRulePriority.
         */
        public Builder grayRulePriority(Integer grayRulePriority) {
            this.putQueryParameter("GrayRulePriority", grayRulePriority);
            this.grayRulePriority = grayRulePriority;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tags</p>
         */
        public Builder grayType(String grayType) {
            this.putQueryParameter("GrayType", grayType);
            this.grayType = grayType;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-st2212****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * OpType.
         */
        public Builder opType(String opType) {
            this.putQueryParameter("OpType", opType);
            this.opType = opType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestPars.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * StopGray.
         */
        public Builder stopGray(Boolean stopGray) {
            this.putQueryParameter("StopGray", stopGray);
            this.stopGray = stopGray;
            return this;
        }

        @Override
        public UpdateNacosGrayConfigRequest build() {
            return new UpdateNacosGrayConfigRequest(this);
        } 

    } 

}
