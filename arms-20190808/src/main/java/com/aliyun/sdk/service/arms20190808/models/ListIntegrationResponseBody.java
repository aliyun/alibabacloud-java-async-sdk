// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntegrationResponseBody</p>
 */
public class ListIntegrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIntegrationResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntegrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntegrationResponseBody build() {
            return new ListIntegrationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntegrationResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationResponseBody</p>
     */
    public static class IntegrationDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRecover")
        private Boolean autoRecover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DuplicateKey")
        private String duplicateKey;

        @com.aliyun.core.annotation.NameInMap("ExtendedFieldRedefineRules")
        private java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules;

        @com.aliyun.core.annotation.NameInMap("FieldRedefineRules")
        private java.util.List < java.util.Map<String, ?>> fieldRedefineRules;

        @com.aliyun.core.annotation.NameInMap("InitiativeRecoverField")
        private String initiativeRecoverField;

        @com.aliyun.core.annotation.NameInMap("InitiativeRecoverValue")
        private String initiativeRecoverValue;

        @com.aliyun.core.annotation.NameInMap("RecoverTime")
        private Long recoverTime;

        @com.aliyun.core.annotation.NameInMap("Stat")
        private java.util.List < Long > stat;

        private IntegrationDetail(Builder builder) {
            this.autoRecover = builder.autoRecover;
            this.description = builder.description;
            this.duplicateKey = builder.duplicateKey;
            this.extendedFieldRedefineRules = builder.extendedFieldRedefineRules;
            this.fieldRedefineRules = builder.fieldRedefineRules;
            this.initiativeRecoverField = builder.initiativeRecoverField;
            this.initiativeRecoverValue = builder.initiativeRecoverValue;
            this.recoverTime = builder.recoverTime;
            this.stat = builder.stat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntegrationDetail create() {
            return builder().build();
        }

        /**
         * @return autoRecover
         */
        public Boolean getAutoRecover() {
            return this.autoRecover;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duplicateKey
         */
        public String getDuplicateKey() {
            return this.duplicateKey;
        }

        /**
         * @return extendedFieldRedefineRules
         */
        public java.util.List < java.util.Map<String, ?>> getExtendedFieldRedefineRules() {
            return this.extendedFieldRedefineRules;
        }

        /**
         * @return fieldRedefineRules
         */
        public java.util.List < java.util.Map<String, ?>> getFieldRedefineRules() {
            return this.fieldRedefineRules;
        }

        /**
         * @return initiativeRecoverField
         */
        public String getInitiativeRecoverField() {
            return this.initiativeRecoverField;
        }

        /**
         * @return initiativeRecoverValue
         */
        public String getInitiativeRecoverValue() {
            return this.initiativeRecoverValue;
        }

        /**
         * @return recoverTime
         */
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        /**
         * @return stat
         */
        public java.util.List < Long > getStat() {
            return this.stat;
        }

        public static final class Builder {
            private Boolean autoRecover; 
            private String description; 
            private String duplicateKey; 
            private java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules; 
            private java.util.List < java.util.Map<String, ?>> fieldRedefineRules; 
            private String initiativeRecoverField; 
            private String initiativeRecoverValue; 
            private Long recoverTime; 
            private java.util.List < Long > stat; 

            /**
             * <p>Indicates whether alert events are automatically cleared. Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRecover(Boolean autoRecover) {
                this.autoRecover = autoRecover;
                return this;
            }

            /**
             * <p>The description of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The fields whose values are deduplicated.</p>
             * 
             * <strong>example:</strong>
             * <p>LABEL.alertname::LABEL.severity</p>
             */
            public Builder duplicateKey(String duplicateKey) {
                this.duplicateKey = duplicateKey;
                return this;
            }

            /**
             * <p>The extended mapped fields of the alert source.</p>
             */
            public Builder extendedFieldRedefineRules(java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules) {
                this.extendedFieldRedefineRules = extendedFieldRedefineRules;
                return this;
            }

            /**
             * <p>The predefined mapped fields of the alert source.</p>
             */
            public Builder fieldRedefineRules(java.util.List < java.util.Map<String, ?>> fieldRedefineRules) {
                this.fieldRedefineRules = fieldRedefineRules;
                return this;
            }

            /**
             * <p>The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
             * <blockquote>
             * <p>Only the Log Service alert integration supports the parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$.status</p>
             */
            public Builder initiativeRecoverField(String initiativeRecoverField) {
                this.initiativeRecoverField = initiativeRecoverField;
                return this;
            }

            /**
             * <p>The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
             * <blockquote>
             * <p>Only the Log Service alert integration supports the parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder initiativeRecoverValue(String initiativeRecoverValue) {
                this.initiativeRecoverValue = initiativeRecoverValue;
                return this;
            }

            /**
             * <p>The time when alert events are automatically cleared. Unit: seconds. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder recoverTime(Long recoverTime) {
                this.recoverTime = recoverTime;
                return this;
            }

            /**
             * <p>The total number of alert events and the number of abnormal alert events in the last hour.</p>
             */
            public Builder stat(java.util.List < Long > stat) {
                this.stat = stat;
                return this;
            }

            public IntegrationDetail build() {
                return new IntegrationDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationResponseBody</p>
     */
    public static class Integrations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiEndpoint")
        private String apiEndpoint;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IntegrationDetail")
        private IntegrationDetail integrationDetail;

        @com.aliyun.core.annotation.NameInMap("IntegrationId")
        private Long integrationId;

        @com.aliyun.core.annotation.NameInMap("IntegrationName")
        private String integrationName;

        @com.aliyun.core.annotation.NameInMap("IntegrationProductType")
        private String integrationProductType;

        @com.aliyun.core.annotation.NameInMap("Liveness")
        private String liveness;

        @com.aliyun.core.annotation.NameInMap("ShortToken")
        private String shortToken;

        @com.aliyun.core.annotation.NameInMap("State")
        private Boolean state;

        private Integrations(Builder builder) {
            this.apiEndpoint = builder.apiEndpoint;
            this.createTime = builder.createTime;
            this.integrationDetail = builder.integrationDetail;
            this.integrationId = builder.integrationId;
            this.integrationName = builder.integrationName;
            this.integrationProductType = builder.integrationProductType;
            this.liveness = builder.liveness;
            this.shortToken = builder.shortToken;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Integrations create() {
            return builder().build();
        }

        /**
         * @return apiEndpoint
         */
        public String getApiEndpoint() {
            return this.apiEndpoint;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return integrationDetail
         */
        public IntegrationDetail getIntegrationDetail() {
            return this.integrationDetail;
        }

        /**
         * @return integrationId
         */
        public Long getIntegrationId() {
            return this.integrationId;
        }

        /**
         * @return integrationName
         */
        public String getIntegrationName() {
            return this.integrationName;
        }

        /**
         * @return integrationProductType
         */
        public String getIntegrationProductType() {
            return this.integrationProductType;
        }

        /**
         * @return liveness
         */
        public String getLiveness() {
            return this.liveness;
        }

        /**
         * @return shortToken
         */
        public String getShortToken() {
            return this.shortToken;
        }

        /**
         * @return state
         */
        public Boolean getState() {
            return this.state;
        }

        public static final class Builder {
            private String apiEndpoint; 
            private String createTime; 
            private IntegrationDetail integrationDetail; 
            private Long integrationId; 
            private String integrationName; 
            private String integrationProductType; 
            private String liveness; 
            private String shortToken; 
            private Boolean state; 

            /**
             * <p>The endpoint of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alerts.aliyuncs.com/api/v1/integrations/custom/ymQBN">https://alerts.aliyuncs.com/api/v1/integrations/custom/ymQBN</a>******</p>
             */
            public Builder apiEndpoint(String apiEndpoint) {
                this.apiEndpoint = apiEndpoint;
                return this;
            }

            /**
             * <p>The time when the alert integration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-18</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The information about the alert events.</p>
             */
            public Builder integrationDetail(IntegrationDetail integrationDetail) {
                this.integrationDetail = integrationDetail;
                return this;
            }

            /**
             * <p>The ID of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder integrationId(Long integrationId) {
                this.integrationId = integrationId;
                return this;
            }

            /**
             * <p>The name of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudMonitor integration</p>
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * <p>The type of the alert integration. Valid values:</p>
             * <ul>
             * <li>CLOUD_MONITOR: CloudMonitor</li>
             * <li>LOG_SERVICE: Log Service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_MONITOR</p>
             */
            public Builder integrationProductType(String integrationProductType) {
                this.integrationProductType = integrationProductType;
                return this;
            }

            /**
             * <p>The activity of the alert integration</p>
             * 
             * <strong>example:</strong>
             * <p>ready</p>
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * <p>The authentication token of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>ymQBN******</p>
             */
            public Builder shortToken(String shortToken) {
                this.shortToken = shortToken;
                return this;
            }

            /**
             * <p>Indicates whether the alert integration was enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder state(Boolean state) {
                this.state = state;
                return this;
            }

            public Integrations build() {
                return new Integrations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntegrationResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntegrationResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Integrations")
        private java.util.List < Integrations> integrations;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Long page;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageInfo(Builder builder) {
            this.integrations = builder.integrations;
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return integrations
         */
        public java.util.List < Integrations> getIntegrations() {
            return this.integrations;
        }

        /**
         * @return page
         */
        public Long getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Integrations> integrations; 
            private Long page; 
            private Long size; 
            private Long total; 

            /**
             * <p>The information about each alert integration.</p>
             */
            public Builder integrations(java.util.List < Integrations> integrations) {
                this.integrations = integrations;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of alert integrations returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of alert integrations.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
