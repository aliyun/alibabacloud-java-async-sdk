// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDataQualityAlertRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataQualityAlertRulesResponseBody</p>
 */
public class ListDataQualityAlertRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataQualityAlertRulesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataQualityAlertRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDataQualityAlertRulesResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

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

        public ListDataQualityAlertRulesResponseBody build() {
            return new ListDataQualityAlertRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataQualityAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityAlertRulesResponseBody</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
        private java.util.List<String> receiverValues;

        private Receivers(Builder builder) {
            this.extension = builder.extension;
            this.receiverType = builder.receiverType;
            this.receiverValues = builder.receiverValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receivers create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverValues
         */
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String extension; 
            private String receiverType; 
            private java.util.List<String> receiverValues; 

            private Builder() {
            } 

            private Builder(Receivers model) {
                this.extension = model.extension;
                this.receiverType = model.receiverType;
                this.receiverValues = model.receiverValues;
            } 

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * ReceiverType.
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * ReceiverValues.
             */
            public Builder receiverValues(java.util.List<String> receiverValues) {
                this.receiverValues = receiverValues;
                return this;
            }

            public Receivers build() {
                return new Receivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityAlertRulesResponseBody</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<String> channels;

        @com.aliyun.core.annotation.NameInMap("Receivers")
        private java.util.List<Receivers> receivers;

        private Notification(Builder builder) {
            this.channels = builder.channels;
            this.receivers = builder.receivers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        /**
         * @return receivers
         */
        public java.util.List<Receivers> getReceivers() {
            return this.receivers;
        }

        public static final class Builder {
            private java.util.List<String> channels; 
            private java.util.List<Receivers> receivers; 

            private Builder() {
            } 

            private Builder(Notification model) {
                this.channels = model.channels;
                this.receivers = model.receivers;
            } 

            /**
             * Channels.
             */
            public Builder channels(java.util.List<String> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Receivers.
             */
            public Builder receivers(java.util.List<Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityAlertRulesResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List<Long> ids;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Target(Builder builder) {
            this.ids = builder.ids;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return ids
         */
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Long> ids; 
            private String type; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.ids = model.ids;
                this.type = model.type;
            } 

            /**
             * Ids.
             */
            public Builder ids(java.util.List<Long> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityAlertRulesResponseBody</p>
     */
    public static class DataQualityAlertRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Notification")
        private Notification notification;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        private DataQualityAlertRules(Builder builder) {
            this.condition = builder.condition;
            this.id = builder.id;
            this.notification = builder.notification;
            this.projectId = builder.projectId;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityAlertRules create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return notification
         */
        public Notification getNotification() {
            return this.notification;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String condition; 
            private Long id; 
            private Notification notification; 
            private Long projectId; 
            private Target target; 

            private Builder() {
            } 

            private Builder(DataQualityAlertRules model) {
                this.condition = model.condition;
                this.id = model.id;
                this.notification = model.notification;
                this.projectId = model.projectId;
                this.target = model.target;
            } 

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Notification.
             */
            public Builder notification(Notification notification) {
                this.notification = notification;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            public DataQualityAlertRules build() {
                return new DataQualityAlertRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataQualityAlertRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataQualityAlertRulesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataQualityAlertRules")
        private java.util.List<DataQualityAlertRules> dataQualityAlertRules;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.dataQualityAlertRules = builder.dataQualityAlertRules;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return dataQualityAlertRules
         */
        public java.util.List<DataQualityAlertRules> getDataQualityAlertRules() {
            return this.dataQualityAlertRules;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DataQualityAlertRules> dataQualityAlertRules; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.dataQualityAlertRules = model.dataQualityAlertRules;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * DataQualityAlertRules.
             */
            public Builder dataQualityAlertRules(java.util.List<DataQualityAlertRules> dataQualityAlertRules) {
                this.dataQualityAlertRules = dataQualityAlertRules;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
