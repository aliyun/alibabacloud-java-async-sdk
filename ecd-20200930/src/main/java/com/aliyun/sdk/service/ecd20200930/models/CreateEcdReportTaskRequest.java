// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateEcdReportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateEcdReportTaskRequest</p>
 */
public class CreateEcdReportTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterList")
    private java.util.List<FilterList> filterList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LangType")
    private String langType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportFileName")
    private String reportFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    private CreateEcdReportTaskRequest(Builder builder) {
        super(builder);
        this.filterList = builder.filterList;
        this.langType = builder.langType;
        this.reportFileName = builder.reportFileName;
        this.subType = builder.subType;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEcdReportTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterList
     */
    public java.util.List<FilterList> getFilterList() {
        return this.filterList;
    }

    /**
     * @return langType
     */
    public String getLangType() {
        return this.langType;
    }

    /**
     * @return reportFileName
     */
    public String getReportFileName() {
        return this.reportFileName;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateEcdReportTaskRequest, Builder> {
        private java.util.List<FilterList> filterList; 
        private String langType; 
        private String reportFileName; 
        private String subType; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateEcdReportTaskRequest request) {
            super(request);
            this.filterList = request.filterList;
            this.langType = request.langType;
            this.reportFileName = request.reportFileName;
            this.subType = request.subType;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The filter conditions for filtering query results. The logical relationship between each filter condition is &quot;and&quot; (&amp;). Each filter condition contains FilterKey and FilterValues, which indicate the key and value for the filter condition.</p>
         */
        public Builder filterList(java.util.List<FilterList> filterList) {
            this.putQueryParameter("FilterList", filterList);
            this.filterList = filterList;
            return this;
        }

        /**
         * <p>The language of the report. An enumerated type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>zh-CN (default): Chinese</li>
         * <li>en-GB: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder langType(String langType) {
            this.putQueryParameter("LangType", langType);
            this.langType = langType;
            return this;
        }

        /**
         * <p>The name of the report file.</p>
         */
        public Builder reportFileName(String reportFileName) {
            this.putQueryParameter("ReportFileName", reportFileName);
            this.reportFileName = reportFileName;
            return this;
        }

        /**
         * <p>The sub-type of the report export task.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>DESKTOP: cloud computer</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP</p>
         */
        public Builder subType(String subType) {
            this.putQueryParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        /**
         * <p>The type of the report task.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>RESOURCE_REPORT</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RESOURCE_REPORT</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateEcdReportTaskRequest build() {
            return new CreateEcdReportTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEcdReportTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateEcdReportTaskRequest</p>
     */
    public static class FilterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FilterKey")
        private String filterKey;

        @com.aliyun.core.annotation.NameInMap("FilterValues")
        private java.util.List<String> filterValues;

        private FilterList(Builder builder) {
            this.filterKey = builder.filterKey;
            this.filterValues = builder.filterValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterList create() {
            return builder().build();
        }

        /**
         * @return filterKey
         */
        public String getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterValues
         */
        public java.util.List<String> getFilterValues() {
            return this.filterValues;
        }

        public static final class Builder {
            private String filterKey; 
            private java.util.List<String> filterValues; 

            private Builder() {
            } 

            private Builder(FilterList model) {
                this.filterKey = model.filterKey;
                this.filterValues = model.filterValues;
            } 

            /**
             * <p>The key of the filter condition for filtering query results. When SubType is set to:</p>
             * <ol>
             * <li>DESKTOP (indicating a cloud computer report), the following filter conditions are available:</li>
             * </ol>
             * <ul>
             * <li>KeyWord: cloud computer keyword (supports automatic recognition)</li>
             * <li>RegionId: region ID</li>
             * <li>DesktopId: cloud computer ID</li>
             * <li>DesktopName: cloud computer name (supports fuzzy matching)</li>
             * <li>OfficeSiteId: office network ID</li>
             * <li>OfficeSiteName: office network name (supports fuzzy matching)</li>
             * <li>Status: cloud computer status</li>
             * <li>DesktopType: desktop type</li>
             * <li>DesktopIP: cloud computer IP address</li>
             * <li>SubPayType: billing method</li>
             * <li>EndUserId: user name (supports fuzzy matching)</li>
             * <li>ExpireTime: expiration date and time, in the yyyy-MM-dd&quot;T&quot;HH:mm:ss&quot;Z&quot; format</li>
             * <li>IncludeAssignedUser: indicates whether the cloud computer is assigned to users or not</li>
             * <li>ResourceGroupId: resource group ID</li>
             * <li>PolicyId: policy ID</li>
             * <li>Tag:{Tag Key value}: cloud computer tag (To filter data using multiple tags, specify multiple filter condition objects.)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Tag:TestKey</p>
             */
            public Builder filterKey(String filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * <p>The value of the filter condition. Only the first value of the FilterValues parameter is used, if FilterKey is set to one of the following values:</p>
             * <ul>
             * <li>KeyWord</li>
             * <li>DesktopName</li>
             * <li>OfficeSiteName</li>
             * <li>DesktopIP</li>
             * <li>EndUserId</li>
             * <li>ExpireTime</li>
             * <li>IncludeAssignedUser</li>
             * </ul>
             */
            public Builder filterValues(java.util.List<String> filterValues) {
                this.filterValues = filterValues;
                return this;
            }

            public FilterList build() {
                return new FilterList(this);
            } 

        } 

    }
}
