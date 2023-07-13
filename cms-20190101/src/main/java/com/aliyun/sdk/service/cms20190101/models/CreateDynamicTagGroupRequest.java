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
         * ContactGroupList.
         */
        public Builder contactGroupList(java.util.List < String > contactGroupList) {
            this.putQueryParameter("ContactGroupList", contactGroupList);
            this.contactGroupList = contactGroupList;
            return this;
        }

        /**
         * EnableInstallAgent.
         */
        public Builder enableInstallAgent(Boolean enableInstallAgent) {
            this.putQueryParameter("EnableInstallAgent", enableInstallAgent);
            this.enableInstallAgent = enableInstallAgent;
            return this;
        }

        /**
         * EnableSubscribeEvent.
         */
        public Builder enableSubscribeEvent(Boolean enableSubscribeEvent) {
            this.putQueryParameter("EnableSubscribeEvent", enableSubscribeEvent);
            this.enableSubscribeEvent = enableSubscribeEvent;
            return this;
        }

        /**
         * MatchExpress.
         */
        public Builder matchExpress(java.util.List < MatchExpress> matchExpress) {
            this.putQueryParameter("MatchExpress", matchExpress);
            this.matchExpress = matchExpress;
            return this;
        }

        /**
         * MatchExpressFilterRelation.
         */
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            this.putQueryParameter("MatchExpressFilterRelation", matchExpressFilterRelation);
            this.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }

        /**
         * TagKey.
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * TagRegionId.
         */
        public Builder tagRegionId(String tagRegionId) {
            this.putQueryParameter("TagRegionId", tagRegionId);
            this.tagRegionId = tagRegionId;
            return this;
        }

        /**
         * TemplateIdList.
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
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * TagValueMatchFunction.
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
