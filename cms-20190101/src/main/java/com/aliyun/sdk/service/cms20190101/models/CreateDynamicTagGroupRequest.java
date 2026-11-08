// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link CreateDynamicTagGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDynamicTagGroupRequest</p>
 */
public class CreateDynamicTagGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> contactGroupList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInstallAgent")
    private Boolean enableInstallAgent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSubscribeEvent")
    private Boolean enableSubscribeEvent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchExpress")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<MatchExpress> matchExpress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchExpressFilterRelation")
    private String matchExpressFilterRelation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagRegionId")
    private String tagRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIdList")
    private java.util.List<String> templateIdList;

    private CreateDynamicTagGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.contactGroupList = builder.contactGroupList;
        this.dryRun = builder.dryRun;
        this.enableInstallAgent = builder.enableInstallAgent;
        this.enableSubscribeEvent = builder.enableSubscribeEvent;
        this.matchExpress = builder.matchExpress;
        this.matchExpressFilterRelation = builder.matchExpressFilterRelation;
        this.tagKey = builder.tagKey;
        this.tagRegionId = builder.tagRegionId;
        this.templateIdList = builder.templateIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDynamicTagGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return contactGroupList
     */
    public java.util.List<String> getContactGroupList() {
        return this.contactGroupList;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return enableInstallAgent
     */
    public Boolean getEnableInstallAgent() {
        return this.enableInstallAgent;
    }

    /**
     * @return enableSubscribeEvent
     */
    public Boolean getEnableSubscribeEvent() {
        return this.enableSubscribeEvent;
    }

    /**
     * @return matchExpress
     */
    public java.util.List<MatchExpress> getMatchExpress() {
        return this.matchExpress;
    }

    /**
     * @return matchExpressFilterRelation
     */
    public String getMatchExpressFilterRelation() {
        return this.matchExpressFilterRelation;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * @return tagRegionId
     */
    public String getTagRegionId() {
        return this.tagRegionId;
    }

    /**
     * @return templateIdList
     */
    public java.util.List<String> getTemplateIdList() {
        return this.templateIdList;
    }

    public static final class Builder extends Request.Builder<CreateDynamicTagGroupRequest, Builder> {
        private String clientToken; 
        private java.util.List<String> contactGroupList; 
        private Boolean dryRun; 
        private Boolean enableInstallAgent; 
        private Boolean enableSubscribeEvent; 
        private java.util.List<MatchExpress> matchExpress; 
        private String matchExpressFilterRelation; 
        private String tagKey; 
        private String tagRegionId; 
        private java.util.List<String> templateIdList; 

        private Builder() {
            super();
        } 

        private Builder(CreateDynamicTagGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.contactGroupList = request.contactGroupList;
            this.dryRun = request.dryRun;
            this.enableInstallAgent = request.enableInstallAgent;
            this.enableSubscribeEvent = request.enableSubscribeEvent;
            this.matchExpress = request.matchExpress;
            this.matchExpressFilterRelation = request.matchExpressFilterRelation;
            this.tagKey = request.tagKey;
            this.tagRegionId = request.tagRegionId;
            this.templateIdList = request.templateIdList;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The alert contact groups. Valid values of N: 1 to 100. Alert notifications for the application group are sent to the alert contacts in the alert contact groups.</p>
         * <p>An alert contact group contains one or more alert contacts. For more information about how to create alert contacts and alert contact groups, see <a href="https://help.aliyun.com/document_detail/114923.html">PutContact</a> and <a href="https://help.aliyun.com/document_detail/114929.html">PutContactGroup</a>. For more information about how to query alert contact groups, see <a href="https://help.aliyun.com/document_detail/114922.html">DescribeContactGroupList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_Group</p>
         */
        public Builder contactGroupList(java.util.List<String> contactGroupList) {
            this.putQueryParameter("ContactGroupList", contactGroupList);
            this.contactGroupList = contactGroupList;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without creating the queue. The system checks whether required parameters are specified, the request format is valid, and business limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the error code DryRunOperation is returned.</li>
         * <li><strong>false</strong>: performs a dry run and creates the queue if the request passes the dry run. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic installation of the CloudMonitor agent for the application group. CloudMonitor automatically installs the CloudMonitor agent on the hosts in the application group. Valid values:</p>
         * <ul>
         * <li><p>true: enables automatic installation.</p>
         * </li>
         * <li><p>false: disables automatic installation. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInstallAgent(Boolean enableInstallAgent) {
            this.putQueryParameter("EnableInstallAgent", enableInstallAgent);
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic subscription to event notifications for the application group. When a critical or warning event occurs on a resource in the application group, CloudMonitor sends an alert notification. Valid values:</p>
         * <ul>
         * <li><p>true: enables automatic subscription.</p>
         * </li>
         * <li><p>false: disables automatic subscription. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.putQueryParameter("EnableSubscribeEvent", enableSubscribeEvent);
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }

        /**
         * <p>The match expression used to generate the application group based on tags.</p>
         * <p>This parameter is required.</p>
         */
        public Builder matchExpress(java.util.List<MatchExpress> matchExpress) {
            this.putQueryParameter("MatchExpress", matchExpress);
            this.matchExpress = matchExpress;
            return this;
        }

        /**
         * <p>The relationship between the conditional expressions of the resource tag values. Valid values:</p>
         * <ul>
         * <li>and: AND. This is the default value.</li>
         * <li>or: OR.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            this.putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }

        /**
         * <p>The tag key of the resource.</p>
         * <p>For more information about how to query the tag keys of resources, see <a href="https://help.aliyun.com/document_detail/145558.html">DescribeTagKeyList</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs_instance</p>
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * <p>The region ID to which the tag belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder tagRegionId(String tagRegionId) {
            this.putQueryParameter("TagRegionId", tagRegionId);
            this.tagRegionId = tagRegionId;
            return this;
        }

        /**
         * <p>The IDs of the alert templates.</p>
         * <p>For more information about how to query the IDs of alert templates, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>85****</p>
         */
        public Builder templateIdList(java.util.List<String> templateIdList) {
            this.putQueryParameter("TemplateIdList", templateIdList);
            this.templateIdList = templateIdList;
            return this;
        }

        @Override
        public CreateDynamicTagGroupRequest build() {
            return new CreateDynamicTagGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDynamicTagGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateDynamicTagGroupRequest</p>
     */
    public static class MatchExpress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("TagValueMatchFunction")
        private String tagValueMatchFunction;

        private MatchExpress(Builder builder) {
            this.tagName = builder.tagName;
            this.tagValue = builder.tagValue;
            this.tagValueMatchFunction = builder.tagValueMatchFunction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchExpress create() {
            return builder().build();
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagValueMatchFunction
         */
        public String getTagValueMatchFunction() {
            return this.tagValueMatchFunction;
        }

        public static final class Builder {
            private String tagName; 
            private String tagValue; 
            private String tagValueMatchFunction; 

            private Builder() {
            } 

            private Builder(MatchExpress model) {
                this.tagName = model.tagName;
                this.tagValue = model.tagValue;
                this.tagValueMatchFunction = model.tagValueMatchFunction;
            } 

            /**
             * <p>The tag key used to create the group. If multiple resources contain this key, the matched resources are added to the same group based on the same key-value pair according to the filter conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>appname</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * <p>The resource tag value. Valid values of N: 1.</p>
             * <blockquote>
             * <p>You must specify both MatchExpress.N.TagValueMatchFunction and MatchExpress.N.TagValue at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * <p>The matching method for the resource tag value. Valid values of N: 1. Valid values:</p>
             * <ul>
             * <li>contains: includes</li>
             * <li>startWith: prefix</li>
             * <li>endWith: suffix</li>
             * <li>notContains: excludes</li>
             * <li>equals: equals</li>
             * <li>all: all</li>
             * </ul>
             * <blockquote>
             * <p>You must specify both MatchExpress.N.TagValueMatchFunction and MatchExpress.N.TagValue at the same time.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>contains</p>
             */
            public Builder tagValueMatchFunction(String tagValueMatchFunction) {
                this.tagValueMatchFunction = tagValueMatchFunction;
                return this;
            }

            public MatchExpress build() {
                return new MatchExpress(this);
            } 

        } 

    }
}
