// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
 *
 * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
 */
public class DiscribeSmartAccessGatewayDiagnosisReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiagnoseResult")
    private DiagnoseResult diagnoseResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DiscribeSmartAccessGatewayDiagnosisReportResponseBody(Builder builder) {
        this.diagnoseResult = builder.diagnoseResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiscribeSmartAccessGatewayDiagnosisReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnoseResult
     */
    public DiagnoseResult getDiagnoseResult() {
        return this.diagnoseResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiagnoseResult diagnoseResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DiscribeSmartAccessGatewayDiagnosisReportResponseBody model) {
            this.diagnoseResult = model.diagnoseResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The diagnosis report of the SAG device.</p>
         */
        public Builder diagnoseResult(DiagnoseResult diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7D6E3AB-D41A-42E3-8D4E-97B145F4B7C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DiscribeSmartAccessGatewayDiagnosisReportResponseBody build() {
            return new DiscribeSmartAccessGatewayDiagnosisReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class Cn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private java.util.List<String> advice;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<String> details;

        @com.aliyun.core.annotation.NameInMap("ItemLevel")
        private String itemLevel;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private String itemType;

        private Cn(Builder builder) {
            this.advice = builder.advice;
            this.details = builder.details;
            this.itemLevel = builder.itemLevel;
            this.itemName = builder.itemName;
            this.itemType = builder.itemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cn create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public java.util.List<String> getAdvice() {
            return this.advice;
        }

        /**
         * @return details
         */
        public java.util.List<String> getDetails() {
            return this.details;
        }

        /**
         * @return itemLevel
         */
        public String getItemLevel() {
            return this.itemLevel;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        public static final class Builder {
            private java.util.List<String> advice; 
            private java.util.List<String> details; 
            private String itemLevel; 
            private String itemName; 
            private String itemType; 

            private Builder() {
            } 

            private Builder(Cn model) {
                this.advice = model.advice;
                this.details = model.details;
                this.itemLevel = model.itemLevel;
                this.itemName = model.itemName;
                this.itemType = model.itemType;
            } 

            /**
             * <p>The suggestion for the diagnosis.</p>
             */
            public Builder advice(java.util.List<String> advice) {
                this.advice = advice;
                return this;
            }

            /**
             * <p>The diagnosis.</p>
             */
            public Builder details(java.util.List<String> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The diagnosis level of the item. Valid values:</p>
             * <ul>
             * <li><strong>ERROR</strong>: indicates that the item has an issue that may affect your services. We recommend that you handle the issue at the earliest opportunity.</li>
             * <li><strong>WARNING</strong>: indicates that the item has an issue. You can handle the issue based on your business requirements.</li>
             * <li><strong>INFO</strong>: indicates that the item is working as expected. No additional operation is required.</li>
             * </ul>
             */
            public Builder itemLevel(String itemLevel) {
                this.itemLevel = itemLevel;
                return this;
            }

            /**
             * <p>The name of the item.</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The type of the item. Valid values:</p>
             * <ul>
             * <li><strong>Config</strong>: <strong>SAG configuration</strong></li>
             * <li><strong>Service</strong>: <strong>service quality</strong></li>
             * <li><strong>Internet</strong>: <strong>quality of connections to the Internet</strong></li>
             * </ul>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            public Cn build() {
                return new Cn(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class En extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private java.util.List<String> advice;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<String> details;

        @com.aliyun.core.annotation.NameInMap("ItemLevel")
        private String itemLevel;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private String itemType;

        private En(Builder builder) {
            this.advice = builder.advice;
            this.details = builder.details;
            this.itemLevel = builder.itemLevel;
            this.itemName = builder.itemName;
            this.itemType = builder.itemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static En create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public java.util.List<String> getAdvice() {
            return this.advice;
        }

        /**
         * @return details
         */
        public java.util.List<String> getDetails() {
            return this.details;
        }

        /**
         * @return itemLevel
         */
        public String getItemLevel() {
            return this.itemLevel;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        public static final class Builder {
            private java.util.List<String> advice; 
            private java.util.List<String> details; 
            private String itemLevel; 
            private String itemName; 
            private String itemType; 

            private Builder() {
            } 

            private Builder(En model) {
                this.advice = model.advice;
                this.details = model.details;
                this.itemLevel = model.itemLevel;
                this.itemName = model.itemName;
                this.itemType = model.itemType;
            } 

            /**
             * <p>The suggestion for the diagnosis.</p>
             */
            public Builder advice(java.util.List<String> advice) {
                this.advice = advice;
                return this;
            }

            /**
             * <p>The diagnosis.</p>
             */
            public Builder details(java.util.List<String> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The diagnosis level of the item. Valid values:</p>
             * <ul>
             * <li><strong>ERROR</strong>: indicates that the item has an issue that may affect your services. We recommend that you handle the issue at the earliest opportunity.</li>
             * <li><strong>WARNING</strong>: indicates that the item has an issue. You can handle the issue based on your business requirements.</li>
             * <li><strong>INFO</strong>: indicates that the item is working as expected. No additional operation is required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ERROR</p>
             */
            public Builder itemLevel(String itemLevel) {
                this.itemLevel = itemLevel;
                return this;
            }

            /**
             * <p>The name of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>Express Connect Port Configuration</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The type of the item. Valid values:</p>
             * <ul>
             * <li><strong>Config</strong>: <strong>SAG configuration</strong></li>
             * <li><strong>Service</strong>: <strong>service quality</strong></li>
             * <li><strong>Internet</strong>: <strong>quality of connections to the Internet</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Config</p>
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            public En build() {
                return new En(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CN")
        private Cn cn;

        @com.aliyun.core.annotation.NameInMap("EN")
        private En en;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Items(Builder builder) {
            this.cn = builder.cn;
            this.en = builder.en;
            this.endTime = builder.endTime;
            this.itemName = builder.itemName;
            this.level = builder.level;
            this.startTime = builder.startTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cn
         */
        public Cn getCn() {
            return this.cn;
        }

        /**
         * @return en
         */
        public En getEn() {
            return this.en;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Cn cn; 
            private En en; 
            private Long endTime; 
            private String itemName; 
            private String level; 
            private Long startTime; 
            private String type; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.cn = model.cn;
                this.en = model.en;
                this.endTime = model.endTime;
                this.itemName = model.itemName;
                this.level = model.level;
                this.startTime = model.startTime;
                this.type = model.type;
            } 

            /**
             * <p>The diagnosis report in Chinese.</p>
             */
            public Builder cn(Cn cn) {
                this.cn = cn;
                return this;
            }

            /**
             * <p>The diagnosis report in English.</p>
             */
            public Builder en(En en) {
                this.en = en;
                return this;
            }

            /**
             * <p>The timestamp when the system finishes diagnosing the item.</p>
             * 
             * <strong>example:</strong>
             * <p>1602741570596</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the item, which is the unique identifier of the item.</p>
             * 
             * <strong>example:</strong>
             * <p>eccConfigCheck</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The diagnosis level of the item. Valid values:</p>
             * <ul>
             * <li><strong>error</strong>: severe</li>
             * <li><strong>warning</strong>: warning</li>
             * <li><strong>info</strong>: normal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The timestamp when the system starts to diagnose the item.</p>
             * 
             * <strong>example:</strong>
             * <p>1602741570567</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The type of the item. Valid values:</p>
             * <ul>
             * <li><strong>config</strong>: SAG configuration</li>
             * <li><strong>internet</strong>: quality of connections to the Internet</li>
             * <li><strong>biz</strong>: service quality</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>config</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private Integer error;

        @com.aliyun.core.annotation.NameInMap("Info")
        private Integer info;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private Integer warning;

        private Statistics(Builder builder) {
            this.error = builder.error;
            this.info = builder.info;
            this.total = builder.total;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Integer getError() {
            return this.error;
        }

        /**
         * @return info
         */
        public Integer getInfo() {
            return this.info;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return warning
         */
        public Integer getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private Integer error; 
            private Integer info; 
            private Integer total; 
            private Integer warning; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.error = model.error;
                this.info = model.info;
                this.total = model.total;
                this.warning = model.warning;
            } 

            /**
             * <p>The number of items of the <strong>ERROR</strong> level.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder error(Integer error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The number of items of the <strong>INFO</strong> level.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder info(Integer info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The total number of items for the current diagnosis type.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The number of items of the <strong>WARNING</strong> level.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder warning(Integer warning) {
                this.warning = warning;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private Statistics statistics;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Details(Builder builder) {
            this.items = builder.items;
            this.statistics = builder.statistics;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return statistics
         */
        public Statistics getStatistics() {
            return this.statistics;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Statistics statistics; 
            private String type; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.items = model.items;
                this.statistics = model.statistics;
                this.type = model.type;
            } 

            /**
             * <p>The list of items diagnosed.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The information about items of each diagnosis level for the current diagnosis type.</p>
             */
            public Builder statistics(Statistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The type of the diagnosis. Valid values:</p>
             * <ul>
             * <li><strong>config</strong>: SAG configuration</li>
             * <li><strong>internet</strong>: quality of connections to the Internet</li>
             * <li><strong>biz</strong>: service quality</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>config</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class Level extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Biz")
        private String biz;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private String configuration;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private Level(Builder builder) {
            this.biz = builder.biz;
            this.configuration = builder.configuration;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Level create() {
            return builder().build();
        }

        /**
         * @return biz
         */
        public String getBiz() {
            return this.biz;
        }

        /**
         * @return configuration
         */
        public String getConfiguration() {
            return this.configuration;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String biz; 
            private String configuration; 
            private String total; 

            private Builder() {
            } 

            private Builder(Level model) {
                this.biz = model.biz;
                this.configuration = model.configuration;
                this.total = model.total;
            } 

            /**
             * <p>The diagnosis level of the service quality.</p>
             * 
             * <strong>example:</strong>
             * <p>warning</p>
             */
            public Builder biz(String biz) {
                this.biz = biz;
                return this;
            }

            /**
             * <p>The diagnosis level of the SAG configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder configuration(String configuration) {
                this.configuration = configuration;
                return this;
            }

            /**
             * <p>The overall diagnosis level.</p>
             * <ul>
             * <li><strong>error</strong>: severe</li>
             * <li><strong>warning</strong>: warning</li>
             * <li><strong>info</strong>: normal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Level build() {
                return new Level(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class DiagnoseResultStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private Integer error;

        @com.aliyun.core.annotation.NameInMap("Info")
        private Integer info;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("Warning")
        private Integer warning;

        private DiagnoseResultStatistics(Builder builder) {
            this.error = builder.error;
            this.info = builder.info;
            this.total = builder.total;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseResultStatistics create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public Integer getError() {
            return this.error;
        }

        /**
         * @return info
         */
        public Integer getInfo() {
            return this.info;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return warning
         */
        public Integer getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private Integer error; 
            private Integer info; 
            private Integer total; 
            private Integer warning; 

            private Builder() {
            } 

            private Builder(DiagnoseResultStatistics model) {
                this.error = model.error;
                this.info = model.info;
                this.total = model.total;
                this.warning = model.warning;
            } 

            /**
             * <p>The number of items of the <strong>ERROR</strong> level.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder error(Integer error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The number of items of the <strong>INFO</strong> level.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder info(Integer info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The number of items of the <strong>WARNING</strong> level.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder warning(Integer warning) {
                this.warning = warning;
                return this;
            }

            public DiagnoseResultStatistics build() {
                return new DiagnoseResultStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscribeSmartAccessGatewayDiagnosisReportResponseBody} extends {@link TeaModel}
     *
     * <p>DiscribeSmartAccessGatewayDiagnosisReportResponseBody</p>
     */
    public static class DiagnoseResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoxType")
        private String boxType;

        @com.aliyun.core.annotation.NameInMap("BoxVersion")
        private String boxVersion;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("DiagnoseId")
        private String diagnoseId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Integer endTime;

        @com.aliyun.core.annotation.NameInMap("FinishedNumber")
        private Integer finishedNumber;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Level level;

        @com.aliyun.core.annotation.NameInMap("MonitorVersion")
        private String monitorVersion;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ReportSLSSuccess")
        private Integer reportSLSSuccess;

        @com.aliyun.core.annotation.NameInMap("SN")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Integer startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private DiagnoseResultStatistics statistics;

        @com.aliyun.core.annotation.NameInMap("StoreType")
        private String storeType;

        @com.aliyun.core.annotation.NameInMap("TotalNumber")
        private Integer totalNumber;

        @com.aliyun.core.annotation.NameInMap("UId")
        private String uId;

        @com.aliyun.core.annotation.NameInMap("UserLevel")
        private String userLevel;

        private DiagnoseResult(Builder builder) {
            this.boxType = builder.boxType;
            this.boxVersion = builder.boxVersion;
            this.details = builder.details;
            this.diagnoseId = builder.diagnoseId;
            this.endTime = builder.endTime;
            this.finishedNumber = builder.finishedNumber;
            this.instanceId = builder.instanceId;
            this.level = builder.level;
            this.monitorVersion = builder.monitorVersion;
            this.percent = builder.percent;
            this.reportSLSSuccess = builder.reportSLSSuccess;
            this.sn = builder.sn;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.statistics = builder.statistics;
            this.storeType = builder.storeType;
            this.totalNumber = builder.totalNumber;
            this.uId = builder.uId;
            this.userLevel = builder.userLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseResult create() {
            return builder().build();
        }

        /**
         * @return boxType
         */
        public String getBoxType() {
            return this.boxType;
        }

        /**
         * @return boxVersion
         */
        public String getBoxVersion() {
            return this.boxVersion;
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return diagnoseId
         */
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return finishedNumber
         */
        public Integer getFinishedNumber() {
            return this.finishedNumber;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public Level getLevel() {
            return this.level;
        }

        /**
         * @return monitorVersion
         */
        public String getMonitorVersion() {
            return this.monitorVersion;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return reportSLSSuccess
         */
        public Integer getReportSLSSuccess() {
            return this.reportSLSSuccess;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statistics
         */
        public DiagnoseResultStatistics getStatistics() {
            return this.statistics;
        }

        /**
         * @return storeType
         */
        public String getStoreType() {
            return this.storeType;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        /**
         * @return uId
         */
        public String getUId() {
            return this.uId;
        }

        /**
         * @return userLevel
         */
        public String getUserLevel() {
            return this.userLevel;
        }

        public static final class Builder {
            private String boxType; 
            private String boxVersion; 
            private java.util.List<Details> details; 
            private String diagnoseId; 
            private Integer endTime; 
            private Integer finishedNumber; 
            private String instanceId; 
            private Level level; 
            private String monitorVersion; 
            private Integer percent; 
            private Integer reportSLSSuccess; 
            private String sn; 
            private Integer startTime; 
            private String state; 
            private DiagnoseResultStatistics statistics; 
            private String storeType; 
            private Integer totalNumber; 
            private String uId; 
            private String userLevel; 

            private Builder() {
            } 

            private Builder(DiagnoseResult model) {
                this.boxType = model.boxType;
                this.boxVersion = model.boxVersion;
                this.details = model.details;
                this.diagnoseId = model.diagnoseId;
                this.endTime = model.endTime;
                this.finishedNumber = model.finishedNumber;
                this.instanceId = model.instanceId;
                this.level = model.level;
                this.monitorVersion = model.monitorVersion;
                this.percent = model.percent;
                this.reportSLSSuccess = model.reportSLSSuccess;
                this.sn = model.sn;
                this.startTime = model.startTime;
                this.state = model.state;
                this.statistics = model.statistics;
                this.storeType = model.storeType;
                this.totalNumber = model.totalNumber;
                this.uId = model.uId;
                this.userLevel = model.userLevel;
            } 

            /**
             * <p>The model of the SAG device.</p>
             * <ul>
             * <li><strong>sag-1000</strong></li>
             * <li><strong>sag-100WM</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sag-1000</p>
             */
            public Builder boxType(String boxType) {
                this.boxType = boxType;
                return this;
            }

            /**
             * <p>The version of the SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>2.1.0</p>
             */
            public Builder boxVersion(String boxVersion) {
                this.boxVersion = boxVersion;
                return this;
            }

            /**
             * <p>The list of diagnoses that are returned.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The ID of the diagnosis.</p>
             * 
             * <strong>example:</strong>
             * <p>dia-sag42c3t703trh02olv5rf****</p>
             */
            public Builder diagnoseId(String diagnoseId) {
                this.diagnoseId = diagnoseId;
                return this;
            }

            /**
             * <p>The timestamp when the system finishes diagnosing the item.</p>
             * 
             * <strong>example:</strong>
             * <p>160274157</p>
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of items that are diagnosed.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder finishedNumber(Integer finishedNumber) {
                this.finishedNumber = finishedNumber;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-0nnteglltw6z4b***</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The diagnosis level.</p>
             */
            public Builder level(Level level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The version of the monitoring feature that is used by the SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0.2.9</p>
             */
            public Builder monitorVersion(String monitorVersion) {
                this.monitorVersion = monitorVersion;
                return this;
            }

            /**
             * <p>The completion percentage of the diagnosis report.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the diagnosis report to be uploaded to Log Service.</p>
             * <ul>
             * <li><strong>0</strong>: The system failed to upload the report.</li>
             * <li><strong>1</strong>: The system has uploaded the report to Log Service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reportSLSSuccess(Integer reportSLSSuccess) {
                this.reportSLSSuccess = reportSLSSuccess;
                return this;
            }

            /**
             * <p>The serial number of the SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>sag42c3****</p>
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * <p>The timestamp when the system starts to diagnose the item.</p>
             * 
             * <strong>example:</strong>
             * <p>160274157</p>
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The diagnosis status. Valid values:</p>
             * <ul>
             * <li><strong>processing</strong>: The SAG device is being diagnosed.</li>
             * <li><strong>finished</strong>: The SAG device is diagnosed.</li>
             * <li><strong>failed</strong>: The system failed to diagnose the SAG device.</li>
             * <li><strong>error</strong>: A diagnostic error occurred.</li>
             * <li><strong>upload_to_sls_fail</strong>: The system failed to upload the diagnosis report.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>finished</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The overall diagnosis level.</p>
             */
            public Builder statistics(DiagnoseResultStatistics statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * <p>The value is set to <strong>both</strong>, which indicates that the data is stored in the SAG device and Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>both</p>
             */
            public Builder storeType(String storeType) {
                this.storeType = storeType;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            /**
             * <p>The user ID (UID) of the Alibaba Cloud account to which the SAG instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1688000000000000</p>
             */
            public Builder uId(String uId) {
                this.uId = uId;
                return this;
            }

            /**
             * <p>The type of user that initiated the diagnostics. The value is set to <strong>user</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder userLevel(String userLevel) {
                this.userLevel = userLevel;
                return this;
            }

            public DiagnoseResult build() {
                return new DiagnoseResult(this);
            } 

        } 

    }
}
