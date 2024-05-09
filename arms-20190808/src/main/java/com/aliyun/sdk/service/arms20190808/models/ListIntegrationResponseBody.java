// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIntegrationResponseBody build() {
            return new ListIntegrationResponseBody(this);
        } 

    } 

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
             * AutoRecover.
             */
            public Builder autoRecover(Boolean autoRecover) {
                this.autoRecover = autoRecover;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DuplicateKey.
             */
            public Builder duplicateKey(String duplicateKey) {
                this.duplicateKey = duplicateKey;
                return this;
            }

            /**
             * ExtendedFieldRedefineRules.
             */
            public Builder extendedFieldRedefineRules(java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules) {
                this.extendedFieldRedefineRules = extendedFieldRedefineRules;
                return this;
            }

            /**
             * FieldRedefineRules.
             */
            public Builder fieldRedefineRules(java.util.List < java.util.Map<String, ?>> fieldRedefineRules) {
                this.fieldRedefineRules = fieldRedefineRules;
                return this;
            }

            /**
             * InitiativeRecoverField.
             */
            public Builder initiativeRecoverField(String initiativeRecoverField) {
                this.initiativeRecoverField = initiativeRecoverField;
                return this;
            }

            /**
             * InitiativeRecoverValue.
             */
            public Builder initiativeRecoverValue(String initiativeRecoverValue) {
                this.initiativeRecoverValue = initiativeRecoverValue;
                return this;
            }

            /**
             * RecoverTime.
             */
            public Builder recoverTime(Long recoverTime) {
                this.recoverTime = recoverTime;
                return this;
            }

            /**
             * Stat.
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
             * ApiEndpoint.
             */
            public Builder apiEndpoint(String apiEndpoint) {
                this.apiEndpoint = apiEndpoint;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IntegrationDetail.
             */
            public Builder integrationDetail(IntegrationDetail integrationDetail) {
                this.integrationDetail = integrationDetail;
                return this;
            }

            /**
             * IntegrationId.
             */
            public Builder integrationId(Long integrationId) {
                this.integrationId = integrationId;
                return this;
            }

            /**
             * IntegrationName.
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * IntegrationProductType.
             */
            public Builder integrationProductType(String integrationProductType) {
                this.integrationProductType = integrationProductType;
                return this;
            }

            /**
             * Liveness.
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * ShortToken.
             */
            public Builder shortToken(String shortToken) {
                this.shortToken = shortToken;
                return this;
            }

            /**
             * State.
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
             * Integrations.
             */
            public Builder integrations(java.util.List < Integrations> integrations) {
                this.integrations = integrations;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Long page) {
                this.page = page;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
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
