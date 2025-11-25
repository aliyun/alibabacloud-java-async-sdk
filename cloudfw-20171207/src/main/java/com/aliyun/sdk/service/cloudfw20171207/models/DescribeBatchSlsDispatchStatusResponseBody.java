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
    @com.aliyun.core.annotation.NameInMap("ItemList")
    private java.util.List<ItemList> itemList;

    @com.aliyun.core.annotation.NameInMap("LogstoreName")
    private String logstoreName;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBatchSlsDispatchStatusResponseBody(Builder builder) {
        this.itemList = builder.itemList;
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
     * @return itemList
     */
    public java.util.List<ItemList> getItemList() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ItemList> itemList; 
        private String logstoreName; 
        private String projectName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBatchSlsDispatchStatusResponseBody model) {
            this.itemList = model.itemList;
            this.logstoreName = model.logstoreName;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
        } 

        /**
         * ItemList.
         */
        public Builder itemList(java.util.List<ItemList> itemList) {
            this.itemList = itemList;
            return this;
        }

        /**
         * LogstoreName.
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RequestId.
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
             * ConfigStatus.
             */
            public Builder configStatus(String configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * DispatchName.
             */
            public Builder dispatchName(String dispatchName) {
                this.dispatchName = dispatchName;
                return this;
            }

            /**
             * DispatchValue.
             */
            public Builder dispatchValue(String dispatchValue) {
                this.dispatchValue = dispatchValue;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * FilterKeys.
             */
            public Builder filterKeys(java.util.List<String> filterKeys) {
                this.filterKeys = filterKeys;
                return this;
            }

            /**
             * SearchName.
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
