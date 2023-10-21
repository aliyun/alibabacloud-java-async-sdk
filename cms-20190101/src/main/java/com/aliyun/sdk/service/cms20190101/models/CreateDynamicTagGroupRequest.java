// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDynamicTagGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDynamicTagGroupRequest</p>
 */
public class CreateDynamicTagGroupRequest extends Request {
    @Query
    @NameInMap("ContactGroupList")
    @Validation(required = true)
    private java.util.List < String > contactGroupList;

    @Query
    @NameInMap("EnableInstallAgent")
    private Boolean enableInstallAgent;

    @Query
    @NameInMap("EnableSubscribeEvent")
    private Boolean enableSubscribeEvent;

    @Query
    @NameInMap("MatchExpress")
    @Validation(required = true)
    private java.util.List < MatchExpress> matchExpress;

    @Query
    @NameInMap("MatchExpressFilterRelation")
    private String matchExpressFilterRelation;

    @Query
    @NameInMap("TagKey")
    @Validation(required = true)
    private String tagKey;

    @Query
    @NameInMap("TagRegionId")
    private String tagRegionId;

    @Query
    @NameInMap("TemplateIdList")
    private java.util.List < String > templateIdList;

    private CreateDynamicTagGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupList = builder.contactGroupList;
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
     * @return contactGroupList
     */
    public java.util.List < String > getContactGroupList() {
        return this.contactGroupList;
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
    public java.util.List < MatchExpress> getMatchExpress() {
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
    public java.util.List < String > getTemplateIdList() {
        return this.templateIdList;
    }

    public static final class Builder extends Request.Builder<CreateDynamicTagGroupRequest, Builder> {
        private java.util.List < String > contactGroupList; 
        private Boolean enableInstallAgent; 
        private Boolean enableSubscribeEvent; 
        private java.util.List < MatchExpress> matchExpress; 
        private String matchExpressFilterRelation; 
        private String tagKey; 
        private String tagRegionId; 
        private java.util.List < String > templateIdList; 

        private Builder() {
            super();
        } 

        private Builder(CreateDynamicTagGroupRequest request) {
            super(request);
            this.contactGroupList = request.contactGroupList;
            this.enableInstallAgent = request.enableInstallAgent;
            this.enableSubscribeEvent = request.enableSubscribeEvent;
            this.matchExpress = request.matchExpress;
            this.matchExpressFilterRelation = request.matchExpressFilterRelation;
            this.tagKey = request.tagKey;
            this.tagRegionId = request.tagRegionId;
            this.templateIdList = request.templateIdList;
        } 

        /**
         * The relationship between the conditional expressions for the tag values of the cloud resources. Valid values:
         * <p>
         * 
         * *   and (default)
         * *   or
         */
        public Builder contactGroupList(java.util.List < String > contactGroupList) {
            this.putQueryParameter("ContactGroupList", contactGroupList);
            this.contactGroupList = contactGroupList;
            return this;
        }

        /**
         * The ID of the region to which the tags belong.
         */
        public Builder enableInstallAgent(Boolean enableInstallAgent) {
            this.putQueryParameter("EnableInstallAgent", enableInstallAgent);
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }

        /**
         * The keys of the tags that are used to create the application group. If a specified key is attached to multiple resources, the resources that have the same key-value pair are added to the same group.
         */
        public Builder enableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.putQueryParameter("EnableSubscribeEvent", enableSubscribeEvent);
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }

        /**
         * Specifies whether the CloudMonitor agent is automatically installed for the application group. CloudMonitor determines whether to automatically install the CloudMonitor agent for the hosts in an application group based on the value of this parameter. Valid values:
         * <p>
         * 
         * *   true: The CloudMonitor agent is automatically installed.
         * *   false (default): The CloudMonitor agent is not automatically installed.
         */
        public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
            this.putQueryParameter("MatchExpress", matchExpress);
            this.matchExpress = matchExpress;
            return this;
        }

        /**
         * Specifies whether the application group automatically subscribes to event notifications. If events whose severity level is critical or warning occur on resources in an application group, CloudMonitor sends alert notifications. Valid values:
         * <p>
         * 
         * *   true: The application group automatically subscribes to event notifications.
         * *   false (default): The application group does not automatically subscribe to event notifications.
         */
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            this.putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }

        /**
         * The alert contact groups. Valid values of N: 1 to 100. The alert notifications of the application group are sent to the alert contacts that belong to the specified alert contact groups.
         * <p>
         * 
         * An alert contact group can contain one or more alert contacts. For information about how to create alert contacts and alert contact groups, see [PutContact](~~114923~~) and [PutContactGroup](~~114929~~). For information about how to obtain alert contact groups, see [DescribeContactGroupList](~~114922~~).
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * The tag keys of the cloud resources.
         * <p>
         * 
         * For more information about how to obtain tag keys, see [DescribeTagKeyList](~~145558~~).
         */
        public Builder tagRegionId(String tagRegionId) {
            this.putQueryParameter("TagRegionId", tagRegionId);
            this.tagRegionId = tagRegionId;
            return this;
        }

        /**
         * The IDs of the alert templates.
         * <p>
         * 
         * For more information about how to query alert template IDs, see [DescribeMetricRuleTemplateList](~~114982~~).
         */
        public Builder templateIdList(java.util.List < String > templateIdList) {
            this.putQueryParameter("TemplateIdList", templateIdList);
            this.templateIdList = templateIdList;
            return this;
        }

        @Override
        public CreateDynamicTagGroupRequest build() {
            return new CreateDynamicTagGroupRequest(this);
        } 

    } 

    public static class MatchExpress extends TeaModel {
        @NameInMap("TagName")
        private String tagName;

        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagValueMatchFunction")
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

            /**
             * The tag values of the cloud resources. In this example, set the value of N to 1.
             * <p>
             * 
             * >  If you set the `MatchExpress.N.TagValueMatchFunction` parameter, you must also set the `MatchExpress.N.TagValue` parameter.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * The ID of the region to which the tags belong.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The error message.
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
