// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListListenersByConfigRequest} extends {@link RequestModel}
 *
 * <p>ListListenersByConfigRequest</p>
 */
public class ListListenersByConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtGrayRules")
    private java.util.List < ExtGrayRules> extGrayRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    private ListListenersByConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.dataId = builder.dataId;
        this.extGrayRules = builder.extGrayRules;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersByConfigRequest create() {
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
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return extGrayRules
     */
    public java.util.List < ExtGrayRules> getExtGrayRules() {
        return this.extGrayRules;
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
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<ListListenersByConfigRequest, Builder> {
        private String acceptLanguage; 
        private String dataId; 
        private java.util.List < ExtGrayRules> extGrayRules; 
        private String group; 
        private String instanceId; 
        private String namespaceId; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(ListListenersByConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.dataId = request.dataId;
            this.extGrayRules = request.extGrayRules;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.requestPars = request.requestPars;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zeekr-clueboss.yml</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * ExtGrayRules.
         */
        public Builder extGrayRules(java.util.List < ExtGrayRules> extGrayRules) {
            String extGrayRulesShrink = shrink(extGrayRules, "ExtGrayRules", "json");
            this.putQueryParameter("ExtGrayRules", extGrayRulesShrink);
            this.extGrayRules = extGrayRules;
            return this;
        }

        /**
         * <p>The name of the group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-m7r1yurp00e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>aaeb4d28-c9eb-4fa2-85f5-d03ce7ee8df1</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The extended request parameters in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;appGroup\&quot;:\&quot;emas-zfive_prehost\&quot;,\&quot;appName\&quot;:\&quot;emas-zfive\&quot;,\&quot;appStage\&quot;:\&quot;PRE_PUBLISH\&quot;,\&quot;appUnit\&quot;:\&quot;\&quot;,\&quot;bucId\&quot;:\&quot;225902\&quot;,\&quot;bucName\&quot;:\&quot;Wireless\&quot;,\&quot;provider\&quot;:\&quot;aliyun\&quot;}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public ListListenersByConfigRequest build() {
            return new ListListenersByConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListListenersByConfigRequest} extends {@link TeaModel}
     *
     * <p>ListListenersByConfigRequest</p>
     */
    public static class ExtGrayRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrayRule")
        private String grayRule;

        @com.aliyun.core.annotation.NameInMap("GrayRuleName")
        private String grayRuleName;

        @com.aliyun.core.annotation.NameInMap("GrayRulePriority")
        private Integer grayRulePriority;

        @com.aliyun.core.annotation.NameInMap("GrayRuleType")
        private String grayRuleType;

        private ExtGrayRules(Builder builder) {
            this.grayRule = builder.grayRule;
            this.grayRuleName = builder.grayRuleName;
            this.grayRulePriority = builder.grayRulePriority;
            this.grayRuleType = builder.grayRuleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtGrayRules create() {
            return builder().build();
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
         * @return grayRuleType
         */
        public String getGrayRuleType() {
            return this.grayRuleType;
        }

        public static final class Builder {
            private String grayRule; 
            private String grayRuleName; 
            private Integer grayRulePriority; 
            private String grayRuleType; 

            /**
             * GrayRule.
             */
            public Builder grayRule(String grayRule) {
                this.grayRule = grayRule;
                return this;
            }

            /**
             * GrayRuleName.
             */
            public Builder grayRuleName(String grayRuleName) {
                this.grayRuleName = grayRuleName;
                return this;
            }

            /**
             * GrayRulePriority.
             */
            public Builder grayRulePriority(Integer grayRulePriority) {
                this.grayRulePriority = grayRulePriority;
                return this;
            }

            /**
             * GrayRuleType.
             */
            public Builder grayRuleType(String grayRuleType) {
                this.grayRuleType = grayRuleType;
                return this;
            }

            public ExtGrayRules build() {
                return new ExtGrayRules(this);
            } 

        } 

    }
}
