// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeBatchSlsDispatchStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBatchSlsDispatchStatusResponseBody</p>
 */
public class DescribeBatchSlsDispatchStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InfoList")
    private java.util.List<InfoList> infoList;

    @com.aliyun.core.annotation.NameInMap("ItemList")
    private java.util.List<ItemList> itemList;

    @com.aliyun.core.annotation.NameInMap("LogVersion")
    private String logVersion;

    @com.aliyun.core.annotation.NameInMap("LogstoreName")
    private String logstoreName;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBatchSlsDispatchStatusResponseBody(Builder builder) {
        this.infoList = builder.infoList;
        this.itemList = builder.itemList;
        this.logVersion = builder.logVersion;
        this.logstoreName = builder.logstoreName;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBatchSlsDispatchStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return infoList
     */
    public java.util.List<InfoList> getInfoList() {
        return this.infoList;
    }

    /**
     * @return itemList
     */
    public java.util.List<ItemList> getItemList() {
        return this.itemList;
    }

    /**
     * @return logVersion
     */
    public String getLogVersion() {
        return this.logVersion;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InfoList> infoList; 
        private java.util.List<ItemList> itemList; 
        private String logVersion; 
        private String logstoreName; 
        private String projectName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBatchSlsDispatchStatusResponseBody model) {
            this.infoList = model.infoList;
            this.itemList = model.itemList;
            this.logVersion = model.logVersion;
            this.logstoreName = model.logstoreName;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of detailed information about the Logstores.</p>
         */
        public Builder infoList(java.util.List<InfoList> infoList) {
            this.infoList = infoList;
            return this;
        }

        /**
         * <p>A list of Simple Log Service projects.</p>
         */
        public Builder itemList(java.util.List<ItemList> itemList) {
            this.itemList = itemList;
            return this;
        }

        /**
         * <p>The log version. A value of 1 indicates that there is one Logstore. A value of 2 indicates that there are two Logstores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logVersion(String logVersion) {
            this.logVersion = logVersion;
            return this;
        }

        /**
         * <p>The name of the Logstore in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>rs-stats</p>
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * <p>The name of the project in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewallnew-project-199053910542****-cn-hangzhou</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7036EBAB-F85F-5AAE-976F-C75AEE59****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBatchSlsDispatchStatusResponseBody build() {
            return new DescribeBatchSlsDispatchStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBatchSlsDispatchStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchSlsDispatchStatusResponseBody</p>
     */
    public static class InfoListItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigStatus")
        private String configStatus;

        @com.aliyun.core.annotation.NameInMap("DispatchName")
        private String dispatchName;

        @com.aliyun.core.annotation.NameInMap("DispatchValue")
        private String dispatchValue;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FilterKeys")
        private java.util.List<String> filterKeys;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private InfoListItemList(Builder builder) {
            this.configStatus = builder.configStatus;
            this.dispatchName = builder.dispatchName;
            this.dispatchValue = builder.dispatchValue;
            this.enable = builder.enable;
            this.filterKeys = builder.filterKeys;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoListItemList create() {
            return builder().build();
        }

        /**
         * @return configStatus
         */
        public String getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return dispatchName
         */
        public String getDispatchName() {
            return this.dispatchName;
        }

        /**
         * @return dispatchValue
         */
        public String getDispatchValue() {
            return this.dispatchValue;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return filterKeys
         */
        public java.util.List<String> getFilterKeys() {
            return this.filterKeys;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private String configStatus; 
            private String dispatchName; 
            private String dispatchValue; 
            private Boolean enable; 
            private java.util.List<String> filterKeys; 
            private String searchName; 

            private Builder() {
            } 

            private Builder(InfoListItemList model) {
                this.configStatus = model.configStatus;
                this.dispatchName = model.dispatchName;
                this.dispatchValue = model.dispatchValue;
                this.enable = model.enable;
                this.filterKeys = model.filterKeys;
                this.searchName = model.searchName;
            } 

            /**
             * <p>The configuration status.</p>
             * 
             * <strong>example:</strong>
             * <p>success_finished</p>
             */
            public Builder configStatus(String configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * <p>The name of the delivery type.</p>
             * 
             * <strong>example:</strong>
             * <p>internet-traffic-log</p>
             */
            public Builder dispatchName(String dispatchName) {
                this.dispatchName = dispatchName;
                return this;
            }

            /**
             * <p>The key for the log categorization. Valid values:</p>
             * <p><strong>internet_log</strong></p>
             * <p><strong>vpc_firewall_log</strong></p>
             * <p><strong>nat_firewall_log</strong></p>
             * <p><strong>ipv6_firewall_log</strong></p>
             * <p><strong>dns_firewall_log</strong></p>
             * 
             * <strong>example:</strong>
             * <p>ipv6_firewall_log</p>
             */
            public Builder dispatchValue(String dispatchValue) {
                this.dispatchValue = dispatchValue;
                return this;
            }

            /**
             * <p>Indicates whether this delivery type is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The detailed delivery configurations for the Internet and VPCs.</p>
             */
            public Builder filterKeys(java.util.List<String> filterKeys) {
                this.filterKeys = filterKeys;
                return this;
            }

            /**
             * <p>The value is fixed to log_type. You can ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>log_type</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public InfoListItemList build() {
                return new InfoListItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBatchSlsDispatchStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchSlsDispatchStatusResponseBody</p>
     */
    public static class InfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemList")
        private java.util.List<InfoListItemList> itemList;

        @com.aliyun.core.annotation.NameInMap("LogstoreName")
        private String logstoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        private InfoList(Builder builder) {
            this.itemList = builder.itemList;
            this.logstoreName = builder.logstoreName;
            this.projectName = builder.projectName;
            this.site = builder.site;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoList create() {
            return builder().build();
        }

        /**
         * @return itemList
         */
        public java.util.List<InfoListItemList> getItemList() {
            return this.itemList;
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        public static final class Builder {
            private java.util.List<InfoListItemList> itemList; 
            private String logstoreName; 
            private String projectName; 
            private String site; 

            private Builder() {
            } 

            private Builder(InfoList model) {
                this.itemList = model.itemList;
                this.logstoreName = model.logstoreName;
                this.projectName = model.projectName;
                this.site = model.site;
            } 

            /**
             * <p>The details of the log delivery configuration.</p>
             */
            public Builder itemList(java.util.List<InfoListItemList> itemList) {
                this.itemList = itemList;
                return this;
            }

            /**
             * <p>The name of the Logstore in Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudfirewall-logstore</p>
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * <p>The name of the project in Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>cloudfirewall-project-1204872307283650-cn-hangzhou</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>\<code>cn\\</code> indicates the Chinese mainland. \<code>intl\\</code> indicates regions outside the Chinese mainland. \<code>global\\</code> indicates global.</p>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            public InfoList build() {
                return new InfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBatchSlsDispatchStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBatchSlsDispatchStatusResponseBody</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigStatus")
        private String configStatus;

        @com.aliyun.core.annotation.NameInMap("DispatchName")
        private String dispatchName;

        @com.aliyun.core.annotation.NameInMap("DispatchValue")
        private String dispatchValue;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("FilterKeys")
        private java.util.List<String> filterKeys;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private ItemList(Builder builder) {
            this.configStatus = builder.configStatus;
            this.dispatchName = builder.dispatchName;
            this.dispatchValue = builder.dispatchValue;
            this.enable = builder.enable;
            this.filterKeys = builder.filterKeys;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return configStatus
         */
        public String getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return dispatchName
         */
        public String getDispatchName() {
            return this.dispatchName;
        }

        /**
         * @return dispatchValue
         */
        public String getDispatchValue() {
            return this.dispatchValue;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return filterKeys
         */
        public java.util.List<String> getFilterKeys() {
            return this.filterKeys;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private String configStatus; 
            private String dispatchName; 
            private String dispatchValue; 
            private Boolean enable; 
            private java.util.List<String> filterKeys; 
            private String searchName; 

            private Builder() {
            } 

            private Builder(ItemList model) {
                this.configStatus = model.configStatus;
                this.dispatchName = model.dispatchName;
                this.dispatchValue = model.dispatchValue;
                this.enable = model.enable;
                this.filterKeys = model.filterKeys;
                this.searchName = model.searchName;
            } 

            /**
             * <p>The status of the delivery configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>success_finished</p>
             */
            public Builder configStatus(String configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * <p>The name of the log delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>internet-traffic-log</p>
             */
            public Builder dispatchName(String dispatchName) {
                this.dispatchName = dispatchName;
                return this;
            }

            /**
             * <p>The value of the log to be delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>internet_log</p>
             */
            public Builder dispatchValue(String dispatchValue) {
                this.dispatchValue = dispatchValue;
                return this;
            }

            /**
             * <p>The delivery status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The supported filter conditions.</p>
             */
            public Builder filterKeys(java.util.List<String> filterKeys) {
                this.filterKeys = filterKeys;
                return this;
            }

            /**
             * <p>The name of the search type.</p>
             * 
             * <strong>example:</strong>
             * <p>log_type</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
}
