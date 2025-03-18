// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeSoarRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarRecordsRequest</p>
 */
public class DescribeSoarRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndMillis")
    private Long endMillis;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestUuid")
    private String requestUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartMillis")
    private Long startMillis;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskflowMd5")
    private String taskflowMd5;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerUser")
    private String triggerUser;

    private DescribeSoarRecordsRequest(Builder builder) {
        super(builder);
        this.endMillis = builder.endMillis;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.playbookUuid = builder.playbookUuid;
        this.requestUuid = builder.requestUuid;
        this.startMillis = builder.startMillis;
        this.taskStatus = builder.taskStatus;
        this.taskflowMd5 = builder.taskflowMd5;
        this.triggerUser = builder.triggerUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endMillis
     */
    public Long getEndMillis() {
        return this.endMillis;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return requestUuid
     */
    public String getRequestUuid() {
        return this.requestUuid;
    }

    /**
     * @return startMillis
     */
    public Long getStartMillis() {
        return this.startMillis;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return taskflowMd5
     */
    public String getTaskflowMd5() {
        return this.taskflowMd5;
    }

    /**
     * @return triggerUser
     */
    public String getTriggerUser() {
        return this.triggerUser;
    }

    public static final class Builder extends Request.Builder<DescribeSoarRecordsRequest, Builder> {
        private Long endMillis; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String playbookUuid; 
        private String requestUuid; 
        private Long startMillis; 
        private String taskStatus; 
        private String taskflowMd5; 
        private String triggerUser; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarRecordsRequest request) {
            super(request);
            this.endMillis = request.endMillis;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.playbookUuid = request.playbookUuid;
            this.requestUuid = request.requestUuid;
            this.startMillis = request.startMillis;
            this.taskStatus = request.taskStatus;
            this.taskflowMd5 = request.taskflowMd5;
            this.triggerUser = request.triggerUser;
        } 

        /**
         * <p>The end time of the task execution, in 13-digit timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1683772744953</p>
         */
        public Builder endMillis(Long endMillis) {
            this.putQueryParameter("EndMillis", endMillis);
            this.endMillis = endMillis;
            return this;
        }

        /**
         * <p>Set the language type for requests and received messages. The default is <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Set which page to start displaying the query results from. The default value is 1, indicating the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Specify the maximum number of data entries per page when performing a paginated query. The default number of entries per page is 20. If the PageSize parameter is empty, it will return 10 entries by default.</p>
         * <blockquote>
         * <p>It is recommended not to leave the PageSize value empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8f55e76d-b5d5-4720-9cd7-xxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>UUID of the playbook task execution.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="https://help.aliyun.com/document_detail/2627455.html">DescribeSoarRecords</a> interface.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>6d412cfa-0905-4567-8a83-xxxxxx</p>
         */
        public Builder requestUuid(String requestUuid) {
            this.putQueryParameter("RequestUuid", requestUuid);
            this.requestUuid = requestUuid;
            return this;
        }

        /**
         * <p>The start time of the task execution, in 13-digit timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>1683526284584</p>
         */
        public Builder startMillis(Long startMillis) {
            this.putQueryParameter("StartMillis", startMillis);
            this.startMillis = startMillis;
            return this;
        }

        /**
         * <p>The status of the task execution. Values:</p>
         * <ul>
         * <li><strong>success</strong>: Successful task.</li>
         * <li><strong>failed</strong>: Failed task.</li>
         * <li><strong>inprogress</strong>: Task in progress</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inprogress</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>The MD5 value of the playbook configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>be0a4ef084dd174abe478df52xxxxx</p>
         */
        public Builder taskflowMd5(String taskflowMd5) {
            this.putQueryParameter("TaskflowMd5", taskflowMd5);
            this.taskflowMd5 = taskflowMd5;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID that executed the playbook task.</p>
         * 
         * <strong>example:</strong>
         * <p>127xxxx4392</p>
         */
        public Builder triggerUser(String triggerUser) {
            this.putQueryParameter("TriggerUser", triggerUser);
            this.triggerUser = triggerUser;
            return this;
        }

        @Override
        public DescribeSoarRecordsRequest build() {
            return new DescribeSoarRecordsRequest(this);
        } 

    } 

}
