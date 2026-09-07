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
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

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
        this.businessChannel = builder.businessChannel;
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
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
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
        private String businessChannel; 
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
            this.businessChannel = request.businessChannel;
            this.filterList = request.filterList;
            this.langType = request.langType;
            this.reportFileName = request.reportFileName;
            this.subType = request.subType;
            this.taskType = request.taskType;
        } 

        /**
         * <p>The business channel. Valid values:
         * Enterprise: Enterprise Edition.
         * Business: Business Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The list of filter conditions for query results. The filter condition objects have a logical AND (&amp;) relationship.
         * Each filter condition contains FilterKey and FilterValues, which specify the filter condition name and its values.</p>
         */
        public Builder filterList(java.util.List<FilterList> filterList) {
            this.putQueryParameter("FilterList", filterList);
            this.filterList = filterList;
            return this;
        }

        /**
         * <p>The report language type. This is an enumerated value.</p>
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
         * <p>The report file name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestReportName</p>
         */
        public Builder reportFileName(String reportFileName) {
            this.putQueryParameter("ReportFileName", reportFileName);
            this.reportFileName = reportFileName;
            return this;
        }

        /**
         * <p>The report task subtype.
         * [_single.params.SubType.enum.  DESKTOP]Cloud computer</p>
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
         * <p>The report task type.</p>
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
             * <p>The report query filter condition. The valid values vary based on the SubType value:</p>
             * <ol>
             * <li>Cloud computer report</li>
             * </ol>
             * <ul>
             * <li>KeyWord: automatically identifies the cloud computer keyword.</li>
             * <li>RegionId: the region ID.</li>
             * <li>DesktopId: the cloud computer ID.</li>
             * <li>DesktopName: the cloud computer name (fuzzy match).</li>
             * <li>OfficeSiteId: the office network ID.</li>
             * <li>OfficeSiteName: the office network name (fuzzy match).</li>
             * <li>Status: the cloud computer status.</li>
             * <li>DesktopType: the desktop specifications.</li>
             * <li>DesktopIP: the cloud computer IP address.</li>
             * <li>SubPayType: the billing method.</li>
             * <li>EndUserId: the username (fuzzy match).</li>
             * <li>ExpireTime: the expiration time, in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot; format.</li>
             * <li>IncludeAssignedUser: specifies whether users are assigned.</li>
             * <li>ResourceGroupId: the resource group ID.</li>
             * <li>PolicyId: the policy ID.</li>
             * <li>Tag:{Tag key}: the cloud computer tag. To query by multiple tags, pass in multiple Filter objects.</li>
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
             * <p>The values of the filter condition.
             * When FilterKey is set to one of the following values, only the first value in FilterValues is used:</p>
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
