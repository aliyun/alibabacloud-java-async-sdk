// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticReportsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportsResponseBody</p>
 */
public class DescribeDiagnosticReportsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Reports")
    private Reports reports;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosticReportsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return reports
     */
    public Reports getReports() {
        return this.reports;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private Reports reports; 
        private String requestId; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Reports.
         */
        public Builder reports(Reports reports) {
            this.reports = reports;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticReportsResponseBody build() {
            return new DescribeDiagnosticReportsResponseBody(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Parameter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
    public static class Parameters extends TeaModel {
        @NameInMap("Parameter")
        private java.util.List < Parameter> parameter;

        private Parameters(Builder builder) {
            this.parameter = builder.parameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameter
         */
        public java.util.List < Parameter> getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private java.util.List < Parameter> parameter; 

            /**
             * Parameter.
             */
            public Builder parameter(java.util.List < Parameter> parameter) {
                this.parameter = parameter;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    public static class RecommendedAction extends TeaModel {
        @NameInMap("ActionCode")
        private String actionCode;

        @NameInMap("Parameters")
        private Parameters parameters;

        @NameInMap("Url")
        private String url;

        private RecommendedAction(Builder builder) {
            this.actionCode = builder.actionCode;
            this.parameters = builder.parameters;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendedAction create() {
            return builder().build();
        }

        /**
         * @return actionCode
         */
        public String getActionCode() {
            return this.actionCode;
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String actionCode; 
            private Parameters parameters; 
            private String url; 

            /**
             * ActionCode.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public RecommendedAction build() {
                return new RecommendedAction(this);
            } 

        } 

    }
    public static class RecommendedActions extends TeaModel {
        @NameInMap("RecommendedAction")
        private java.util.List < RecommendedAction> recommendedAction;

        private RecommendedActions(Builder builder) {
            this.recommendedAction = builder.recommendedAction;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendedActions create() {
            return builder().build();
        }

        /**
         * @return recommendedAction
         */
        public java.util.List < RecommendedAction> getRecommendedAction() {
            return this.recommendedAction;
        }

        public static final class Builder {
            private java.util.List < RecommendedAction> recommendedAction; 

            /**
             * RecommendedAction.
             */
            public Builder recommendedAction(java.util.List < RecommendedAction> recommendedAction) {
                this.recommendedAction = recommendedAction;
                return this;
            }

            public RecommendedActions build() {
                return new RecommendedActions(this);
            } 

        } 

    }
    public static class Issue extends TeaModel {
        @NameInMap("IssueCategory")
        private String issueCategory;

        @NameInMap("IssueCode")
        private String issueCode;

        @NameInMap("Message")
        private String message;

        @NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @NameInMap("RecommendedActions")
        private RecommendedActions recommendedActions;

        @NameInMap("Severity")
        private String severity;

        private Issue(Builder builder) {
            this.issueCategory = builder.issueCategory;
            this.issueCode = builder.issueCode;
            this.message = builder.message;
            this.occurrenceTime = builder.occurrenceTime;
            this.recommendedActions = builder.recommendedActions;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issue create() {
            return builder().build();
        }

        /**
         * @return issueCategory
         */
        public String getIssueCategory() {
            return this.issueCategory;
        }

        /**
         * @return issueCode
         */
        public String getIssueCode() {
            return this.issueCode;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return recommendedActions
         */
        public RecommendedActions getRecommendedActions() {
            return this.recommendedActions;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private String issueCategory; 
            private String issueCode; 
            private String message; 
            private String occurrenceTime; 
            private RecommendedActions recommendedActions; 
            private String severity; 

            /**
             * IssueCategory.
             */
            public Builder issueCategory(String issueCategory) {
                this.issueCategory = issueCategory;
                return this;
            }

            /**
             * IssueCode.
             */
            public Builder issueCode(String issueCode) {
                this.issueCode = issueCode;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * OccurrenceTime.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * RecommendedActions.
             */
            public Builder recommendedActions(RecommendedActions recommendedActions) {
                this.recommendedActions = recommendedActions;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public Issue build() {
                return new Issue(this);
            } 

        } 

    }
    public static class Issues extends TeaModel {
        @NameInMap("Issue")
        private java.util.List < Issue> issue;

        private Issues(Builder builder) {
            this.issue = builder.issue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issues create() {
            return builder().build();
        }

        /**
         * @return issue
         */
        public java.util.List < Issue> getIssue() {
            return this.issue;
        }

        public static final class Builder {
            private java.util.List < Issue> issue; 

            /**
             * Issue.
             */
            public Builder issue(java.util.List < Issue> issue) {
                this.issue = issue;
                return this;
            }

            public Issues build() {
                return new Issues(this);
            } 

        } 

    }
    public static class ItemData extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private ItemData(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemData create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ItemData build() {
                return new ItemData(this);
            } 

        } 

    }
    public static class ItemDatas extends TeaModel {
        @NameInMap("ItemData")
        private java.util.List < ItemData> itemData;

        private ItemDatas(Builder builder) {
            this.itemData = builder.itemData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemDatas create() {
            return builder().build();
        }

        /**
         * @return itemData
         */
        public java.util.List < ItemData> getItemData() {
            return this.itemData;
        }

        public static final class Builder {
            private java.util.List < ItemData> itemData; 

            /**
             * ItemData.
             */
            public Builder itemData(java.util.List < ItemData> itemData) {
                this.itemData = itemData;
                return this;
            }

            public ItemDatas build() {
                return new ItemDatas(this);
            } 

        } 

    }
    public static class Item extends TeaModel {
        @NameInMap("ItemCategory")
        private String itemCategory;

        @NameInMap("ItemCode")
        private String itemCode;

        @NameInMap("ItemDatas")
        private ItemDatas itemDatas;

        @NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Status")
        private String status;

        private Item(Builder builder) {
            this.itemCategory = builder.itemCategory;
            this.itemCode = builder.itemCode;
            this.itemDatas = builder.itemDatas;
            this.occurrenceTime = builder.occurrenceTime;
            this.severity = builder.severity;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return itemCategory
         */
        public String getItemCategory() {
            return this.itemCategory;
        }

        /**
         * @return itemCode
         */
        public String getItemCode() {
            return this.itemCode;
        }

        /**
         * @return itemDatas
         */
        public ItemDatas getItemDatas() {
            return this.itemDatas;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String itemCategory; 
            private String itemCode; 
            private ItemDatas itemDatas; 
            private String occurrenceTime; 
            private String severity; 
            private String status; 

            /**
             * ItemCategory.
             */
            public Builder itemCategory(String itemCategory) {
                this.itemCategory = itemCategory;
                return this;
            }

            /**
             * ItemCode.
             */
            public Builder itemCode(String itemCode) {
                this.itemCode = itemCode;
                return this;
            }

            /**
             * ItemDatas.
             */
            public Builder itemDatas(ItemDatas itemDatas) {
                this.itemDatas = itemDatas;
                return this;
            }

            /**
             * OccurrenceTime.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class RecentEvent extends TeaModel {
        @NameInMap("EventID")
        private String eventID;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("PublishTime")
        private String publishTime;

        private RecentEvent(Builder builder) {
            this.eventID = builder.eventID;
            this.eventName = builder.eventName;
            this.publishTime = builder.publishTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentEvent create() {
            return builder().build();
        }

        /**
         * @return eventID
         */
        public String getEventID() {
            return this.eventID;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        public static final class Builder {
            private String eventID; 
            private String eventName; 
            private String publishTime; 

            /**
             * EventID.
             */
            public Builder eventID(String eventID) {
                this.eventID = eventID;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            public RecentEvent build() {
                return new RecentEvent(this);
            } 

        } 

    }
    public static class RecentEvents extends TeaModel {
        @NameInMap("RecentEvent")
        private java.util.List < RecentEvent> recentEvent;

        private RecentEvents(Builder builder) {
            this.recentEvent = builder.recentEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecentEvents create() {
            return builder().build();
        }

        /**
         * @return recentEvent
         */
        public java.util.List < RecentEvent> getRecentEvent() {
            return this.recentEvent;
        }

        public static final class Builder {
            private java.util.List < RecentEvent> recentEvent; 

            /**
             * RecentEvent.
             */
            public Builder recentEvent(java.util.List < RecentEvent> recentEvent) {
                this.recentEvent = recentEvent;
                return this;
            }

            public RecentEvents build() {
                return new RecentEvents(this);
            } 

        } 

    }
    public static class Report extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DiagnosticCategory")
        private String diagnosticCategory;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("InvokeSystem")
        private String invokeSystem;

        @NameInMap("IssueCategoryId")
        private String issueCategoryId;

        @NameInMap("Issues")
        private Issues issues;

        @NameInMap("Items")
        private Items items;

        @NameInMap("OfflineDiagReportStatus")
        private String offlineDiagReportStatus;

        @NameInMap("PePassword")
        private String pePassword;

        @NameInMap("RecentEvents")
        private RecentEvents recentEvents;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private Report(Builder builder) {
            this.creationTime = builder.creationTime;
            this.diagnosticCategory = builder.diagnosticCategory;
            this.endTime = builder.endTime;
            this.finishedTime = builder.finishedTime;
            this.invokeSystem = builder.invokeSystem;
            this.issueCategoryId = builder.issueCategoryId;
            this.issues = builder.issues;
            this.items = builder.items;
            this.offlineDiagReportStatus = builder.offlineDiagReportStatus;
            this.pePassword = builder.pePassword;
            this.recentEvents = builder.recentEvents;
            this.reportId = builder.reportId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Report create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return diagnosticCategory
         */
        public String getDiagnosticCategory() {
            return this.diagnosticCategory;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return invokeSystem
         */
        public String getInvokeSystem() {
            return this.invokeSystem;
        }

        /**
         * @return issueCategoryId
         */
        public String getIssueCategoryId() {
            return this.issueCategoryId;
        }

        /**
         * @return issues
         */
        public Issues getIssues() {
            return this.issues;
        }

        /**
         * @return items
         */
        public Items getItems() {
            return this.items;
        }

        /**
         * @return offlineDiagReportStatus
         */
        public String getOfflineDiagReportStatus() {
            return this.offlineDiagReportStatus;
        }

        /**
         * @return pePassword
         */
        public String getPePassword() {
            return this.pePassword;
        }

        /**
         * @return recentEvents
         */
        public RecentEvents getRecentEvents() {
            return this.recentEvents;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String diagnosticCategory; 
            private String endTime; 
            private String finishedTime; 
            private String invokeSystem; 
            private String issueCategoryId; 
            private Issues issues; 
            private Items items; 
            private String offlineDiagReportStatus; 
            private String pePassword; 
            private RecentEvents recentEvents; 
            private String reportId; 
            private String resourceId; 
            private String resourceType; 
            private String severity; 
            private String startTime; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DiagnosticCategory.
             */
            public Builder diagnosticCategory(String diagnosticCategory) {
                this.diagnosticCategory = diagnosticCategory;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * InvokeSystem.
             */
            public Builder invokeSystem(String invokeSystem) {
                this.invokeSystem = invokeSystem;
                return this;
            }

            /**
             * IssueCategoryId.
             */
            public Builder issueCategoryId(String issueCategoryId) {
                this.issueCategoryId = issueCategoryId;
                return this;
            }

            /**
             * Issues.
             */
            public Builder issues(Issues issues) {
                this.issues = issues;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            /**
             * OfflineDiagReportStatus.
             */
            public Builder offlineDiagReportStatus(String offlineDiagReportStatus) {
                this.offlineDiagReportStatus = offlineDiagReportStatus;
                return this;
            }

            /**
             * PePassword.
             */
            public Builder pePassword(String pePassword) {
                this.pePassword = pePassword;
                return this;
            }

            /**
             * RecentEvents.
             */
            public Builder recentEvents(RecentEvents recentEvents) {
                this.recentEvents = recentEvents;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    public static class Reports extends TeaModel {
        @NameInMap("Report")
        private java.util.List < Report> report;

        private Reports(Builder builder) {
            this.report = builder.report;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return report
         */
        public java.util.List < Report> getReport() {
            return this.report;
        }

        public static final class Builder {
            private java.util.List < Report> report; 

            /**
             * Report.
             */
            public Builder report(java.util.List < Report> report) {
                this.report = report;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
