// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanMachineEventResponseBody</p>
 */
public class ListVirusScanMachineEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListVirusScanMachineEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanMachineEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListVirusScanMachineEventResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the alert event.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

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
         * <p>2DAEF40F-8E1A-550D-8793-99C61C401DD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListVirusScanMachineEventResponseBody build() {
            return new ListVirusScanMachineEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoType")
        private String infoType;

        @com.aliyun.core.annotation.NameInMap("NameDisplay")
        private String nameDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValueDisplay")
        private String valueDisplay;

        private Details(Builder builder) {
            this.infoType = builder.infoType;
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.valueDisplay = builder.valueDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return infoType
         */
        public String getInfoType() {
            return this.infoType;
        }

        /**
         * @return nameDisplay
         */
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return valueDisplay
         */
        public String getValueDisplay() {
            return this.valueDisplay;
        }

        public static final class Builder {
            private String infoType; 
            private String nameDisplay; 
            private String type; 
            private String valueDisplay; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.infoType = model.infoType;
                this.nameDisplay = model.nameDisplay;
                this.type = model.type;
                this.valueDisplay = model.valueDisplay;
            } 

            /**
             * <p>The display type of the value for ValueDisplay. Valid value:</p>
             * <ul>
             * <li><strong>download_url</strong>, which indicates a download URL.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>download_url</p>
             */
            public Builder infoType(String infoType) {
                this.infoType = infoType;
                return this;
            }

            /**
             * <p>The display name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Trojan Path</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>The format in which the details of the exception are displayed.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * <li><strong>html</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>html</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The attribute information about the exception. The information includes the logon time or location of an alert triggered by an unusual logon, and the trojan file path or trojan type of an alert.</p>
             * 
             * <strong>example:</strong>
             * <p>getopt</p>
             */
            public Builder valueDisplay(String valueDisplay) {
                this.valueDisplay = valueDisplay;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Long eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LastTimeStamp")
        private Long lastTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Data(Builder builder) {
            this.details = builder.details;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.lastTimeStamp = builder.lastTimeStamp;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return lastTimeStamp
         */
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private java.util.List<Details> details; 
            private Long eventId; 
            private String eventName; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long lastTimeStamp; 
            private String level; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.details = model.details;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.lastTimeStamp = model.lastTimeStamp;
                this.level = model.level;
            } 

            /**
             * <p>The details of the exception.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>911273</p>
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The name of the alert event. The value indicates a subtype.</p>
             * 
             * <strong>example:</strong>
             * <p>Unusual Logon</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz92q7m5hsbgfhdss***</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.42.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp when the alert event was last generated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1682046733628</p>
             */
            public Builder lastTimeStamp(Long lastTimeStamp) {
                this.lastTimeStamp = lastTimeStamp;
                return this;
            }

            /**
             * <p>The risk level of the alert event. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>suspicious</strong></li>
             * <li><strong>remind</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanMachineEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanMachineEventResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
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
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>149</p>
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
