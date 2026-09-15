// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListAiAppWarningByPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListAiAppWarningByPageResponseBody</p>
 */
public class ListAiAppWarningByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Ext")
    private Ext ext;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAiAppWarningByPageResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.ext = builder.ext;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAiAppWarningByPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ext
     */
    public Ext getExt() {
        return this.ext;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Ext ext; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAiAppWarningByPageResponseBody model) {
            this.currentPage = model.currentPage;
            this.ext = model.ext;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The extension field.</p>
         */
        public Builder ext(Ext ext) {
            this.ext = ext;
            return this;
        }

        /**
         * <p>The data on the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAiAppWarningByPageResponseBody build() {
            return new ListAiAppWarningByPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAiAppWarningByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiAppWarningByPageResponseBody</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Option")
        private java.util.Map<String, ?> option;

        private Ext(Builder builder) {
            this.option = builder.option;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return option
         */
        public java.util.Map<String, ?> getOption() {
            return this.option;
        }

        public static final class Builder {
            private java.util.Map<String, ?> option; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.option = model.option;
            } 

            /**
             * <p>The option.</p>
             */
            public Builder option(java.util.Map<String, ?> option) {
                this.option = option;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAiAppWarningByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiAppWarningByPageResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelDesc")
        private String labelDesc;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Labels(Builder builder) {
            this.count = builder.count;
            this.label = builder.label;
            this.labelDesc = builder.labelDesc;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelDesc
         */
        public String getLabelDesc() {
            return this.labelDesc;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long count; 
            private String label; 
            private String labelDesc; 
            private String type; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.count = model.count;
                this.label = model.label;
                this.labelDesc = model.labelDesc;
                this.type = model.type;
            } 

            /**
             * <p>The count.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The label name.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The label description.</p>
             * 
             * <strong>example:</strong>
             * <p>desc-xxx</p>
             */
            public Builder labelDesc(String labelDesc) {
                this.labelDesc = labelDesc;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>promptAttack</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAiAppWarningByPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListAiAppWarningByPageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("WarningCount")
        private Long warningCount;

        @com.aliyun.core.annotation.NameInMap("WarningTime")
        private String warningTime;

        private Items(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.labels = builder.labels;
            this.serviceCode = builder.serviceCode;
            this.traceId = builder.traceId;
            this.warningCount = builder.warningCount;
            this.warningTime = builder.warningTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return warningCount
         */
        public Long getWarningCount() {
            return this.warningCount;
        }

        /**
         * @return warningTime
         */
        public String getWarningTime() {
            return this.warningTime;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private java.util.List<Labels> labels; 
            private String serviceCode; 
            private String traceId; 
            private Long warningCount; 
            private String warningTime; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.labels = model.labels;
                this.serviceCode = model.serviceCode;
                this.traceId = model.traceId;
                this.warningCount = model.warningCount;
                this.warningTime = model.warningTime;
            } 

            /**
             * <p>appId。</p>
             * 
             * <strong>example:</strong>
             * <p>id-xxx</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>name-xxx</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The list of labels.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>baselineCheck_01</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The trace ID used to correlate and trace alert events.</p>
             * 
             * <strong>example:</strong>
             * <p>0bc3b4b0********516098843e19bc</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>The number of alerts.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder warningCount(Long warningCount) {
                this.warningCount = warningCount;
                return this;
            }

            /**
             * <p>The alert time in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01 00:00:00</p>
             */
            public Builder warningTime(String warningTime) {
                this.warningTime = warningTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
